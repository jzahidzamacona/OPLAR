package mx.com.primer.diamante.oplar.service;

import mx.com.primer.diamante.oplar.entity.Cliente;
import mx.com.primer.diamante.oplar.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClientes(int id){
        return clienteRepository.findById(id);
    }


    public void saveOrUpdate(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void delete(int id){
        clienteRepository.deleteById(id);
    }




}
