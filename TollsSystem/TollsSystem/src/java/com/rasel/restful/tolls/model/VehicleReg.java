
package com.rasel.restful.tolls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="VEHICLE_REG")
@XmlRootElement
public class VehicleReg {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
  @Column(unique = true)
    private String vehicleNo;
    private String vehicleType;
    private String vehicleName;
    private String modelNo;
   @Column(unique = true)
    private String engineNo;
    private String ownerName;
    private String address;
    private String phone;

    public VehicleReg() {
    }

    public VehicleReg(String vehicleNo, String vehicleType, String vehicleName, String modelNo, String engineNo, String ownerName, String address, String phone) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.modelNo = modelNo;
        this.engineNo = engineNo;
        this.ownerName = ownerName;
        this.address = address;
        this.phone = phone;
    }

    
    
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
}
