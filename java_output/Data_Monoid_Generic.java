public class Data_Monoid_Generic {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };


public static final Object genericMonoidNoArguments = new java.util.LinkedHashMap<String, Object>() {{ put("genericMempty'", new Data_Generic_Rep.NoArguments()); }};
public static final Object genericMonoidArgument = (java.util.function.Function<Object, Object>) (dictMonoid_0) -> new java.util.LinkedHashMap<String, Object>() {{ put("genericMempty'", ((java.util.LinkedHashMap<String, Object>) dictMonoid_0).get("mempty")); }};
public static final Object genericMemptyprime = (java.util.function.Function<Object, Object>) (dict_0) -> ((java.util.LinkedHashMap<String, Object>) dict_0).get("genericMempty'");
public static final Object genericMonoidConstructor = (java.util.function.Function<Object, Object>) (dictGenericMonoid_0) -> new java.util.LinkedHashMap<String, Object>() {{ put("genericMempty'", ((java.util.LinkedHashMap<String, Object>) dictGenericMonoid_0).get("genericMempty'")); }};
public static final Object genericMonoidProduct = (java.util.function.Function<Object, Object>) (dictGenericMonoid_0) -> (java.util.function.Function<Object, Object>) (dictGenericMonoid1_1) -> new java.util.LinkedHashMap<String, Object>() {{ put("genericMempty'", new Data_Generic_Rep.Product(((java.util.LinkedHashMap<String, Object>) dictGenericMonoid_0).get("genericMempty'"), ((java.util.LinkedHashMap<String, Object>) dictGenericMonoid1_1).get("genericMempty'"))); }};
public static final Object genericMempty = (java.util.function.Function<Object, Object>) (dictGeneric_0) -> (java.util.function.Function<Object, Object>) (dictGenericMonoid_1) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictGeneric_0).get("to"))).apply(((java.util.LinkedHashMap<String, Object>) dictGenericMonoid_1).get("genericMempty'"));
}
