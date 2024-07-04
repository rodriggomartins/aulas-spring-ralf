
package aulas.dozeroralf.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aulas.dozeroralf.models.UserModel;

@RestController
@RequestMapping("/usuarios")
public class UsersController {
	
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
	public String boasVindasUsers(@PathVariable username){
		return "Bem Vindo(a) " + username;
	}

  // aqui estou crindo a rota de listar os usuarios
  @PostMapping("/criar")
  public UserModel criarusuario(@RequestBody UserModel user){
    return user;
  }

  @GetMapping("/listarusuarios")
  public String listUsers(){
    return "Ola Usuarios de Drogas";
  }
	
}
