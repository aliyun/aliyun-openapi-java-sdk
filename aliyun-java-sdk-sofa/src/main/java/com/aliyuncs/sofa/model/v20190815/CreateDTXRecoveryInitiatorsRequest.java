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
public class CreateDTXRecoveryInitiatorsRequest extends RpcAcsRequest<CreateDTXRecoveryInitiatorsResponse> {
	   

	private Boolean isLoadTest;

	private Boolean isMix;

	private List<RecoveryDatasources> recoveryDatasourcess;

	private Long activityMode;

	private String appName;

	private String splitMode;

	private Boolean isAsyn;

	private String splitRuleJsonStr;

	private String clientVersion;

	private Long recoveryThreadNum;

	private String bizType;

	private String instanceId;

	private Long actionMode;

	private Long recoveryLimit;

	private String desc;
	public CreateDTXRecoveryInitiatorsRequest() {
		super("SOFA", "2019-08-15", "CreateDTXRecoveryInitiators", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsLoadTest() {
		return this.isLoadTest;
	}

	public void setIsLoadTest(Boolean isLoadTest) {
		this.isLoadTest = isLoadTest;
		if(isLoadTest != null){
			putBodyParameter("IsLoadTest", isLoadTest.toString());
		}
	}

	public Boolean getIsMix() {
		return this.isMix;
	}

	public void setIsMix(Boolean isMix) {
		this.isMix = isMix;
		if(isMix != null){
			putBodyParameter("IsMix", isMix.toString());
		}
	}

	public List<RecoveryDatasources> getRecoveryDatasourcess() {
		return this.recoveryDatasourcess;
	}

	public void setRecoveryDatasourcess(List<RecoveryDatasources> recoveryDatasourcess) {
		this.recoveryDatasourcess = recoveryDatasourcess;	
		if (recoveryDatasourcess != null) {
			for (int depth1 = 0; depth1 < recoveryDatasourcess.size(); depth1++) {
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".ActionTableIndexEnd" , recoveryDatasourcess.get(depth1).getActionTableIndexEnd());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".DsNameFormat" , recoveryDatasourcess.get(depth1).getDsNameFormat());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".ActivityTableIndexStart" , recoveryDatasourcess.get(depth1).getActivityTableIndexStart());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".ActivityTableIndexEnd" , recoveryDatasourcess.get(depth1).getActivityTableIndexEnd());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".DbConnectMin" , recoveryDatasourcess.get(depth1).getDbConnectMin());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".InstanceId" , recoveryDatasourcess.get(depth1).getInstanceId());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".IsLocalDs" , recoveryDatasourcess.get(depth1).getIsLocalDs());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".Zone" , recoveryDatasourcess.get(depth1).getZone());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".DbType" , recoveryDatasourcess.get(depth1).getDbType());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".ActivityTableNameFormat" , recoveryDatasourcess.get(depth1).getActivityTableNameFormat());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".DbConnMax" , recoveryDatasourcess.get(depth1).getDbConnMax());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".DsIndexEnd" , recoveryDatasourcess.get(depth1).getDsIndexEnd());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".Id" , recoveryDatasourcess.get(depth1).getId());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".DsIndexStart" , recoveryDatasourcess.get(depth1).getDsIndexStart());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".IsLdc" , recoveryDatasourcess.get(depth1).getIsLdc());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".ActionTableIndexStart" , recoveryDatasourcess.get(depth1).getActionTableIndexStart());
				putBodyParameter("RecoveryDatasources." + (depth1 + 1) + ".ActionTableNameFormat" , recoveryDatasourcess.get(depth1).getActionTableNameFormat());
			}
		}	
	}

	public Long getActivityMode() {
		return this.activityMode;
	}

	public void setActivityMode(Long activityMode) {
		this.activityMode = activityMode;
		if(activityMode != null){
			putBodyParameter("ActivityMode", activityMode.toString());
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

	public String getSplitMode() {
		return this.splitMode;
	}

	public void setSplitMode(String splitMode) {
		this.splitMode = splitMode;
		if(splitMode != null){
			putBodyParameter("SplitMode", splitMode);
		}
	}

	public Boolean getIsAsyn() {
		return this.isAsyn;
	}

	public void setIsAsyn(Boolean isAsyn) {
		this.isAsyn = isAsyn;
		if(isAsyn != null){
			putBodyParameter("IsAsyn", isAsyn.toString());
		}
	}

	public String getSplitRuleJsonStr() {
		return this.splitRuleJsonStr;
	}

	public void setSplitRuleJsonStr(String splitRuleJsonStr) {
		this.splitRuleJsonStr = splitRuleJsonStr;
		if(splitRuleJsonStr != null){
			putBodyParameter("SplitRuleJsonStr", splitRuleJsonStr);
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putBodyParameter("ClientVersion", clientVersion);
		}
	}

	public Long getRecoveryThreadNum() {
		return this.recoveryThreadNum;
	}

	public void setRecoveryThreadNum(Long recoveryThreadNum) {
		this.recoveryThreadNum = recoveryThreadNum;
		if(recoveryThreadNum != null){
			putBodyParameter("RecoveryThreadNum", recoveryThreadNum.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
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

	public Long getActionMode() {
		return this.actionMode;
	}

	public void setActionMode(Long actionMode) {
		this.actionMode = actionMode;
		if(actionMode != null){
			putBodyParameter("ActionMode", actionMode.toString());
		}
	}

	public Long getRecoveryLimit() {
		return this.recoveryLimit;
	}

	public void setRecoveryLimit(Long recoveryLimit) {
		this.recoveryLimit = recoveryLimit;
		if(recoveryLimit != null){
			putBodyParameter("RecoveryLimit", recoveryLimit.toString());
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	public static class RecoveryDatasources {

		private Long actionTableIndexEnd;

		private String dsNameFormat;

		private Long activityTableIndexStart;

		private Long activityTableIndexEnd;

		private Long dbConnectMin;

		private String instanceId;

		private Boolean isLocalDs;

		private String zone;

		private Long dbType;

		private String activityTableNameFormat;

		private Long dbConnMax;

		private Long dsIndexEnd;

		private Long id;

		private Long dsIndexStart;

		private Boolean isLdc;

		private Long actionTableIndexStart;

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

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public Long getActionTableIndexStart() {
			return this.actionTableIndexStart;
		}

		public void setActionTableIndexStart(Long actionTableIndexStart) {
			this.actionTableIndexStart = actionTableIndexStart;
		}

		public String getActionTableNameFormat() {
			return this.actionTableNameFormat;
		}

		public void setActionTableNameFormat(String actionTableNameFormat) {
			this.actionTableNameFormat = actionTableNameFormat;
		}
	}

	@Override
	public Class<CreateDTXRecoveryInitiatorsResponse> getResponseClass() {
		return CreateDTXRecoveryInitiatorsResponse.class;
	}

}
