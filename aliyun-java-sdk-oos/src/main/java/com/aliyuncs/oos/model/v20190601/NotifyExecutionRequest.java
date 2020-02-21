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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class NotifyExecutionRequest extends RpcAcsRequest<NotifyExecutionResponse> {
	   

	private String taskName;

	private String executionId;

	private String notifyType;

	private String executionStatus;

	private String notifyNote;

	private String loopItem;

	private String taskExecutionId;

	private String parameters;
	public NotifyExecutionRequest() {
		super("oos", "2019-06-01", "NotifyExecution", "oos");
		setMethod(MethodType.POST);
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
		if(executionId != null){
			putQueryParameter("ExecutionId", executionId);
		}
	}

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
		if(notifyType != null){
			putQueryParameter("NotifyType", notifyType);
		}
	}

	public String getExecutionStatus() {
		return this.executionStatus;
	}

	public void setExecutionStatus(String executionStatus) {
		this.executionStatus = executionStatus;
		if(executionStatus != null){
			putQueryParameter("ExecutionStatus", executionStatus);
		}
	}

	public String getNotifyNote() {
		return this.notifyNote;
	}

	public void setNotifyNote(String notifyNote) {
		this.notifyNote = notifyNote;
		if(notifyNote != null){
			putQueryParameter("NotifyNote", notifyNote);
		}
	}

	public String getLoopItem() {
		return this.loopItem;
	}

	public void setLoopItem(String loopItem) {
		this.loopItem = loopItem;
		if(loopItem != null){
			putQueryParameter("LoopItem", loopItem);
		}
	}

	public String getTaskExecutionId() {
		return this.taskExecutionId;
	}

	public void setTaskExecutionId(String taskExecutionId) {
		this.taskExecutionId = taskExecutionId;
		if(taskExecutionId != null){
			putQueryParameter("TaskExecutionId", taskExecutionId);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<NotifyExecutionResponse> getResponseClass() {
		return NotifyExecutionResponse.class;
	}

}
