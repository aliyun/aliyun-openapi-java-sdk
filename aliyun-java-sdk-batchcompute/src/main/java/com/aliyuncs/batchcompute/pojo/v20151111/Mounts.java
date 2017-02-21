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
public class Mounts {


    @JsonProperty("Locale")
    private String locale = "GBK";

    @JsonProperty("Lock")
    private boolean lock = false;


    @JsonProperty("NAS")
    private NASConfig nas;

    @JsonProperty("OSS")
    private OSSConfig oss;

    @JsonProperty("Entries")
    private List<MountEntry> entries;



    @JsonIgnore
    public NASConfig getNas() {
        return nas;
    }
    @JsonIgnore
    public void setNas(NASConfig nas) {
        this.nas = nas;
    }
    @JsonIgnore
    public OSSConfig getOss() {
        return oss;
    }
    @JsonIgnore
    public void setOss(OSSConfig oss) {
        this.oss = oss;
    }
    @JsonIgnore
    public List<MountEntry> getEntries() {
        return entries;
    }
    @JsonIgnore
    public void setEntries(List<MountEntry> entries) {
        this.entries = entries;
    }

    public void addEntries(MountEntry e) {
        if(entries==null){
            entries = new ArrayList<MountEntry>();
        }
        entries.add(e);
    }

    @JsonIgnore
    public String getLocale() {
        return locale;
    }
    @JsonIgnore
    public void setLocale(String locale) {
        this.locale = locale;
    }
    @JsonIgnore
    public boolean isLock() {
        return lock;
    }
    @JsonIgnore
    public void setLock(boolean lock) {
        this.lock = lock;
    }



}
