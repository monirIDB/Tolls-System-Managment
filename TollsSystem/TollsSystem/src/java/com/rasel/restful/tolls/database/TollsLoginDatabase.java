package com.rasel.restful.tolls.database;

import com.rasel.restful.tolls.model.TollsLogin;
import com.rasel.restful.tolls.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class TollsLoginDatabase {

    public int doTollsLoginSave(TollsLogin login) {
        int n = 0;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            n = (Integer) session.save(login);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    public TollsLogin doUserLogin(String userId, String password) {
        TollsLogin login = null;
        List<TollsLogin> list = new ArrayList<TollsLogin>();
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            list = session.createQuery("from TollsLogin where loginId = :p and loginPassword = :p2")
                    .setParameter("p", userId).setParameter("p2", password).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list.size() > 0) {
            login = list.get(0);
        }
        return login;
    }

    public List<TollsLogin> doTollsLoginQuery() {
        List<TollsLogin> list = null;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            list = session.createQuery("from TollsLogin").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
