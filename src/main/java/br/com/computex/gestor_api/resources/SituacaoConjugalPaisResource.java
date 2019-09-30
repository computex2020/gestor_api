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

import br.com.computex.gestor_api.models.SituacaoConjugalPais;
import br.com.computex.gestor_api.repository.SituacaoConjugalPaisRepository;

@RestController
@RequestMapping(value = "/api")
public class SituacaoConjugalPaisResource {

	@Autowired
	SituacaoConjugalPaisRepository situacaoConjugalPaisRepository;
	
	@GetMapping("/situacoes-conjugais-pais")
	public List<SituacaoConjugalPais> listaSituacaoConjugalPaises() {
		return situacaoConjugalPaisRepository.findAll();
	}
	
	@GetMapping("/situacao-conjugal-pais/{id}")
	public SituacaoConjugalPais listaSituacaoConjugalPaisUnica(@PathVariable(value="id") long id){
		return situacaoConjugalPaisRepository.findById(id);
	}
	
	@PostMapping("/situacao-conjugal-pais")
	public SituacaoConjugalPais salvaSituacaoConjugalPais(@RequestBody SituacaoConjugalPais situacaoConjugalPais) {
		return situacaoConjugalPaisRepository.save(situacaoConjugalPais);
	}
	
	@DeleteMapping("/situacao-conjugal-pais")
	public void deletaSituacaoConjugalPais(@RequestBody SituacaoConjugalPais situacaoConjugalPais) {
		situacaoConjugalPaisRepository.delete(situacaoConjugalPais);
	}
	
	@PutMapping("/situacao-conjugal-pais")
	public SituacaoConjugalPais atualizaSituacaoConjugalPais(@RequestBody SituacaoConjugalPais situacaoConjugalPais) {
		return situacaoConjugalPaisRepository.save(situacaoConjugalPais);
	}
}
