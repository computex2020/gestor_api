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

import br.com.computex.gestor_api.models.MoraCom;
import br.com.computex.gestor_api.repository.MoraComRepository;

@RestController
@RequestMapping(value = "/api")
public class MoraComResource {

	@Autowired
	MoraComRepository moraComRepository;
	
	@GetMapping("/moras-com")
	public List<MoraCom> listaMorasCons() {
		return moraComRepository.findAll();
	}
	
	@GetMapping("/mora-com/{id}")
	public MoraCom listaMoraComUnico(@PathVariable(value="id") long id){
		return moraComRepository.findById(id);
	}
	
	@PostMapping("/mora-com")
	public MoraCom salvaMoraCom(@RequestBody MoraCom moraCom) {
		return moraComRepository.save(moraCom);
	}
	
	@DeleteMapping("/mora-com")
	public void deletaMoraCom(@RequestBody MoraCom moraCom) {
		moraComRepository.delete(moraCom);
	}
	
	@PutMapping("/mora-com")
	public MoraCom atualizaMoraCom(@RequestBody MoraCom moraCom) {
		return moraComRepository.save(moraCom);
	}
}
