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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetDeviceOtaTaskStatusRequest extends RpcAcsRequest<SetDeviceOtaTaskStatusResponse> {
	   

	private Integer operationStatus;

	private Integer taskId;
	public SetDeviceOtaTaskStatusRequest() {
		super("wyota", "2021-04-20", "SetDeviceOtaTaskStatus");
		setMethod(MethodType.POST);
	}

	public Integer getOperationStatus() {
		return this.operationStatus;
	}

	public void setOperationStatus(Integer operationStatus) {
		this.operationStatus = operationStatus;
		if(operationStatus != null){
			putBodyParameter("OperationStatus", operationStatus.toString());
		}
	}

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<SetDeviceOtaTaskStatusResponse> getResponseClass() {
		return SetDeviceOtaTaskStatusResponse.class;
	}

}
