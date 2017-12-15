package config;

import aop.Audience;
import aop.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yp
 * @description
 * @date 2017/10/29 17:12
 */
@Configuration
@ComponentScan(basePackages = {"aop","target"})
@EnableAspectJAutoProxy//启用自动代理
public class JavaConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }
}
