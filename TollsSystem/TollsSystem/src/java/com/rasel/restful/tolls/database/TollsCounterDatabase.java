package com.rasel.restful.tolls.database;

import com.rasel.restful.tolls.interfaces.GenarelInt;
import com.rasel.restful.tolls.model.TollsCounter;
import com.rasel.restful.tolls.util.NewHibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

public class TollsCounterDatabase {

    public static int doTollsCounterSave(TollsCounter counter) {
        int n = 0;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            n = (Integer) session.save(counter);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    public static void doTollsCounterUpdate(TollsCounter counter) {
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(counter);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doTollsCounterDelete(TollsCounter counter) {
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(counter);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<TollsCounter> doTollsCounterByDate() {
        List<TollsCounter> list = null;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            list = session.createQuery("from TollsCounter where vehicleDate = :p")
                    .setParameter("p", new Date()).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<TollsCounter> doTollsCounterQuery() {
        List<TollsCounter> list = null;
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            list = session.createQuery("from TollsCounter").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
