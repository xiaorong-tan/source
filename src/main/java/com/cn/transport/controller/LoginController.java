package com.cn.transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: A Handsome Man
 * Date:2019/6/1
 * Time:16:20
 * <p>
 * When I wrote this, only God and I understood what I was doing
 * <p>
 * Now, God only knows
 * <p>
 * Good Luck
 **/
@Controller
public class LoginController {
    /**
     * 页面跳转
     *
     * @return
     */
    @GetMapping(value = {"/", "login"})
    public String login() {
        return "login";
    }
}