package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/5.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class InputMappingConfig {

    @JsonProperty("Locale")
    private String locale;

    @JsonProperty("Lock")
    private boolean lock;


    @JsonIgnore
    public boolean isLock() {
        return lock;
    }

    @JsonIgnore
    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @JsonIgnore
    public String getLocale() {
        return locale;
    }

    @JsonIgnore
    public void setLocale(String locale) {
        this.locale = locale;
    }
}
