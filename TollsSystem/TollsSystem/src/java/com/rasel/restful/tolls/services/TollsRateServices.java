
package com.rasel.restful.tolls.services;

import static com.rasel.restful.tolls.database.TollsRateDatabase.*;
import com.rasel.restful.tolls.model.TollsRate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TollsRateServices {
    
    private Map<Integer, TollsRate> tollsRates = new HashMap();

    public TollsRateServices() {
        for (TollsRate rate : doRateQuerry()) {
            tollsRates.put(rate.getRateId(), rate);
        }
    }
    
    public List<TollsRate> getAllTollsRate() {

        return new ArrayList<TollsRate>(tollsRates.values());
    }
    
    public TollsRate getTollsRate(int tollsId){
        return tollsRates.get(tollsId);
    }
    
    
    public TollsRate addTollsRate(TollsRate rate) {
         doRateSave(rate);
        return rate;
    }
    
    public TollsRate updateTollsRate(TollsRate rate) {
          if (rate.getRateId() <= 0) {
            return null;
        }
        doTollsRateUpdate(rate);
        return rate;
    }
    
     public void removeTollsRate(int id) {
         TollsRate vehicle = new TollsRate();
        vehicle.setRateId(id);
        doTollsRateDelete(vehicle);
    }
    
  
}
