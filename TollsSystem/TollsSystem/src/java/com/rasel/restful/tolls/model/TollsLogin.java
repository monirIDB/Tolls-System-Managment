package com.rasel.restful.tolls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TOLLS_LOGIN")
public class TollsLogin {
    @Id 
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String loginId;
    private String loginPassword;
    private String loginFor;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginFor() {
        return loginFor;
    }

    public void setLoginFor(String loginFor) {
        this.loginFor = loginFor;
    }
    
}
