
package com.rasel.restful.tolls.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TOLLS_COUNTER")
@XmlRootElement
public class TollsCounter{
    @Id @GeneratedValue
    private int tollsId;
    private String vehicleNo;
    @Temporal(TemporalType.DATE)
    private Date vehicleDate;
    @Temporal(TemporalType.TIME)
    private Date vehicleTime;
    private String transportName;
    private double rate;
    private boolean payment;

    public int getTollsId() {
        return tollsId;
    }

    public void setTollsId(int tollsId) {
        this.tollsId = tollsId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Date getVehicleDate() {
        return vehicleDate;
    }

    public void setVehicleDate(Date vehicleDate) {
        this.vehicleDate = vehicleDate;
    }

    public Date getVehicleTime() {
        return vehicleTime;
    }

    public void setVehicleTime(Date vehicleTime) {
        this.vehicleTime = vehicleTime;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

   
    
}
