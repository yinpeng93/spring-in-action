package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yp
 * @description
 * @date 2017/12/12 13:31
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<String,Object>();
        int aa = (Integer) map.get("aa");
        System.out.println(aa);
    }
}
