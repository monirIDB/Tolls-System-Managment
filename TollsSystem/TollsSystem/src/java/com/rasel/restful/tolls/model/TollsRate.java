
package com.rasel.restful.tolls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name= "TOLLS_RATE")
@XmlRootElement
public class TollsRate {
    @Id @GeneratedValue
    private int rateId;
    @Column(unique = true)
    private String transportName;
    private double rate;

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
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

   
}
