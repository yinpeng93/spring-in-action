package spittr.data;

import spittr.Spittle;

import java.util.List;

public interface SpittleRepository {
    /**
     * 获取Spittle列表
     * @param max 代表所返回的Spittle中，Spittle ID属性的最大值
     * @param count 表明要返回多少个Spittle对象
     * @return
     */
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(String spittleId);
}
