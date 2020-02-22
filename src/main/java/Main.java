import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Model> base = new Loader().getDatabase();
        for (; ; ) {
            try {
                System.out.println("Введите модель или VIN-номер: ");
                String enteredModel = reader.readLine();
                if (!base.containsKey(enteredModel)) {
                    System.out.println("Такой модели пока нет в справочнике! " +
                            "Проверьте правильность ввода или обратитесь к разработчику");
                    continue;
                }
                System.out.println(base.get(enteredModel));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
