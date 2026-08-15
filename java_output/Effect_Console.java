public class Effect_Console {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    // FFI provided by /Users/0x1/Documents/htdocs/javapurs/javapurs-strings-extra/src/Effect/Console.java

    public static Object log = (java.util.function.Function<Object, Object>) (s) -> (java.util.function.Supplier<Object>) () -> {
        System.out.println(s);
        return null;
    };
    public static Object error = (java.util.function.Function<Object, Object>) (s) -> (java.util.function.Supplier<Object>) () -> {
        System.err.println(s);
        return null;
    };
    public static Object warn = FFI_STUB;
    public static Object info = FFI_STUB;
    public static Object debug = FFI_STUB;
    public static Object group = FFI_STUB;
    public static Object groupEnd = FFI_STUB;


public static final Object warnShow = (java.util.function.Function<Object, Object>) (dictShow_0) -> (java.util.function.Function<Object, Object>) (a_1) -> ((java.util.function.Function<Object, Object>) (Effect_Console.warn)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0).get("show"))).apply(a_1));
public static final Object logShow = (java.util.function.Function<Object, Object>) (dictShow_0) -> (java.util.function.Function<Object, Object>) (a_1) -> ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) (arg) -> (java.util.function.Supplier<Object>) () -> { System.out.println(arg); return null; })).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0).get("show"))).apply(a_1));
public static final Object infoShow = (java.util.function.Function<Object, Object>) (dictShow_0) -> (java.util.function.Function<Object, Object>) (a_1) -> ((java.util.function.Function<Object, Object>) (Effect_Console.info)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0).get("show"))).apply(a_1));
public static final Object grouped = (java.util.function.Function<Object, Object>) (name_0) -> (java.util.function.Function<Object, Object>) (inner_1) -> ((new java.util.function.Supplier<Object>() { Object __local_var_2 = ((java.util.function.Function<Object, Object>) (Effect_Console.group)).apply(name_0); public Object get() { return ((new java.util.function.Supplier<Object>() { Object _dollar___unused_3 = __local_var_2; public Object get() { return ((new java.util.function.Supplier<Object>() { Object result_4 = inner_1; public Object get() { return ((new java.util.function.Supplier<Object>() { Object _dollar___unused_5 = Effect_Console.groupEnd; public Object get() { return result_4; } })).get(); } })).get(); } })).get(); } })).get();
public static final Object errorShow = (java.util.function.Function<Object, Object>) (dictShow_0) -> (java.util.function.Function<Object, Object>) (a_1) -> ((java.util.function.Function<Object, Object>) (Effect_Console.error)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0).get("show"))).apply(a_1));
public static final Object debugShow = (java.util.function.Function<Object, Object>) (dictShow_0) -> (java.util.function.Function<Object, Object>) (a_1) -> ((java.util.function.Function<Object, Object>) (Effect_Console.debug)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0).get("show"))).apply(a_1));
}
