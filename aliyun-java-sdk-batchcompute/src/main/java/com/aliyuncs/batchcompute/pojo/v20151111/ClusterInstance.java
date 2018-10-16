package com.aliyuncs.batchcompute.pojo.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.util.Date;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClusterInstance {


    @JsonProperty("Id")
    private String id;

    @JsonProperty("Hint")
    private String hint;

    @JsonProperty("State")
    private String state;

    @JsonProperty("IpAddress")
    private String ipAddress;

    @JsonProperty("EcsInstanceId")
    private String ecsInstanceId;

    @JsonProperty("HostName")
    private String hostName;

    @JsonProperty("ErrorCode")
    private int errorCode;

    @JsonProperty("ErrorMessage")
    private String errorMessage;

    @JsonProperty("CreationTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date creationTime;


    @JsonIgnore
    public String getEcsInstanceId() {
        return ecsInstanceId;
    }
    @JsonIgnore
    public void setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
    }
    @JsonIgnore
    public String getHostName() {
        return hostName;
    }
    @JsonIgnore
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    @JsonIgnore
    public int getErrorCode() {
        return errorCode;
    }
    @JsonIgnore
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    @JsonIgnore
    public String getErrorMessage() {
        return errorMessage;
    }
    @JsonIgnore
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    @JsonIgnore
    public String getIpAddress() {
        return ipAddress;
    }
    @JsonIgnore
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    @JsonIgnore
    public String getId() {
        return id;
    }
    @JsonIgnore
    public void setId(String id) {
        this.id = id;
    }
    @JsonIgnore
    public String getHint() {
        return hint;
    }
    @JsonIgnore
    public void setHint(String hint) {
        this.hint = hint;
    }
    @JsonIgnore
    public String getState() {
        return state;
    }
    @JsonIgnore
    public void setState(String state) {
        this.state = state;
    }

    @JsonIgnore
    public Date getCreationTime() {
        return this.creationTime;
    }

    @JsonIgnore
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

}
