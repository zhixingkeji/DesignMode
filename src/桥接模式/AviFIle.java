package 桥接模式;

// avi视频文件 具体实现化角色
public class AviFIle implements VideoFile{

    @Override
    public void decode(String filename) {
        System.out.println("avi视频" + filename);
    }
}
