package spring.annotation.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhao on 2017/2/8.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
