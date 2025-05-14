/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.kaue.OSApiApplication.domain.service;

import local.kaue.OSApiApplication.domain.exception.DomainException;
import local.kaue.OSApiApplication.domain.model.Cliente;
import local.kaue.OSApiApplication.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    
    public Cliente salvar(Cliente cliente){
        Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
        
        //Lembre-se que o metodo SAVE pode ser usado para utilizar um cliente também !!!
        //ID vazio->    Novo Registro 
        // ID Preenchido 
        
        //verifica 
        if(clienteExistente != null && !clienteExistente.equals(cliente)){
            //lançar exception 
            throw new DomainException("Ja existe um cliente cadastrado com esse email!");
            
        }
        return  clienteRepository.save(cliente);
              
    }
    public void excluir(Long clienteId){ 
        clienteRepository.deleteById(clienteId );
    }
}
