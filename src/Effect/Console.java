
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
