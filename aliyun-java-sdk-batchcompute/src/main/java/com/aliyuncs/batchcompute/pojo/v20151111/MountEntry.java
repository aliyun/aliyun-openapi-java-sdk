package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
