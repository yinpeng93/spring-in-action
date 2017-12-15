package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yp
 * @description
 * @date 2017/12/10 20:40
 */
@Controller  //声明为一个控制器
public class HomeController {
    /**
     * 处理对“/”的get请求
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hh(){
        return "hello";
    }
}
