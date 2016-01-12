package lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by david on 1/8/16.
 */
@Controller
public class Lab1Controller {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
