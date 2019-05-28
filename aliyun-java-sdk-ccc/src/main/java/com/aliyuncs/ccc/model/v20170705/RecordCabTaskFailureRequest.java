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

/**
 * @author auto create
 * @version 
 */
public class RecordCabTaskFailureRequest extends RpcAcsRequest<RecordCabTaskFailureResponse> {
	
	public RecordCabTaskFailureRequest() {
		super("CCC", "2017-07-05", "RecordCabTaskFailure");
	}

	private String callId;

	private Long actualTime;

	private String instanceId;

	private String dispositionCode;

	private Long instanceOwnerId;

	private String taskId;

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putQueryParameter("CallId", callId);
		}
	}

	public Long getActualTime() {
		return this.actualTime;
	}

	public void setActualTime(Long actualTime) {
		this.actualTime = actualTime;
		if(actualTime != null){
			putQueryParameter("ActualTime", actualTime.toString());
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

	public String getDispositionCode() {
		return this.dispositionCode;
	}

	public void setDispositionCode(String dispositionCode) {
		this.dispositionCode = dispositionCode;
		if(dispositionCode != null){
			putQueryParameter("DispositionCode", dispositionCode);
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
	public Class<RecordCabTaskFailureResponse> getResponseClass() {
		return RecordCabTaskFailureResponse.class;
	}

}
