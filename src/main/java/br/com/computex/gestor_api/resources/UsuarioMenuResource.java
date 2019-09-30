package br.com.computex.gestor_api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.computex.gestor_api.models.UsuarioMenu;
import br.com.computex.gestor_api.repository.UsuarioMenuRepository;

@RestController
@RequestMapping(value = "/api")
public class UsuarioMenuResource {

@Autowired
    private UsuarioMenuRepository usuarioMenuRepository;

@GetMapping("/usuarios-menus")
public List<UsuarioMenu> listaUsuariosmenus() {
return usuarioMenuRepository.findAll();
}

@GetMapping("/usuario-menu/{id}")
public UsuarioMenu listaUsuarioMenuUnico(@PathVariable(value="id") long id){
	return usuarioMenuRepository.findById(id);
}

@PostMapping("/usuario-menu")
public UsuarioMenu salvaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
return usuarioMenuRepository.save(usuariomenu);
}

@DeleteMapping("/usuario-menu")
public void deletaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
	usuarioMenuRepository.delete(usuariomenu);
}

@PutMapping("/usuario-menu")
public UsuarioMenu atualizaUsuarioMenu(@RequestBody UsuarioMenu usuariomenu) {
	return usuarioMenuRepository.save(usuariomenu);
}
}
