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


/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobDescription {

    @JsonProperty("Name")
    private String name;


    @JsonProperty("Priority")
    private int priority;

    @JsonProperty("Description")
    private String description;


    @JsonProperty("App")
    private AppJobDescription app;

    @JsonProperty("DAG")
    private DAG dag;

    @JsonProperty("JobFailOnInstanceFail")
    private boolean jobFailOnInstanceFail=true;

    @JsonProperty("AutoRelease")
    private boolean autoRelease;


    @JsonProperty("Type")
    private String type;

    @JsonProperty("Notification")
    private Notification notification;


    @JsonIgnore
    public boolean isAutoRelease() {
        return autoRelease;
    }

    @JsonIgnore
    public void setAutoRelease(boolean autoRelease) {
        this.autoRelease = autoRelease;
    }


    @JsonIgnore
    public Notification getNotification() {
        return notification;
    }
    @JsonIgnore
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @JsonIgnore
    public AppJobDescription getApp() {
        return app;
    }
    @JsonIgnore
    public void setApp(AppJobDescription app) {
        this.app = app;
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
    public int getPriority() {
        return priority;
    }

    @JsonIgnore
    public void setPriority(int priority) {
        this.priority = priority;
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
    public DAG getDag() {
        return dag;
    }
    @JsonIgnore
    public void setDag(DAG dag) {
        this.dag = dag;
    }
    @JsonIgnore
    public boolean isJobFailOnInstanceFail() {
        return jobFailOnInstanceFail;
    }
    @JsonIgnore
    public void setJobFailOnInstanceFail(boolean jobFailOnInstanceFail) {
        this.jobFailOnInstanceFail = jobFailOnInstanceFail;
    }
    @JsonIgnore
    public String getType() {
        return type;
    }
    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

}


