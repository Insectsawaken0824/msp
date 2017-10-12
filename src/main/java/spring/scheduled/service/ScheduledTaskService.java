package spring.scheduled.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhao on 2017/2/7.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//每隔固定时间执行
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次 "+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 24 22 ? * *")//按照指定时间执行,cron是UNIX和类UNIX(Linux)系统下的定时任务
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+dateFormat.format(new Date()) +"执行");
    }
}
