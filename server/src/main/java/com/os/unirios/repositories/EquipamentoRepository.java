
package com.os.unirios.repositories;

import com.os.unirios.entities.Equipamento; 

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  EquipamentoRepository extends JpaRepository<Equipamento, Long> {

    @Query("FROM Equipamento obj")
	public Page<Equipamento> equipamentoPage(Pageable pageable);
    
} 
