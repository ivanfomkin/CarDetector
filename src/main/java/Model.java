public class Model {
    private String model;
    private double engineCapacity;
    private int valveCount;
    private Engines engine;
    private BodyTypes bodyType;
    private Transmissions transmission;

    public Model(String model, double engineCapacity, int valveCount,
                 Engines engine, BodyTypes bodyType, Transmissions transmission) {
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.valveCount = valveCount;
        this.engine = engine;
        this.bodyType = bodyType;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Модель: ").append(model).append("\n")
                .append("Двигатель: ").append(engine.getValue()).append("\n")
                .append("Объём двигателя: ").append(engineCapacity).append("\n")
                .append("Число клапанов: ").append(valveCount).append("\n")
                .append("КПП: ").append(transmission.getValue()).append("\n")
                .append("Тип кузова: ").append(bodyType.getValue()).append("\n");
        return stringBuilder.toString();
    }
}
