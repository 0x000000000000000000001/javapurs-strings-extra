public class Data_Semigroup_Last {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object Last = (java.util.function.Function<Object, Object>) (x_0) -> x_0;
public static final Object showLast = (java.util.function.Function<Object, Object>) (dictShow_0) -> new java.util.LinkedHashMap<String, Object>() {{ put("show", (java.util.function.Function<Object, Object>) (v_1) -> (((String) ((((String) ("(Last ")) + ((String) (((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictShow_0).get("show"))).apply(v_1)))))) + ((String) (")")))); }};
public static final Object semigroupLast = new java.util.LinkedHashMap<String, Object>() {{ put("append", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (x_1) -> x_1); }};
public static final Object ordLast = (java.util.function.Function<Object, Object>) (dictOrd_0) -> dictOrd_0;
public static final Object functorLast = new java.util.LinkedHashMap<String, Object>() {{ put("map", (java.util.function.Function<Object, Object>) (f_0) -> (java.util.function.Function<Object, Object>) (m_1) -> ((java.util.function.Function<Object, Object>) (f_0)).apply(m_1)); }};
public static final Object eqLast = (java.util.function.Function<Object, Object>) (dictEq_0) -> dictEq_0;
public static final Object eq1Last = new java.util.LinkedHashMap<String, Object>() {{ put("eq1", (java.util.function.Function<Object, Object>) (dictEq_0) -> ((java.util.LinkedHashMap<String, Object>) dictEq_0).get("eq")); }};
public static final Object ord1Last = new java.util.LinkedHashMap<String, Object>() {{ put("compare1", (java.util.function.Function<Object, Object>) (dictOrd_0) -> ((java.util.LinkedHashMap<String, Object>) dictOrd_0).get("compare")); put("Eq10", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Semigroup_Last.eq1Last); }};
public static final Object boundedLast = (java.util.function.Function<Object, Object>) (dictBounded_0) -> dictBounded_0;
public static final Object applyLast = new java.util.LinkedHashMap<String, Object>() {{ put("apply", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (v1_1) -> ((java.util.function.Function<Object, Object>) (v_0)).apply(v1_1)); put("Functor0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Semigroup_Last.functorLast); }};
public static final Object bindLast = new java.util.LinkedHashMap<String, Object>() {{ put("bind", (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (f_1) -> ((java.util.function.Function<Object, Object>) (f_1)).apply(v_0)); put("Apply0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Semigroup_Last.applyLast); }};
public static final Object applicativeLast = new java.util.LinkedHashMap<String, Object>() {{ put("pure", (java.util.function.Function<Object, Object>) (x_0) -> x_0); put("Apply0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Semigroup_Last.applyLast); }};
public static final Object monadLast = new java.util.LinkedHashMap<String, Object>() {{ put("Applicative0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Semigroup_Last.applicativeLast); put("Bind1", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Semigroup_Last.bindLast); }};
}
