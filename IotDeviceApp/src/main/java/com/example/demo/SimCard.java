package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="SIM_CARD")
public class SimCard {


    @Id
    @Column(unique = true,name="SIM_ID")
    private Long SimId;

    @Column(unique = true,name="OPERATOR_CODE")
    private Long OperatorCode;
    @Column(name="COUNTRY_NAME")
    private String Country;

    @Enumerated(EnumType.STRING)
    @Column(name="DEVICE_STATUS")
    private DeviceStatus status;






    public Long getSimId() {
        return SimId;
    }

    public void setSimId(Long simId) {
        SimId = simId;
    }


    public Long getOperatorCode() {
        return OperatorCode;
    }

    public void setOperatorCode(Long operatorCode) {
        OperatorCode = operatorCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

}
