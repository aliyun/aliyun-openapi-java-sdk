package com.aliyuncs.batchcompute.pojo.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

/**
 * Created by guangchun.luo on 2017-5-3
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VPC {

    @JsonProperty("CidrBlock")
    private String cidrBlock;

    @JsonProperty("VpcId")
    private String vpcId;

    @JsonProperty("ExpressConnectSpec")
    private String expressConnectSpec;

    @JsonProperty("OppositeRegionId")
    private String oppositeRegionId;

    @JsonProperty("OppositeAccessPointId")
    private String oppositeAccessPointId;

    @JsonProperty("OppositeRouterType")
    private String oppositeRouterType;

    @JsonProperty("OppositeRouterId")
    private String oppositeRouterId;

    @JsonProperty("OppositeInterfaceId")
    private String oppositeInterfaceId;

    @JsonIgnore
    public String getVpcId() {
        return vpcId;
    }

    @JsonIgnore
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    @JsonIgnore
    public String getCidrBlock() {
        return cidrBlock;
    }

    @JsonIgnore
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    @JsonIgnore
    public String getExpressConnectSpec() {
        return expressConnectSpec;
    }

    @JsonIgnore
    public void setExpressConnectSpec(String expressConnectSpec) {
        this.expressConnectSpec = expressConnectSpec;
    }

    @JsonIgnore
    public String getOppositeRegionId() {
        return oppositeRegionId;
    }

    @JsonIgnore
    public void setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
    }

    @JsonIgnore
    public String getOppositeAccessPointId() {
        return oppositeAccessPointId;
    }

    @JsonIgnore
    public void setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
    }

    @JsonIgnore
    public String getOppositeRouterType() {
        return oppositeRouterType;
    }

    @JsonIgnore
    public void setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
    }

    @JsonIgnore
    public String getOppositeRouterId() {
        return oppositeRouterId;
    }

    @JsonIgnore
    public void setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
    }

    @JsonIgnore
    public String getOppositeInterfaceId() {
        return oppositeInterfaceId;
    }

    @JsonIgnore
    public void setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
    }
}
