package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 16/1/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AutoCluster{


    @JsonProperty("ImageId")
    private String imageId;

    @JsonProperty("ECSImageId")
    private String ECSImageId;

    @JsonProperty("InstanceType")
    private String instanceType;

    @JsonProperty("ResourceType")
    private String resourceType = "OnDemand";

    @JsonProperty("ClusterId")
    private String clusterId;

    @JsonProperty("Configs")
    private Configs configs;

    @JsonProperty("ReserveOnFail")
    private boolean reserveOnFail = false;

    @JsonProperty("DependencyIsvService")
    private String dependencyIsvService;

    @JsonIgnore
    public boolean isReserveOnFail() {
        return reserveOnFail;
    }
    @JsonIgnore
    public void setReserveOnFail(boolean reserveOnFail) {
        this.reserveOnFail = reserveOnFail;
    }


    @JsonProperty("UserData")
    private Map<String, String> userData;

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
    public Configs getConfigs() {
        return configs;
    }

    @JsonIgnore
    public void setConfigs(Configs configs) {
        this.configs = configs;
    }

    @JsonIgnore
    public Map<String, String> getUserData() {
        return userData;
    }

    @JsonIgnore
    public void setUserData(Map<String, String> userData) {
        this.userData = userData;
    }

    public void addUserData(String key, String value) {
        if(this.userData==null){
            this.userData = new HashMap<String,String>();
        }
        this.userData.put(key, value);
    }

    @JsonIgnore
    public String getImageId() {
        return imageId;
    }
    @JsonIgnore
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    @JsonIgnore
    public String getECSImageId() {
        return ECSImageId;
    }
    @JsonIgnore
    public void setECSImageId(String eCSImageId) {
        this.ECSImageId = eCSImageId;
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

    @JsonIgnore
    public void setClusterId(String clusterId) { this.clusterId = clusterId; }

    @JsonIgnore
    public String getClusterId() { return clusterId; }

    @JsonIgnore
    public void setDependencyIsvService(String dependencyIsvService) { this.dependencyIsvService = dependencyIsvService; }

    @JsonIgnore
    public String getDependencyIsvService() { return dependencyIsvService; }

}
