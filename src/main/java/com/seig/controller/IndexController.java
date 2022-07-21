package com.seig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //在templates目录下的所有页面，只能通过controller来跳转！
//这个需要模板引擎的支持 ！ thymeleaf
public class IndexController {

//    @RequestMapping({"/","/index.html"})
//    public String Index(){
//        return "index";
//    }

    @RequestMapping("t1")
    public String test1(Model model) {
        //存入数据
        model.addAttribute("msg", "Hello,Thymeleaf");
        //classpath:/templates/test.html
        return "test";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "My SpringBoot Project！！";
    }
}
