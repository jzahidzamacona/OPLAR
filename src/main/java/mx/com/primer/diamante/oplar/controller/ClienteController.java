package mx.com.primer.diamante.oplar.controller;

import ch.qos.logback.core.net.server.Client;
import mx.com.primer.diamante.oplar.entity.Cliente;
import mx.com.primer.diamante.oplar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAll(){
    return clienteService.getClientes();
    }

    @GetMapping("/{clienteId}")
    public Optional<Cliente> getBId(@PathVariable("clienteId") int clienteId){
        return clienteService.getClientes(clienteId);
    }


    @PostMapping
    public void saveUpdate(@RequestBody Cliente cliente){
        clienteService.saveOrUpdate(cliente);
    }

    @DeleteMapping("/{clienteId}")
    public void saveUpdate(@PathVariable("clienteId") int clienteId){
        clienteService.delete(clienteId);
    }
}

