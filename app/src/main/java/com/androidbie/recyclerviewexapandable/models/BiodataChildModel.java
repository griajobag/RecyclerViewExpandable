package com.androidbie.recyclerviewexapandable.models;

/**
 * Created by putuguna on 04/01/17.
 */

public class BiodataChildModel {

    private String status;
    private String descriptions;

    public BiodataChildModel(String status, String descriptions) {
        this.status = status;
        this.descriptions = descriptions;
    }

    public BiodataChildModel() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
