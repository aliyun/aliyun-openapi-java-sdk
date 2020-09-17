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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDTXAppsRecoveryRequest extends RpcAcsRequest<CreateDTXAppsRecoveryResponse> {
	   

	private String recoveryJsonStr;

	private String appName;

	private List<RecoveryDsArray> recoveryDsArrays;

	private String instanceId;
	public CreateDTXAppsRecoveryRequest() {
		super("SOFA", "2019-08-15", "CreateDTXAppsRecovery", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRecoveryJsonStr() {
		return this.recoveryJsonStr;
	}

	public void setRecoveryJsonStr(String recoveryJsonStr) {
		this.recoveryJsonStr = recoveryJsonStr;
		if(recoveryJsonStr != null){
			putBodyParameter("RecoveryJsonStr", recoveryJsonStr);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public List<RecoveryDsArray> getRecoveryDsArrays() {
		return this.recoveryDsArrays;
	}

	public void setRecoveryDsArrays(List<RecoveryDsArray> recoveryDsArrays) {
		this.recoveryDsArrays = recoveryDsArrays;	
		if (recoveryDsArrays != null) {
			for (int depth1 = 0; depth1 < recoveryDsArrays.size(); depth1++) {
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".ActionTableIndexEnd" , recoveryDsArrays.get(depth1).getActionTableIndexEnd());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".DsNameFormat" , recoveryDsArrays.get(depth1).getDsNameFormat());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".ActivityTableIndexStart" , recoveryDsArrays.get(depth1).getActivityTableIndexStart());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".GroupId" , recoveryDsArrays.get(depth1).getGroupId());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".ActivityTableIndexEnd" , recoveryDsArrays.get(depth1).getActivityTableIndexEnd());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".DbConnectMin" , recoveryDsArrays.get(depth1).getDbConnectMin());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".IsLocalDs" , recoveryDsArrays.get(depth1).getIsLocalDs());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".Zone" , recoveryDsArrays.get(depth1).getZone());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".DbType" , recoveryDsArrays.get(depth1).getDbType());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".ActivityTableNameFormat" , recoveryDsArrays.get(depth1).getActivityTableNameFormat());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".DbConnMax" , recoveryDsArrays.get(depth1).getDbConnMax());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".DsIndexEnd" , recoveryDsArrays.get(depth1).getDsIndexEnd());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".Id" , recoveryDsArrays.get(depth1).getId());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".DsIndexStart" , recoveryDsArrays.get(depth1).getDsIndexStart());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".IsLdc" , recoveryDsArrays.get(depth1).getIsLdc());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".TaskIndexEnd" , recoveryDsArrays.get(depth1).getTaskIndexEnd());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".TaskNameFormat" , recoveryDsArrays.get(depth1).getTaskNameFormat());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".ActionTableIndexStart" , recoveryDsArrays.get(depth1).getActionTableIndexStart());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".TaskIndexStart" , recoveryDsArrays.get(depth1).getTaskIndexStart());
				putBodyParameter("RecoveryDsArray." + (depth1 + 1) + ".ActionTableNameFormat" , recoveryDsArrays.get(depth1).getActionTableNameFormat());
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public static class RecoveryDsArray {

		private Long actionTableIndexEnd;

		private String dsNameFormat;

		private Long activityTableIndexStart;

		private String groupId;

		private Long activityTableIndexEnd;

		private Long dbConnectMin;

		private Boolean isLocalDs;

		private String zone;

		private Long dbType;

		private String activityTableNameFormat;

		private Long dbConnMax;

		private Long dsIndexEnd;

		private Long id;

		private Long dsIndexStart;

		private Boolean isLdc;

		private Long taskIndexEnd;

		private String taskNameFormat;

		private Long actionTableIndexStart;

		private Long taskIndexStart;

		private String actionTableNameFormat;

		public Long getActionTableIndexEnd() {
			return this.actionTableIndexEnd;
		}

		public void setActionTableIndexEnd(Long actionTableIndexEnd) {
			this.actionTableIndexEnd = actionTableIndexEnd;
		}

		public String getDsNameFormat() {
			return this.dsNameFormat;
		}

		public void setDsNameFormat(String dsNameFormat) {
			this.dsNameFormat = dsNameFormat;
		}

		public Long getActivityTableIndexStart() {
			return this.activityTableIndexStart;
		}

		public void setActivityTableIndexStart(Long activityTableIndexStart) {
			this.activityTableIndexStart = activityTableIndexStart;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Long getActivityTableIndexEnd() {
			return this.activityTableIndexEnd;
		}

		public void setActivityTableIndexEnd(Long activityTableIndexEnd) {
			this.activityTableIndexEnd = activityTableIndexEnd;
		}

		public Long getDbConnectMin() {
			return this.dbConnectMin;
		}

		public void setDbConnectMin(Long dbConnectMin) {
			this.dbConnectMin = dbConnectMin;
		}

		public Boolean getIsLocalDs() {
			return this.isLocalDs;
		}

		public void setIsLocalDs(Boolean isLocalDs) {
			this.isLocalDs = isLocalDs;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public Long getDbType() {
			return this.dbType;
		}

		public void setDbType(Long dbType) {
			this.dbType = dbType;
		}

		public String getActivityTableNameFormat() {
			return this.activityTableNameFormat;
		}

		public void setActivityTableNameFormat(String activityTableNameFormat) {
			this.activityTableNameFormat = activityTableNameFormat;
		}

		public Long getDbConnMax() {
			return this.dbConnMax;
		}

		public void setDbConnMax(Long dbConnMax) {
			this.dbConnMax = dbConnMax;
		}

		public Long getDsIndexEnd() {
			return this.dsIndexEnd;
		}

		public void setDsIndexEnd(Long dsIndexEnd) {
			this.dsIndexEnd = dsIndexEnd;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getDsIndexStart() {
			return this.dsIndexStart;
		}

		public void setDsIndexStart(Long dsIndexStart) {
			this.dsIndexStart = dsIndexStart;
		}

		public Boolean getIsLdc() {
			return this.isLdc;
		}

		public void setIsLdc(Boolean isLdc) {
			this.isLdc = isLdc;
		}

		public Long getTaskIndexEnd() {
			return this.taskIndexEnd;
		}

		public void setTaskIndexEnd(Long taskIndexEnd) {
			this.taskIndexEnd = taskIndexEnd;
		}

		public String getTaskNameFormat() {
			return this.taskNameFormat;
		}

		public void setTaskNameFormat(String taskNameFormat) {
			this.taskNameFormat = taskNameFormat;
		}

		public Long getActionTableIndexStart() {
			return this.actionTableIndexStart;
		}

		public void setActionTableIndexStart(Long actionTableIndexStart) {
			this.actionTableIndexStart = actionTableIndexStart;
		}

		public Long getTaskIndexStart() {
			return this.taskIndexStart;
		}

		public void setTaskIndexStart(Long taskIndexStart) {
			this.taskIndexStart = taskIndexStart;
		}

		public String getActionTableNameFormat() {
			return this.actionTableNameFormat;
		}

		public void setActionTableNameFormat(String actionTableNameFormat) {
			this.actionTableNameFormat = actionTableNameFormat;
		}
	}

	@Override
	public Class<CreateDTXAppsRecoveryResponse> getResponseClass() {
		return CreateDTXAppsRecoveryResponse.class;
	}

}
