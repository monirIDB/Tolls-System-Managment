package com.rasel.restful.tolls.services;

import static com.rasel.restful.tolls.database.VehicleRegDatabase.*;
import com.rasel.restful.tolls.model.VehicleReg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRegServices {

    private Map<Integer, VehicleReg> vehicleReg = new HashMap();

    public VehicleRegServices() {
        for (VehicleReg veh : doVehicleQuery()) {
            vehicleReg.put(veh.getVehicleId(), veh);
        }
    }

    public List<VehicleReg> getAllVehicle() {

        return new ArrayList<VehicleReg>(vehicleReg.values());
    }

    public VehicleReg getVehicle(int id) {
        return vehicleReg.get(id);
    }

    public VehicleReg addVehicle(VehicleReg vehicle) {

        doVehicleSave(vehicle);
        return vehicle;
    }

    public VehicleReg updateVehicle(VehicleReg vehicle) {
        if (vehicle.getVehicleId()<= 0) {
            return null;
        }
        doVehicleUpdate(vehicle);
        return vehicle;
    }
   

    public void removeVehicle(int id) {
         VehicleReg vehicle = new VehicleReg();
        vehicle.setVehicleId(id);
        doVehicleDelete(vehicle);
    }

}
