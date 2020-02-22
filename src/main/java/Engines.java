public enum Engines {
    CARBURATOR("Карбюратор"),
    INJECTOR("Инжектор")
    ;

    private final String value;
    Engines(String engine) {
        this.value = engine;
    }

    public String getValue() {
        return value;
    }

    public static Engines fromString(String value) {
        for (Engines engine : Engines.values()) {
            if (engine.value.equals(value)) return engine;
        }
        return null;
    }
}
