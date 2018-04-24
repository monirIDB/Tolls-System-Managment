
package com.rasel.restful.tolls.database;

import com.rasel.restful.tolls.model.VehicleReg;
import com.rasel.restful.tolls.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class VehicleRegDatabase {
    
    public static int doVehicleSave(VehicleReg veh) 
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int n = (Integer) session.save(veh);
        session.getTransaction().commit();
        //session.close();
        
        return n;
    }
    
    public static void doVehicleUpdate(VehicleReg veh) 
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(veh);
        session.getTransaction().commit();
        //session.close();
    }
    
    
    public static void doVehicleDelete(VehicleReg id) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(id);
        session.getTransaction().commit();
        //session.close();
    }
    
    
    public static List<VehicleReg> doVehicleQuery(){
       List<VehicleReg> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from VehicleReg").list();
        return list;
    }
    
}
