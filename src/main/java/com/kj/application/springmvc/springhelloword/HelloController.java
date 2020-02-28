package com.kj.application.springmvc.springhelloword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String printHello(ModelMap modelMap) {
       modelMap.addAttribute("message", "hello word");
       return "hello";
    }
}
