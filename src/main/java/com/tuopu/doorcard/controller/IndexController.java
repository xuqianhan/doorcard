package com.tuopu.doorcard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/welcome")
    public String index(@RequestHeader("Accept-Language") String heads){
        System.out.println(heads);
        return "welcome";
    }


}
