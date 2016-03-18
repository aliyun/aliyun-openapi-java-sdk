package com.aliyuncs.batchcompute.pojo.v20151111;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
