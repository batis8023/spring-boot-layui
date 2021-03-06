package com.demo.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页控制器
 *
 * @author dswl
 */
@Controller
public class IndexController {
    @RequestMapping(
            value = {"/", "/index", "/index.html"},
            method = RequestMethod.GET
    )
    public String index() {
        return "index";
    }
}
