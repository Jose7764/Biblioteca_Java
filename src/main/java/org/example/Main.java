package org.example;

import org.example.service.EmprestimoService;
import org.example.service.LivroService;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        BibliotecaView view = new BibliotecaView();
        LivroService livroFuntions = new LivroService();
        EmprestimoService emprFuntions =  new EmprestimoService();

        while(true) {
            view.mostrarMenu();
            int opcao = view.capturarMenu();

            if (opcao == 0){
                break;
            }else if (opcao < 0 || opcao > 5){
                System.err.println("| ----------------  Digite uma opção valida -------------------");
                System.out.println("---------------------------------------------------------------");
                continue;
            }

            switch (opcao){
                case 1:
                    livroFuntions.cadastrarLivro();

                    break;

                case 2:
                    emprFuntions.inserirEmprestimo();

                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    System.out.println("+------------------------------------+");
                    System.out.println("|            Volte sempre!           |");
                    System.out.println("+------------------------------------+");
                    break;
            }

        }
    }
}