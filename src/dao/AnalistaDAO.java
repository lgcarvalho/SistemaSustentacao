/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Analista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author carvalui
 */
public class AnalistaDAO extends GenericoDAO<Analista> {
    
    public List<Analista> consultaTodosAnalistas() {
        EntityManager em = getEM();
        Query query = em.createNamedQuery("Analista.ConsultaTodosAnalistas");
        return query.getResultList();
    }
    
}
