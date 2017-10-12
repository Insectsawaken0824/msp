package spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zhao on 2017/2/8.
 */
@Configuration
public class DemoConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from product profile");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("prod");
        context.getEnvironment().setActiveProfiles("dev");
        context.register(DemoConfig.class);
        context.refresh();
        DemoBean bean = context.getBean(DemoBean.class);
        String content = bean.getContent();
        System.out.println(content);
        context.close();
    }
}
