package spring.event.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.event.publisher.DemoPublisher;

/**
 * Created by zhao on 2017/2/6.
 */
@Configuration
@ComponentScan("spring.event")
public class EventConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        System.out.println(context.containsBean("DemoPublisher"));
        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("诶呦我去");
        context.close();

    }
}
