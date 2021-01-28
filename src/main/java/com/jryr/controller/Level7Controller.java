package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 16:34
 */
@Controller
@RequestMapping("/level7")
public class Level7Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        nameStr = nameStr.toLowerCase().replaceAll(">", "");
        mv.addObject("name", nameStr);
        mv.setViewName("level7");
        return mv;
    }

}
