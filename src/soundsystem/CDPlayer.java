package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

//    @Autowired
//    public void setCompactDisk(CompactDisc cd) {
//        this.cd = cd;
//    }

    @Override
    public void play() {

    }
}
