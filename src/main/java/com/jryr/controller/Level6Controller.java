package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 16:15
 */
@Controller
@RequestMapping("/level6")
public class Level6Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        nameStr = nameStr.toLowerCase();
        String[] str = {"script", "onclick"};
        for (int i = 0; i < str.length; i++) {
            int flag = nameStr.indexOf(str[i]);
            while (flag != -1) {
                nameStr = nameStr.replaceAll(str[i], "");
                flag = nameStr.indexOf(str[i]);
            }
        }
        mv.addObject("name", nameStr);
        mv.setViewName("level6");
        return mv;
    }

}
