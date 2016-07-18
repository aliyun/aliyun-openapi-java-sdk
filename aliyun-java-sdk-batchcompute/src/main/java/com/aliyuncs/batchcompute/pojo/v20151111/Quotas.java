package com.aliyuncs.batchcompute.pojo.v20151111;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

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
