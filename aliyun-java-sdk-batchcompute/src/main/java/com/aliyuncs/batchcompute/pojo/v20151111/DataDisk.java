package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDisk {


    @JsonProperty("Type")
    private String type;

    @JsonProperty("Size")
    private int size;     //GB

    @JsonProperty("MountPoint")
    private String mountPoint;


    @JsonIgnore
    public String getType() {
        return type;
    }
    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }
    @JsonIgnore
    public int getSize() {
        return size;
    }
    @JsonIgnore
    public void setSize(int size) {
        this.size = size;
    }
    @JsonIgnore
    public String getMountPoint() {
        return mountPoint;
    }
    @JsonIgnore
    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

}
