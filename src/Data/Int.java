    public static final Object fromNumberImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (n) -> {
        Double d = (Double) n;
        if (d.isNaN() || d.isInfinite() || Math.floor(d) != d) return nothing;
        return ((java.util.function.Function<Object, Object>) just).apply(d.intValue());
    };
    public static final Object fromStringAsImpl = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (radix) -> (java.util.function.Function<Object, Object>) (s) -> {
        try {
            return ((java.util.function.Function<Object, Object>) just).apply(Integer.parseInt((String) s, (Integer) radix));
        } catch (NumberFormatException e) {
            return nothing;
        }
    };
    public static final Object pow = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> (int) Math.pow((Integer) x, (Integer) y);
    public static final Object quot = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> ((Integer) x) / ((Integer) y);
    public static final Object rem = (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (y) -> ((Integer) x) % ((Integer) y);
    public static final Object toNumber = (java.util.function.Function<Object, Object>) (n) -> ((Integer) n).doubleValue();
    public static final Object toStringAs = (java.util.function.Function<Object, Object>) (radix) -> (java.util.function.Function<Object, Object>) (i) -> Integer.toString((Integer) i, (Integer) radix);
