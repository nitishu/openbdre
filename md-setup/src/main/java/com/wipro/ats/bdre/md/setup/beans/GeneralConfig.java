package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.*;

/**
 * GeneralConfig generated by hbm2java
 */
@Entity
@Table(name="GENERAL_CONFIG"

)
public class GeneralConfig  implements java.io.Serializable {


     private GeneralConfigId id;
     private String gcValue;
     private String description;
     private Boolean required;
     private String defaultVal;
     private String type;
     private Boolean enabled;

    public GeneralConfig() {
    }

	
    public GeneralConfig(GeneralConfigId id, String description, Boolean required, String type) {
        this.id = id;
        this.description = description;
        this.required = required;
        this.type = type;
    }
    public GeneralConfig(GeneralConfigId id, String gcValue, String description, Boolean required, String defaultVal, String type, Boolean enabled) {
       this.id = id;
       this.gcValue = gcValue;
       this.description = description;
       this.required = required;
       this.defaultVal = defaultVal;
       this.type = type;
       this.enabled = enabled;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="configGroup", column=@Column(name="CONFIG_GROUP", nullable=false, length=128) ), 
        @AttributeOverride(name="gcKey", column=@Column(name="GC_KEY", nullable=false, length=128) ) } )
    public GeneralConfigId getId() {
        return this.id;
    }
    
    public void setId(GeneralConfigId id) {
        this.id = id;
    }
    
    @Column(name="GC_VALUE", length=2048)
    public String getGcValue() {
        return this.gcValue;
    }
    
    public void setGcValue(String gcValue) {
        this.gcValue = gcValue;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=1028)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="REQUIRED", nullable=false)
    public Boolean getRequired() {
        return this.required;
    }
    
    public void setRequired(Boolean required) {
        this.required = required;
    }
    
    @Column(name="DEFAULT_VAL", length=2048)
    public String getDefaultVal() {
        return this.defaultVal;
    }
    
    public void setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal;
    }
    
    @Column(name="TYPE", nullable=false, length=20)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="ENABLED")
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }




}


