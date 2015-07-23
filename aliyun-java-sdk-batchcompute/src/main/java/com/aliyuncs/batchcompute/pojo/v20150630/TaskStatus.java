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
package com.aliyuncs.batchcompute.pojo.v20150630;

import com.aliyuncs.batchcompute.main.v20150630.StatusUtil;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by guangchun.luo on 15/4/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskStatus {


    @JsonProperty("TaskName")
    private String taskName;

    @JsonProperty("EndTime")
    private long endTime;

    @JsonProperty("State")
    private int state;


    @JsonProperty("StartTime")
    private long startTime;

    @JsonProperty("InstanceStatusVector")
    private List<InstanceStatus> instanceStatusList;



    @JsonIgnore
    public String getTaskName() {
        return taskName;
    }

    @JsonIgnore
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @JsonIgnore
    public long getEndTime() {
        return endTime;
    }

    @JsonIgnore
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    @JsonIgnore
    public String getState() {
        return StatusUtil.getState(state);
    }

    @JsonIgnore
    public void setState(int state) {
        this.state = state;
    }

    @JsonIgnore
    public long getStartTime() {
        return startTime;
    }

    @JsonIgnore
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @JsonIgnore
    public List<InstanceStatus> getInstanceStatusList() {
        return instanceStatusList;
    }

    @JsonIgnore
    public void setInstanceStatusList(List<InstanceStatus> instanceStatusList) {
        this.instanceStatusList = instanceStatusList;
    }

}
