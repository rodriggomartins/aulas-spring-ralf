package aulas.dozeroralf.repository;

import aulas.dozeroralf.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;


// O REPOSITORYO, CONTEM AS ACOES DO NOSSO BANCO DE DADOS
// CREATE, UPDATED, PUT AND DELETE

// o jpa disbonibiliza o CrudRepository e o JpaRepository
// o que mais usam, e o JpaRepository

// depois do jpaRespository<colocamos aqui o model, depois o tipo do id>
// O tipo tem que ser uma classe, nao pode ser int, float

// @Repository e opcional

public interface UserRepository extends JpaRepository<UserModel, UUID> {
  // retornado uma lista de pessoa vou usar o List do java.util
  // lembrando que tudo que eu faco aqui, vai ter que ser usado no controller
  // esse aqui, vai buscar todos os registros do banco de dados.

  // dentro do<> o tipo de dado que eu quero listar, nesse caso tem que ser o meu model
  // aqui eu to criando meu metodo findAll, eu acho;
  List<UserModel> findAll();
}
