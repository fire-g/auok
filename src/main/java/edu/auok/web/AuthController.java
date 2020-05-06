package edu.auok.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 认证相关接口
 * @author HaoTian
 * @date 2020/05/06
 */
@RestController
public class AuthController {

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("/login");
    }
}
