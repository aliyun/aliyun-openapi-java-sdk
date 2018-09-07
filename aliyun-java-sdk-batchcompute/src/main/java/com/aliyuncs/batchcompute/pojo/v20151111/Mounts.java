package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    //控制ossmounter是否开启分布式缓存，Job级别的设置会被忽略，只有cluster和AutoCluster级别的有效
    @JsonProperty("CacheSupport")
    private boolean cacheSupport = true;


    @JsonProperty("CacheBlockSize")
    private long cacheBlockSize = 262144L;

    @JsonProperty("CacheTotalSize")
    private long cacheTotalSize = 536870912L;


    @JsonProperty("NAS")
    private NASConfig nas;

    @JsonProperty("OSS")
    private OSSConfig oss;

    @JsonProperty("Entries")
    private List<MountEntry> entries;


    @JsonIgnore
    public long getCacheBlockSize() {
        return cacheBlockSize;
    }
    @JsonIgnore
    public void setCacheBlockSize(long cacheBlockSize) {
        this.cacheBlockSize = cacheBlockSize;
    }
    @JsonIgnore
    public long getCacheTotalSize() {
        return cacheTotalSize;
    }
    @JsonIgnore
    public void setCacheTotalSize(long cacheTotalSize) {
        this.cacheTotalSize = cacheTotalSize;
    }
    @JsonIgnore
    public boolean isCacheSupport() {
        return cacheSupport;
    }
    @JsonIgnore
    public void setCacheSupport(boolean cacheSupport) {
        this.cacheSupport = cacheSupport;
    }

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
