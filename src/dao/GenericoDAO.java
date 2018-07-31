/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.EntidadeBase;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carvalui
 * @param <T>
 */
public class GenericoDAO<T extends EntidadeBase> {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaSustentacaoPU");
        return factory.createEntityManager();
    }

    public T salvar(T t) throws Exception {
        EntityManager em = getEM();
        try {
            em.getTransaction().begin();
            if (t.getId() == null) {
                em.persist(t);
            } else {
                if (!em.contains(t)) {
                    if (em.find(t.getClass(), t.getId()) == null) {
                        throw new Exception("Erro ao atualizar!");
                    }
                }
                t = em.merge(t);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return t;
    }

    public void remover(Class<T> clazz, Long id) {
        EntityManager em = getEM();
        T t = null;
        try {
            t = em.find(clazz, id);
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            em.close();
        }
    }

    public T consultarPorID(Class<T> clazz, Long id) {
        EntityManager em = getEM();
        T t = null;
        try {
            t = em.find(clazz, id);
        } catch (Exception e) {
        } finally {
            em.close();
        }
        return t;
    }
}
