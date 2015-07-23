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

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/4/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobStatus {


    @JsonProperty("CreateTime")
    private long creationTime;


    @JsonProperty("ResourceId")
    private String jobId;


    @JsonProperty("Name")
    private String jobName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("EndTime")
    private long endTime;


    @JsonProperty("NumFailedInstance")
    private long numFailedInstance;

    @JsonProperty("NumFailedTask")
    private long numFailedTask;

    @JsonProperty("NumFinishedInstance")
    private long numFinishedInstance;

    @JsonProperty("NumFinishedTask")
    private long numFinishedTask;

    @JsonProperty("NumRunningInstance")
    private long numRunningInstance;

    @JsonProperty("NumRunningTask")
    private long numRunningTask;

    @JsonProperty("NumStoppedInstance")
    private long numStoppedInstance;

    @JsonProperty("NumStoppedTask")
    private long numStoppedTask;

    @JsonProperty("NumTotalInstance")
    private long numTotalInstance;

    @JsonProperty("NumTotalTask")
    private long numTotalTask;

    @JsonProperty("NumWaitingInstance")
    private long numWaitingInstance;

    @JsonProperty("NumWaitingTask")
    private long numWaitingTask;

    @JsonProperty("OwnerId")
    private long ownerId;

    @JsonProperty("Priority")
    private int priority;


    @JsonProperty("StartTime")
    private long startTime;



    @JsonProperty("TotalTime")
    private long finishedInstanceTotalTime;


    @JsonProperty("State")
    private String state;

    @JsonIgnore
    public String getState() {
        if (state!=null && state.equals("Terminated")) {
            return "Finished";
        } else return state;
    }

    @JsonIgnore
    public void setState(String state) {
        this.state = state;
    }

    @JsonIgnore
    public long getCreationTime() {
        return creationTime;
    }

    @JsonIgnore
    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    @JsonIgnore
    public String getJobId() {
        return jobId;
    }

    @JsonIgnore
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @JsonIgnore
    public String getJobName() {
        return jobName;
    }

    @JsonIgnore
    public void setJobName(String jobName) {
        this.jobName = jobName;
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
    public long getEndTime() {
        return endTime;
    }

    @JsonIgnore
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @JsonIgnore
    public long getNumFailedInstance() {
        return numFailedInstance;
    }

    @JsonIgnore
    public void setNumFailedInstance(long numFailedInstance) {
        this.numFailedInstance = numFailedInstance;
    }

    @JsonIgnore
    public long getNumFailedTask() {
        return numFailedTask;
    }

    @JsonIgnore
    public void setNumFailedTask(long numFailedTask) {
        this.numFailedTask = numFailedTask;
    }

    @JsonIgnore
    public long getNumFinishedInstance() {
        return numFinishedInstance;
    }

    @JsonIgnore
    public void setNumFinishedInstance(long numFinishedInstance) {
        this.numFinishedInstance = numFinishedInstance;
    }

    @JsonIgnore
    public long getNumFinishedTask() {
        return numFinishedTask;
    }

    @JsonIgnore
    public void setNumFinishedTask(long numFinishedTask) {
        this.numFinishedTask = numFinishedTask;
    }

    @JsonIgnore
    public long getNumRunningInstance() {
        return numRunningInstance;
    }

    @JsonIgnore
    public void setNumRunningInstance(long numRunningInstance) {
        this.numRunningInstance = numRunningInstance;
    }

    @JsonIgnore
    public long getNumRunningTask() {
        return numRunningTask;
    }

    @JsonIgnore
    public void setNumRunningTask(long numRunningTask) {
        this.numRunningTask = numRunningTask;
    }

    @JsonIgnore
    public long getNumStoppedInstance() {
        return numStoppedInstance;
    }

    @JsonIgnore
    public void setNumStoppedInstance(long numStoppedInstance) {
        this.numStoppedInstance = numStoppedInstance;
    }

    @JsonIgnore
    public long getNumStoppedTask() {
        return numStoppedTask;
    }

    @JsonIgnore
    public void setNumStoppedTask(long numStoppedTask) {
        this.numStoppedTask = numStoppedTask;
    }

    @JsonIgnore
    public long getNumTotalInstance() {
        return numTotalInstance;
    }

    @JsonIgnore
    public void setNumTotalInstance(long numTotalInstance) {
        this.numTotalInstance = numTotalInstance;
    }

    @JsonIgnore
    public long getNumTotalTask() {
        return numTotalTask;
    }

    @JsonIgnore
    public void setNumTotalTask(long numTotalTask) {
        this.numTotalTask = numTotalTask;
    }

    @JsonIgnore
    public long getNumWaitingInstance() {
        return numWaitingInstance;
    }

    @JsonIgnore
    public void setNumWaitingInstance(long numWaitingInstance) {
        this.numWaitingInstance = numWaitingInstance;
    }

    @JsonIgnore
    public long getNumWaitingTask() {
        return numWaitingTask;
    }

    @JsonIgnore
    public void setNumWaitingTask(long numWaitingTask) {
        this.numWaitingTask = numWaitingTask;
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
    public int getPriority() {
        return priority;
    }

    @JsonIgnore
    public void setPriority(int priority) {
        this.priority = priority;
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
    public long getFinishedInstanceTotalTime() {
        return finishedInstanceTotalTime;
    }
    @JsonIgnore
    public void setFinishedInstanceTotalTime(long finishedInstanceTotalTime) {
        this.finishedInstanceTotalTime = finishedInstanceTotalTime;
    }
}
