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
public class CancelOTATaskByJobRequest extends RpcAcsRequest<CancelOTATaskByJobResponse> {
	   

	private Boolean cancelScheduledTask;

	private String jobId;

	private String iotInstanceId;

	private Boolean cancelQueuedTask;

	private Boolean cancelInProgressTask;

	private Boolean cancelNotifiedTask;
	public CancelOTATaskByJobRequest() {
		super("Iot", "2018-01-20", "CancelOTATaskByJob", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getCancelScheduledTask() {
		return this.cancelScheduledTask;
	}

	public void setCancelScheduledTask(Boolean cancelScheduledTask) {
		this.cancelScheduledTask = cancelScheduledTask;
		if(cancelScheduledTask != null){
			putQueryParameter("CancelScheduledTask", cancelScheduledTask.toString());
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

	public Boolean getCancelQueuedTask() {
		return this.cancelQueuedTask;
	}

	public void setCancelQueuedTask(Boolean cancelQueuedTask) {
		this.cancelQueuedTask = cancelQueuedTask;
		if(cancelQueuedTask != null){
			putQueryParameter("CancelQueuedTask", cancelQueuedTask.toString());
		}
	}

	public Boolean getCancelInProgressTask() {
		return this.cancelInProgressTask;
	}

	public void setCancelInProgressTask(Boolean cancelInProgressTask) {
		this.cancelInProgressTask = cancelInProgressTask;
		if(cancelInProgressTask != null){
			putQueryParameter("CancelInProgressTask", cancelInProgressTask.toString());
		}
	}

	public Boolean getCancelNotifiedTask() {
		return this.cancelNotifiedTask;
	}

	public void setCancelNotifiedTask(Boolean cancelNotifiedTask) {
		this.cancelNotifiedTask = cancelNotifiedTask;
		if(cancelNotifiedTask != null){
			putQueryParameter("CancelNotifiedTask", cancelNotifiedTask.toString());
		}
	}

	@Override
	public Class<CancelOTATaskByJobResponse> getResponseClass() {
		return CancelOTATaskByJobResponse.class;
	}

}
