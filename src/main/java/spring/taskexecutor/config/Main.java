package spring.taskexecutor.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.taskexecutor.config.TaskExecuterConfig;
import spring.taskexecutor.service.AsyncTaskService;

/**
 * Created by zhao on 2017/2/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecuterConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10 ;i++){
            bean.executeAsyncTask(i);
            bean.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
