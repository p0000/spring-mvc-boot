package com.sss.probie.example.service.impl;

import com.sss.probie.example.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by 0A8936 on 2015/07/06.
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String saySomething() {
        return "Hello from IntelliJ World !";
    }
}
