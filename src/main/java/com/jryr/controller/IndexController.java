package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author WJRYR
 * @create 2020-08-09 09:15
 */
@Controller
public class IndexController {

    @RequestMapping("/index.do")
    public ModelAndView level1(String name) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

}
