package gicb.i4.i4bweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {
    @GetMapping("/")
    public String Home(){
        return "home";
    }
}
