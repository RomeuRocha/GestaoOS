
package com.os.unirios.services;

import java.util.List;
import java.util.Optional;        
        
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.os.unirios.entities.Equipamento;
import com.os.unirios.repositories.EquipamentoRepository;

import com.os.unirios.entities.OrdemServico;
import com.os.unirios.services.OrdemServicoService;

        
@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository repo;

   

            
    public List<Equipamento> findAll(){
        return repo.findAll();
    }

    public Page<Equipamento> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		return repo.equipamentoPage(pageRequest);
	
    }

    public Equipamento findById(Long id){
        Optional<Equipamento> obj = repo.findById(id);
        return obj.get();
    }

    public Equipamento insert(Equipamento obj){
        
        
        obj.setId(null);
        obj = repo.save(obj); // salvar e obter objeto monitorado
        return obj;
    }
        
    public Equipamento delete(Long id) {
        Equipamento s = findById(id);//ou existe, ou irá gerar exception
        repo.deleteById(id);
        return s;
    }
        
    public Equipamento update(Equipamento obj) {
        

        Equipamento newObj = findById(obj.getId());
        
        

        updateData(newObj, obj);
        
        return repo.save(newObj);          
    }

    private void updateData(Equipamento newObj, Equipamento obj) {
        
        newObj.setId(obj.getId());
            newObj.setNome(obj.getNome());
            newObj.setModelo(obj.getModelo());
            newObj.setDetalhes(obj.getDetalhes());
            
    }
}
