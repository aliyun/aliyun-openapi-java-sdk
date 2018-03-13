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
import com.aliyuncs.batchcompute.transform.v20151111.StopJobRequestMarshaller;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopJobRequest extends BatchComputeRequest<StopJobResponse> {
	
	public StopJobRequest() {
		super("BatchCompute", "2015-11-11", "StopJob");
		setUriPattern("/jobs/[ResourceName]/stop");
		setMethod(MethodType.POST);
	}


	private String resourceName;

	public String getJobId() {
		return this.resourceName;
	}

	public void setJobId(String jobId) {
		this.resourceName = jobId;
		putPathParameter("ResourceName", resourceName);

		StopJobRequestMarshaller.marshall(this);
	}


	@Override
	public Class<StopJobResponse> getResponseClass() {
		return StopJobResponse.class;
	}

}
