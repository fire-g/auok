package edu.auok.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HaoTian
 */
@RestController
public class HospitalController {

    @GetMapping("/hospital")
    public ModelAndView view(){
        return new ModelAndView("/hospital");
    }
}
