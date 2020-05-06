package edu.auok.config;

import edu.auok.auth.SmsCodeAuthenticationSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author HaoTian
 * @date 2020/05/06
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SmsCodeAuthenticationSecurityConfig securityConfig;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //设置访问权限
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll();
        //开启登录
        http.formLogin()
                //设置自定义登录页面
                .loginPage("/login");
        //关闭csrf功能
        http.csrf().disable();

        //开启注销
        http.logout()
                //登录成功后跳转到首页
                .logoutSuccessUrl("/");

        http.apply(securityConfig).and().authorizeRequests()
                //如果运行匿名的url，填在下面
                .antMatchers("/sms-login").permitAll()
                .anyRequest().authenticated()
                .and()
                //设置登录页
                .formLogin().loginPage("/login")
                //设置登录成功页面
                .defaultSuccessUrl("/").permitAll()
                .and()
                .logout().permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
        //设置拦截忽略文件夹，可以对静态资源放行
        web.ignoring().antMatchers("/css/**", "/js/**", "/**.ico", "/**.png");
    }
}
