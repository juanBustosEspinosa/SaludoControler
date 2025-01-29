package org.example.spritboot.Biblioteca;

import org.example.spritboot.Casa.Casa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class ControlUsuario {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> usuariosAll() {

        return usuarioService.getAllUsuarios();

    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> usuarioById(@PathVariable int id) {
        Optional<Usuario> usu =usuarioService.getUsuario(id);
        return ResponseEntity.ok().body(usu.get());
    }
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.addUsuario(usuario);
    }
    @DeleteMapping("/{id}")
    public void usuarioDelete(@PathVariable int id) {
        usuarioService.deleteUsuario(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        if (!usuarioService.getUsuario(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Usuario usu = usuarioService.getUsuario(id).get();
        if (usuario.getNombre() != null) {
            usu.setNombre(usuario.getNombre());
        }
        if (usuario.getEmail() != null) {
            usu.setEmail(usuario.getEmail());
        }
        if (usuario.getPassword() != null) {
            usu.setPassword(usuario.getPassword());
        }
        if (usuario.getPenalizacionHasta() != null) {
            usu.setPenalizacionHasta(usuario.getPenalizacionHasta());
        }
        if (usuario.getTipo() != null) {
            usu.setTipo(usuario.getTipo());
        }

        return ResponseEntity.ok(usuarioService.addUsuario(usu));
    }

}
