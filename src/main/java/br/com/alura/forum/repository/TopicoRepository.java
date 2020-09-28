package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{//entidade, tipo da chave primária

	List<Topico> findByCurso_Nome(String nomeCurso);
	// Criar um método com esse nomeclatura "findBy", para o Spring de forma automática montar a query.
	/* A entidade topico possui um relacionamento com a entidade Curso, que possui o atributo nome
	 * Para buscar o curso pelo nome, apenas seguir a ordem do relacionamento 
	 * Topico>Curso>Nome -> findByCurso_Nome
	 * utilizar o "_" para tirar ambiguidade entre atributo e relacionamento
	 * No caso o Spring entende como relacionamento.
	 * 	 * */
	
																											

}
