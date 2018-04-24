
package com.rasel.restful.tolls.services;

import com.rasel.restful.tolls.database.TollsLoginDatabase;
import com.rasel.restful.tolls.model.TollsLogin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TollsLoginServices {
    
    private Map<Integer, TollsLogin> loginServices = new HashMap();
private TollsLoginDatabase tollsLoginDatabase = new TollsLoginDatabase();
    
    public TollsLoginServices() {
        for (TollsLogin login : tollsLoginDatabase.doTollsLoginQuery()) {
            loginServices.put(login.getId(), login);
        }
    }
    
    public List<TollsLogin> getAllTollsLogin() {

        return new ArrayList<TollsLogin>(loginServices.values());
    }
    
    public TollsLogin findUserLogin(TollsLogin login){
        
      return  tollsLoginDatabase.doUserLogin(login.getLoginId(), login.getLoginPassword());
    }
    
    public static void main(String[] args) {
        TollsLoginServices t = new TollsLoginServices();
        TollsLogin td = new TollsLogin();
        td.setLoginId("rasel@gmail.com");
        td.setLoginPassword("12345");
//        System.out.println(t.findUserLogin(td));
    }
    
}
