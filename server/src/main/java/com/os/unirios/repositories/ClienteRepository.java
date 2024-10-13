
package com.os.unirios.repositories;

import com.os.unirios.entities.Cliente; 

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("FROM Cliente obj")
	public Page<Cliente> clientePage(Pageable pageable);
    
} 
