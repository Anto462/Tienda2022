package com.tienda.controller;

import com.tienda.ClienteDao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos usando spring"); //aparece en log de la sesion
        
        var clientes = clienteDao.findAll();
        
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
    
}
