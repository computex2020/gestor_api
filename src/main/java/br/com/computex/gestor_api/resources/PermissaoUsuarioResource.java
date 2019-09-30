package br.com.computex.gestor_api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.computex.gestor_api.models.PermissaoUsuario;
import br.com.computex.gestor_api.repository.PermissaoUsuarioRepository;

@RestController
@RequestMapping(value = "/api")
public class PermissaoUsuarioResource {

	@Autowired
    private PermissaoUsuarioRepository permissaoUsuarioRepository;
	
	@GetMapping("/permissoes-usuarios")
	public List<PermissaoUsuario> listaPermissoesUsuarios() {
		return permissaoUsuarioRepository.findAll();
	}
	
	@PostMapping("/permissao-usuario")
	public PermissaoUsuario salvaPermissaoUsuario(@RequestBody PermissaoUsuario permissaoUsuario) {
		return permissaoUsuarioRepository.save(permissaoUsuario);
	}
	
	@DeleteMapping("/permissao-usuario")
	public void deletaPermissaoUsuario(@RequestBody PermissaoUsuario permissaoUsuario) {
		permissaoUsuarioRepository.delete(permissaoUsuario);
	}
	
	@PutMapping("/permissao-usuario")
	public PermissaoUsuario atualizaPermissaoUsuario(@RequestBody PermissaoUsuario permissaoUsuario) {
		return permissaoUsuarioRepository.save(permissaoUsuario);
	}
}
