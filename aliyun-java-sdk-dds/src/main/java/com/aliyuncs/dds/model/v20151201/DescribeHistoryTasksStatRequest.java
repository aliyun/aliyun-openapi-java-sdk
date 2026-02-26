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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeHistoryTasksStatRequest extends RpcAcsRequest<DescribeHistoryTasksStatResponse> {
	   

	private Long resourceOwnerId;

	private String toStartTime;

	private String resourceGroupId;

	private String taskId;

	private Integer toExecTime;

	private String taskType;

	private String resourceOwnerAccount;

	private String fromStartTime;

	private Integer fromExecTime;

	private String instanceId;

	private String status;
	public DescribeHistoryTasksStatRequest() {
		super("Dds", "2015-12-01", "DescribeHistoryTasksStat", "dds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getToStartTime() {
		return this.toStartTime;
	}

	public void setToStartTime(String toStartTime) {
		this.toStartTime = toStartTime;
		if(toStartTime != null){
			putQueryParameter("ToStartTime", toStartTime);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public Integer getToExecTime() {
		return this.toExecTime;
	}

	public void setToExecTime(Integer toExecTime) {
		this.toExecTime = toExecTime;
		if(toExecTime != null){
			putQueryParameter("ToExecTime", toExecTime.toString());
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
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

	public String getFromStartTime() {
		return this.fromStartTime;
	}

	public void setFromStartTime(String fromStartTime) {
		this.fromStartTime = fromStartTime;
		if(fromStartTime != null){
			putQueryParameter("FromStartTime", fromStartTime);
		}
	}

	public Integer getFromExecTime() {
		return this.fromExecTime;
	}

	public void setFromExecTime(Integer fromExecTime) {
		this.fromExecTime = fromExecTime;
		if(fromExecTime != null){
			putQueryParameter("FromExecTime", fromExecTime.toString());
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeHistoryTasksStatResponse> getResponseClass() {
		return DescribeHistoryTasksStatResponse.class;
	}

}
