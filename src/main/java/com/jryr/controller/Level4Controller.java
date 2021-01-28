package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 10:35
 */
@Controller
@RequestMapping("/level4")
public class Level4Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        nameStr = nameStr.toLowerCase();
        String[] str = {"script", "img","on"};
        for (int i = 0; i < str.length; i++) {
            nameStr = nameStr.replaceAll(str[i], "");
        }
        mv.addObject("name", nameStr);
        mv.setViewName("level4");
        return mv;
    }

}
