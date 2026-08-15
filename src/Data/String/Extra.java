    public static final java.util.function.Function<Object, Object> levenshtein = (str1Obj) -> (java.util.function.Function<Object, Object>) (str2Obj) -> {
        String str1 = (String) str1Obj;
        String str2 = (String) str2Obj;
        int str1Len = str1.length();
        int str2Len = str2.length();
        
        if (str1Len == 0) return str2Len;
        if (str2Len == 0) return str1Len;
        
        int[] prevRow = new int[str2Len + 1];
        int[] str2Char = new int[str2Len];
        
        for (int i = 0; i < str2Len; ++i) {
            prevRow[i] = i;
            str2Char[i] = str2.charAt(i);
        }
        prevRow[str2Len] = str2Len;
        
        int curCol, nextCol = 0, tmp;
        for (int i = 0; i < str1Len; ++i) {
            nextCol = i + 1;
            for (int j = 0; j < str2Len; ++j) {
                curCol = nextCol;
                boolean strCmp = str1.charAt(i) == str2Char[j];
                nextCol = prevRow[j] + (strCmp ? 0 : 1);
                tmp = curCol + 1;
                if (nextCol > tmp) nextCol = tmp;
                tmp = prevRow[j + 1] + 1;
                if (nextCol > tmp) nextCol = tmp;
                prevRow[j] = curCol;
            }
            prevRow[str2Len] = nextCol;
        }
        return nextCol;
    };

    public static final java.util.function.Function<Object, Object> sorensenDiceCoefficient = (lObj) -> (java.util.function.Function<Object, Object>) (rObj) -> {
        String l = (String) lObj;
        String r = (String) rObj;
        if (l.length() < 2 || r.length() < 2) return 0.0;
        
        java.util.Map<String, Integer> lBigrams = new java.util.HashMap<>();
        for (int i = 0; i < l.length() - 1; i++) {
            String lBigram = l.substring(i, i + 2);
            lBigrams.put(lBigram, lBigrams.getOrDefault(lBigram, 0) + 1);
        }
        
        int intersectionSize = 0;
        for (int j = 0; j < r.length() - 1; j++) {
            String rBigram = r.substring(j, j + 2);
            int rCount = lBigrams.getOrDefault(rBigram, 0);
            if (rCount > 0) {
                lBigrams.put(rBigram, rCount - 1);
                intersectionSize++;
            }
        }
        
        return (2.0 * intersectionSize) / (l.length() + r.length() - 2);
    };
