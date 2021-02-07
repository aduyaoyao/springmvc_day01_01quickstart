package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数的绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定的入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println ("param...");
        System.out.println (username);
        System.out.println (password);
        return "success";
    }

    /**
     * 将请求参数绑定到javabean中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println (account);
        return "success";

    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveAccount(User user){
        System.out.println (user);
        return "success";
    }

    /**
     * 原生的Servlet的api
     * @param user
     * @return
     */
    @RequestMapping("/testServlet")
    public String saveAccount(HttpServletRequest request, HttpServletResponse response){
        System.out.println ("asdas");
        System.out.println (request);
        HttpSession session = request.getSession ();
        System.out.println (session);
        ServletContext servletContext = session.getServletContext ( );
        System.out.println (servletContext);
        return "success";
    }
}
