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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class GetJobDescriptionRequest extends BatchComputeRequest<GetJobDescriptionResponse> {

    public GetJobDescriptionRequest() {
        super("BatchCompute", "2015-11-11", "GetJobDescription");
        setUriPattern("/jobs/[ResourceName]?description");
        setMethod(MethodType.GET);
    }

    private String resourceName;

    public String getJobId() {
        return this.resourceName;
    }

    public void setJobId(String jobId) {
        this.resourceName = jobId;
        putPathParameter("ResourceName", resourceName);
    }

    @Override
    public Class<GetJobDescriptionResponse> getResponseClass() {
        return GetJobDescriptionResponse.class;
    }

}
