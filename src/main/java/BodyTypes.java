public enum  BodyTypes {
    SEDAN("Седан"),
    WAGON("Универсал"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе");

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
