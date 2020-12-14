package com.autobots.autobotsquestionnare.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class Questionnare {
    @Id
    private String id;
    private String webCtrlVersion;
    private String webCtrlIp;
    private String addOnsList;
    private String oldAddOns;
    private String alertMethod;
    private String inNotification;
    private String dbBrandAndVersion;
    private String usingHierarchial;
    private String directorySize;
    private String dbSize;
    private String controllerNo;
    private String pointsNo;
    private String sourceNo;
    private String sampleNo;

    private String controllerModel;
    private String controllerIpAddress;
    private String controllerFirmware;
    private String bacNet;
    private String internetProxy;
    private String hardwareVpn;
}
