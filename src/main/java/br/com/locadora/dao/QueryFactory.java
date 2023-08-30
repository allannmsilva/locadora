package br.com.locadora.dao;

import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * @author Allan Neves Melquíades Silva
 */

//MÉTODOS GENÉRICOS PARA TRANSAÇÕES DE BANCO DE DADOS
public abstract class QueryFactory {

    public static List<Object> findList(Class c) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;
        List<Object> resultList = null;

        try {

            sessao = HibernateConnection.getSessionFactory().openSession();
            entityTransaction = (EntityTransaction) sessao.getTransaction();
            entityTransaction.begin();

            CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
            CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery(c);
            Root<Object> root = criteriaQuery.from(c);
            criteriaQuery.select(root);
            Query<Object> query = sessao.createQuery(criteriaQuery);
            resultList = query.getResultList();

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }

        return resultList;
    }

    public static void insert(Object body) throws Exception {
        Session sessao = null;

        try {

            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(body);

            sessao.getTransaction().commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }
    }

    public static void update(Object body) throws Exception {
        Session sessao = null;

        try {

            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(body);

            sessao.getTransaction().commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }
    }

    public static void delete(Object body) throws Exception {
        Session sessao = null;
        EntityTransaction entityTransaction = null;

        try {

            sessao = HibernateConnection.getSessionFactory().openSession();
            entityTransaction = sessao.getTransaction();
            entityTransaction.begin();

            sessao.delete(body);

            entityTransaction.commit();
            sessao.close();

        } catch (HibernateException hex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
                sessao.close();
            }
            throw new HibernateException(hex);
        }
    }

    public static Object findById(Class classe, Long id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            objReturn = sessao.get(classe, id);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return objReturn;
    }
}
