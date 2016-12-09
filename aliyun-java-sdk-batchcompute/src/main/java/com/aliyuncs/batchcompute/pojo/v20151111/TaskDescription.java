/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/4/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDescription {

    @JsonProperty("TaskName")
    private String taskName;

    @JsonProperty("ClusterId")
    private String clusterId;

    @JsonProperty("AutoCluster")
    private AutoCluster autoCluster;

    @JsonProperty("InputMapping")
    private Map<String, String> inputMapping;

    @JsonProperty("OutputMapping")
    private Map<String, String> outputMapping;

    @JsonProperty("LogMapping")
    private Map<String, String> logMapping;


    @JsonProperty("Timeout")
    private long timeout;

    @JsonProperty("InstanceCount")
    private int instanceCount;

    @JsonProperty("MaxRetryCount")
    private int maxRetryCount;

    @JsonProperty("Parameters")
    private Parameters parameters;


    @JsonProperty("WriteSupport")
    private boolean writeSupport;


    @JsonIgnore
    public boolean isWriteSupport() {
        return writeSupport;
    }

    @JsonIgnore
    public void setWriteSupport(boolean writeSupport) {
        this.writeSupport = writeSupport;
    }


    @JsonIgnore
    public AutoCluster getAutoCluster() {
        return autoCluster;
    }
    @JsonIgnore
    public void setAutoCluster(AutoCluster autoCluster) {
        this.autoCluster = autoCluster;
    }


    @JsonIgnore
    public String getTaskName() {
        return taskName;
    }

    @JsonIgnore
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    @JsonIgnore
    public String getClusterId() {
        return clusterId;
    }

    @JsonIgnore
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @JsonIgnore
    public Map<String, String> getInputMapping() {
        return inputMapping;
    }

    @JsonIgnore
    public void setInputMapping(Map<String, String> inputMapping) {
        this.inputMapping = inputMapping;
    }


    public void addInputMapping(String ossPath, String path) {
        if (null == inputMapping) {
            inputMapping = new HashMap();
        }
        inputMapping.put(ossPath, path);
    }

    @JsonIgnore
    public Map<String, String> getOutputMapping() {
        return outputMapping;
    }

    public void addOutputMapping(String path, String ossPath) {
        if (null == outputMapping) {
            outputMapping = new HashMap();
        }
        this.outputMapping.put(path, ossPath);
    }

    @Deprecated
    public void addOutputtMapping(String path, String ossPath) {
        addInputMapping(path,ossPath);
    }

    @JsonIgnore
    public void setOutputMapping(Map<String, String> outputMapping) {
        this.outputMapping = outputMapping;
    }

    @JsonIgnore
    public Map<String, String> getLogMapping() {
        return logMapping;
    }


    public void addLogMapping(String path, String ossPath) {
        if (null == logMapping) {
            logMapping = new HashMap();
        }
        this.logMapping.put(path,ossPath);
    }

    @JsonIgnore
    public void setLogMapping(Map<String, String> logMapping) {
        this.logMapping = logMapping;
    }
    @JsonIgnore
    public long getTimeout() {
        return this.timeout;
    }
    @JsonIgnore
    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }
    @JsonIgnore
    public int getInstanceCount() {
        return this.instanceCount;
    }
    @JsonIgnore
    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }
    @JsonIgnore
    public int getMaxRetryCount() {
        return maxRetryCount;
    }
    @JsonIgnore
    public void setMaxRetryCount(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }
    @JsonIgnore
    public Parameters getParameters() {
        return parameters;
    }
    @JsonIgnore
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

}
