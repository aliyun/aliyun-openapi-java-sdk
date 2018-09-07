package com.aliyuncs.batchcompute.pojo.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

/**
 * Created by guangchun.luo on 2016-6-12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

    public final static String LINUX = "Linux";
    public final static String WINDOWS = "Windows";


    @JsonProperty("Name")
    private String name;

    @JsonIgnore
    public String getPlatform() {
        return Platform;
    }

    @JsonIgnore
    public void setPlatform(String platform) {
        Platform = platform;
    }

    @JsonProperty("Platform")
    private String Platform;

    @JsonIgnore
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getId() {
        return Id;
    }

    @JsonIgnore
    public void setId(String id) {
        Id = id;
    }

    @JsonIgnore
    public String getDescription() {
        return Description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        Description = description;
    }

    @JsonIgnore
    public String getEcsImageId() {
        return EcsImageId;
    }

    @JsonIgnore
    public void setEcsImageId(String ecsImageId) {
        EcsImageId = ecsImageId;
    }

    @JsonIgnore
    public String getOwnerId() {
        return OwnerId;
    }

    @JsonIgnore
    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    @JsonIgnore
    public Date getCreationTime() {
        return creationTime;
    }

    @JsonIgnore
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @JsonIgnore
    public String getType() {
        return type;
    }

    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Id")
    private String Id;

    @JsonProperty("Description")
    private String Description;


    @JsonProperty("EcsImageId")
    private String EcsImageId;

    @JsonProperty("OwnerId")
    private String OwnerId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("CreationTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date creationTime;


}
