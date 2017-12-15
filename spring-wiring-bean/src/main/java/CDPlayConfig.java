import cd.CDPlayer;
import cd.CompactDisc;
import cd.CompactDiscImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yp
 * @description
 * @date 2017/10/16 21:54
 */

@Configuration  //标记该类是Java配置类
//组件扫描方式创建bean
//@ComponentScan(basePackages = {"cd"})
public class CDPlayConfig {
    @Bean
    public CDPlayer getCDPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }

    @Bean
    public CompactDisc getCompactDisc(){
        return new CompactDiscImpl();
    }
}
