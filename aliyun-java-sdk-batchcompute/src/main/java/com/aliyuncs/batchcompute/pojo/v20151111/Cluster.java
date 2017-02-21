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
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cluster {

    @JsonProperty("Id")
    private String id;


    @JsonProperty("Name")
    private String name;

    @JsonProperty("OwnerId")
    private long ownerId;

    @JsonProperty("InstanceType")
    private String instanceType;


    @JsonProperty("Configs")
    private Configs configs;

    @JsonIgnore
    public Notification getNotification() {
        return notification;
    }
    @JsonIgnore
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @JsonProperty("Notification")
    private Notification notification;


    @JsonProperty("CreationTime")
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date creationTime;

    @JsonProperty("State")
    private String state;

    @JsonIgnore
    public String getInstanceType() {
        return instanceType;
    }

    @JsonIgnore
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonIgnore
    public Configs getConfigs() {
        return configs;
    }

    @JsonIgnore
    public void setConfigs(Configs configs) {
        this.configs = configs;
    }

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ImageId")
    private String imageId;

    @JsonProperty("OperationLogs")
    private List<String> operationLogs;

    @JsonProperty("Metrics")
    private ClusterMatrics metrics;


    @JsonProperty("Metric")
    private ClusterMatrics metric;

    @JsonProperty("Groups")
    private Map<String, Group> groups;


    @JsonProperty("UserData")
    private Map<String, String> userData;


    @JsonProperty("Bootstrap")
    private String bootstrap;


    @JsonProperty("EnvVars")
    private Map<String, String> envVars;

    @JsonIgnore
    public String getBootstrap() {
        return bootstrap;
    }

    @JsonIgnore
    public void setBootstrap(String bootstrap) {
        this.bootstrap = bootstrap;
    }

    @JsonIgnore
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    @JsonIgnore
    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    public void addEnvVar(String key, String value) {
        if(this.envVars==null){
            this.envVars = new HashMap<String,String>();
        }
        this.envVars.put(key, value);
    }


    @JsonIgnore
    public Map<String, String> getUserData() {
        return userData;
    }

    @JsonIgnore
    public void setUserData(Map<String, String> userData) {
        this.userData = userData;
    }
    @JsonIgnore
    public void addUserData(String key, String value) {
        if(this.userData==null){
            this.userData = new HashMap<String,String>();
        }
        this.userData.put(key, value);
    }



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
    public String getState() {
        return state;
    }

    @JsonIgnore
    public void setState(String state) {
        this.state = state;
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
    public String getImageId() {
        return imageId;
    }

    @JsonIgnore
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonIgnore
    public List<String> getOperationLogs() {
        return operationLogs;
    }

    @JsonIgnore
    public void setOperationLogs(List<String> operationLogs) {
        this.operationLogs = operationLogs;
    }

    @JsonIgnore
    public ClusterMatrics getMetrics() {
        return metrics==null ? metric :metrics;
    }

    @JsonIgnore
    public void setMetrics(ClusterMatrics metrics) {
        this.metrics = metrics;
    }


    @JsonIgnore
    public Map<String, Group> getGroups() {
        return groups;
    }

    @JsonIgnore
    public void setGroups(Map<String, Group> groups) {
        this.groups = groups;
    }

}


