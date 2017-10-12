package spring.aware.demo;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by zhao on 2017/2/7.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    /**
     *      spring提供的Aware接口
     *
     *      BeanNameAware                   获得容器中Bean的名称
     *      BeanFactoryAware                获得当前bean factory,这样可以调用容器的服务
     *      ApplicationContextAware*        当前的application context,这样可以调用容器的服务
     *      MessageSourceAware              获得message source,这样可以获得文本信息
     *      ApplicationEventPublisherAware  应用时间发布器,可以发布事件,DemoPublisher也可实现这个接口来发布事件
     *      ResourceLoaderAware             资源加载器.可以获得外部资源文件
     */

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("BeanName为:"+beanName);
        Resource resource = loader.getResource("classpath:profile.txt");
        try {
            System.out.println("文件内容为:"+IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
