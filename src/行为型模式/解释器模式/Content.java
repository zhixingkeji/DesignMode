package org.example.行为型模式.解释器模式;

import java.util.HashMap;
import java.util.Map;

//环境角色类
public class Content {
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable variable , Integer value) {
        map.put(variable, value);

    }

    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
