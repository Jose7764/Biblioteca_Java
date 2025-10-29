package org.example.service;

import org.example.model.Livros;
import org.example.repository.LivroRepository;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class LivroService {

    BibliotecaView view= new BibliotecaView();

    public void cadastrarLivro() throws SQLException {

        Livros livro = view.cadastrarlivro();
        LivroRepository DaoLivro = new LivroRepository();
        DaoLivro.inserirLivro(livro);
    }

}
