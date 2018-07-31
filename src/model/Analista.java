/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author carvalui
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Analista.ConsultaTodosAnalistas",
            query = "SELECT a FROM Analista a ORDER BY a.nome")
})
@SequenceGenerator(name = "analista_seq", sequenceName = "analista_seq",
        allocationSize = 1, initialValue = 1)
public class Analista implements Serializable, EntidadeBase {
    private static final long serialVersionUID = 3839059783088394957L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "analista_seq")
    private Long id;
    private String nome;
    private boolean desligado;

    public Analista() {
    }

    public Analista(String nome, boolean desligado) {
        this.nome = nome;
        this.desligado = desligado;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
}
