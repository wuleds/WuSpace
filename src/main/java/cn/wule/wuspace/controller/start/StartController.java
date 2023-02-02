package cn.wule.wuspace.controller.start;
//汉江师范学院 数计学院 吴乐创建于2023/2/2 17:37:16

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**初始页面
 * @author 吴乐*/
@Controller
@CrossOrigin
public class StartController
{
    public static Logger logger = LoggerFactory.getLogger(StartController.class.getName());

    static {
        logger.info("[日志]StartController Ready...");
    }

    @RequestMapping("/")
    public ModelAndView startView()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Start");
        logger.info("[日志]跳转Start");

        return modelAndView;
    }
}