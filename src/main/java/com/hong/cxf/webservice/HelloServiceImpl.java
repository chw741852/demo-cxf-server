package com.hong.cxf.webservice;

import com.alibaba.fastjson.JSON;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Cai on 2014/5/12 14:10.
 */
@WebService(endpointInterface = "com.hong.cxf.webservice.IHelloService", serviceName = "helloService")
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String username) {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> data = new HashMap<>();
        data.put("name", "cai");
        data.put("age", "25");
        list.add(data);
        data = new HashMap<>();
        data.put("name", "hong");
        data.put("age", "21");
        list.add(data);

        map.put("status", true);
        map.put("data", list);
        map.put("username", username);

        String json = JSON.toJSONString(map);
        System.out.println(json);

        return json;
    }
}
