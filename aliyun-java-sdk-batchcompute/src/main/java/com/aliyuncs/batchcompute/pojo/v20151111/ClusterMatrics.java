package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClusterMatrics {

    @JsonProperty("StartingCount")
    private long startingCount;

    @JsonProperty("RunningCount")
    private long runningCount;

    @JsonProperty("StoppingCount")
    private long stoppingCount;


    @JsonProperty("StoppedCount")
    private long stoppedCount;



    @JsonIgnore
    public long getStartingCount() {
        return startingCount;
    }

    @JsonIgnore
    public void setStartingCount(long startingCount) {
        this.startingCount = startingCount;
    }

    @JsonIgnore
    public long getRunningCount() {
        return runningCount;
    }

    @JsonIgnore
    public void setRunningCount(long runningCount) {
        this.runningCount = runningCount;
    }

    @JsonIgnore
    public long getStoppingCount() {
        return stoppingCount;
    }

    @JsonIgnore
    public void setStoppingCount(long stoppingCount) {
        this.stoppingCount = stoppingCount;
    }
    @JsonIgnore
    public long getStoppedCount() {
        return stoppedCount;
    }
    @JsonIgnore
    public void setStoppedCount(long stoppedCount) {
        this.stoppedCount = stoppedCount;
    }
}
