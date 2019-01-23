package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/12/5.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Command {

    @JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class Docker {

        @JsonProperty("Image")
        private String image;

        @JsonProperty("RunMode")
        private String runMode;

        @JsonIgnore
        public void setImage(String image) {
            this.image = image;
        }

        @JsonIgnore
        public String getImage() {
            return image;
        }


        @JsonIgnore
        public void setRunMode(String runMode) {
            this.runMode = runMode;
        }

        @JsonIgnore
        public String getRunMode() {
            return runMode;
        }

    }

    @JsonProperty("CommandLine")
    private String commandLine;


    @JsonProperty("PackagePath")
    private String packagePath;

    @JsonProperty("EnvVars")
    private Map<String,String> envVars;

    @JsonProperty("Docker")
    private Docker docker;

    @JsonIgnore
    public String getCommandLine() {
        return commandLine;
    }

    @JsonIgnore
    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    @JsonIgnore
    public String getPackagePath() {
        return packagePath;
    }

    @JsonIgnore
    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    @JsonIgnore
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    @JsonIgnore
    public void addEnvVars(String key,String value) {
        if (null == envVars) {
            envVars = new HashMap();
        }
        this.envVars.put(key,value);
    }
    @JsonIgnore
    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }


    @JsonIgnore
    public Command.Docker getDocker() {
        return docker;
    }

    @JsonIgnore
    public void setDocker(Command.Docker docker) {
        this.docker = docker;
    }

}
