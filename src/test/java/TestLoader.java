import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Set;

public class TestLoader extends TestCase {
    HashMap<String,Model> modelMap;
    Loader loader;
    public void testLoader() {
        loader = new Loader();
        modelMap = loader.getDatabase();
        Set<String> models = modelMap.keySet();
        for(String model : models) {
            assertNotNull(modelMap.get(model));
        }
    }
}
