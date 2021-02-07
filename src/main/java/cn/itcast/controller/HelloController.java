package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器类
@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping(path = "/hello")//用于建立请求URL和处理请求方法之间的对应关系
    public String sayHello(){
        System.out.println ("hello");
        return "success";//表示默认jsp的文件
    }

    /**
     * RequestMapping注解
     * @return
     */
    @RequestMapping(value = "/testRequestMapping",params = {"username"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println ("测试RequestMapping的注解");
        return "success";
    }
}
