package spring.taskexecutor.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by zhao on 2017/2/7.
 */
@Service
public class AsyncTaskService {

    @Async  //表明该方法是个异步方法,如果注解在类级别,则表明该类所有的方法都是异步方法,而这里的方法自动被注入使用ThreadPoolTaskExecuter作为TaskExecuter
    public void executeAsyncTask(int i){
        System.out.println("第一个任务执行"+i);
    }

    @Async
    public void executeAsyncTaskPlus(int i){
        System.out.println("第二个任务执行"+i);
    }
}
