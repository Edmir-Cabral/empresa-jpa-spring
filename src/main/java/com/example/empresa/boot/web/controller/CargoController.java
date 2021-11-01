package com.example.empresa.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/cargos")
public class CargoController {
    @RequestMapping(method = RequestMethod.GET, value = "/cadastrar")
    public String cadastrarCargo(){
        return "/cargo/cadastro.html";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public String listarCargo(){
        return "/cargo/lista.html";
    }
}
