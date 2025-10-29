package org.example.view;


import org.example.Main;
import org.example.model.Emprestimo;
import org.example.model.Livros;
import org.example.model.Usuario;
import org.example.repository.usuarioRepository;
import org.example.service.UsuarioService;

import java.sql.SQLException;
import java.util.Scanner;

public class BibliotecaView {

    Scanner input = new Scanner(System.in);

    public void mostrarMenu(){

        System.out.println("--------------------------------------");
        System.out.println("|             Biblioteca             |");
        System.out.println("|------------------------------------|");
        System.out.println("| 1 - Cadastro de Livro              |");
        System.out.println("| 2 - Cadastro de Emprestimo         |");
        System.out.println("| 3 - Devolução do Livro             |");
        System.out.println("| 4 - Consultas                      |");
        System.out.println("|                                    |");
        System.out.println("|                          0 - Sair  |");
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o numero da sua escolha:    |");

    }

    public int capturarMenu(){

        System.out.print("| - ");
        int opcao = input.nextInt();

        return opcao;
    }

    public Livros cadastrarlivro(){
        System.out.println("|------------------------------------|");
        System.out.println("|          Cadastro do Livro         |");
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o titulo:                   |");
        System.out.print("| -");
        String titulo = input.nextLine();
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o autor:                    |");
        System.out.print("| -");
        String autor = input.nextLine();
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o ano:                      |");
        System.out.print("| -");
        int ano = input.nextInt();

        Livros livro = new Livros(titulo, autor, ano);
        return livro;
    }

    public Emprestimo inserirEmprestimo() throws SQLException {

        usuarioRepository user = new usuarioRepository();
        UsuarioService userFuntion = new UsuarioService();
        Emprestimo emprestimo;

        System.out.println("|------------------------------------|");
        System.out.println("|         Inserir Emprestimo         |");
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o id do livro:              |");
        System.out.print("| -");
        int titulo = input.nextInt();
        input.nextLine();

        System.out.println("|------------------------------------|");
        System.out.println("| Digite nome do usuario:            |");
        System.out.print("| -");
        String nome = input.nextLine();

        int idUser = user.buscaIDusuario(nome);

        if(idUser == -1){
            System.out.println("|------------------------------------|");
            System.out.println("|O usuario nao se encontra no sistema|");
            System.out.println("|                                    |");
            System.out.println("| 1 - Cadastrar Usuario              |");
            System.out.println("| 2 - Voltar ao menu principal       |");
            System.out.println("|------------------------------------|");
            System.out.print("| -");
            int opcao = input.nextInt();

            if (opcao == 1){
                userFuntion.cadastrarUsuario();
            }else if(opcao == 2){
                Main.main(new String[0]);
            }

        } else {
            emprestimo = new Emprestimo(titulo, idUser);
            return emprestimo;
        }

        emprestimo = new Emprestimo();
        return emprestimo;
    }

    public Usuario cadastrarUsuario(){
        System.out.println("|------------------------------------|");
        System.out.println("|        Cadastro do Usuario         |");
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o nome:                   |");
        System.out.print("| -");
        String nome = input.nextLine();
        System.out.println("|------------------------------------|");
        System.out.println("| Digite o email:                    |");
        System.out.print("| -");
        String email = input.nextLine();

        Usuario user = new Usuario(nome, email);
        return user;

    }

}
