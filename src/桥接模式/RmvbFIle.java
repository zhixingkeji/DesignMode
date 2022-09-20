package 桥接模式;

// rmvb 具体实现化角色
public class RmvbFIle implements VideoFile{
    @Override
    public void decode(String filename) {
        System.out.println("rmvb视频文件" + filename);

    }
}
