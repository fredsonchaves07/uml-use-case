package com.fredson.umlusecase.services;

import com.fredson.umlusecase.entities.Categoria;
import com.fredson.umlusecase.entities.Cliente;
import com.fredson.umlusecase.repositories.CategoriaRepository;
import com.fredson.umlusecase.repositories.ClienteRepository;
import com.fredson.umlusecase.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscarPorId(int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new EntityNotFoundException("Cliente não encontrada com id:  " + id));
    }
}
