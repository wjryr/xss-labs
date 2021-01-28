package com.jryr.controller;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 17:36
 */
@Controller
@RequestMapping("/level9")
public class Level9Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        String nameIframe = nameStr;
        nameStr = StringEscapeUtils.escapeXml11(nameStr.toLowerCase());
        mv.addObject("name", nameStr);
        mv.addObject("nameIframe",nameIframe);
        mv.setViewName("level9");
        return mv;
    }

}
