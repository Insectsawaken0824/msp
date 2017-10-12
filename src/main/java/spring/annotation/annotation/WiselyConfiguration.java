package spring.annotation.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by zhao on 2017/2/8.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
@Configuration
public @interface WiselyConfiguration {
    String[] value() default {};
}
