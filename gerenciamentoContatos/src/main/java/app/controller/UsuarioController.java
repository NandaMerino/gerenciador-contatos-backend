package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Usuario;
import app.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin("*")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/save")
	public ResponseEntity<String>save(@RequestBody Usuario usuario){
		try {
			String mensagem = this.usuarioService.save(usuario);
			return new ResponseEntity<String>(mensagem, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<String>("Erro ao tentar salvar o cadastro do usuário!", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String>update(@RequestBody Usuario usuario, @PathVariable long id){
		try {
			String mensagem = this.usuarioService.update(id, usuario);
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>("Erro ao tentar o cadastro do usuário " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/listAll")
	public ResponseEntity<List<Usuario>>listAll(){
		try {
			List<Usuario>lista = this.usuarioService.listAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Usuario>findById(@PathVariable long id){
		try {
			Usuario usuario = this.usuarioService.findById(id);
			return new ResponseEntity<>(usuario, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>delete(@PathVariable long id){
		try {
			String mensagem = this.usuarioService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>("Erro ao tentar deletar o usuário: " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
