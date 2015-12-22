package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/5.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
