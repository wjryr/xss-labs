package com.jryr.controller;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 19:40
 */
@Controller
@RequestMapping("/level12")
public class Level12Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        nameStr = nameStr.toLowerCase();
        if (nameStr.indexOf("\\x") == -1 && nameStr.indexOf("\\u") == -1) {
            nameStr = StringEscapeUtils.escapeXml11(nameStr);
        }
        mv.addObject("name", nameStr);
        mv.setViewName("level12");
        return mv;
    }

}