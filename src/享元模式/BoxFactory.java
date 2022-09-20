package 享元模式;

import java.util.HashMap;

// 工厂类单例模式
public class BoxFactory {
    private HashMap<String, AbstractBox > map;

    private BoxFactory(){
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());

    }

    public static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance() {
        return factory;

    }


    public AbstractBox getShape(String name) {
        return map.get(name);
    }

}
