package 单例模式.demo2;

// 单例模式 懒汉式1
public class Slob {
    // 私有方法
    private Slob(){

    }

    // 声明变量
    private static Slob instance;

    // 对外访问 处理线程安全问题
    public static synchronized Slob getInstance() {

        //判断是否存在 如果存在直接返回
        if(instance == null) {
            instance = new Slob();
        }

        return instance;
    }

}
