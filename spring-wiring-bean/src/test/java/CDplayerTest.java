import cd.CompactDisc;
import cd.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yp
 * @description
 * @date 2017/10/16 21:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayConfig.class})
public class CDplayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
    }

    //测试自动装配
    @Test
    public void play(){
        player.play();
    }
}
