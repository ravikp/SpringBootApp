package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings..1.." + new Date() + System.lineSeparator();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "1..Hello world:- " + new Date() + System.lineSeparator();
    }
}
