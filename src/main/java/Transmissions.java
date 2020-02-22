public enum Transmissions {
    MECHANIC("МКПП"),
    MECHANICWITHCABLE("МКПП с тросовым приводом"),
    AUTOMATIC("Автоматическая"),
    MECHANICORAMT("МКПП с тросовым приводом или АМТ"),
    MECHANICLINK("МКПП с тяговым приводом"),
    JR5("JR5 5MT"),
    JH3("JH3 5MT"),
    MECHANICALLTYPE("МКПП или АМТ"),
    VAZ2180("МКПП с тросовым приводом 2180"),
    AMT("АМТ"),
    CVT("Бесступенчатая трансмиссия");

    private final String type;


    Transmissions(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }

    public static Transmissions fromString(String value) {
        for (Transmissions transmissions : Transmissions.values()) {
            if (transmissions.getValue().equals(value)) return transmissions;
        }
        return null;
    }
}
