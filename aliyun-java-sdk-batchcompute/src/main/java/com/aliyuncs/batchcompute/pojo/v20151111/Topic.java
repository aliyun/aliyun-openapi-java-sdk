package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangchun.luo on 16/12/1.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Topic {

    //cluster相关事件
    public final static String ON_CLUSTER_DELETED = "OnClusterDeleted";
    public final static String ON_CLUSTER_INSTANCE_CREATED = "OnInstanceCreated";
    public final static String ON_CLUSTER_INSTANCE_ACTIVE = "OnInstanceActive";

    //job相关事件
    public final static String ON_JOB_WAITING = "OnJobWaiting";
    public final static String ON_JOB_RUNNING = "OnJobRunning";
    public final static String ON_JOB_STOPPED = "OnJobStopped";
    public final static String ON_JOB_FINISHED = "OnJobFinished";
    public final static String ON_JOB_FAILED = "OnJobFailed";

    public final static String ON_TASK_WAITING = "OnTaskWaiting";
    public final static String ON_TASK_RUNNING = "OnTaskRunning";
    public final static String ON_TASK_STOPPED = "OnTaskStopped";
    public final static String ON_TASK_FINISHED = "OnTaskFinished";
    public final static String ON_TASK_FAILED = "OnTaskFailed";

    public final static String ON_INSTANCE_WAITING = "OnInstanceWaiting";
    public final static String ON_INSTANCE_RUNNING = "OnInstanceRunning";
    public final static String ON_INSTANCE_STOPPED = "OnInstanceStopped";
    public final static String ON_INSTANCE_FINISHED = "OnInstanceFinished";
    public final static String ON_INSTANCE_FAILED = "OnInstanceFailed";

    public final static String ON_PRIORITY_CHANGE = "OnPriorityChange";


    @JsonProperty("Name")
    private String name;

    @JsonProperty("Endpoint")
    private String endpoint;

    @JsonProperty("Events")
    private List<String> events;


    @JsonIgnore
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getEndpoint() {
        return endpoint;
    }

    @JsonIgnore
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonIgnore
    public List<String> getEvents() {
        return events;
    }

    @JsonIgnore
    public void setEvents(List<String> events) {
        this.events = events;
    }

    public void addEvent(String event) {
        if(this.events==null){
            this.events = new ArrayList<String>();
        }
        this.events.add(event);
    }



}
