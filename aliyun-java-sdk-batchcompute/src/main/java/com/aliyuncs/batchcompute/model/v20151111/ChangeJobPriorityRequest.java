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
package com.aliyuncs.batchcompute.model.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.batchcompute.transform.v20151111.ChangeJobPriorityRequestMarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class ChangeJobPriorityRequest extends BatchComputeRequest<ChangeJobPriorityResponse> {

    public ChangeJobPriorityRequest() {
        super("BatchCompute", "2015-11-11", "ChangeJobPriority");
        setUriPattern("/jobs/[ResourceName]");
        setMethod(MethodType.PUT);

    }

    private String resourceName;

    private int priority;

    public boolean _useInteger = true;

    public String getJobId() {
        return this.resourceName;
    }

    public void setJobId(String jobId) {
        this.resourceName = jobId;
        putPathParameter("ResourceName", resourceName);
    }

    public void setPriority(int priority) throws ClientException {
        this.priority = priority;
        ChangeJobPriorityRequestMarshaller.marshall(this);
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public Class<ChangeJobPriorityResponse> getResponseClass() {
        return ChangeJobPriorityResponse.class;
    }

}
