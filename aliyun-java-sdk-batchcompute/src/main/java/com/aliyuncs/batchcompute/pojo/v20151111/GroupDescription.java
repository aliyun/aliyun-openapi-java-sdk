package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupDescription {

    @JsonProperty("DesiredVMCount")
    private int desiredVMCount = -1;


    @JsonProperty("InstanceType")
    private String instanceType;


    @JsonProperty("ResourceType")
    private String resourceType;

    @JsonProperty("SpotStrategy")
    private String spotStrategy;

    @JsonProperty("SpotPriceLimit")
    private float spotPriceLimit;

    @JsonIgnore
    public String getSpotStrategy() {
        return spotStrategy;
    }
    @JsonIgnore
    public void setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
    }
    @JsonIgnore
    public float getSpotPriceLimit() {
        return spotPriceLimit;
    }
    @JsonIgnore
    public void setSpotPriceLimit(float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
    }




    @JsonIgnore
    public int getDesiredVMCount() {
        return desiredVMCount;
    }

    @JsonIgnore
    public void setDesiredVMCount(int desiredVMCount) {
        this.desiredVMCount = desiredVMCount;
    }


    @JsonIgnore
    public String getInstanceType() {
        return instanceType;
    }

    @JsonIgnore
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonIgnore
    public String getResourceType() {
        return resourceType;
    }

    @JsonIgnore
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


}
