package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yp
 * @description
 * @date 2017/12/16 20:05
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            list.add(new Spittle("spittle"+i,new Date()));
        }
        return list;
    }

    public Spittle findOne(String spittleId) {
        return new Spittle(spittleId,new Date());
    }
}
