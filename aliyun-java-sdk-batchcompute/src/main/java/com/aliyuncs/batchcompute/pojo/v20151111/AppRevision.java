package com.aliyuncs.batchcompute.pojo.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 17/10/13.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppRevision {

    @JsonIgnore
    public int getRevision() {
        return revision;
    }
    @JsonIgnore
    public void setRevision(int revision) {
        this.revision = revision;
    }
    @JsonIgnore
    public Date getUpdateTime() {
        return updateTime;
    }
    @JsonIgnore
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @JsonProperty("Revision")
    private int revision;

    @JsonProperty("UpdateTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date updateTime;



}


