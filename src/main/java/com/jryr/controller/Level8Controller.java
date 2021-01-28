package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 17:13
 */
@Controller
@RequestMapping("/level8")
public class Level8Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name, @RequestHeader(value = "Host") final String host) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        nameStr = nameStr.toLowerCase().replaceAll("\"", "&quot;");
        mv.addObject("host", host);
        mv.setViewName("level8");
        return mv;
    }

}
