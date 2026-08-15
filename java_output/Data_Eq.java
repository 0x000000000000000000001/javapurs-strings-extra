public class Data_Eq {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    // FFI provided by ../javapurs-prelude/src/Data/Eq.java
    public static Object eqBooleanImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((Boolean) a).equals((Boolean) b);
    public static Object eqIntImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((Integer) a).equals((Integer) b);
    public static Object eqStringImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((String) a).equals((String) b);
    public static Object eqCharImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((String) a).equals((String) b);
    public static Object eqNumberImpl = (java.util.function.Function<Object, Object>) (a) -> (java.util.function.Function<Object, Object>) (b) -> ((Double) a).equals((Double) b);
    public static Object eqArrayImpl = (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (xs) -> (java.util.function.Function<Object, Object>) (ys) -> {
        Object[] arr1 = (Object[]) xs;
        Object[] arr2 = (Object[]) ys;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            Boolean res = (Boolean) ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(arr1[i])).apply(arr2[i]);
            if (!res) return false;
        }
        return true;
    };


public static final Object eqVoid = new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> true); }};
public static final Object eqUnit = new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> true); }};
public static final Object eqString = new java.util.LinkedHashMap<String, Object>() {{ put("eq", Data_Eq.eqStringImpl); }};
public static final Object eqRowNil = new java.util.LinkedHashMap<String, Object>() {{ put("eqRecord", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> (java.util.function.Function<Object, Object>) (v2_2) -> true); }};
public static final Object eqRecord = (java.util.function.Function<Object, Object>) (dict_0) -> ((java.util.LinkedHashMap<String, Object>) dict_0).get("eqRecord");
public static final Object eqRec = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> (java.util.function.Function<Object, Object>) (dictEqRecord_1) -> new java.util.LinkedHashMap<String, Object>() {{ put("eq", ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictEqRecord_1).get("eqRecord"))).apply(new Type_Proxy.Proxy())); }};
public static final Object eqProxy = new java.util.LinkedHashMap<String, Object>() {{ put("eq", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> true); }};
public static final Object eqNumber = new java.util.LinkedHashMap<String, Object>() {{ put("eq", Data_Eq.eqNumberImpl); }};
public static final Object eqInt = new java.util.LinkedHashMap<String, Object>() {{ put("eq", Data_Eq.eqIntImpl); }};
public static final Object eqChar = new java.util.LinkedHashMap<String, Object>() {{ put("eq", Data_Eq.eqCharImpl); }};
public static final Object eqBoolean = new java.util.LinkedHashMap<String, Object>() {{ put("eq", Data_Eq.eqBooleanImpl); }};
public static final Object eq1 = (java.util.function.Function<Object, Object>) (dict_0) -> ((java.util.LinkedHashMap<String, Object>) dict_0).get("eq1");
public static final Object eq = (java.util.function.Function<Object, Object>) (dict_0) -> ((java.util.LinkedHashMap<String, Object>) dict_0).get("eq");
public static final Object eqArray = (java.util.function.Function<Object, Object>) (dictEq_0) -> new java.util.LinkedHashMap<String, Object>() {{ put("eq", ((java.util.function.Function<Object, Object>) (Data_Eq.eqArrayImpl)).apply(((java.util.LinkedHashMap<String, Object>) dictEq_0).get("eq"))); }};
public static final Object eq1Array = new java.util.LinkedHashMap<String, Object>() {{ put("eq1", (java.util.function.Function<Object, Object>) (dictEq_0) -> ((java.util.function.Function<Object, Object>) (Data_Eq.eqArrayImpl)).apply(((java.util.LinkedHashMap<String, Object>) dictEq_0).get("eq"))); }};
public static final Object eqRowCons = (java.util.function.Function<Object, Object>) (dictEqRecord_0) -> (java.util.function.Function<Object, Object>) (_dollar___unused_1) -> (java.util.function.Function<Object, Object>) (dictIsSymbol_2) -> (java.util.function.Function<Object, Object>) (dictEq_3) -> new java.util.LinkedHashMap<String, Object>() {{ put("eqRecord", (java.util.function.Function<Object, Object>) (v_4) -> (java.util.function.Function<Object, Object>) (ra_5) -> (java.util.function.Function<Object, Object>) (rb_6) -> ((new java.util.function.Supplier<Object>() { Object get_7 = ((java.util.function.Function<Object, Object>) (Record_Unsafe.unsafeGet)).apply(((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictIsSymbol_2).get("reflectSymbol"))).apply(new Type_Proxy.Proxy())); public Object get() { return (((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictEq_3).get("eq"))).apply(((java.util.function.Function<Object, Object>) (get_7)).apply(ra_5)))).apply(((java.util.function.Function<Object, Object>) (get_7)).apply(rb_6)))) && ((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictEqRecord_0).get("eqRecord"))).apply(new Type_Proxy.Proxy()))).apply(ra_5))).apply(rb_6)))); } })).get()); }};
public static final Object notEq = (java.util.function.Function<Object, Object>) (dictEq_0) -> (java.util.function.Function<Object, Object>) (x_1) -> (java.util.function.Function<Object, Object>) (y_2) -> !(((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictEq_0).get("eq"))).apply(x_1))).apply(y_2))));
public static final Object notEq1 = (java.util.function.Function<Object, Object>) (dictEq1_0) -> (java.util.function.Function<Object, Object>) (dictEq_1) -> (java.util.function.Function<Object, Object>) (x_2) -> (java.util.function.Function<Object, Object>) (y_3) -> !(((Boolean) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictEq1_0).get("eq1"))).apply(dictEq_1))).apply(x_2))).apply(y_3))));
}
