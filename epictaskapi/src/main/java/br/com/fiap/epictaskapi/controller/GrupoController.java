package br.com.fiap.epictaskapi.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grupo")
public class GrupoController {
    @GetMapping
    public String index(){
        return "Gabriel de Nicola RM: 88803 \n Gustava de Souza Nascimento RM: 88804\n João Victor Deziderio RM: 88805 \n  Nathan Augusto Pagliari RM: 88806";
    }
}
