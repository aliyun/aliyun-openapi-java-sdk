/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/12/05.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DAG {

    @JsonProperty("Tasks")
    private Map<String, TaskDescription> tasks;

    @JsonProperty("Dependencies")
    private Map<String, List<String>> dependencies;



    @JsonIgnore
    public Map<String, TaskDescription> getTasks() {
        return tasks;
    }

    @JsonIgnore
    public void setTasks(Map<String, TaskDescription> tasks) {
        this.tasks = tasks;
    }

    @JsonIgnore
    public void addTask(String taskName, TaskDescription taskDescription) {
        if (null == tasks) {
            tasks = new HashMap();
        }
        tasks.put(taskName, taskDescription);
    }

    @JsonIgnore
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

    @JsonIgnore
    public void addDependencies(String taskNameSrc, List<String> taskNameTargets) {
        if (null == dependencies) {
            dependencies = new HashMap();
        }
        dependencies.put(taskNameSrc, taskNameTargets);
    }
}
