
package com.rasel.restful.tolls.services;

import static com.rasel.restful.tolls.database.TollsCounterDatabase.*;
import com.rasel.restful.tolls.model.TollsCounter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TollsCounterServices {
    
    private Map<Integer, TollsCounter> counterServices = new HashMap();

    public TollsCounterServices() {
        for (TollsCounter counter : doTollsCounterQuery()) {
            counterServices.put(counter.getTollsId(), counter);
        }
    }
    
    public List<TollsCounter> getAllTollsCounter() {

        return new ArrayList<TollsCounter>(counterServices.values());
    }
    
    public TollsCounter getTollsCounter(int tollsId){
        return counterServices.get(tollsId);
    }
    
    public TollsCounter addTollsCounter(TollsCounter counter) {
       doTollsCounterSave(counter);
       return counter;
    }
    
   
    public TollsCounter updateTollsCounter(TollsCounter counter){
        if (counter.getTollsId()<= 0) {
            return null;
        }
        doTollsCounterUpdate(counter);
        return counter;
    }
    
    public List<TollsCounter> tollsCounterByDate(){
        return doTollsCounterByDate();
    }
    
    public void removeTollsCounter(int tollsId){
        TollsCounter toll = new TollsCounter();
        toll.setTollsId(tollsId);
        doTollsCounterDelete(toll);
    }
    
   
}
