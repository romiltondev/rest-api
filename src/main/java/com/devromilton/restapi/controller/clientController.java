package com.devromilton.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devromilton.restapi.model.Cliente;
import com.devromilton.restapi.repository.ClientRepository;

@RestController
@RequestMapping("/clients")
public class clientController {

    @Autowired
    private ClientRepository clientrepository;

    @GetMapping
    public List<Cliente> listar(){
        return clientrepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clientrepository.save(cliente);
    }
}
