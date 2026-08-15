    public static Object fromCharArray = (java.util.function.Function<Object, Object>) (a) -> {
        Object[] arr = (Object[]) a;
        StringBuilder sb = new StringBuilder(arr.length);
        for (Object o : arr) sb.append((String) o);
        return sb.toString();
    };

    public static Object toCharArray = (java.util.function.Function<Object, Object>) (s) -> {
        String str = (String) s;
        Object[] arr = new Object[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        return arr;
    };

    public static Object singleton = (java.util.function.Function<Object, Object>) (c) -> {
        return (String) c;
    };

    public static Object _charAt = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (i) -> (java.util.function.Function<Object, Object>) (s) -> {
        Integer idx = (Integer) i;
        String str = (String) s;
        if (idx >= 0 && idx < str.length()) {
            return ((java.util.function.Function<Object, Object>) just).apply(String.valueOf(str.charAt(idx)));
        } else {
            return nothing;
        }
    };

    public static Object _toChar = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (s) -> {
        String str = (String) s;
        if (str.length() == 1) {
            return ((java.util.function.Function<Object, Object>) just).apply(String.valueOf(str.charAt(0)));
        } else {
            return nothing;
        }
    };

    public static Object length = (java.util.function.Function<Object, Object>) (s) -> {
        return ((String) s).length();
    };

    public static Object countPrefix = (java.util.function.Function<Object, Object>) (p) -> (java.util.function.Function<Object, Object>) (s) -> {
        String str = (String) s;
        int i = 0;
        while (i < str.length() && (Boolean) ((java.util.function.Function<Object, Object>) p).apply(String.valueOf(str.charAt(i)))) {
            i++;
        }
        return i;
    };

    public static Object _indexOf = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (s) -> {
        int i = ((String) s).indexOf((String) x);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object _indexOfStartingAt = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (startAt) -> (java.util.function.Function<Object, Object>) (s) -> {
        int start = (Integer) startAt;
        String str = (String) s;
        if (start < 0 || start > str.length()) return nothing;
        int i = str.indexOf((String) x, start);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object _lastIndexOf = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (s) -> {
        int i = ((String) s).lastIndexOf((String) x);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object _lastIndexOfStartingAt = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (startAt) -> (java.util.function.Function<Object, Object>) (s) -> {
        int start = (Integer) startAt;
        String str = (String) s;
        if (start < 0 || start > str.length()) return nothing;
        int i = str.lastIndexOf((String) x, start);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object take = (java.util.function.Function<Object, Object>) (n) -> (java.util.function.Function<Object, Object>) (s) -> {
        int num = (Integer) n;
        String str = (String) s;
        num = Math.max(0, Math.min(num, str.length()));
        return str.substring(0, num);
    };

    public static Object drop = (java.util.function.Function<Object, Object>) (n) -> (java.util.function.Function<Object, Object>) (s) -> {
        int num = (Integer) n;
        String str = (String) s;
        num = Math.max(0, Math.min(num, str.length()));
        return str.substring(num);
    };

    public static Object slice = (java.util.function.Function<Object, Object>) (b) -> (java.util.function.Function<Object, Object>) (e) -> (java.util.function.Function<Object, Object>) (s) -> {
        int begin = (Integer) b;
        int end = (Integer) e;
        String str = (String) s;
        if (begin < 0) begin = str.length() + begin;
        if (end < 0) end = str.length() + end;
        begin = Math.max(0, Math.min(begin, str.length()));
        end = Math.max(0, Math.min(end, str.length()));
        if (begin > end) return "";
        return str.substring(begin, end);
    };

    public static Object splitAt = (java.util.function.Function<Object, Object>) (i) -> (java.util.function.Function<Object, Object>) (s) -> {
        int idx = (Integer) i;
        String str = (String) s;
        idx = Math.max(0, Math.min(idx, str.length()));
        java.util.LinkedHashMap<String, Object> result = new java.util.LinkedHashMap<>();
        result.put("before", str.substring(0, idx));
        result.put("after", str.substring(idx));
        return result;
    };
