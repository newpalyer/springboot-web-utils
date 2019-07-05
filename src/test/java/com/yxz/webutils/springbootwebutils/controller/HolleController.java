package com.yxz.webutils.springbootwebutils.controller;

import com.yxz.webutils.springbootwebutils.annotation.ReqMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/5 16:57
 */
@RestController
@RequestMapping("test")
public class HolleController {
    @ReqMapping(bex = "hello",value = "hello",method = RequestMethod.GET)
    public String get(){
        return "hello";
    }

    @RequestMapping(value = "hello2",method = RequestMethod.GET)
    public String get2(){
        return "hello2";
    }
}
