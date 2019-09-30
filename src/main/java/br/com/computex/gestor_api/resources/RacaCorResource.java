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

import br.com.computex.gestor_api.models.RacaCor;
import br.com.computex.gestor_api.repository.RacaCorRepository;

@RestController
@RequestMapping(value = "/api")
public class RacaCorResource {

	@Autowired
	RacaCorRepository racaCorRepository;
	
	@GetMapping("/racas-cores")
	public List<RacaCor> listaRacaCores() {
		return racaCorRepository.findAll();
	}
	
	@GetMapping("/raca-cor/{id}")
	public RacaCor listaRacaCorUnica(@PathVariable(value="id") long id){
		return racaCorRepository.findById(id);
	}
	
	@PostMapping("/raca-cor")
	public RacaCor salvaRacaCor(@RequestBody RacaCor racaCor) {
		return racaCorRepository.save(racaCor);
	}
	
	@DeleteMapping("/raca-cor")
	public void deletaRacaCor(@RequestBody RacaCor racaCor) {
		racaCorRepository.delete(racaCor);
	}
	
	@PutMapping("/raca-cor")
	public RacaCor atualizaRacaCor(@RequestBody RacaCor racaCor) {
		return racaCorRepository.save(racaCor);
	}
}
