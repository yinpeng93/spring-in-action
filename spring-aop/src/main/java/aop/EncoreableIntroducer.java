package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import target.DefaultEncoreable;
import target.Encofeable;

/**
 * @author yp
 * @description
 * @date 2017/10/29 21:51
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "target.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encofeable encofeable;
}
