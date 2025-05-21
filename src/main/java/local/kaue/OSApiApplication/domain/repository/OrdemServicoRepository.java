/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.kaue.OSApiApplication.domain.repository;

import local.kaue.OSApiApplication.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>   {
    
}
