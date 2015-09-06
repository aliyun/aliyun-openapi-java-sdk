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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/4/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDag {

    @JsonProperty("TaskDescMap")
    private Map<String, TaskDescription> taskDescMap;

    @JsonProperty("Dependencies")
    private Map<String, List<String>> dependencies;

    @JsonIgnore
    public Map<String, TaskDescription> getTaskDescMap() {
        return taskDescMap;
    }

    @JsonIgnore
    public void setTaskDescMap(Map<String, TaskDescription> taskDescMap) {
        this.taskDescMap = taskDescMap;
    }

    public void addTask(String taskName, TaskDescription taskDescription) {
        if (null == taskDescMap) {
            taskDescMap = new HashMap();
        }
        taskDescMap.put(taskName, taskDescription);
    }

    public void addTask(TaskDescription taskDescription) {
        addTask(taskDescription.getTaskName(), taskDescription);
    }


    @JsonIgnore
    public Map<String, List<String>> getDependencies() {
        return dependencies;
    }

    @JsonIgnore
    public void setDependencies(Map<String, List<String>> dependencies) {
        this.dependencies = dependencies;
    }

    public void addDependencies(String taskNameSrc, List<String> taskNameTargets) {
        if (null == dependencies) {
            dependencies = new HashMap();
        }
        dependencies.put(taskNameSrc, taskNameTargets);
    }
}
