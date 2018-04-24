package com.rasel.restful.tolls.database;

import com.rasel.restful.tolls.model.TollsRate;
import com.rasel.restful.tolls.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;

public class TollsRateDatabase {

    public static int doRateSave(TollsRate rate) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int n = (Integer) session.save(rate);
        session.getTransaction().commit();
        return n;
    }
    public static void doTollsRateUpdate(TollsRate rate) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(rate);
        session.getTransaction().commit();
    }
    public static void doTollsRateDelete(TollsRate rate) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(rate);
        session.getTransaction().commit();
    }

    public static List<TollsRate> doRateQuerry() {
        List<TollsRate> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from TollsRate").list();
        return list;
    }

}
