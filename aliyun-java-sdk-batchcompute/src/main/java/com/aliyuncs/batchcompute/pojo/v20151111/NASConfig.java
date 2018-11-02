package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class NASConfig {


    @JsonProperty("AccessGroup")
    private List<String> accessGroup;

    @JsonProperty("FileSystem")
    private List<String> fileSystem;



    @JsonIgnore
    public List<String> getAccessGroup() {
        return accessGroup;
    }
    @JsonIgnore
    public void setAccessGroup(List<String> accessGroup) {
        this.accessGroup = accessGroup;
    }
    @JsonIgnore
    public List<String> getFileSystem() {
        return fileSystem;
    }
    @JsonIgnore
    public void setFileSystem(List<String> fileSystem) {
        this.fileSystem = fileSystem;
    }

    public void addFileSystem(String item) {
        if(fileSystem==null){
            fileSystem = new ArrayList<String>();
        }
        fileSystem.add(item);
    }
    public void addAccessGroup(String item) {
        if(accessGroup==null){
            accessGroup = new ArrayList<String>();
        }
        accessGroup.add(item);
    }


}
