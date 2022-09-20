package 桥接模式;

public class Mac extends OpratingSystem{

    public Mac(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
