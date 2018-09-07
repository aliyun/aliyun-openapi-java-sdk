package com.aliyuncs.batchcompute.pojo.v20151111;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 17/10/13.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppJobDescription {
    @JsonIgnore
    public String getAppName() {
        return appName;
    }
    @JsonIgnore
    public void setAppName(String appName) {
        this.appName = appName;
    }
    @JsonIgnore
    public Logging getLogging() {
        return logging;
    }
    @JsonIgnore
    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    @JsonIgnore
    public Map<String, Object> getInputs() {
        return inputs;
    }

    @JsonIgnore
    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }


    @JsonIgnore
    public Map<String, Object> getOutputs() {
        return outputs;
    }

    @JsonIgnore
    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }


    public void addOutputs(String key ,Object value) {
        if(null==this.outputs) this.outputs = new HashMap<String, Object>();
        this.outputs.put(key,value);
    }

    public void addInputs(String key ,Object value) {
        if(null==this.inputs) this.inputs = new HashMap<String, Object>();
        this.inputs.put(key,value);
    }

    public void addConfig(String key ,Object value) {
        if(null==this.config) this.config = new HashMap<String, Object>();
        this.config.put(key,value);
    }

    @JsonIgnore
    public Map<String, Object> getConfig() {
        return config;
    }

    @JsonIgnore
    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }


    @JsonProperty("AppName")
    private String appName;

    @JsonProperty("Logging")
    private Logging logging;

    @JsonProperty("Inputs")
    private Map<String, Object> inputs;

    @JsonProperty("Outputs")
    private Map<String, Object> outputs;

    @JsonProperty("Config")
    private Map<String,Object> config;


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Logging {

        @JsonProperty("StdoutPath")
        private String stdoutPath;

        @JsonProperty("StderrPath")
        private String stderrPath;

        public String getStdoutPath() {
            return stdoutPath;
        }

        public void setStdoutPath(String stdoutPath) {
            this.stdoutPath = stdoutPath;
        }

        public String getStderrPath() {
            return stderrPath;
        }

        public void setStderrPath(String stderrPath) {
            this.stderrPath = stderrPath;
        }
    }
}


