package spring.condition;

import org.springframework.context.annotation.*;

/**
 * Created by zhao on 2017/2/7.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListServiceImpl(){
        return new WindowsListServiceImpl();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListServiceImpl(){
        return new LinuxListServiceImpl();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService bean = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统的命令"+bean.showListCmd());
    }
}
