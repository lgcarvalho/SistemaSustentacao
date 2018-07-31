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
 * @author luizg
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.consultarPorLogin",
            query = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha")
})
@SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq",
        allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable, EntidadeBase {

    private static final long serialVersionUID = -4262390529704228304L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    private Long id;
    private String login;
    private String senha;
    private boolean adm;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdm() {
        return adm;
    }

}
