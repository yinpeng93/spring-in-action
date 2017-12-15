package cd;

import org.springframework.stereotype.Component;

/**
 * @author yp
 * @description
 * @date 2017/10/16 21:43
 */
@Component
public class CompactDiscImpl implements CompactDisc {
    private String title = "Sgt. Peppper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + "by "+ artist);
    }
}
