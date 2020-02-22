public enum BodyTypes {
    SEDAN("Седан"),
    WAGON("Универсал"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    LIFTBACK("Лифтбек"),
    CARGO2M("Фургон 2-местный"),
    WAGON5("Универсал 5-местный"),
    WAGON7("Универсал 7-местынй"),
    CROSS("Кроссовер");

    private final String bodyType;

    BodyTypes(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getValue() {
        return bodyType;
    }

    public static BodyTypes fromString(String value) {
        for (BodyTypes types : BodyTypes.values()) {
            if (types.getValue().equals(value)) return types;
        }
        return null;
    }
}
