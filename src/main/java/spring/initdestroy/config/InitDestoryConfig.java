package spring.initdestroy.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.initdestroy.demo.BeanWayService;
import spring.initdestroy.demo.JSR250WayService;

/**
 * Created by zhao on 2017/2/6.
 */
@Configuration
@ComponentScan("spring.initdestory")
public class InitDestoryConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(InitDestoryConfig.class);
        annotationConfigApplicationContext.getBean(BeanWayService.class);
        annotationConfigApplicationContext.getBean(JSR250WayService.class);
        annotationConfigApplicationContext.close();
    }
}
