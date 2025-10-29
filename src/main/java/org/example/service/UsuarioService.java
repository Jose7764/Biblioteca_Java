package org.example.service;

import org.example.model.Usuario;
import org.example.repository.usuarioRepository;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class UsuarioService {

    BibliotecaView view = new BibliotecaView();
    usuarioRepository DaoUser = new usuarioRepository();

    public void cadastrarUsuario() throws SQLException {
        Usuario user = view.cadastrarUsuario();
        DaoUser.cadastrarUsuario(user);
    }
}
