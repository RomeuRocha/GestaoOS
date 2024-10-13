
package com.os.unirios.services;

import java.util.List;
import java.util.Optional;        
        
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.os.unirios.entities.Cliente;
import com.os.unirios.repositories.ClienteRepository;

import com.os.unirios.entities.OrdemServico;
import com.os.unirios.services.OrdemServicoService;

        
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

   

            
    public List<Cliente> findAll(){
        return repo.findAll();
    }

    public Page<Cliente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		return repo.clientePage(pageRequest);
	
    }

    public Cliente findById(Long id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.get();
    }

    public Cliente insert(Cliente obj){
        
        
        obj.setId(null);
        obj = repo.save(obj); // salvar e obter objeto monitorado
        return obj;
    }
        
    public Cliente delete(Long id) {
        Cliente s = findById(id);//ou existe, ou irá gerar exception
        repo.deleteById(id);
        return s;
    }
        
    public Cliente update(Cliente obj) {
        

        Cliente newObj = findById(obj.getId());
        
        

        updateData(newObj, obj);
        
        return repo.save(newObj);          
    }

    private void updateData(Cliente newObj, Cliente obj) {
        
        newObj.setId(obj.getId());
            newObj.setNome(obj.getNome());
            newObj.setEndereco(obj.getEndereco());
            newObj.setContatos(obj.getContatos());
            newObj.setDocumentoID(obj.getDocumentoID());
            
    }
}
