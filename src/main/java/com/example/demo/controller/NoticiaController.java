package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Noticia;
import com.example.demo.services.NoticiaServiceImplementation;

@RequestMapping("/noticia")
@Controller
public class NoticiaController {
    @Autowired
    NoticiaServiceImplementation service;

    @PostMapping("/addNoticia")
    public String create(Noticia noticia, Model model){
        model.addAttribute(noticia);
        service.saveNoticia(noticia);
        return "prueba";
    }

    @GetMapping({"","/"})
    public String formNoticia(Model model){
        Noticia noticia = new Noticia();
        model.addAttribute(noticia);
        return "noticia/formNoticia";
    }
}