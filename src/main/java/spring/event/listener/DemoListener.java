package spring.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import spring.event.event.DemoEvent;

/**
 * Created by zhao on 2017/2/6.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(Listener)接收到了Publisher发布的消息"+msg);
    }
}
