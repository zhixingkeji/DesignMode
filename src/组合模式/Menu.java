package 组合模式;

import java.util.ArrayList;
import java.util.List;

// 菜单类 树枝节点角色
public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name, int  level) {
        this.name = name;
        this.level = level;
    }


    @Override
    public void add(MenuComponent menucomponent) {
        menuComponentList.add(menucomponent);
    }

    @Override
    public void remove(MenuComponent menucomponent) {
        menuComponentList.remove(menucomponent);
    }

    @Override
    public MenuComponent getChildren(int index) {
        return super.getChildren(index);
    }

    @Override
    public void printname() {
        //层级
        for (int i = 0; i< level ; i++) {
            System.out.print("--");
        }

        //打印菜单名称
        System.out.println(name);
        //打印子菜单名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.printname();
        }

    }
}
