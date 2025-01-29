package org.example.spritboot.Biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    public Optional<Usuario> getUsuario(int id) {
        return usuarioRepository.findById(id);
    }
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

}
