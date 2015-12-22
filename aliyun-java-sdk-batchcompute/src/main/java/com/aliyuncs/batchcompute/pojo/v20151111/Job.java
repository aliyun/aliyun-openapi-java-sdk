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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Job extends DateFormatFieldPojo{

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OwnerId")
    private long ownerId;


    @JsonProperty("CreationTime")
    private Date creationTime;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("StartTime")
    private Date startTime;

    @JsonProperty("EndTime")
    private Date endTime;

    @JsonProperty("TaskMetrics")
    private Matrics taskMetrics;

    @JsonProperty("InstanceMetrics")
    private Matrics instanceMetrics;




    @JsonIgnore
    public String getId() {
        return id;
    }

    @JsonIgnore
    public void setId(String id) {
        this.id = id;
    }

    @JsonIgnore
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }
    @JsonIgnore
    public long getOwnerId() {
        return ownerId;
    }
    @JsonIgnore
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
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
    public void setCreationTime(String creationTime) {
        this.creationTime = parseDate(creationTime);
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
    public String getMessage() {
        return message;
    }

    @JsonIgnore
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonIgnore
    public Date getStartTime() {
        return startTime;
    }

    @JsonIgnore
    public void setStartTime(String startTime) {
        this.startTime = parseDate(startTime);
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
    public void setEndTime(String endTime) {
        this.endTime = parseDate(endTime);
    }

    @JsonIgnore
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @JsonIgnore
    public Matrics getTaskMetrics() {
        return taskMetrics;
    }

    @JsonIgnore
    public void setTaskMetrics(Matrics taskMetrics) {
        this.taskMetrics = taskMetrics;
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


