package com.laptrinhjavaweb.model;

import java.sql.Time;
import java.sql.Timestamp;

public class AbstracModel {
    private long id;
    private Timestamp createdDate;
    private Time modifiedDate;
    private String createdBy;
    private String modifiedBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Time getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Time modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
