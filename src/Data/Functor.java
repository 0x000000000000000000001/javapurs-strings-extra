    public static Object arrayMap = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (arrObj) -> {
        java.util.function.Function<Object, Object> fn = (java.util.function.Function<Object, Object>) f;
        Object[] arr = (Object[]) arrObj;
        Object[] result = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = fn.apply(arr[i]);
        }
        return result;
    };
