import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Loader loader = new Loader();
        HashMap<String, Model> base = loader.getDatabase();
        System.out.println("Программа для получения информации о моделях автомобилей ВАЗ");
        System.out.println("Поддерживаемые модели: 4x4, Vesta, X-Ray, Largus, Priora, Granta, Kalina, 110, Samara");
        System.out.println("Для работы с программой введите подель или вин в одном из следующих форматов:");
        System.out.println("FSA45\t - информация по модели (5 символов)");
        System.out.println("XTAGFL110JY000002\t - VIN-номер (17 символов)");
        System.out.println("Для выхода из программ наберите exit");
        for (; ; ) {
            try {
                System.out.println("Введите модель или VIN-номер: ");
                String enteredModel = reader.readLine();
                if (enteredModel.equalsIgnoreCase("exit")) break;
                String model = getModelFromVin(enteredModel);
                System.out.println("Вы ввели модель: " + model);
                if (!base.containsKey(model.toUpperCase()) || model == null) {
                    System.out.println("Такой модели пока нет в справочнике! " +
                            "Проверьте правильность ввода или обратитесь к разработчику");
                    continue;
                }
                System.out.println(base.get(model));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static String getModelFromVin(String vin) {
        String model = "";
        if (vin.length() < 5) return null;
        if (vin.length() == 5) return vin;
        if (vin.charAt(0) == 'X' || vin.charAt(0) == 'Х' || vin.charAt(0) == 'Z') {
            model = vin.substring(3);
            if (model.length() != 5) {
                model = model.substring(0, 5);
            }
        }
            return model;
    }
}
