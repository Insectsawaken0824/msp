package spring.aware.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.aware.demo.AwareService;

/**
 * Created by zhao on 2017/2/7.
 */
@Configuration
@ComponentScan("spring.aware")
public class AwareConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.outputResult();
        context.close();
    }
}
