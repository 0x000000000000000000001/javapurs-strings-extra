public class Data_Functor {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    // FFI provided by /Users/0x1/Documents/htdocs/javapurs/javapurs-strings-extra/src/Data/Functor.java
    public static Object arrayMap = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (arrObj) -> {
        java.util.function.Function<Object, Object> fn = (java.util.function.Function<Object, Object>) f;
        Object[] arr = (Object[]) arrObj;
        Object[] result = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = fn.apply(arr[i]);
        }
        return result;
    };


public static final Object map = (java.util.function.Function<Object, Object>) (dict_0) -> ((java.util.LinkedHashMap<String, Object>) dict_0).get("map");
public static final Object mapFlipped = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> (java.util.function.Function<Object, Object>) (fa_1) -> (java.util.function.Function<Object, Object>) (f_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0).get("map"))).apply(f_2))).apply(fa_1);
public static final Object $void = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_1) -> Data_Unit.unit);
public static final Object voidLeft = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> (java.util.function.Function<Object, Object>) (f_1) -> (java.util.function.Function<Object, Object>) (x_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_3) -> x_2))).apply(f_1);
public static final Object voidRight = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> (java.util.function.Function<Object, Object>) (x_1) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0).get("map"))).apply((java.util.function.Function<Object, Object>) (v_2) -> x_1);
public static final Object functorProxy = new java.util.LinkedHashMap<String, Object>() {{ put("map", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> new Type_Proxy.Proxy()); }};
public static final Object functorFn = new java.util.LinkedHashMap<String, Object>() {{ put("map", ((java.util.LinkedHashMap<String, Object>) Control_Semigroupoid.semigroupoidFn).get("compose")); }};
public static final Object functorArray = new java.util.LinkedHashMap<String, Object>() {{ put("map", Data_Functor.arrayMap); }};
public static final Object flap = (java.util.function.Function<Object, Object>) (dictFunctor_0) -> (java.util.function.Function<Object, Object>) (ff_1) -> (java.util.function.Function<Object, Object>) (x_2) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictFunctor_0).get("map"))).apply((java.util.function.Function<Object, Object>) (f_3) -> ((java.util.function.Function<Object, Object>) (f_3)).apply(x_2)))).apply(ff_1);
}
