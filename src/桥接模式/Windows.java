package 桥接模式;

// 扩展抽象化角色
public class Windows extends OpratingSystem{
    public Windows(VideoFile videofile) {
        super(videofile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }

}
