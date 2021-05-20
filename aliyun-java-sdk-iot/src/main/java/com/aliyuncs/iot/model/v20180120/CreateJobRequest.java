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
public class CreateJobRequest extends RpcAcsRequest<CreateJobResponse> {
	   

	private String jobDocument;

	private String description;

	private String type;

	private String rolloutConfig;

	private String iotInstanceId;

	private String jobName;

	private String timeoutConfig;

	private String targetConfig;

	private String jobFile;

	private Long scheduledTime;
	public CreateJobRequest() {
		super("Iot", "2018-01-20", "CreateJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobDocument() {
		return this.jobDocument;
	}

	public void setJobDocument(String jobDocument) {
		this.jobDocument = jobDocument;
		if(jobDocument != null){
			putQueryParameter("JobDocument", jobDocument);
		}
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
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

	public String getTargetConfig() {
		return this.targetConfig;
	}

	public void setTargetConfig(String targetConfig) {
		this.targetConfig = targetConfig;
		if(targetConfig != null){
			putQueryParameter("TargetConfig", targetConfig);
		}
	}

	public String getJobFile() {
		return this.jobFile;
	}

	public void setJobFile(String jobFile) {
		this.jobFile = jobFile;
		if(jobFile != null){
			putQueryParameter("JobFile", jobFile);
		}
	}

	public Long getScheduledTime() {
		return this.scheduledTime;
	}

	public void setScheduledTime(Long scheduledTime) {
		this.scheduledTime = scheduledTime;
		if(scheduledTime != null){
			putQueryParameter("ScheduledTime", scheduledTime.toString());
		}
	}

	@Override
	public Class<CreateJobResponse> getResponseClass() {
		return CreateJobResponse.class;
	}

}
