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
public class ClassicNetWork {


    @JsonProperty("AllowIpAddress")
    private List<String> allowIpAddress;

    @JsonProperty("AllowSecurityGroup")
    private  List<String>  allowSecurityGroup;

    @JsonIgnore
    public List<String> getAllowIpAddress() {
        return allowIpAddress;
    }

    @JsonIgnore
    public void setAllowIpAddress(List<String> allowIpAddress) {
        this.allowIpAddress = allowIpAddress;
    }

    @JsonIgnore
    public List<String> getAllowSecurityGroup() {
        return allowSecurityGroup;
    }

    @JsonIgnore
    public void setAllowSecurityGroup(List<String> allowSecurityGroup) {
        this.allowSecurityGroup = allowSecurityGroup;
    }

    public void addAllowIpAddress(String item) {
        if(allowIpAddress==null){
            allowIpAddress = new ArrayList<String>();
        }
        allowIpAddress.add(item);
    }

    public void addAllowSecurityGroup(String item) {
       if(allowSecurityGroup==null){
           allowSecurityGroup = new ArrayList<String>();
       }
        allowSecurityGroup.add(item);
    }
}
