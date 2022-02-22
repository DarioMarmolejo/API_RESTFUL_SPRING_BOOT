package com.api.restful.spring.boot.model.entity;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "usuarios")
public class PersonEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "personId", unique = true, nullable = false)
     private String personId;

    @Column(name = "nombre")
     private String nombre;

     @Column(name = "apellido")
     private String apellido;

     @Column(name = "email")
     private String email;

     @Column(name = "edad")
     private Integer edad;

     @Column(name = "cumpleaños")
     private LocalDate dumpleaños;

}
