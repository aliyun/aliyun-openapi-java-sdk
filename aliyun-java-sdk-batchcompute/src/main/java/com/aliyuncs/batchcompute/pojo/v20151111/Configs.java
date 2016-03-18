package com.aliyuncs.batchcompute.pojo.v20151111;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Configs {

    @JsonIgnore
    public Disks getDisks() {
        return disks;
    }

    @JsonIgnore
    public void setDisks(Disks disks) {
        this.disks = disks;
    }

    @JsonProperty("Disks")
    private Disks disks;



}
