package com.eureka.server.eurelainstance.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther sxz
 * @date 2021/12/17
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private Registration registration;

    @GetMapping("hello")
    public String sayHello(){
        registration.getServiceId();
        List<ServiceInstance> list=client.getInstances(registration.getServiceId());
        for (ServiceInstance serviceInstance : list) {
            System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort());
        }
        return "Hello man";
    }
}
