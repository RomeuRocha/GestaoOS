
package com.os.unirios.services;

import java.util.List;
import java.util.Optional;        
        
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.os.unirios.entities.OrdemServico;
import com.os.unirios.repositories.OrdemServicoRepository;

import com.os.unirios.entities.Cliente;
import com.os.unirios.services.ClienteService;
import com.os.unirios.repositories.ClienteRepository;
import com.os.unirios.entities.Equipamento;
import com.os.unirios.services.EquipamentoService;
import com.os.unirios.repositories.EquipamentoRepository;

        
@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository repo;

   
                        @Autowired 
                        private ClienteService clienteService;
                      

                        @Autowired 
                        private EquipamentoService equipamentoService;
                      

            
    public List<OrdemServico> findAll(){
        return repo.findAll();
    }

    public Page<OrdemServico> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		return repo.ordemServicoPage(pageRequest);
	
    }

    public OrdemServico findById(Long id){
        Optional<OrdemServico> obj = repo.findById(id);
        return obj.get();
    }

    public OrdemServico insert(OrdemServico obj){
        
                                Cliente cliente = clienteService.findById(obj.getCliente().getId());
                                obj.setCliente(cliente);

                                Equipamento equipamento = equipamentoService.findById(obj.getEquipamento().getId());
                                obj.setEquipamento(equipamento);
        
        obj.setId(null);
        obj = repo.save(obj); // salvar e obter objeto monitorado
        return obj;
    }
        
    public OrdemServico delete(Long id) {
        OrdemServico s = findById(id);//ou existe, ou irá gerar exception
        repo.deleteById(id);
        return s;
    }
        
    public OrdemServico update(OrdemServico obj) {
        
                                Cliente cliente = clienteService.findById(obj.getCliente().getId());
                                obj.setCliente(cliente);

                                Equipamento equipamento = equipamentoService.findById(obj.getEquipamento().getId());
                                obj.setEquipamento(equipamento);

        OrdemServico newObj = findById(obj.getId());
        
        

        updateData(newObj, obj);
        
        return repo.save(newObj);          
    }

    private void updateData(OrdemServico newObj, OrdemServico obj) {
        
                        newObj.setCliente(obj.getCliente());

                        newObj.setEquipamento(obj.getEquipamento());
        newObj.setId(obj.getId());
            newObj.setData(obj.getData());
            newObj.setResponsavel(obj.getResponsavel());
            newObj.setValorTotal(obj.getValorTotal());
            newObj.setEquipamentoID(obj.getEquipamentoID());
            newObj.setDiagnostico(obj.getDiagnostico());
            newObj.setServicos(obj.getServicos());
            newObj.setPecas(obj.getPecas());
            
    }
}
