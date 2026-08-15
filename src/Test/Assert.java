    public static Object assertImpl = (java.util.function.Function<Object, Object>) (msg) -> (java.util.function.Function<Object, Object>) (cond) -> (java.util.function.Supplier<Object>) () -> {
        if (!(Boolean) cond) {
            System.err.println("Assertion failed: " + msg);
            throw new RuntimeException("Assertion failed: " + msg);
        }
        return null;
    };
    public static Object checkThrows = (java.util.function.Function<Object, Object>) (fn) -> (java.util.function.Supplier<Object>) () -> {
        try {
            ((java.util.function.Function<Object, Object>) fn).apply(null);
            return false;
        } catch (Exception e) {
            return true;
        }
    };
