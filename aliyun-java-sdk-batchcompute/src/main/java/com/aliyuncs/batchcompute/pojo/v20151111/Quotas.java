package com.aliyuncs.batchcompute.pojo.v20151111;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quotas {

    @JsonProperty("AvailableClusterInstanceType")
    private List<String> availableClusterInstanceType;


    @JsonProperty("AvailableClusterInstanceSystemDiskType")
    private List<String> availableClusterInstanceSystemDiskType;


    @JsonProperty("AvailableClusterInstanceDataDiskType")
    private List<String> availableClusterInstanceDataDiskType;


    @JsonProperty("AvailableSpotInstanceType")
    private List<String> availableSpotInstanceType;

    @JsonProperty("AvailableClusterResourceType")
    private List<String> availableClusterResourceType;


    @JsonIgnore
    public List<String> getAvailableClusterResourceType() {
        return availableClusterResourceType;
    }
    @JsonIgnore
    public void setAvailableClusterResourceType(List<String> availableClusterResourceType) {
        this.availableClusterResourceType = availableClusterResourceType;
    }

    @JsonIgnore
    public List<String> getAvailableSpotInstanceType() {
        return availableSpotInstanceType;
    }
    @JsonIgnore
    public void setAvailableSpotInstanceType(List<String> availableSpotInstanceType) {
        this.availableSpotInstanceType = availableSpotInstanceType;
    }


    @JsonIgnore
    public List<String> getAvailableClusterInstanceType() {
        return availableClusterInstanceType;
    }

    @JsonIgnore
    public void setAvailableClusterInstanceType(List<String> availableClusterInstanceType) {
        this.availableClusterInstanceType = availableClusterInstanceType;
    }

    @JsonIgnore
    public List<String> getAvailableClusterInstanceSystemDiskType() {
        return availableClusterInstanceSystemDiskType;
    }

    @JsonIgnore
    public void setAvailableClusterInstanceSystemDiskType(List<String> availableClusterInstanceSystemDiskType) {
        this.availableClusterInstanceSystemDiskType = availableClusterInstanceSystemDiskType;
    }

    @JsonIgnore
    public List<String> getAvailableClusterInstanceDataDiskType() {
        return availableClusterInstanceDataDiskType;
    }

    @JsonIgnore
    public void setAvailableClusterInstanceDataDiskType(List<String> availableClusterInstanceDataDiskType) {
        this.availableClusterInstanceDataDiskType = availableClusterInstanceDataDiskType;
    }
}
