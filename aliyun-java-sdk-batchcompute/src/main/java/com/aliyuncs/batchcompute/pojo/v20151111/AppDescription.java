package com.aliyuncs.batchcompute.pojo.v20151111;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 17/10/13.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AppDescription {
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
    public Docker getDocker() {
        return docker;
    }

    @JsonIgnore
    public void setDocker(Docker docker) {
        this.docker = docker;
    }

    @JsonIgnore
    public VM getVm() {
        return vm;
    }

    @JsonIgnore
    public void setVm(VM vm) {
        this.vm = vm;
    }

    @JsonIgnore
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    @JsonIgnore
    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    public void addEnvVars(String key, String value) {
        if(null==this.envVars){
            this.envVars = new HashMap<String, String>();
        }
        this.envVars.put(key, value);
    }

    @JsonIgnore
    public String getCommandLine() {
        return commandLine;
    }
    @JsonIgnore
    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }


    @JsonIgnore
    public boolean isDaemonize() {
        return daemonize;
    }

    @JsonIgnore
    public void setDaemonize(boolean daemonize) {
        this.daemonize = daemonize;
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

    @JsonProperty("InputParameters")
    private Map<String, InputParameterValue> inputParameters;

    @JsonProperty("OutputParameters")
    private Map<String, OutputParameterValue> outputParameters;


    @JsonProperty("Docker")
    private Docker docker;

    @JsonProperty("VM")
    private VM vm;


    @JsonProperty("EnvVars")
    private Map<String,String> envVars;



    @JsonProperty("CommandLine")
    private String commandLine;

    @JsonProperty("Daemonize")
    private boolean daemonize;

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
        public void setDataDiskMountPoint(ConfigValue dataDiskMountPoint) { this.dataDiskMountPoint = dataDiskMountPoint; }

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
        private boolean overwritable = true;
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
        private boolean overwritable = true;

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
        private boolean overwritable = true;

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
        private boolean defaultValue = true;

        @JsonProperty("Overwritable")
        private boolean overwritable;

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
    public static class Docker{
        @JsonProperty("Image")
        private String image;

        @JsonProperty("RunMode")
        private String runMode;

        @JsonProperty("RegistryOSSPath")
        private String registryOSSPath;

        @JsonIgnore
        public String getImage() {
            return image;
        }

        @JsonIgnore
        public void setImage(String image) {
            this.image = image;
        }

        @JsonIgnore
        public String getRegistryOSSPath() {
            return registryOSSPath;
        }
        @JsonIgnore
        public void setRegistryOSSPath(String registryOSSPath) {
            this.registryOSSPath = registryOSSPath;
        }

        @JsonIgnore
        public String getRunMode() {
            return runMode;
        }

        @JsonIgnore
        public void setRunMode(String runMode) {
            this.runMode = runMode;
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class VM{
        public VM(){}
        public VM(String ecsImageId){
            this.setECSImageId(ecsImageId);
        }
        @JsonIgnore
        public String getECSImageId() {
            return ECSImageId;
        }
        @JsonIgnore
        public void setECSImageId(String ECSImageId) {
            this.ECSImageId = ECSImageId;
        }

        @JsonProperty("ECSImageId")
        private String ECSImageId;
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
        @JsonIgnore
        public String getLocalPath() {
            return localPath;
        }
        @JsonIgnore
        public void setLocalPath(String localPath) {
            this.localPath = localPath;
        }

        @JsonProperty("LocalPath")
        private String localPath;
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

        @JsonIgnore
        public String getLocalPath() {
            return localPath;
        }

        @JsonIgnore
        public void setLocalPath(String localPath) {
            this.localPath = localPath;
        }

        @JsonProperty("LocalPath")
        private String localPath;
    }

}


