package com.sss.probie.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by K.Kangai on 2015/07/14.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model) {
        return "bbs/bbs";
    }
}
