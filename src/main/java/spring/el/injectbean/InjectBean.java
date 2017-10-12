package spring.el.injectbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zhao on 2017/2/4.
 */
@Service
public class InjectBean {
    @Value("注入bean名称")
    private String injectBeanName;

    public String getInjectBeanName() {
        return injectBeanName;
    }

    public void setInjectBeanName(String injectBeanName) {
        this.injectBeanName = injectBeanName;
    }
}
