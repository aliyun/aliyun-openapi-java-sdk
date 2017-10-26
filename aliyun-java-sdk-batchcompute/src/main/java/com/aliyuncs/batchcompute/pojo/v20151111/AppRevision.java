package com.aliyuncs.batchcompute.pojo.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

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


