package com.dio.projetospring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.projetospring.model.Livro;
import com.dio.projetospring.model.LivroRepository;

@Service
public class LivroServiceImplementacao implements LivroService{

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public Iterable<Livro> buscarTodos() {
        return livroRepository.findAll();
    }

    @Override
    public Livro buscarPorId(Long id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.get();
    }

    @Override
    public void inserir(Livro livro) {
        livroRepository.save(livro);
    }

    @Override
    public void deletar(Long id) {
        livroRepository.deleteById(id);
    }
    
}
