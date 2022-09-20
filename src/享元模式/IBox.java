package 享元模式;


// 具体享元角色  I形状 方块
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }


}
