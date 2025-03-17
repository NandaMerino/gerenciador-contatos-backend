package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
	@Query("SELECT c FROM Contato c WHERE LOWER(c.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
	public List<Contato> findByTrechoNome(String nome);

}
