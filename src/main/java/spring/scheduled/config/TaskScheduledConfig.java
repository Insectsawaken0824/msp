package spring.scheduled.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zhao on 2017/2/7.
 */
@Configuration
@ComponentScan("spring.scheduled")
@EnableScheduling
public class TaskScheduledConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduledConfig.class);
    }
}
