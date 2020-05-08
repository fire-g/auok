package edu.auok.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HaoTian
 */
@RestController
public class HospitalController {

    @GetMapping("/personal")
    public ModelAndView view(){
        ModelAndView view=new ModelAndView("/personal");
        view.addObject("name","info");
        return view;
    }

    @GetMapping("/personal/{name}")
    public ModelAndView op(@PathVariable String name){
        ModelAndView view=new ModelAndView("/personal");
        view.addObject("name",name);
        return view;
    }
}
