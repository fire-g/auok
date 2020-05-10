package edu.auok.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 认证相关接口
 * @author HaoTian
 * @date 2020/05/06
 */
@RestController
public class AuthController {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("/login");
    }

    @RequestMapping("/sms-code")
    @ResponseBody
    public void sms(String mobile, HttpSession session){
        int code=(int)Math.ceil(Math.random()*9000+1000);
        Map<String,Object> map=new HashMap<>();
        map.put("mobile",mobile);
        map.put("code",code);

        session.setAttribute("smsCode",map);

        logger.info("{}:为{}设置短信验证码:{}",session.getId(),mobile,code);
    }
}
