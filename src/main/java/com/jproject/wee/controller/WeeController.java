package com.jproject.wee.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/wee")
public class WeeController {

    @GetMapping("/test")
    public String test() {

        return "/weeMain/testPage";

    }

}
