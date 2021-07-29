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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTaskRequest extends RpcAcsRequest<CreateTaskResponse> {
	   

	private String seatCount;

	private Long resourceOwnerId;

	private Integer retryCount;

	private String workDay;

	private Boolean startNow;

	private String taskName;

	private String callStringType;

	private String robotId;

	private Integer retryFlag;

	private String retryStatusCode;

	private String resourceOwnerAccount;

	private String callString;

	private Long ownerId;

	private Integer retryInterval;

	private String caller;

	private String workTimeList;
	public CreateTaskRequest() {
		super("aiccs", "2019-10-15", "CreateTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSeatCount() {
		return this.seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
		if(seatCount != null){
			putQueryParameter("SeatCount", seatCount);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getRetryCount() {
		return this.retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
		if(retryCount != null){
			putQueryParameter("RetryCount", retryCount.toString());
		}
	}

	public String getWorkDay() {
		return this.workDay;
	}

	public void setWorkDay(String workDay) {
		this.workDay = workDay;
		if(workDay != null){
			putQueryParameter("WorkDay", workDay);
		}
	}

	public Boolean getStartNow() {
		return this.startNow;
	}

	public void setStartNow(Boolean startNow) {
		this.startNow = startNow;
		if(startNow != null){
			putQueryParameter("StartNow", startNow.toString());
		}
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

	public String getCallStringType() {
		return this.callStringType;
	}

	public void setCallStringType(String callStringType) {
		this.callStringType = callStringType;
		if(callStringType != null){
			putQueryParameter("CallStringType", callStringType);
		}
	}

	public String getRobotId() {
		return this.robotId;
	}

	public void setRobotId(String robotId) {
		this.robotId = robotId;
		if(robotId != null){
			putQueryParameter("RobotId", robotId);
		}
	}

	public Integer getRetryFlag() {
		return this.retryFlag;
	}

	public void setRetryFlag(Integer retryFlag) {
		this.retryFlag = retryFlag;
		if(retryFlag != null){
			putQueryParameter("RetryFlag", retryFlag.toString());
		}
	}

	public String getRetryStatusCode() {
		return this.retryStatusCode;
	}

	public void setRetryStatusCode(String retryStatusCode) {
		this.retryStatusCode = retryStatusCode;
		if(retryStatusCode != null){
			putQueryParameter("RetryStatusCode", retryStatusCode);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCallString() {
		return this.callString;
	}

	public void setCallString(String callString) {
		this.callString = callString;
		if(callString != null){
			putQueryParameter("CallString", callString);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Integer retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public String getWorkTimeList() {
		return this.workTimeList;
	}

	public void setWorkTimeList(String workTimeList) {
		this.workTimeList = workTimeList;
		if(workTimeList != null){
			putQueryParameter("WorkTimeList", workTimeList);
		}
	}

	@Override
	public Class<CreateTaskResponse> getResponseClass() {
		return CreateTaskResponse.class;
	}

}
