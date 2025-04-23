/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.kaue.OSApiApplication.api.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import local.kaue.OSApiApplication.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */
@RestController
public class ClienteController {
    
    @PersistenceContext
    private EntityManager manager;
       
    
    List<Cliente> listaClientes;
    
    @GetMapping("/clientes")
    public List<Cliente>  listas() {
            
        //Linguagem JPQL (tipo SQL Só que do jakarta)
        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
    
    }
    
    
}
