package com.hong.cxf.webservice;

import junit.framework.TestCase;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.ws.Endpoint;

/**
 * Created by Cai on 2014/5/12 14:13.
 */
public class CxfDemoImplTest extends TestCase {
    private static final String ADDRESS = "http://localhost:8080/cxf";
    @org.junit.Before
    public void setUp() throws Exception {
        super.setUp();

        System.out.println("Starting Server");
        HelloServiceImpl demo = new HelloServiceImpl();

        Endpoint.publish(ADDRESS, demo);
        System.out.println("Start Success");
    }

    @org.junit.Test
    public void testSayHello() throws Exception {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(IHelloService.class);
        factoryBean.setAddress(ADDRESS);
        IHelloService client = (IHelloService)factoryBean.create();
        Assert.assertEquals(client.sayHello("foo"), "Hello foo");
    }

    @Test
    public void testQQ() throws Exception {
//        long s=new Date().getTime();
//        QName SERVICE = new QName("http://liaomin", "UserServiceImplService");
//        QName UserServiceImplPort = new QName("http://liaomin", "UserServiceImplPort");
//        URL url = new URL("http://localhost:8088/abc?wsdl");
//        ServiceDelegate dele= Provider.provider().createServiceDelegate(url,SERVICE,Service.class);
//        UserService us = (UserService) dele.getPort(UserServiceImplPort,UserService.class);
//        User u = new User();
//        us.addUser(u);
//        long s1=new Date().getTime();
//        System.out.println(s1-s);
    }
}
