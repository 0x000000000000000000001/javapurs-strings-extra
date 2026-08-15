public class Data_Void {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object absurd = (java.util.function.Function<Object, Object>) (a_0) -> ((new java.util.function.Supplier<Object>() { class LetRecScope { Object spin_1; LetRecScope() { spin_1 = (java.util.function.Function<Object, Object>) (v_2) -> ((java.util.function.Supplier<Object>) () -> { Object __tco_v_2 = v_2; while(true) { final Object __final_v_2 = __tco_v_2; try { return ((java.util.function.Function<Object, Object>) (spin_1)).apply(__final_v_2); } catch (TcoLoop __tco_ex) { __tco_v_2 = __tco_ex.args[0]; } } }).get(); } } LetRecScope _scope = new LetRecScope(); Object spin_1 = _scope.spin_1; public Object get() { return ((java.util.function.Function<Object, Object>) (spin_1)).apply(a_0); } })).get();
}
