package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Contato;
import app.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public String save(Contato contato) {
		this.contatoRepository.save(contato);
		return "Contato cadastrado com sucesso!";
	}
	
	public String update (long id, Contato contato) {
		contato.setId(id);
		this.contatoRepository.save(contato);
		return "Contato alterado com sucesso!";
	}
	
	public List<Contato>listAll(){
		return this.contatoRepository.findAll();
	}
	
	public Contato findById(long id) {
		Contato contato = this.contatoRepository.findById(id).get();
		return contato;
	}
	
	public String delete (long id) {
		this.contatoRepository.deleteById(id);
		return "Cadastro deletado com sucesso!";
	}

}
