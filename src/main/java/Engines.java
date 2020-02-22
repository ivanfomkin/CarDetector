public enum Engines {
    CARBURATOR("Карбюратор"),
    INJECTOR("Инжектор"),
    VAZ11186("ВАЗ-11186"),
    VAZ21126("ВАЗ-21126"),
    VAZ21116("ВАЗ-21116"),
    VAZ21127("ВАЗ-21127"),
    VAZ11183("ВАЗ-11183"),
    VAZ11194("ВАЗ-11194"),
    K7M("K7M"),
    VAZ11189("ВАЗ-11189"),
    VAZ21129("ВАЗ-21129"),
    CNG("ВАЗ-21129 CNG"),
    K4M("K4M"),
    VAZ21114("ВАЗ-21114"),
    VAZ21179("ВАЗ-21179"),
    H4M("H4M"),
    VAZ21179SPORT("ВАЗ-21179 Sport"),
    VAZ21214("ВАЗ-21214");
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
