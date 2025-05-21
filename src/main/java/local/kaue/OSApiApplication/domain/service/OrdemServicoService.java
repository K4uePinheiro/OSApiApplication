/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.kaue.OSApiApplication.domain.service;

import java.time.LocalDateTime;
import local.kaue.OSApiApplication.domain.model.OrdemServico;
import local.kaue.OSApiApplication.domain.model.StatusOrdemServico;
import local.kaue.OSApiApplication.domain.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class OrdemServicoService {
    
    @Autowired
    private OrdemServicoRepository ordemServicoRepository;
    
   public OrdemServico criar (OrdemServico ordemServico){
       ordemServico.setStatus(StatusOrdemServico.ABERTA);   
       ordemServico.setDataAbertura(LocalDateTime.now());
       
       return ordemServicoRepository.save(ordemServico);
   }
}
