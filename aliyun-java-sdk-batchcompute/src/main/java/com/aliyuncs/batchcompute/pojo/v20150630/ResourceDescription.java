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
 * Created by guangchun.luo on 15/4/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceDescription {
    @JsonProperty("Cpu")
    private int Cpu;

    @JsonProperty("Memory")
    private int Memory;

    @JsonIgnore
    public int getCpu() {
        return Cpu;
    }

    @JsonIgnore
    public void setCpu(int cpu) {
        Cpu = cpu;
    }

    @JsonIgnore
    public int getMemory() {
        return Memory;
    }

    @JsonIgnore
    public void setMemory(int memory) {
        Memory = memory;
    }
}
