package com.hong.cxf.client;

import com.hong.cxf.webservice.IHelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cai on 2014/5/12 16:08.
 */
public class HelloServiceClient {
    public static void main(String[] args) {
//        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext-client.xml");
//        IHelloService helloService = (IHelloService) cxt.getBean("client");
//        String response = helloService.sayHello("Peter");
//        System.out.println(response);
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IHelloService.class);
        factory.setAddress("http://localhost:8080/cxf/ws/helloService");

    }
}
