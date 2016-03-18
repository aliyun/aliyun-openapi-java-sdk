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
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.util.Date;


/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Task{


    @JsonProperty("TaskName")
    private String taskName;


    @JsonProperty("State")
    private String state;


    @JsonProperty("StartTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date startTime;

    @JsonProperty("EndTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date endTime;


    @JsonProperty("InstanceMetrics")
    private Matrics instanceMetrics;




    @JsonIgnore
    public String getTaskName() {
        return taskName;
    }
    @JsonIgnore
    public void setTaskName(String taskName) {
        this.taskName = taskName;
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

    @JsonIgnore
    public Matrics getInstanceMetrics() {
        return instanceMetrics;
    }

    @JsonIgnore
    public void setInstanceMetrics(Matrics instanceMetrics) {
        this.instanceMetrics = instanceMetrics;
    }

}


