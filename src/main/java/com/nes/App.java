package com.nes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by wdq on 16-8-30.
 */

//@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class App {



    public static void main(String[] args) {
        //start app
        SpringApplication.run(App.class,args);

        //这里别修改了
        System.out.println("start end...");

    }

}
