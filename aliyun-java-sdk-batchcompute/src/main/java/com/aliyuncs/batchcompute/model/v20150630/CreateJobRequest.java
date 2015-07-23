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
package com.aliyuncs.batchcompute.model.v20150630;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.batchcompute.transform.v20150630.CreateJobRequestMarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class CreateJobRequest extends RoaAcsRequest<CreateJobResponse> {

    public CreateJobRequest() {
        super("BatchCompute", "2015-06-30", "PostJob");
        setUriPattern("/jobs");
        setMethod(MethodType.POST);
    }

    public CreateJobRequest(Job job) throws ClientException {
        super("BatchCompute", "2015-06-30", "PostJob");
        setUriPattern("/jobs");
        setMethod(MethodType.POST);
        setJob(job);
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) throws ClientException {
        this.job = job;
        CreateJobRequestMarshaller.marshall(this, job);
    }

    private Job job;


    @Override
    public Class<CreateJobResponse> getResponseClass() {
        return CreateJobResponse.class;
    }

}
