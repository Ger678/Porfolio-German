/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author German
 */
@Getter
@Setter
@Entity
public class Educacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String titulo;
    private String fecha;
    private String icono;

    public Educacion() {
    }

    public Educacion(Long id,Long itemId, String titulo, String fecha, String icono) {
        this.id = id;
        this.itemId= itemId;
        this.titulo = titulo;
        this.fecha = fecha;
        this.icono = icono;
    }

   

}
