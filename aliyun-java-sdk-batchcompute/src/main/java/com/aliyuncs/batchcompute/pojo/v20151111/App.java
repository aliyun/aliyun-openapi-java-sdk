package com.aliyuncs.batchcompute.pojo.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 17/10/13.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class App {
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
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonIgnore
    public Map<String, InputParameterValue> getInputParameters() {
        return inputParameters;
    }

    @JsonIgnore
    public void setInputParameters(Map<String, InputParameterValue> inputParameters) {
        this.inputParameters = inputParameters;
    }

    public void addInputParameters(String key, InputParameterValue inputParameterValue) {
        if(null==this.inputParameters){
            this.inputParameters = new HashMap<String, InputParameterValue>();
        }
        this.inputParameters.put(key, inputParameterValue);
    }

    @JsonIgnore
    public Map<String, OutputParameterValue> getOutputParameters() {
        return outputParameters;
    }

    @JsonIgnore
    public void setOutputParameters(Map<String, OutputParameterValue> outputParameters) {
        this.outputParameters = outputParameters;
    }


    public void addOutputParameters(String key, OutputParameterValue outputParameterValue) {
        if(null==this.outputParameters){
            this.outputParameters = new HashMap<String, OutputParameterValue>();
        }
        this.outputParameters.put(key, outputParameterValue);
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
    public Config getConfig() {
        return config;
    }
    @JsonIgnore
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CreationTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date creationTime;

    @JsonProperty("InputParameters")
    private Map<String, InputParameterValue> inputParameters;

    @JsonProperty("OutputParameters")
    private Map<String, OutputParameterValue> outputParameters;


    @JsonProperty("Config")
    private Config config;


    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class Config{
        @JsonProperty("ResourceType")
        private ConfigValue resourceType;

        @JsonProperty("InstanceType")
        private ConfigValue instanceType;

        @JsonProperty("InstanceCount")
        private ConfigValueInteger instanceCount;

        @JsonProperty("MinDiskSize")
        private ConfigValueInteger minDiskSize;

        @JsonProperty("DiskType")
        private ConfigValue diskType;

        @JsonProperty("MaxRetryCount")
        private ConfigValueInteger maxRetryCount;

        @JsonProperty("Timeout")
        private ConfigValueLong timeout;

        @JsonProperty("MinDataDiskSize")
        private ConfigValueInteger minDataDiskSize;

        @JsonProperty("DataDiskType")
        private ConfigValue dataDiskType;

        @JsonProperty("DataDiskMountPoint")
        private ConfigValue dataDiskMountPoint;

        @JsonIgnore
        public ConfigValueInteger getMinDatDiskSize() {
            return minDataDiskSize;
        }
        @JsonIgnore
        public void setMinDataDiskSize(ConfigValueInteger minDataDiskSize) {
            this.minDataDiskSize = minDataDiskSize;
        }
        @JsonIgnore
        public ConfigValue getDataDiskType() {
            return dataDiskType;
        }
        @JsonIgnore
        public void setDataDiskType(ConfigValue dataDiskType) {
            this.dataDiskType = dataDiskType;
        }
        @JsonIgnore
        public ConfigValue getDataDiskMountPoint() {
            return dataDiskMountPoint;
        }
        @JsonIgnore
        public void setDataDiskMountPointDiskType(ConfigValue dataDiskMountPoint) { this.dataDiskMountPoint = dataDiskMountPoint; }

        @JsonIgnore
        public ConfigValue getResourceType() {
            return resourceType;
        }
        @JsonIgnore
        public void setResourceType(ConfigValue resourceType) {
            this.resourceType = resourceType;
        }
        @JsonIgnore
        public ConfigValue getInstanceType() {
            return instanceType;
        }
        @JsonIgnore
        public void setInstanceType(ConfigValue instanceType) {
            this.instanceType = instanceType;
        }
        @JsonIgnore
        public ConfigValueInteger getInstanceCount() {
            return instanceCount;
        }
        @JsonIgnore
        public void setInstanceCount(ConfigValueInteger instanceCount) {
            this.instanceCount = instanceCount;
        }
        @JsonIgnore
        public ConfigValueInteger getMinDiskSize() {
            return minDiskSize;
        }
        @JsonIgnore
        public void setMinDiskSize(ConfigValueInteger minDiskSize) {
            this.minDiskSize = minDiskSize;
        }
        @JsonIgnore
        public ConfigValue getDiskType() {
            return diskType;
        }
        @JsonIgnore
        public void setDiskType(ConfigValue diskType) {
            this.diskType = diskType;
        }
        @JsonIgnore
        public ConfigValueInteger getMaxRetryCount() {
            return maxRetryCount;
        }
        @JsonIgnore
        public void setMaxRetryCount(ConfigValueInteger maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
        }
        @JsonIgnore
        public ConfigValueLong getTimeout() {
            return timeout;
        }
        @JsonIgnore
        public void setTimeout(ConfigValueLong timeout) {
            this.timeout = timeout;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class ConfigValue{
        @JsonProperty("Description")
        private String description;

        @JsonProperty("Default")
        private String defaultValue;

        @JsonProperty("Overwritable")
        private boolean overwritable=true;
        @JsonIgnore
        public String getDescription() {
            return description;
        }
        @JsonIgnore
        public void setDescription(String description) {
            this.description = description;
        }
        @JsonIgnore
        public String getDefaultValue() {
            return defaultValue;
        }
        @JsonIgnore
        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }
        @JsonIgnore
        public boolean isOverwritable() {
            return overwritable;
        }
        @JsonIgnore
        public void setOverwritable(boolean overwritable) {
            this.overwritable = overwritable;
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class ConfigValueInteger{
        @JsonProperty("Description")
        private String description;

        @JsonProperty("Default")
        private int defaultValue;

        @JsonProperty("Overwritable")
        private boolean overwritable=true;

        @JsonIgnore
        public String getDescription() {
            return description;
        }

        @JsonIgnore
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonIgnore
        public int getDefaultValue() {
            return defaultValue;
        }

        @JsonIgnore
        public void setDefaultValue(int defaultValue) {
            this.defaultValue = defaultValue;
        }

        @JsonIgnore
        public boolean isOverwritable() {
            return overwritable;
        }

        @JsonIgnore
        public void setOverwritable(boolean overwritable) {
            this.overwritable = overwritable;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class ConfigValueLong{
        @JsonProperty("Description")
        private String description;

        @JsonProperty("Default")
        private long defaultValue;

        @JsonProperty("Overwritable")
        private boolean overwritable=true;

        @JsonIgnore
        public String getDescription() {
            return description;
        }

        @JsonIgnore
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonIgnore
        public long getDefaultValue() {
            return defaultValue;
        }
        @JsonIgnore
        public void setDefaultValue(long defaultValue) {
            this.defaultValue = defaultValue;
        }
        @JsonIgnore
        public boolean isOverwritable() {
            return overwritable;
        }
        @JsonIgnore
        public void setOverwritable(boolean overwritable) {
            this.overwritable = overwritable;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class ConfigValueBoolean{
        @JsonProperty("Description")
        private String description;

        @JsonProperty("Default")
        private boolean defaultValue;

        @JsonProperty("Overwritable")
        private boolean overwritable=true;

        @JsonIgnore
        public String getDescription() {
            return description;
        }
        @JsonIgnore
        public void setDescription(String description) {
            this.description = description;
        }
        @JsonIgnore
        public boolean isDefaultValue() {
            return defaultValue;
        }
        @JsonIgnore
        public void setDefaultValue(boolean defaultValue) {
            this.defaultValue = defaultValue;
        }
        @JsonIgnore
        public boolean isOverwritable() {
            return overwritable;
        }
        @JsonIgnore
        public void setOverwritable(boolean overwritable) {
            this.overwritable = overwritable;
        }
    }





    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class InputParameterValue{
        @JsonProperty("Description")
        private String description;

        @JsonProperty("Type")
        private String type;

        @JsonProperty("Default")
        private String defaultValue;

        @JsonIgnore
        public String getDescription() {
            return description;
        }
        @JsonIgnore
        public void setDescription(String description) {
            this.description = description;
        }
        @JsonIgnore
        public String getType() {
            return type;
        }
        @JsonIgnore
        public void setType(String type) {
            this.type = type;
        }
        @JsonIgnore
        public String getDefaultValue() {
            return defaultValue;
        }
        @JsonIgnore
        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class OutputParameterValue{
        @JsonProperty("Description")
        private String description;

        @JsonProperty("Type")
        private String type;

        @JsonIgnore
        public String getDescription() {
            return description;
        }

        @JsonIgnore
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonIgnore
        public String getType() {
            return type;
        }

        @JsonIgnore
        public void setType(String type) {
            this.type = type;
        }

    }

}


