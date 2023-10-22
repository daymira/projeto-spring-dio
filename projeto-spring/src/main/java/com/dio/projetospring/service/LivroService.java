package com.dio.projetospring.service;

import com.dio.projetospring.model.Livro;

public interface LivroService {
    Iterable<Livro> buscarTodos();

    Livro buscarPorId(Long id);

    void inserir(Livro livro);

    void deletar(Long id);
}
