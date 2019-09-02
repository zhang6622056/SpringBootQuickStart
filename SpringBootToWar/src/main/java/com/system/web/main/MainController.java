package com.system.web.main;

import com.system.spring.ignore.IgnoreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Nero on 2018-08-22.
 */
@RestController
@RequestMapping("/main")
public class MainController {



    @Autowired
    IgnoreInterface ignoreInterface;
    @Autowired
    ApplicationContext applicationContext;





    @RequestMapping("getmain")
    public String getMain(){
        System.out.println(applicationContext.getApplicationName());
        ignoreInterface.setTest();
        return "123";
    }






}
