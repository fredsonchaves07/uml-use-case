package com.fredson.umlusecase.services;

import com.fredson.umlusecase.entities.Categoria;
import com.fredson.umlusecase.repositories.CategoriaRepository;
import com.fredson.umlusecase.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarPorId(Long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() -> new EntityNotFoundException("Categoria não encontrada com id:  " + id));
    }
}
