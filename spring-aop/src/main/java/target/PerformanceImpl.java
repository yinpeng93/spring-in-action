package target;

import org.springframework.stereotype.Component;

/**
 * @author yp
 * @description
 * @date 2017/10/29 17:27
 */
@Component
public class PerformanceImpl implements Performance {
    public void perform() {
        System.out.println("Performing...");
//        int a = 1/0; //用于测试AfterThrowing
        System.out.println("perform success");
    }
}
