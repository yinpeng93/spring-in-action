package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.data.SpittleRepository;

/**
 * @author yp
 * @description
 * @date 2017/12/16 19:48
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "" + Long.MAX_VALUE;
    private SpittleRepository spittleRepository;
    @Autowired //注入spittleReposetory
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    /**
     * model实际上是一个map，它会传递给视图
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam(value = "max",defaultValue = MAX_LONG_AS_STRING) long max,
                           @RequestParam(value = "count",defaultValue = "20") int count, Model model){ //将spittle加入到model中
        model.addAttribute( spittleRepository.findSpittles(Long.MAX_VALUE,count));
        return "spittles";
    }

    /**
     * 路径参数接受输入
     * @param spittleId
     * @param model
     * @return
     */
    @RequestMapping(value = "/{spittleId}",method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId")String spittleId,Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
