package aulas.dozeroralf.repository;

import aulas.dozeroralf.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
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



  // listar unico usuario pelo id
  // o id-> vem do meu model
  // aqui ele tem que me retornar o model 
  /*
    essa meneira e quando na minha tabela eu to usando o id com a classe Ingeter
    o Ingeter e uma classe que represent id, essa classe ja vem com o jpa
    pq na hora de passar aqui no meu repository ele nao aceita os tipo int 
    findById(int id);

    Quando for listar apaenas um id, eu nao preciso do List, so uso o List
    quando for usar para retornar um conjuto de dados
  */ 
 
  // aqui ta funcionando, mas depois tenho que saber o pq de ter que colocar um
  // findUserModelById()
  
  UserModel findUserModelById(UUID id);



  // LEMBRANDO QUE TEM UMA MANEIRA COLOCANDO O OPTIONAL<UserModel>findByUuid(UUID uuid)
  // mas essa nao funcinou, eu tenho que saber o pq tmb e como funciona


}
