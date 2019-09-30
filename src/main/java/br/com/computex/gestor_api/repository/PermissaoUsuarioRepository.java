package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.PermissaoUsuario;

@Repository
public interface PermissaoUsuarioRepository extends JpaRepository<PermissaoUsuario, Long> {

	PermissaoUsuario findById(long id);
}
