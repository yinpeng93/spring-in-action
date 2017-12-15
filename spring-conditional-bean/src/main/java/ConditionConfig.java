import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author yp
 * @description
 * @date 2017/10/26 22:13
 */
@Configuration
public class ConditionConfig {
    @Bean
    //当conditional中的条件返回true，创建该bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
