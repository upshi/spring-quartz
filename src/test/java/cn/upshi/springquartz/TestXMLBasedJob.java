package cn.upshi.springquartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring-quartz cn.upshi.springquartz
 * 描述：
 * 时间：2017-2-27 18:27.
 */

public class TestXMLBasedJob {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    }

}
