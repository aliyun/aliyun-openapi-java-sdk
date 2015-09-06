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
 * Created by guangchun.luo on 15/4/10.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobDescription {

    @JsonProperty("JobName")
    private String jobName;

//    @JsonProperty("JobId")
//    private String jobId;

    @JsonProperty("JobTag")
    private String jobTag = "BatchCompute";

    @JsonProperty("Priority")
    private int priority;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("TaskDag")
    private TaskDag taskDag;

//    @JsonIgnore
//    public String getJobId() {
//        return jobId;
//    }
//
//    @JsonIgnore
//    public void setJobId(String jobId) {
//        this.jobId = jobId;
//    }

    @JsonIgnore
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
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
    public String getJobName() {
        return jobName;
    }

    @JsonIgnore
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @JsonIgnore
    public String getJobTag() {
        return jobTag;
    }

    @JsonIgnore
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    @JsonIgnore
    public TaskDag getTaskDag() {
        return taskDag;
    }

    @JsonIgnore
    public void setTaskDag(TaskDag taskDag) {
        this.taskDag = taskDag;
    }



}


