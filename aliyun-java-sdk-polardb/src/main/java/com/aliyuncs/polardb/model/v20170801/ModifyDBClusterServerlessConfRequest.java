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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterServerlessConfRequest extends RpcAcsRequest<ModifyDBClusterServerlessConfResponse> {
	   

	private String scaleRoNumMax;

	private Long resourceOwnerId;

	private String serverlessRuleMode;

	private String scaleApRoNumMax;

	private String scaleMax;

	private String plannedEndTime;

	private String serverlessRuleCpuEnlargeThreshold;

	private String secondsUntilAutoPause;

	private String scaleApRoNumMin;

	private String taskId;

	private String scaleMin;

	private String crontabJobId;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String serverlessRuleCpuShrinkThreshold;

	private Long ownerId;

	private String plannedStartTime;

	private String scaleRoNumMin;

	private String allowShutDown;

	private Boolean fromTimeService;
	public ModifyDBClusterServerlessConfRequest() {
		super("polardb", "2017-08-01", "ModifyDBClusterServerlessConf", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScaleRoNumMax() {
		return this.scaleRoNumMax;
	}

	public void setScaleRoNumMax(String scaleRoNumMax) {
		this.scaleRoNumMax = scaleRoNumMax;
		if(scaleRoNumMax != null){
			putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
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

	public String getServerlessRuleMode() {
		return this.serverlessRuleMode;
	}

	public void setServerlessRuleMode(String serverlessRuleMode) {
		this.serverlessRuleMode = serverlessRuleMode;
		if(serverlessRuleMode != null){
			putQueryParameter("ServerlessRuleMode", serverlessRuleMode);
		}
	}

	public String getScaleApRoNumMax() {
		return this.scaleApRoNumMax;
	}

	public void setScaleApRoNumMax(String scaleApRoNumMax) {
		this.scaleApRoNumMax = scaleApRoNumMax;
		if(scaleApRoNumMax != null){
			putQueryParameter("ScaleApRoNumMax", scaleApRoNumMax);
		}
	}

	public String getScaleMax() {
		return this.scaleMax;
	}

	public void setScaleMax(String scaleMax) {
		this.scaleMax = scaleMax;
		if(scaleMax != null){
			putQueryParameter("ScaleMax", scaleMax);
		}
	}

	public String getPlannedEndTime() {
		return this.plannedEndTime;
	}

	public void setPlannedEndTime(String plannedEndTime) {
		this.plannedEndTime = plannedEndTime;
		if(plannedEndTime != null){
			putQueryParameter("PlannedEndTime", plannedEndTime);
		}
	}

	public String getServerlessRuleCpuEnlargeThreshold() {
		return this.serverlessRuleCpuEnlargeThreshold;
	}

	public void setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
		this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
		if(serverlessRuleCpuEnlargeThreshold != null){
			putQueryParameter("ServerlessRuleCpuEnlargeThreshold", serverlessRuleCpuEnlargeThreshold);
		}
	}

	public String getSecondsUntilAutoPause() {
		return this.secondsUntilAutoPause;
	}

	public void setSecondsUntilAutoPause(String secondsUntilAutoPause) {
		this.secondsUntilAutoPause = secondsUntilAutoPause;
		if(secondsUntilAutoPause != null){
			putQueryParameter("SecondsUntilAutoPause", secondsUntilAutoPause);
		}
	}

	public String getScaleApRoNumMin() {
		return this.scaleApRoNumMin;
	}

	public void setScaleApRoNumMin(String scaleApRoNumMin) {
		this.scaleApRoNumMin = scaleApRoNumMin;
		if(scaleApRoNumMin != null){
			putQueryParameter("ScaleApRoNumMin", scaleApRoNumMin);
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

	public String getScaleMin() {
		return this.scaleMin;
	}

	public void setScaleMin(String scaleMin) {
		this.scaleMin = scaleMin;
		if(scaleMin != null){
			putQueryParameter("ScaleMin", scaleMin);
		}
	}

	public String getCrontabJobId() {
		return this.crontabJobId;
	}

	public void setCrontabJobId(String crontabJobId) {
		this.crontabJobId = crontabJobId;
		if(crontabJobId != null){
			putQueryParameter("CrontabJobId", crontabJobId);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getServerlessRuleCpuShrinkThreshold() {
		return this.serverlessRuleCpuShrinkThreshold;
	}

	public void setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
		this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
		if(serverlessRuleCpuShrinkThreshold != null){
			putQueryParameter("ServerlessRuleCpuShrinkThreshold", serverlessRuleCpuShrinkThreshold);
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

	public String getPlannedStartTime() {
		return this.plannedStartTime;
	}

	public void setPlannedStartTime(String plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
		if(plannedStartTime != null){
			putQueryParameter("PlannedStartTime", plannedStartTime);
		}
	}

	public String getScaleRoNumMin() {
		return this.scaleRoNumMin;
	}

	public void setScaleRoNumMin(String scaleRoNumMin) {
		this.scaleRoNumMin = scaleRoNumMin;
		if(scaleRoNumMin != null){
			putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
		}
	}

	public String getAllowShutDown() {
		return this.allowShutDown;
	}

	public void setAllowShutDown(String allowShutDown) {
		this.allowShutDown = allowShutDown;
		if(allowShutDown != null){
			putQueryParameter("AllowShutDown", allowShutDown);
		}
	}

	public Boolean getFromTimeService() {
		return this.fromTimeService;
	}

	public void setFromTimeService(Boolean fromTimeService) {
		this.fromTimeService = fromTimeService;
		if(fromTimeService != null){
			putQueryParameter("FromTimeService", fromTimeService.toString());
		}
	}

	@Override
	public Class<ModifyDBClusterServerlessConfResponse> getResponseClass() {
		return ModifyDBClusterServerlessConfResponse.class;
	}

}
