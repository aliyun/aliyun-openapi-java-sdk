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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true) @JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ClusterDescription {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ImageId")
    private String imageId;

    @JsonProperty("InstanceType")
    private String instanceType;

    @JsonProperty("DependencyIsvService")
    private String dependencyIsvService;

    @JsonIgnore
    public String getScheduleType() {
        return scheduleType;
    }

    @JsonIgnore
    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    @JsonProperty("ScheduleType")
    private String scheduleType;

    @JsonProperty("Groups")
    private Map<String, GroupDescription> groups;

    @JsonProperty("UserData")
    private Map<String, String> userData;


    @JsonProperty("Bootstrap")
    private String bootstrap;

    @JsonIgnore
    public Boolean getPasswordInherit() {
        return passwordInherit;
    }

    @JsonIgnore
    public void setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
    }

    @JsonProperty("PasswordInherit")
    private Boolean passwordInherit;

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
    public Notification getNotification() {
        return notification;
    }
    @JsonIgnore
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @JsonProperty("Notification")
    private Notification notification;


    @JsonIgnore
    public Configs getConfigs() {
        return configs;
    }

    @JsonIgnore
    public void setConfigs(Configs configs) {
        this.configs = configs;
    }


    @JsonProperty("Configs")
    private Configs configs;

    @JsonIgnore
    public String getInstanceType() {
        return instanceType;
    }

    @JsonIgnore
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }



    @JsonIgnore
    public Map<String, String> getUserData() {
        return userData;
    }

    @JsonIgnore
    public void setUserData(Map<String, String> userData) {
        this.userData = userData;
    }

    public void addUserData(String key, String value) {
        if(this.userData==null){
            this.userData = new HashMap<String,String>();
        }
        this.userData.put(key, value);
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
    public Map<String, GroupDescription> getGroups() {
        return groups;
    }

    @JsonIgnore
    public void setGroups(Map<String, GroupDescription> groups) {
        this.groups = groups;
    }

    @JsonIgnore
    public void setDependencyIsvService(String dependencyIsvService) { this.dependencyIsvService = dependencyIsvService; }

    @JsonIgnore
    public String getDependencyIsvService() { return dependencyIsvService; }


    public void addGroup(String groupName, GroupDescription group) {
        if(null == this.groups){
            this.groups = new HashMap<String, GroupDescription>();
        }
        this.groups.put(groupName, group);
    }


    public void mountDataDisk(DataDisk dataDisk){
        Configs configs = getConfigs();
        if(configs==null){
            configs = new Configs();
            setConfigs(configs);
        }

        Disks disks = configs.getDisks();
        if(disks==null){
            disks = new Disks();
            configs.setDisks(disks);
        }
        disks.setDataDisk(dataDisk);
    }
    public void mountSystemDisk(SystemDisk systemDisk){

        Configs configs = getConfigs();
        if(configs==null){
            configs = new Configs();
            setConfigs(configs);
        }

        Disks disks = configs.getDisks();
        if(disks==null){
            disks = new Disks();
            configs.setDisks(disks);
        }
        disks.setSystemDisk(systemDisk);
    }
}


