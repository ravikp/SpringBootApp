package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
class HelloController {

    @RequestMapping("/")
    public String index() {
        return "2. Greetings from fully automated deployment system:" + new Date() + System.lineSeparator();
    }    
}
