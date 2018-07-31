/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author carvalui
 */
public class UsuarioDAO extends GenericoDAO<Usuario> {

    public List<Usuario> consultarPorLogin(Usuario usuario) {
        EntityManager em = getEM();
        Query query = em.createNamedQuery("Usuario.consultarPorLogin");
        query.setParameter("login", usuario.getLogin());
        query.setParameter("senha", usuario.getSenha());
        return query.getResultList();
    }

}
