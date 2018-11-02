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

import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;
import java.util.Map;


/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Instance{

    @JsonProperty("InstanceId")
    private int instanceId;


    @JsonProperty("State")
    private String state;


    @JsonProperty("StartTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date startTime;

    @JsonProperty("EndTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date endTime;


    @JsonProperty("RetryCount")
    private int retryCount;

    @JsonProperty("Progress")
    private int progress;

    @JsonProperty("StdoutRedirectPath")
    private String stdoutRedirectPath;

    @JsonProperty("StderrRedirectPath")
    private String stderrRedirectPath;

    @JsonProperty("Result")
    private InstanceResult result;

    @JsonProperty("Error")
    private InstanceError error;

    @JsonProperty("Outputs")
    private Map<String,  Object> outputs;

    @JsonIgnore
    public Map<String, Object> getOutputs() {
        return outputs;
    }
    @JsonIgnore
    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }

    @JsonIgnore
    public InstanceError getError() {
        return error;
    }
    @JsonIgnore
    public void setError(InstanceError error) {
        this.error = error;
    }

    @JsonIgnore
    public int getInstanceId() {
        return instanceId;
    }

    @JsonIgnore
    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    @JsonIgnore
    public int getRetryCount() {
        return retryCount;
    }

    @JsonIgnore
    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    @JsonIgnore
    public int getProgress() {
        return progress;
    }

    @JsonIgnore
    public void setProgress(int progress) {
        this.progress = progress;
    }

    @JsonIgnore
    public String getStdoutRedirectPath() {
        return stdoutRedirectPath;
    }

    @JsonIgnore
    public void setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
    }

    @JsonIgnore
    public String getStderrRedirectPath() {
        return stderrRedirectPath;
    }

    @JsonIgnore
    public void setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
    }

    @JsonIgnore
    public InstanceResult getResult() {
        return result;
    }

    @JsonIgnore
    public void setResult(InstanceResult result) {
        this.result = result;
    }

    @JsonIgnore
    public String getState() {
        return state;
    }

    @JsonIgnore
    public void setState(String state) {
        this.state = state;
    }

    @JsonIgnore
    public Date getStartTime() {
        return startTime;
    }


    @JsonIgnore
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonIgnore
    public Date getEndTime() {
        return endTime;
    }


    @JsonIgnore
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }



}


