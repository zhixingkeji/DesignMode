package 组合模式;


// 叶子节点角色
public class MenuItem extends MenuComponent{
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;

    }
    @Override
    public void printname() {
        //层级
        for (int i = 0; i< level ; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
