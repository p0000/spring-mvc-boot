package com.sss.probie.example.controller;

import com.sss.probie.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kei.Kangai on 2015/07/06.
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService ;

    @RequestMapping("/hello")
    public String hello(Model model) {
        String word = helloService.saySomething();
        model.addAttribute("word", word);
        return "greeting";
    }
}
