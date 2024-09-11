package com.poly.carshopsales.controller;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Home {

        @RequestMapping("/home")
            public String index(){
            return "index";
            }


    }




