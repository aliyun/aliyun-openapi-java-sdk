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

    @JsonProperty("Mounts")
    private Mounts mounts;

    @JsonIgnore
    public Mounts getMounts() {
        return mounts;
    }

    @JsonIgnore
    public void setMounts(Mounts mounts) {
        this.mounts = mounts;
    }

    @JsonIgnore
    public Networks getNetworks() {
        return networks;
    }

    @JsonIgnore
    public void setNetworks(Networks networks) {
        this.networks = networks;
    }

    @JsonProperty("Networks")
    private Networks networks;


}
