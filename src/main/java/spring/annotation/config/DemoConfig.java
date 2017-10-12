package spring.annotation.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.service.DemoService;
import spring.annotation.annotation.WiselyConfiguration;

/**
 * Created by zhao on 2017/2/8.
 */
@WiselyConfiguration("spring.annotation")
public class DemoConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService bean = context.getBean(DemoService.class);
        bean.outputResult();
        context.close();
    }
}
