package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 10:53
 */
@Controller
@RequestMapping("/level5")
public class Level5Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        nameStr = nameStr.replaceAll(">","&gt;");
        mv.addObject("name", nameStr);
        mv.setViewName("level5");
        return mv;
    }

}
