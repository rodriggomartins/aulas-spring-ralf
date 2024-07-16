package aulas.dozeroralf.models;

import java.util.UUID;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
  private String name;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Column(name = "cargo", nullable = false)
  private String cargo;

  @Column(name = "departamento", nullable = false)
  private String departamento;
 
  @CreationTimestamp
  private Instant createdAt;
  
  @UpdateTimestamp
  private Instant updatedAt;
  
  
  public void setUuid(UUID id){
    this.id = id;
  }

  public UUID getUuid(){
    return id;
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

  public void setCargo(String cargo){
    this.cargo = cargo;
  }

  public void setDepartamento(String departamento){
    this.departamento = departamento;
  }

  public String getCargo(){
    return cargo;
  }
  
  public void setCreated(Instant createdAt){
    this.createdAt = createdAt;
  }

   public Instant getCreated(){
    return createdAt;
  }

  public void setUpdated(Instant updatedAt){
    this.updatedAt = updatedAt;
  }

  public Instant getUpdated(){
    return updatedAt;
  }
  
}
