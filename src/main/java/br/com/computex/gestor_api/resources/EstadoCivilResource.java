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

import br.com.computex.gestor_api.models.EstadoCivil;
import br.com.computex.gestor_api.repository.EstadoCivilRepository;

@RestController
@RequestMapping(value = "/api")
public class EstadoCivilResource {

	@Autowired
	EstadoCivilRepository estadoCivilRepository;
	
	@GetMapping("/estados-civis")
	public List<EstadoCivil> listaEstadoCiviles() {
		return estadoCivilRepository.findAll();
	}
	
	@GetMapping("/estado-civil/{id}")
	public EstadoCivil listaEstadoCivilUnico(@PathVariable(value="id") long id){
		return estadoCivilRepository.findById(id);
	}
	
	@PostMapping("/estado-civil")
	public EstadoCivil salvaEstadoCivil(@RequestBody EstadoCivil estadoCivil) {
		return estadoCivilRepository.save(estadoCivil);
	}
	
	@DeleteMapping("/estado-civil")
	public void deletaEstadoCivil(@RequestBody EstadoCivil estadoCivil) {
		estadoCivilRepository.delete(estadoCivil);
	}
	
	@PutMapping("/estado-civil")
	public EstadoCivil atualizaEstadoCivil(@RequestBody EstadoCivil estadoCivil) {
		return estadoCivilRepository.save(estadoCivil);
	}
}
