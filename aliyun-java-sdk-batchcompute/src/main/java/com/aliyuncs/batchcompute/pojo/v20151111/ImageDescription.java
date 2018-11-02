
package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 2016-6-12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ImageDescription {

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



    @JsonProperty("Description")
    private String Description;


    @JsonProperty("EcsImageId")
    private String EcsImageId;



}
