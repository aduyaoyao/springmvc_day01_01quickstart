package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;
@SessionAttributes(value = {"msg"}) //将msg=存入session中
@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "username") String name){
        System.out.println (name);
        System.out.println ("执行了");
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println (body);
        return "success";
    }
    @RequestMapping(value = "/testPathVariable/{id}",method = RequestMethod.PUT)
    public String testPathVariable(@PathVariable String id){
        System.out.println (id);
        return "success";
    }
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String header){
        System.out.println (header);
        return "success";
    }


    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println (cookieValue);
        return "success";
    }


    @RequestMapping(value = "/testModeAttribute")
    public String testModeAttribute(@ModelAttribute("abc") User user){
        System.out.println ("test modeAttribute");
        System.out.println (user);
        return "success";
    }

        @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        //通过用户名查询数据库（模拟）
        User user = new User ();
        user.setUname (uname);
        user.setDate (new Date ());
        user.setAge (10);
        map.put ("abc", user);
    }
//    /**
//     * 该方法会先执行
//     */
//    @ModelAttribute
//    public User show(String uname){
//        //通过用户名查询数据库（模拟）
//        User user = new User ();
//        user.setUname (uname);
//        user.setDate (new Date ());
//        user.setAge (10);
//        return user;
//    }
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println ("session");
        model.addAttribute ("msg", "sad");
       return "success";
    }

    /**
     * 获取值
     * @param map
     * @return
     */
    @RequestMapping(value = "/testget")
    public String testSessionAttributes(ModelMap map){
        System.out.println ("get");
        String msg = (String)map.get ("msg");
        System.out.println (msg);
        return "success";
    }

    /**
     * 删除
     * @param map
     * @return
     */
    @RequestMapping(value = "/testdelete")
    public String testdelete(SessionStatus sessionStatus){
        sessionStatus.setComplete ();
        return "success";
    }
}
