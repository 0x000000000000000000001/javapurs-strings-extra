public class Control_Alternative {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object guard = (java.util.function.Function<Object, Object>) (dictAlternative_0) -> ((new java.util.function.Supplier<Object>() { Object Applicative0_1 = ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictAlternative_0).get("Applicative0"))).apply(null /* TODO: PrimUndefined */); public Object get() { return ((new java.util.function.Supplier<Object>() { Object empty_2 = ((java.util.LinkedHashMap<String, Object>) ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictAlternative_0).get("Plus1"))).apply(null /* TODO: PrimUndefined */)).get("empty"); public Object get() { return (java.util.function.Function<Object, Object>) (v_3) -> ( ((Boolean) (v_3)) ? ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) Applicative0_1).get("pure"))).apply(Data_Unit.unit) : empty_2); } })).get(); } })).get();
public static final Object alternativeArray = new java.util.LinkedHashMap<String, Object>() {{ put("Applicative0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Applicative.applicativeArray); put("Plus1", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Control_Plus.plusArray); }};
}
