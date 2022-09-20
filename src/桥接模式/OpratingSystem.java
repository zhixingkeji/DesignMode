package 桥接模式;

// 抽象化角色
public abstract class OpratingSystem {
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
