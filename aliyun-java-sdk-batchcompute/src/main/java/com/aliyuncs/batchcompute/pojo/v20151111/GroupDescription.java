package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupDescription {

    @JsonProperty("DesiredVMCount")
    private int desiredVMCount;


    @JsonProperty("InstanceType")
    private String instanceType;


    @JsonProperty("ResourceType")
    private String resourceType = "OnDemand";



    @JsonIgnore
    public int getDesiredVMCount() {
        return desiredVMCount;
    }

    @JsonIgnore
    public void setDesiredVMCount(int desiredVMCount) {
        this.desiredVMCount = desiredVMCount;
    }


    @JsonIgnore
    public String getInstanceType() {
        return instanceType;
    }

    @JsonIgnore
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonIgnore
    public String getResourceType() {
        return resourceType;
    }

    @JsonIgnore
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


}
