package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BusDomain generated by hbm2java
 */
@Entity
@Table(name="BUS_DOMAIN"

)
public class BusDomain  implements java.io.Serializable {


     private Integer busDomainId;
     private String description;
     private String busDomainName;
     private String busDomainOwner;

    public BusDomain() {
    }

    public BusDomain(String description, String busDomainName, String busDomainOwner) {
       this.description = description;
       this.busDomainName = busDomainName;
       this.busDomainOwner = busDomainOwner;
    }
   
     @Id 
    
    @Column(name="BUS_DOMAIN_ID", unique=true, nullable=false)
    public Integer getBusDomainId() {
        return this.busDomainId;
    }
    
    public void setBusDomainId(Integer busDomainId) {
        this.busDomainId = busDomainId;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=256)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="BUS_DOMAIN_NAME", nullable=false, length=45)
    public String getBusDomainName() {
        return this.busDomainName;
    }
    
    public void setBusDomainName(String busDomainName) {
        this.busDomainName = busDomainName;
    }
    
    @Column(name="BUS_DOMAIN_OWNER", nullable=false, length=45)
    public String getBusDomainOwner() {
        return this.busDomainOwner;
    }
    
    public void setBusDomainOwner(String busDomainOwner) {
        this.busDomainOwner = busDomainOwner;
    }




}


