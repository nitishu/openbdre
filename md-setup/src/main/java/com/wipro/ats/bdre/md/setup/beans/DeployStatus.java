package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DeployStatus generated by hbm2java
 */
@Entity
@Table(name="DEPLOY_STATUS"

)
public class DeployStatus  implements java.io.Serializable {


     private Short deployStatusId;
     private String description;

    public DeployStatus() {
    }

    public DeployStatus(Short deployStatusId, String description) {
       this.deployStatusId = deployStatusId;
       this.description = description;
    }
   
     @Id 
    
    @Column(name="DEPLOY_STATUS_ID", unique=true, nullable=false)
    public Short getDeployStatusId() {
        return this.deployStatusId;
    }
    
    public void setDeployStatusId(Short deployStatusId) {
        this.deployStatusId = deployStatusId;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=45)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


