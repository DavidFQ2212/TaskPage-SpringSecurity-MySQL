/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.PageTask.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author david
 */
@Data
@Entity
@Table(name = "tareas")
public class Task implements Serializable{

    private static final long serialVersionUID =1L; 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idtarea ;
   
   private String titulo ;
   private String descripcion ;
   private String fechai ;
   private String fechaf ;
   private String destinatario ;
   private String usuario ;
}
