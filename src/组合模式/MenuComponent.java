package 组合模式;

// 抽象根节点
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public void add(MenuComponent menucomponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menucomponent) {
        throw new UnsupportedOperationException();

    }

    // 获取指定子菜单
    public MenuComponent getChildren(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或菜单项名称
    public String getName() {
        return name;
    }

    //打印菜单名称
    public abstract void printname();
}
