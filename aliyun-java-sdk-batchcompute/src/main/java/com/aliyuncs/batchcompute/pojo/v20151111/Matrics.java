package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Matrics {

    @JsonProperty("WaitingCount")
    private long waitingCount;

    @JsonProperty("RunningCount")
    private long runningCount;

    @JsonProperty("FinishedCount")
    private long finishedCount;


    @JsonProperty("FailedCount")
    private long failedCount;

    @JsonProperty("StoppedCount")
    private long stoppedCount;




    @JsonIgnore
    public long getWaitingCount() {
        return waitingCount;
    }

    @JsonIgnore
    public void setWaitingCount(long waitingCount) {
        this.waitingCount = waitingCount;
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
    public long getFinishedCount() {
        return finishedCount;
    }

    @JsonIgnore
    public void setFinishedCount(long finishedCount) {
        this.finishedCount = finishedCount;
    }

    @JsonIgnore
    public long getFailedCount() {
        return failedCount;
    }

    @JsonIgnore
    public void setFailedCount(long failedCount) {
        this.failedCount = failedCount;
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
