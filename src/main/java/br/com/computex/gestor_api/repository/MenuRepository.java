package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.computex.gestor_api.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
	
	Menu findById(long id);

}
