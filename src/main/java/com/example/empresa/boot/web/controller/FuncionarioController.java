package com.example.empresa.boot.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

@Controller
@RequestMapping(path = "/funcionarios")
public class FuncionarioController {
    @RequestMapping(method = RequestMethod.GET, value = "/cadastrar")
    public String cadastrarFuncionario(){
        return "/funcionario/cadastro.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public String listarFuncionario(){
        return "/funcionario/lista";
    }
}
