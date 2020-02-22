public enum Transmissions {
    MECHANIC("МКПП, нет данных о модели");
    private final String type;

    Transmissions(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }
}
