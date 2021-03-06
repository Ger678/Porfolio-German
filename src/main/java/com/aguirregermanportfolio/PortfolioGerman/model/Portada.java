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

@Getter @Setter
@Entity
public class Portada implements Serializable {
     
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String subtitulo;
    private String perfilUrl;
    private String portadaUrl;
    private String contenido;

    public Portada() {
    }

    public Portada(Long id, String nombre,String subtitulo, String perfilUrl, String portadaUrl, String contenido) {
        this.id = id;
        this.nombre = nombre;
        this.subtitulo = subtitulo;
        this.perfilUrl = perfilUrl;
        this.portadaUrl = portadaUrl;
        this.contenido = contenido;
    }

}
