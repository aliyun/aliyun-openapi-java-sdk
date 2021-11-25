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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWatchTaskRequest extends RpcAcsRequest<UpdateWatchTaskResponse> {
	   

	private String scheduleType;

	private String messageReceiver;

	private String watchPolicyIds;

	private String taskName;

	private String description;

	private String scheduleTimes;

	private String scheduleCycleDates;

	private String deviceList;

	private String watchTaskId;
	public UpdateWatchTaskRequest() {
		super("Vcs", "2020-05-15", "UpdateWatchTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putBodyParameter("ScheduleType", scheduleType);
		}
	}

	public String getMessageReceiver() {
		return this.messageReceiver;
	}

	public void setMessageReceiver(String messageReceiver) {
		this.messageReceiver = messageReceiver;
		if(messageReceiver != null){
			putBodyParameter("MessageReceiver", messageReceiver);
		}
	}

	public String getWatchPolicyIds() {
		return this.watchPolicyIds;
	}

	public void setWatchPolicyIds(String watchPolicyIds) {
		this.watchPolicyIds = watchPolicyIds;
		if(watchPolicyIds != null){
			putBodyParameter("WatchPolicyIds", watchPolicyIds);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putBodyParameter("TaskName", taskName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getScheduleTimes() {
		return this.scheduleTimes;
	}

	public void setScheduleTimes(String scheduleTimes) {
		this.scheduleTimes = scheduleTimes;
		if(scheduleTimes != null){
			putBodyParameter("ScheduleTimes", scheduleTimes);
		}
	}

	public String getScheduleCycleDates() {
		return this.scheduleCycleDates;
	}

	public void setScheduleCycleDates(String scheduleCycleDates) {
		this.scheduleCycleDates = scheduleCycleDates;
		if(scheduleCycleDates != null){
			putBodyParameter("ScheduleCycleDates", scheduleCycleDates);
		}
	}

	public String getDeviceList() {
		return this.deviceList;
	}

	public void setDeviceList(String deviceList) {
		this.deviceList = deviceList;
		if(deviceList != null){
			putBodyParameter("DeviceList", deviceList);
		}
	}

	public String getWatchTaskId() {
		return this.watchTaskId;
	}

	public void setWatchTaskId(String watchTaskId) {
		this.watchTaskId = watchTaskId;
		if(watchTaskId != null){
			putBodyParameter("WatchTaskId", watchTaskId);
		}
	}

	@Override
	public Class<UpdateWatchTaskResponse> getResponseClass() {
		return UpdateWatchTaskResponse.class;
	}

}
