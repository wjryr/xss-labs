package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 09:27
 */
@Controller
@RequestMapping("/level1")
public class Level1Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception{
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        mv.addObject("name",nameStr);
        mv.setViewName("level1");
        return mv;
    }

}
