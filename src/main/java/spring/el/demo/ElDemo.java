package spring.el.demo;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by zhao on 2017/2/5.
 */
@Configuration
@ComponentScan("spring.el")
@PropertySource("classpath:el.properties")
public class ElDemo {
    //注入普通字符串
    @Value("I Love You!")
    private String normal;
    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    //注入表达式结果
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumb;
    //注入其他Bean属性
    @Value("#{injectBean.injectBeanName}")
    private String fromBeanName;
    //注入文件资源
    @Value("classpath:profile.txt")
    private Resource testTxt;
    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;
    //注入配置文件
    @Value("${hello}")
    private String hello;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    //注入配置文件第二种方式
    @Autowired
    private Environment environment;

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(hello);
            System.out.println(randomNumb);
            System.out.println(fromBeanName);
            System.out.println(IOUtils.toString(testTxt.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(environment.getProperty("world"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ElDemo.class);
        ElDemo bean = applicationContext.getBean(ElDemo.class);
        bean.outputResource();
        applicationContext.close();
    }

}

