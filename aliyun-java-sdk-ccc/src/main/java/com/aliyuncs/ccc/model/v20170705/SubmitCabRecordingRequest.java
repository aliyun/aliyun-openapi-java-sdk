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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitCabRecordingRequest extends RpcAcsRequest<SubmitCabRecordingResponse> {
	   

	private String mergedRecording;

	private String resourceRecording;

	private String earlyMediaRecording;

	private String instanceId;

	private Long instanceOwnerId;

	private String taskId;
	public SubmitCabRecordingRequest() {
		super("CCC", "2017-07-05", "SubmitCabRecording", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMergedRecording() {
		return this.mergedRecording;
	}

	public void setMergedRecording(String mergedRecording) {
		this.mergedRecording = mergedRecording;
		if(mergedRecording != null){
			putQueryParameter("MergedRecording", mergedRecording);
		}
	}

	public String getResourceRecording() {
		return this.resourceRecording;
	}

	public void setResourceRecording(String resourceRecording) {
		this.resourceRecording = resourceRecording;
		if(resourceRecording != null){
			putQueryParameter("ResourceRecording", resourceRecording);
		}
	}

	public String getEarlyMediaRecording() {
		return this.earlyMediaRecording;
	}

	public void setEarlyMediaRecording(String earlyMediaRecording) {
		this.earlyMediaRecording = earlyMediaRecording;
		if(earlyMediaRecording != null){
			putQueryParameter("EarlyMediaRecording", earlyMediaRecording);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getInstanceOwnerId() {
		return this.instanceOwnerId;
	}

	public void setInstanceOwnerId(Long instanceOwnerId) {
		this.instanceOwnerId = instanceOwnerId;
		if(instanceOwnerId != null){
			putQueryParameter("InstanceOwnerId", instanceOwnerId.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<SubmitCabRecordingResponse> getResponseClass() {
		return SubmitCabRecordingResponse.class;
	}

}
