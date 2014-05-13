package com.hong.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

/**
 * Created by Cai on 2014/5/12 16:08.
 *
 * CXF客户端测试
 */
public class HelloServiceClient {
    public static void main(String[] args) throws Exception {
//        String url = "http://192.168.9.72:8080/cxf/ws/helloService?wsdl";
//        String method = "sayHello";
        String url = "http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx?wsdl";
        String method = "qqCheckOnline";
        DynamicClientFactory factory = DynamicClientFactory.newInstance();
        Client client = factory.createClient(url);  // url：地址
        Object reply = client.invoke(method, new Object[]{"327701898"});    // method：方法名称， Object[]：参数
        Object[] replies = (Object[])reply;
        System.out.println("length:" + replies.length);
        for (Object o : replies) {
            System.out.println(o);
        }
    }
}
