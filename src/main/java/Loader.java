import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Loader {
    private String pathToFile = "src/main/resources/database.csv";
    private HashMap<String, Model> database;

    public Loader() {
        database = new HashMap<>();
        parseFile();
    }

    private void parseFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathToFile));
            String model;
            double engineCapacity;
            int valveCount;
            Engines engine;
            BodyTypes bodyType;
            Transmissions transmission = Transmissions.MECHANIC;
            for (String line : lines) {
                String[] values = line.split(",");
                if (values.length < 5 || values.length > 6) break;
                model = values[0];
                engineCapacity = Double.parseDouble(values[1]);
                valveCount = Integer.parseInt(values[2]);
                bodyType = BodyTypes.fromString(values[3]);
                engine = Engines.fromString(values[4]);
                if (values.length == 6) {
                    transmission = Transmissions.fromString(values[5]);
                }
                Model currentModel = new Model(model, engineCapacity, valveCount, engine,
                        bodyType, transmission);
                database.put(model, currentModel);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public HashMap<String, Model> getDatabase() {
        return database;
    }
}
