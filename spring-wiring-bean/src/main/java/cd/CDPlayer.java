package cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yp
 * @description
 * @date 2017/10/19 22:40
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
