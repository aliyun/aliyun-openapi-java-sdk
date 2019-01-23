package com.aliyuncs.batchcompute.pojo.v20151111;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AvailableResource {
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NetWorkDesc {
        @JsonProperty("Classic")
        private boolean classic;

        @JsonProperty("Vpc")
        private boolean vpc;

        @JsonIgnore
        public boolean getVpc() {
            return vpc;
        }

        @JsonIgnore
        public void setVpc(boolean vpc) {
            this.vpc = vpc;
        }

        @JsonIgnore
        public boolean getClassic() {
            return classic;
        }

        @JsonIgnore
        public void setClassic(boolean classic) {
            this.classic = classic;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class InstanceDesc{
        @JsonProperty("CpuCore")
        private int cpuCore;

        @JsonProperty("InstanceType")
        private String instanceType;

        @JsonProperty("MemorySize")
        private int memorySize;

        @JsonProperty("Network")
        private NetWorkDesc netWork;

        @JsonIgnore
        public int getCpuCore() {
            return cpuCore;
        }

        @JsonIgnore
        public void setCpuCore(int cpuCore) {
            this.cpuCore = cpuCore;
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
        public int getMemorySize() {
            return memorySize;
        }

        @JsonIgnore
        public void setMemorySize(int memorySize) {
            this.memorySize = memorySize;
        }

        @JsonIgnore
        public NetWorkDesc getNetWork() {
            return netWork;
        }

        @JsonIgnore
        public void setNetWork(NetWorkDesc netWork) {
            this.netWork = netWork;
        }
    }

    @JsonProperty("AvailableClusterInstanceType")
    private List<InstanceDesc> availableClusterInstanceType;

    @JsonIgnore
    public List<InstanceDesc> getAvailableClusterInstanceType() {
        return availableClusterInstanceType;
    }

    @JsonIgnore
    public void setAvailableClusterInstanceType(List<InstanceDesc> availableClusterInstanceType) {
        this.availableClusterInstanceType = availableClusterInstanceType;
    }

    @JsonIgnore
    public void addAvailableClusterInstanceType(InstanceDesc availableClusterInstanceType) {
        if(this.availableClusterInstanceType == null){
            this.availableClusterInstanceType = new ArrayList<InstanceDesc>();
        }
        this.availableClusterInstanceType.add(availableClusterInstanceType);
    }

    @JsonProperty("AvailableSpotInstanceType")
    private List<InstanceDesc> availableSpotInstanceType;

    @JsonIgnore
    public List<InstanceDesc> getAvailableSpotInstanceType() {
        return availableSpotInstanceType;
    }

    @JsonIgnore
    public void setAvailableSpotInstanceType(List<InstanceDesc> availableSpotInstanceType) {
        this.availableSpotInstanceType = availableSpotInstanceType;
    }

    @JsonIgnore
    public void addAvailableSpotInstanceType(InstanceDesc availableSpotInstanceType) {
        if(this.availableSpotInstanceType == null){
            this.availableSpotInstanceType = new ArrayList<InstanceDesc>();
        }
        this.availableSpotInstanceType.add(availableSpotInstanceType);
    }


    @JsonProperty("AvailablePrepaidInstanceType")
    private List<InstanceDesc> availablePrepaidInstanceType;

    @JsonIgnore
    public List<InstanceDesc> getAvailablePrepaidInstanceType() {
        return availablePrepaidInstanceType;
    }

    @JsonIgnore
    public void setAvailablePrepaidInstanceType(List<InstanceDesc> availablePrepaidInstanceType) {
        this.availablePrepaidInstanceType = availablePrepaidInstanceType;
    }

    @JsonIgnore
    public void addAvailablePrepaidInstanceType(InstanceDesc availablePrepaidInstanceType) {
        if(this.availablePrepaidInstanceType == null){
            this.availablePrepaidInstanceType = new ArrayList<InstanceDesc>();
        }
        this.availablePrepaidInstanceType.add(availablePrepaidInstanceType);
    }


    @JsonProperty("AvailableResourceType")
    private List<String> availableResourceType;

    @JsonIgnore
    public List<String> getAvailableResourceType() {
        return availableResourceType;
    }

    @JsonIgnore
    public void setAvailableResourceType(List<String> availableResourceType) {
        this.availableResourceType = availableResourceType;
    }

    @JsonIgnore
    public void addAvailableResourceType(String availableResourceType) {
        if(this.availableResourceType == null){
            this.availableResourceType = new ArrayList<String>();
        }
        this.availableResourceType.add(availableResourceType);
    }


    @JsonProperty("AvailableSystemDiskType")
    private List<String> availableSystemDiskType;

    @JsonIgnore
    public List<String> getAvailableSystemDiskType() {
        return availableSystemDiskType;
    }

    @JsonIgnore
    public void setAvailableSystemDiskType(List<String> availableSystemDiskType) {
        this.availableSystemDiskType = availableSystemDiskType;
    }

    @JsonIgnore
    public void addAvailableSystemDiskType(String availableSystemDiskType) {
        if(this.availableSystemDiskType == null){
            this.availableSystemDiskType = new ArrayList<String>();
        }
        this.availableSystemDiskType.add(availableSystemDiskType);
    }

    @JsonProperty("AvailableDataDiskType")
    private List<String> availableDataDiskType;

    @JsonIgnore
    public List<String> getAvailableDataDiskType() {
        return availableDataDiskType;
    }

    @JsonIgnore
    public void setAvailableDataDiskType(List<String> availableDataDiskType) {
        this.availableDataDiskType = availableDataDiskType;
    }

    @JsonIgnore
    public void addAvailableDataDiskType(String availableDataDiskType) {
        if(this.availableDataDiskType == null){
            this.availableDataDiskType = new ArrayList<String>();
        }
        this.availableDataDiskType.add(availableDataDiskType);
    }
}
