package spring.initdestroy.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhao on 2017/2/6.
 */
public class JSR250WayService {
    public JSR250WayService() {
        super();
        System.out.println("JSR250WayService initialize");
    }

    @PostConstruct
    public void init(){
        System.out.println("JSR250WayService init executed");
    }
    @PreDestroy
    public void destory(){
        System.out.println("JSR250WayService destory executed");
    }
}
