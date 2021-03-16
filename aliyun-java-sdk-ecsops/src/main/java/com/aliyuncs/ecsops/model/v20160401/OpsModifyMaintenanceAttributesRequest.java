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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyMaintenanceAttributesRequest extends RpcAcsRequest<OpsModifyMaintenanceAttributesResponse> {
	   

	private String level;

	private Long resourceAliUid;

	private Integer canRecover;

	private List<MaintenanceWindow> maintenanceWindows;

	private List<ReleaseWindow> releaseWindows;

	private List<String> instanceIds;

	private Boolean notifyOnMaintenance;

	private String actionOnMaintenance;

	private List<String> propertyIds;

	private Boolean liveMigration;

	private String auditParamStr;
	public OpsModifyMaintenanceAttributesRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyMaintenanceAttributes", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public Long getResourceAliUid() {
		return this.resourceAliUid;
	}

	public void setResourceAliUid(Long resourceAliUid) {
		this.resourceAliUid = resourceAliUid;
		if(resourceAliUid != null){
			putQueryParameter("ResourceAliUid", resourceAliUid.toString());
		}
	}

	public Integer getCanRecover() {
		return this.canRecover;
	}

	public void setCanRecover(Integer canRecover) {
		this.canRecover = canRecover;
		if(canRecover != null){
			putQueryParameter("CanRecover", canRecover.toString());
		}
	}

	public List<MaintenanceWindow> getMaintenanceWindows() {
		return this.maintenanceWindows;
	}

	public void setMaintenanceWindows(List<MaintenanceWindow> maintenanceWindows) {
		this.maintenanceWindows = maintenanceWindows;	
		if (maintenanceWindows != null) {
			for (int depth1 = 0; depth1 < maintenanceWindows.size(); depth1++) {
				putQueryParameter("MaintenanceWindow." + (depth1 + 1) + ".EndTime" , maintenanceWindows.get(depth1).getEndTime());
				putQueryParameter("MaintenanceWindow." + (depth1 + 1) + ".StartTime" , maintenanceWindows.get(depth1).getStartTime());
			}
		}	
	}

	public List<ReleaseWindow> getReleaseWindows() {
		return this.releaseWindows;
	}

	public void setReleaseWindows(List<ReleaseWindow> releaseWindows) {
		this.releaseWindows = releaseWindows;	
		if (releaseWindows != null) {
			for (int depth1 = 0; depth1 < releaseWindows.size(); depth1++) {
				putQueryParameter("ReleaseWindow." + (depth1 + 1) + ".EndTime" , releaseWindows.get(depth1).getEndTime());
				putQueryParameter("ReleaseWindow." + (depth1 + 1) + ".StartTime" , releaseWindows.get(depth1).getStartTime());
			}
		}	
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public Boolean getNotifyOnMaintenance() {
		return this.notifyOnMaintenance;
	}

	public void setNotifyOnMaintenance(Boolean notifyOnMaintenance) {
		this.notifyOnMaintenance = notifyOnMaintenance;
		if(notifyOnMaintenance != null){
			putQueryParameter("NotifyOnMaintenance", notifyOnMaintenance.toString());
		}
	}

	public String getActionOnMaintenance() {
		return this.actionOnMaintenance;
	}

	public void setActionOnMaintenance(String actionOnMaintenance) {
		this.actionOnMaintenance = actionOnMaintenance;
		if(actionOnMaintenance != null){
			putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
		}
	}

	public List<String> getPropertyIds() {
		return this.propertyIds;
	}

	public void setPropertyIds(List<String> propertyIds) {
		this.propertyIds = propertyIds;	
		if (propertyIds != null) {
			for (int i = 0; i < propertyIds.size(); i++) {
				putQueryParameter("PropertyId." + (i + 1) , propertyIds.get(i));
			}
		}	
	}

	public Boolean getLiveMigration() {
		return this.liveMigration;
	}

	public void setLiveMigration(Boolean liveMigration) {
		this.liveMigration = liveMigration;
		if(liveMigration != null){
			putQueryParameter("LiveMigration", liveMigration.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class MaintenanceWindow {

		private String endTime;

		private String startTime;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	public static class ReleaseWindow {

		private String endTime;

		private String startTime;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	@Override
	public Class<OpsModifyMaintenanceAttributesResponse> getResponseClass() {
		return OpsModifyMaintenanceAttributesResponse.class;
	}

}
