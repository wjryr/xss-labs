package com.jryr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JRYR
 * @create 2020-08-09 10:17
 */
@Controller
@RequestMapping("/level3")
public class Level3Controller {

    @RequestMapping("/find.do")
    public ModelAndView find(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nameStr = new String(name.getBytes("iso-8859-1"), "UTF-8");
        String[] str = {"script"};
        for (int i = 0; i < str.length; i++) {
            int flag = nameStr.indexOf(str[i]);
            while(flag != -1){
                nameStr = nameStr.replaceAll(str[i],"");
                flag = nameStr.indexOf(str[i]);
            }
        }
        mv.addObject("name", nameStr);
        mv.setViewName("level3");
        return mv;
    }

}
