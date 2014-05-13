package com.hong.cxf.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Cai on 2014/5/12 14:09.
 */
@WebService
public interface IHelloService {
    @WebMethod(action = "sayHelloAction", operationName = "sayHello")
    public String sayHello(@WebParam(name = "username")String username);
}
