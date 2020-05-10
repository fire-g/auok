package edu.auok.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HaoTian
 * @date 2020/05/06
 */
@RestController
public class HomePageController {

    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }
//
//    @GetMapping("/login")
//    public ModelAndView login(){
//        return new ModelAndView("/login");
//    }
}
