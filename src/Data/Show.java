    public static final Object showStringImpl = (java.util.function.Function<Object, Object>) (str) -> "\"" + str.toString().replace("\"", "\\\"") + "\"";
    public static final Object showIntImpl = (java.util.function.Function<Object, Object>) (i) -> i.toString();
    public static final Object showNumberImpl = (java.util.function.Function<Object, Object>) (n) -> n.toString();
    public static final Object showCharImpl = (java.util.function.Function<Object, Object>) (c) -> "'" + c.toString() + "'";
    public static final Object showArrayImpl = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (arr) -> {
        Object[] a = (Object[]) arr;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(((java.util.function.Function<Object, Object>) f).apply(a[i]).toString());
            if (i < a.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    };
