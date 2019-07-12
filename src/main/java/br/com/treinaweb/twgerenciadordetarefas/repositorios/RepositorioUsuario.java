package br.com.treinaweb.twgerenciadordetarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twgerenciadordetarefas.models.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);
	
}
