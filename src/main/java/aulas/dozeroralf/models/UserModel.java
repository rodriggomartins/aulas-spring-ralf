package aulas.dozeroralf.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "users_id")
  private UUID id;

  @Column(name = "name", nullable = false)
  public String name;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Column(name = "sector", nullable = false, unique = true)
  private String setor;

  @Column(name = "office")
  private String cargo;

  @Column(name = "code")
  private int codigo;
  
  public void setId(UUID id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getEmail(){
    return email;
  }

  public void setSector(String cargo){
    this.cargo = cargo;
  }

  public String getSector(){
    return cargo;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public int getCodigo(){
    return codigo;
  }
  
}
