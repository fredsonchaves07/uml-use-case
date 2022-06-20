package com.fredson.umlusecase.resources;

import com.fredson.umlusecase.entities.Categoria;
import com.fredson.umlusecase.entities.Cliente;
import com.fredson.umlusecase.services.CategoriaService;
import com.fredson.umlusecase.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> listar(@PathVariable int id) {
        Cliente cliente = clienteService.buscarPorId(id);
        return ResponseEntity.ok().body(cliente);
    }
}
