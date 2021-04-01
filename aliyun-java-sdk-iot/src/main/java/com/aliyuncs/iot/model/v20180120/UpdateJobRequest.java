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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateJobRequest extends RpcAcsRequest<UpdateJobResponse> {
	   

	private String description;

	private String rolloutConfig;

	private String jobId;

	private String iotInstanceId;

	private String timeoutConfig;
	public UpdateJobRequest() {
		super("Iot", "2018-01-20", "UpdateJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getRolloutConfig() {
		return this.rolloutConfig;
	}

	public void setRolloutConfig(String rolloutConfig) {
		this.rolloutConfig = rolloutConfig;
		if(rolloutConfig != null){
			putQueryParameter("RolloutConfig", rolloutConfig);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getTimeoutConfig() {
		return this.timeoutConfig;
	}

	public void setTimeoutConfig(String timeoutConfig) {
		this.timeoutConfig = timeoutConfig;
		if(timeoutConfig != null){
			putQueryParameter("TimeoutConfig", timeoutConfig);
		}
	}

	@Override
	public Class<UpdateJobResponse> getResponseClass() {
		return UpdateJobResponse.class;
	}

}
