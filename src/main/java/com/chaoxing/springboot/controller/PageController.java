package com.chaoxing.springboot.controller;

import com.chaoxing.springboot.config.KafkaProducer;
import com.chaoxing.springboot.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @Autowired
    KafkaProducer producer;
    @Autowired
    PageService pageService;

    @RequestMapping(value = "/page")
    public String home(Model model, String name) {
        producer.send(name);
        pageService.test();
        model.addAttribute("name", name);
        return "page";
    }

}
