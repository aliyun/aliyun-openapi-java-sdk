package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemDisk {


    @JsonProperty("Type")
    private String type;

    @JsonProperty("Size")
    private int size;     //GB


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


}
