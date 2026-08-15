    public static Object _unsafeCodePointAt0 = (java.util.function.Function<Object, Object>) (fallback) -> (java.util.function.Function<Object, Object>) (str) -> {
        String s = (String) str;
        if (s.isEmpty()) throw new RuntimeException("unsafeCodePointAt0: empty string");
        return s.codePointAt(0);
    };

    public static Object _codePointAt = (java.util.function.Function<Object, Object>) (fallback) -> (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (unsafeCodePointAt0) -> (java.util.function.Function<Object, Object>) (index) -> (java.util.function.Function<Object, Object>) (str) -> {
        int idx = (Integer) index;
        String s = (String) str;
        int len = s.codePointCount(0, s.length());
        if (idx < 0 || idx >= len) return nothing;
        int offset = s.offsetByCodePoints(0, idx);
        return ((java.util.function.Function<Object, Object>) just).apply(s.codePointAt(offset));
    };

    public static Object _countPrefix = (java.util.function.Function<Object, Object>) (fallback) -> (java.util.function.Function<Object, Object>) (unsafeCodePointAt0) -> (java.util.function.Function<Object, Object>) (pred) -> (java.util.function.Function<Object, Object>) (str) -> {
        String s = (String) str;
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            int cp = s.codePointAt(i);
            Boolean res = (Boolean) ((java.util.function.Function<Object, Object>) pred).apply(cp);
            if (!res) break;
            count++;
            i += Character.charCount(cp);
        }
        return count;
    };

    public static Object _fromCodePointArray = (java.util.function.Function<Object, Object>) (singleton) -> (java.util.function.Function<Object, Object>) (cps) -> {
        Object[] arr = (Object[]) cps;
        StringBuilder sb = new StringBuilder(arr.length);
        for (Object cp : arr) {
            sb.appendCodePoint((Integer) cp);
        }
        return sb.toString();
    };

    public static Object _singleton = (java.util.function.Function<Object, Object>) (fallback) -> (java.util.function.Function<Object, Object>) (cp) -> {
        return new String(Character.toChars((Integer) cp));
    };

    public static Object _take = (java.util.function.Function<Object, Object>) (fallback) -> (java.util.function.Function<Object, Object>) (n) -> (java.util.function.Function<Object, Object>) (str) -> {
        int num = (Integer) n;
        String s = (String) str;
        int len = s.codePointCount(0, s.length());
        num = Math.max(0, Math.min(num, len));
        int offset = s.offsetByCodePoints(0, num);
        return s.substring(0, offset);
    };

    public static Object _toCodePointArray = (java.util.function.Function<Object, Object>) (fallback) -> (java.util.function.Function<Object, Object>) (unsafeCodePointAt0) -> (java.util.function.Function<Object, Object>) (str) -> {
        String s = (String) str;
        int len = s.codePointCount(0, s.length());
        Object[] arr = new Object[len];
        int j = 0;
        for (int i = 0; i < s.length(); i += Character.charCount(s.codePointAt(i))) {
            arr[j++] = s.codePointAt(i);
        }
        return arr;
    };
