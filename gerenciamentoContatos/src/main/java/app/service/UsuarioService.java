package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Usuario;
import app.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public String save(Usuario usuario) {
		this.usuarioRepository.save(usuario);
		return "Usuário " + usuario.getNome() + " cadastrado com sucesso!";
	}
	
	public String update (long id, Usuario usuario) {
		usuario.setId(id);
		this.usuarioRepository.save(usuario);
		return "Usuário alterado com sucesso!";
	}
	
	public List<Usuario>listAll(){
		return this.usuarioRepository.findAll();
	}
	
	public Usuario findById(long id) {
		Usuario usuario = this.usuarioRepository.findById(id).get();
		return usuario;
	}
	
	public String delete (long id) {
		this.usuarioRepository.deleteById(id);
		return "Cadastro deletado com sucesso!";
	}

}
