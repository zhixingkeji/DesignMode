package Factory.configFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static HashMap<String,Coffee> map = new HashMap<String,Coffee>();
    static {
        Properties properties = new Properties();

        InputStream is =  CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        try{
            properties.load(is);

            Set<Object> keys = properties.keySet();
            System.out.println(keys);

            for (Object key : keys) {
                String className = properties.getProperty((String)key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String)key, coffee);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
