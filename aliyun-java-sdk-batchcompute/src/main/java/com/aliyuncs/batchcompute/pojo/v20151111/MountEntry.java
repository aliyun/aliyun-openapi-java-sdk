package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class MountEntry {

    @JsonIgnore
    public String getDestination() {
        return destination;
    }
    @JsonIgnore
    public void setDestination(String destination) {
        this.destination = destination;
    }
    @JsonIgnore
    public String getSource() {
        return Source;
    }
    @JsonIgnore
    public void setSource(String source) {
        Source = source;
    }
    @JsonIgnore
    public boolean isWriteSupport() {
        return writeSupport;
    }
    @JsonIgnore
    public void setWriteSupport(boolean writeSupport) {
        this.writeSupport = writeSupport;
    }

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("Source")
    private String Source;


    @JsonProperty("WriteSupport")
    private boolean writeSupport;

}
