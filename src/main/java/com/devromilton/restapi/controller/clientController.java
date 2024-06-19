package com.devromilton.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devromilton.restapi.model.cliente;

@RestController
@RequestMapping("/clients")
public class clientController {

    @GetMapping
    public List<cliente> listar(){

    }
}
