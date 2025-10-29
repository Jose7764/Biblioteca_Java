package org.example.service;

import org.example.Main;
import org.example.model.Emprestimo;
import org.example.repository.EmprestimoRepository;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class EmprestimoService {

    BibliotecaView view = new BibliotecaView();
    EmprestimoRepository daoEmprestimo = new EmprestimoRepository();

    public void inserirEmprestimo() throws SQLException {

        Emprestimo emprestimo = view.inserirEmprestimo();
        if(emprestimo.getLivro_id() == 0){
            Main.main(new String[0]);
        }else{
            daoEmprestimo.inserirEmprestimo(emprestimo);

        }

    }
}
