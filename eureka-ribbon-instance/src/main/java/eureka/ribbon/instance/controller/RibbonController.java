package eureka.ribbon.instance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther sxz
 * @date 2021/12/21
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://MICROSERVICE-DISCOVERY-EUREKA-CLIENT/hello",
                String.class).getBody();
    }

}
