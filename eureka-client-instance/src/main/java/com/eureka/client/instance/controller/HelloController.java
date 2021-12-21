package com.eureka.client.instance.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther sxz
 * @date 2021/12/17
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value ="hello",method = RequestMethod.GET)
    public String sayHello(){
        logger.info("-------------");
        ServiceInstance serviceInstance=client.getLocalServiceInstance();
        String info=serviceInstance.getServiceId()+":"+serviceInstance.getPort();
        logger.info("------"+info+"-------");
        return "Hello man";
    }
}
