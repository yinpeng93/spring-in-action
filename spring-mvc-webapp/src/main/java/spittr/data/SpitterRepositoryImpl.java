package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spitter;

/**
 * @author yp
 * @description
 * @date 2017/12/21 22:02
 */
@Repository
public class SpitterRepositoryImpl implements SpitterRepository {

    public void save(Spitter spitter) {
        System.out.println("保存成功!");
    }

    public Spitter findByUsername(String username) {
         Spitter spitter = new Spitter();
         spitter.setFirstName("yin");
         spitter.setLastName("peng");
         spitter.setUsername(username);
         return spitter;
    }
}
