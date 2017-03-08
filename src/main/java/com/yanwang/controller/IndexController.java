package com.yanwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yanjingyang
 * Date: 2017/3/1
 * Time: 16:13
 */
@Controller
public class IndexController {

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "首页");

        return "index";
    }

    @RequestMapping("/i18n")
    public String testI18n(Locale locale, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        String className = request.getClass().getName();
        System.out.println("locale: " + locale);
        String val = messageSource.getMessage("i18n.user", null, locale);
        System.out.println("value: " + val);

        return "i18n";
    }
}
