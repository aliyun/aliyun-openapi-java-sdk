package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/12/5.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Command {

    @JsonProperty("CommandLine")
    private String commandLine;


    @JsonProperty("PackagePath")
    private String packagePath;

    @JsonProperty("EnvVars")
    private Map<String,String> envVars;




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




}
