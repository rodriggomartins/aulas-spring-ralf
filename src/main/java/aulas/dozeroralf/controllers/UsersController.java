package aulas.dozeroralf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import aulas.dozeroralf.models.UserModel;
import aulas.dozeroralf.repository.UserRepository;

@RestController
@RequestMapping("/usuarios")
public class UsersController {

	// aqui para fazer injecao de dependencias
	// evita deu ter que instanciar meu UserRepository userRepository = new UserRepository();
	// ou var userRepository = new UserRepository();
	@Autowired
	private UserRepository userRepository;
	
	// rota de boas vindas(home)
	// qui vai ser uma rota sem o pathvariable
	@GetMapping("/boasvindas")
	public String boasVindas(){
		return "Bem Vindo(a)";
	}

	// aqui e uma rota de boas vindas, mas com o pathvariable
	// ou seja, dentro da minha rota, eu vou cirar uma variavel
	// onde o usuario vai passar o nome dele, ou qualquer outro dado
	// via url, e vai ser retornado na tela o nome dele
	// o usuario, e a variavel
	// http://usuarios/boasvindas/rodrigo
	@GetMapping("/boasvindas/{username}")
	public String userName(@PathVariable String username){
		return "Bem Vindo(a) " + username;
	}

  // aqui estou crindo a rota de listar os usuarios
  // aqui eu posso colocar um: 
  // publicResponseEnriry<UserModel>criarUsuario(@RequesBody UserModel variavel)
// esse save() vem do crud repository... tem nada ver comigo, o spring se vira
  @PostMapping("/criar")
  public UserModel criarusuario(@RequestBody UserModel user){
    return userRepository.save(user);
  }

  @GetMapping("/listar")
  // esse List do java util, eu to tazendo la de dentro do meu repository
  // mas eu posso substituir, pelo EntityRespositori<UserModel>, que acho que vendo do meu jpa
  public List<UserModel> listUsers(){
    return userRepository.findAll();
  }

 

  // o findUserModelById foi criado la no meu repository
  @GetMapping("/listarid/{id}")
  public UserModel listarId(@PathVariable UUID id){
	  return userRepository.findUserModelById(id);
  }


}
