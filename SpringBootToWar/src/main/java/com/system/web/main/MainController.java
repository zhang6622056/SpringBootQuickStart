package com.system.web.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nero on 2018-08-22.
 */
@RestController
@RequestMapping("/main")
public class MainController {


    @RequestMapping("getmain")
    public String getMain(){
        return "123";
    }






}
