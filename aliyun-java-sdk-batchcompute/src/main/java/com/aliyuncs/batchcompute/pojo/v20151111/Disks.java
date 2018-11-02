package com.aliyuncs.batchcompute.pojo.v20151111;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Disks {


    @JsonProperty("SystemDisk")
    private SystemDisk systemDisk;


    @JsonProperty("DataDisk")
    private DataDisk dataDisk;


    @JsonIgnore
    public DataDisk getDataDisk() {
        return  dataDisk;
    }

    @JsonIgnore
    public void setDataDisk(DataDisk data) {
        this.dataDisk = data;
    }

    @JsonIgnore
    public SystemDisk getSystemDisk() {
        return systemDisk;
    }

    @JsonIgnore
    public void setSystemDisk(SystemDisk system) {
        this.systemDisk = system;
    }

}
