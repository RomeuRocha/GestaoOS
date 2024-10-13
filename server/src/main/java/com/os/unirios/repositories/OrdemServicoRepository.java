
package com.os.unirios.repositories;

import com.os.unirios.entities.OrdemServico; 

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

    @Query("FROM OrdemServico obj")
	public Page<OrdemServico> ordemServicoPage(Pageable pageable);
    
} 
