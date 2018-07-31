/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Produtividade;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author carvalui
 */
public class ProdutividadeDAO extends GenericoDAO<Produtividade> {

    public int consultarPorDataEId(Produtividade produtividade) {
        EntityManager em = getEM();
        Query query = em.createNamedQuery("Produtividade.consultarPorDataEId");
        query.setParameter("data", produtividade.getData());
        query.setParameter("id", produtividade.getIdAnalista());

        int resultado;

        try {
            resultado = (int) query.getSingleResult();
        } catch (Exception ex) {
            resultado = 0;
        }

        return resultado;
    }

    public Long consultarMes(Long id, Date dataInicial, Date dataFinal) {
        EntityManager em = getEM();
        Query query = em.createNamedQuery("Produtividade.consultarMes");
        query.setParameter("idAnalista", id);
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);

        Long resultado;      
        
        try {
            resultado = (Long) query.getSingleResult();
        } catch (Exception ex) {
            resultado = 0L;
        }

        return resultado;
    }
}
