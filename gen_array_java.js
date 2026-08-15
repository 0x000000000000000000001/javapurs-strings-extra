const fs = require('fs');
const imports = [
  'fromFoldableImpl', 'rangeImpl', 'replicateImpl', 'length', 'unconsImpl', 'indexImpl',
  'findMapImpl', 'findIndexImpl', 'findLastIndexImpl', '_insertAt', '_deleteAt', '_updateAt',
  'reverse', 'concat', 'filterImpl', 'partitionImpl', 'scanlImpl', 'scanrImpl', 'sortByImpl',
  'sliceImpl', 'zipWithImpl', 'anyImpl', 'allImpl', 'unsafeIndexImpl'
];

let content = '';
for (let name of imports) {
  if (name === 'unconsImpl') {
    content += `    public static Object unconsImpl = (java.util.function.Function<Object, Object>) (empty) -> (java.util.function.Function<Object, Object>) (next) -> (java.util.function.Function<Object, Object>) (xs) -> {
        Object[] arr = (Object[]) xs;
        if (arr.length == 0) return ((java.util.function.Function<Object, Object>) empty).apply(null);
        Object head = arr[0];
        Object[] tail = java.util.Arrays.copyOfRange(arr, 1, arr.length);
        return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) next).apply(head))).apply(tail);
    };\n`;
  } else {
    content += `    public static Object ${name} = FFI_STUB;\n`;
    content += `    public static Object ${name}(Object... args) { return null; }\n`;
  }
}
fs.writeFileSync('../javapurs-arrays/src/Data/Array.java', content);
