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

import com.aliyuncs.batchcompute.main.v20150630.StatusUtil;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/4/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instance {

    @JsonProperty("InstanceId")
    private int instanceId;

    @JsonProperty("StartTime")
    private long startTime;

    @JsonProperty("State")
    private int state;

    @JsonProperty("EndTime")
    private long endTime;

    @JsonIgnore
    public int getInstanceId() {
        return instanceId;
    }

    @JsonIgnore
    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
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
    public String getState() {
        return StatusUtil.getState(state);
    }

    @JsonIgnore
    public void setState(int state) {
        this.state = state;
    }

    @JsonIgnore
    public long getEndTime() {
        return this.endTime;
    }

    @JsonIgnore
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }



}
