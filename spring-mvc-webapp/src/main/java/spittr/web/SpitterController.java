package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.validation.Valid;

/**
 * @author yp
 * @description
 * @date 2017/12/21 21:19
 */

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterRepository spitterRepository;

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    /**
     * 注册操作
     * @param spitter
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors){ //@Valid校验Spitter输入
        if(errors.hasErrors()){
            return "registerForm"; //有错误重新返回表单
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    /**
     * 显示用户信息
     * @return
     */
    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username,Model model){
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }
}
