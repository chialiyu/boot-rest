package k8s.tgt.com.bootrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/boot-rest/v1")
public class BootRestController {

    // http://localhost:8080/boot-rest/v1/greetings
    @RequestMapping (value = "/greetings")
    String greetings (){
        return "Greetings!";
    }
}
