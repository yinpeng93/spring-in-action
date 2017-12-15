import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author yp
 * @description
 * @date 2017/10/26 22:06
 */
public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //通过ConditionContext获取Environment对象
        Environment environment = conditionContext.getEnvironment();
        //检查是否存在magic这个环境属性
        return environment.containsProperty("magic");
    }
}
