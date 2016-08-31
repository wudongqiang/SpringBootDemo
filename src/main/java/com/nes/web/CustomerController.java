package com.nes.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by wdq on 16-8-30.
 */

@RestController
public class CustomerController {


    @RequestMapping("/")
    public String home(){

        System.out.println("----111-----");
        System.out.println("----home-----");

        return "hello world ,welcome study spring boot!";
    }

    @RequestMapping("/now")
    public String nowTime(){
        /// 主要是这边不方便弄，
        return "";

    }


}
