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

import br.com.computex.gestor_api.models.TipoTelefone;
import br.com.computex.gestor_api.repository.TipoTelefoneRepository;

@RestController
@RequestMapping(value = "/api")
public class TipoTelefoneResource {

	@Autowired
	TipoTelefoneRepository tipoTelefoneRepository;
	
	@GetMapping("/tipos-telefones")
	public List<TipoTelefone> listaTipoTelefonees() {
		return tipoTelefoneRepository.findAll();
	}
	
	@GetMapping("/tipo-telefone/{id}")
	public TipoTelefone listaTipoTelefoneUnico(@PathVariable(value="id") long id){
		return tipoTelefoneRepository.findById(id);
	}
	
	@PostMapping("/tipo-telefone")
	public TipoTelefone salvaTipoTelefone(@RequestBody TipoTelefone tipoTelefone) {
		return tipoTelefoneRepository.save(tipoTelefone);
	}
	
	@DeleteMapping("/tipo-telefone")
	public void deletaTipoTelefone(@RequestBody TipoTelefone tipoTelefone) {
		tipoTelefoneRepository.delete(tipoTelefone);
	}
	
	@PutMapping("/tipo-telefone")
	public TipoTelefone atualizaTipoTelefone(@RequestBody TipoTelefone tipoTelefone) {
		return tipoTelefoneRepository.save(tipoTelefone);
	}
}
