    public static Object fromFoldableImpl = FFI_STUB;
    public static Object fromFoldableImpl(Object... args) { return null; }
    public static Object rangeImpl = FFI_STUB;
    public static Object rangeImpl(Object... args) { return null; }
    public static Object replicateImpl = FFI_STUB;
    public static Object replicateImpl(Object... args) { return null; }
    public static Object length = (java.util.function.Function<Object, Object>) (xs) -> {
        return ((Object[]) xs).length;
    };
    public static Object unconsImpl = (java.util.function.Function<Object, Object>) (empty) -> (java.util.function.Function<Object, Object>) (next) -> (java.util.function.Function<Object, Object>) (xs) -> {
        Object[] arr = (Object[]) xs;
        if (arr.length == 0) return ((java.util.function.Function<Object, Object>) empty).apply(null);
        Object head = arr[0];
        Object[] tail = java.util.Arrays.copyOfRange(arr, 1, arr.length);
        return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) next).apply(head))).apply(tail);
    };
    public static Object indexImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (xs) -> (java.util.function.Function<Object, Object>) (i) -> {
        Object[] arr = (Object[]) xs;
        int index = ((Number) i).intValue();
        if (index < 0 || index >= arr.length) return nothing;
        return ((java.util.function.Function<Object, Object>) just).apply(arr[index]);
    };
    public static Object findMapImpl = FFI_STUB;
    public static Object findMapImpl(Object... args) { return null; }
    public static Object findIndexImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (xs) -> {
        Object[] arr = (Object[]) xs;
        for (int i = 0; i < arr.length; i++) {
            if ((Boolean) ((java.util.function.Function<Object, Object>) f).apply(arr[i])) {
                return ((java.util.function.Function<Object, Object>) just).apply(i);
            }
        }
        return nothing;
    };
    public static Object findLastIndexImpl = FFI_STUB;
    public static Object findLastIndexImpl(Object... args) { return null; }
    public static Object _insertAt = FFI_STUB;
    public static Object _insertAt(Object... args) { return null; }
    public static Object _deleteAt = FFI_STUB;
    public static Object _deleteAt(Object... args) { return null; }
    public static Object _updateAt = FFI_STUB;
    public static Object _updateAt(Object... args) { return null; }
    public static Object reverse = FFI_STUB;
    public static Object reverse(Object... args) { return null; }
    public static Object concat = FFI_STUB;
    public static Object concat(Object... args) { return null; }
    public static Object filterImpl = FFI_STUB;
    public static Object filterImpl(Object... args) { return null; }
    public static Object partitionImpl = FFI_STUB;
    public static Object partitionImpl(Object... args) { return null; }
    public static Object scanlImpl = FFI_STUB;
    public static Object scanlImpl(Object... args) { return null; }
    public static Object scanrImpl = FFI_STUB;
    public static Object scanrImpl(Object... args) { return null; }
    public static Object sortByImpl = FFI_STUB;
    public static Object sortByImpl(Object... args) { return null; }
    public static Object sliceImpl = (java.util.function.Function<Object, Object>) (s) -> (java.util.function.Function<Object, Object>) (e) -> (java.util.function.Function<Object, Object>) (l) -> {
        Object[] arr = (Object[]) l;
        int start = Math.max(0, ((Number) s).intValue());
        int end = Math.min(arr.length, ((Number) e).intValue());
        start = Math.min(start, arr.length);
        end = Math.max(start, end);
        return java.util.Arrays.copyOfRange(arr, start, end);
    };
    public static Object zipWithImpl = FFI_STUB;
    public static Object zipWithImpl(Object... args) { return null; }
    public static Object anyImpl = FFI_STUB;
    public static Object anyImpl(Object... args) { return null; }
    public static Object allImpl = FFI_STUB;
    public static Object allImpl(Object... args) { return null; }
    public static Object unsafeIndexImpl = FFI_STUB;
    public static Object unsafeIndexImpl(Object... args) { return null; }
