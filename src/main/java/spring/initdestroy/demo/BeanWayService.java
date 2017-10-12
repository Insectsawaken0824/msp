package spring.initdestroy.demo;

/**
 * Created by zhao on 2017/2/6.
 */
public class BeanWayService {
    public BeanWayService() {
        super();
        System.out.println("BeanWayService initialize");
    }

    public void init(){
        System.out.println("BeanWayService init executed");
    }

    public void destory(){
        System.out.println("BeanWayService destory executed");
    }
}
