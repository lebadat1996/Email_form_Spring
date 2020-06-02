package com.codegym.controller;

import com.codegym.model.webapp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class EmailController {
    @GetMapping()
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @ModelAttribute("language")
    public List<String> languages() {
        List<String> languages = new ArrayList<>();
        languages.add("english");
        languages.add("Japan");
        languages.add("Chinese");
        languages.add("italia");
        return languages;
    }

    @ModelAttribute("size")
    public List<Integer> size() {
        List<Integer> size = new ArrayList<>();
        size.add(10);
        size.add(20);
        size.add(30);
        size.add(30);
        return size;
    }

    @GetMapping("/formEmail")
    public ModelAndView showGetForm() {
        ModelAndView modelAndView = new ModelAndView("webApp");
        modelAndView.addObject("language", languages());
        modelAndView.addObject("size", size());
        modelAndView.addObject("formEmail", new webapp());
        return modelAndView;
    }

    @PostMapping("/formEmail")
    public ModelAndView getForm(@ModelAttribute webapp webapp) {
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("formEmail", webapp);
        return modelAndView;
    }
}
