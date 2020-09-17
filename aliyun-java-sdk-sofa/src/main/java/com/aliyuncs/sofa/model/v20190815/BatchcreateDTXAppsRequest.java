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
public class BatchcreateDTXAppsRequest extends RpcAcsRequest<BatchcreateDTXAppsResponse> {
	   

	private List<RecoveryArray> recoveryArrays;

	private Long activityMode;

	private String appName;

	private String tableRuleName;

	private List<RecoveryDsArray> recoveryDsArrays;

	private String dbRuleTemplete;

	private Long id;

	private String tableRuleTemplete;

	private List<ActionArray> actionArrays;

	private String dbRuleName;

	private String instanceId;

	private String desc;
	public BatchcreateDTXAppsRequest() {
		super("SOFA", "2019-08-15", "BatchcreateDTXApps", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<RecoveryArray> getRecoveryArrays() {
		return this.recoveryArrays;
	}

	public void setRecoveryArrays(List<RecoveryArray> recoveryArrays) {
		this.recoveryArrays = recoveryArrays;	
		if (recoveryArrays != null) {
			for (int depth1 = 0; depth1 < recoveryArrays.size(); depth1++) {
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".ClientVersion" , recoveryArrays.get(depth1).getClientVersion());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".RecoveryThreadNum" , recoveryArrays.get(depth1).getRecoveryThreadNum());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".GroupId" , recoveryArrays.get(depth1).getGroupId());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".RecoveryLimit" , recoveryArrays.get(depth1).getRecoveryLimit());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".Id" , recoveryArrays.get(depth1).getId());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".IsAsyn" , recoveryArrays.get(depth1).getIsAsyn());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".IsLoadTest" , recoveryArrays.get(depth1).getIsLoadTest());
				putBodyParameter("RecoveryArray." + (depth1 + 1) + ".IsMix" , recoveryArrays.get(depth1).getIsMix());
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

	public String getTableRuleName() {
		return this.tableRuleName;
	}

	public void setTableRuleName(String tableRuleName) {
		this.tableRuleName = tableRuleName;
		if(tableRuleName != null){
			putBodyParameter("TableRuleName", tableRuleName);
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

	public String getDbRuleTemplete() {
		return this.dbRuleTemplete;
	}

	public void setDbRuleTemplete(String dbRuleTemplete) {
		this.dbRuleTemplete = dbRuleTemplete;
		if(dbRuleTemplete != null){
			putBodyParameter("DbRuleTemplete", dbRuleTemplete);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getTableRuleTemplete() {
		return this.tableRuleTemplete;
	}

	public void setTableRuleTemplete(String tableRuleTemplete) {
		this.tableRuleTemplete = tableRuleTemplete;
		if(tableRuleTemplete != null){
			putBodyParameter("TableRuleTemplete", tableRuleTemplete);
		}
	}

	public List<ActionArray> getActionArrays() {
		return this.actionArrays;
	}

	public void setActionArrays(List<ActionArray> actionArrays) {
		this.actionArrays = actionArrays;	
		if (actionArrays != null) {
			for (int depth1 = 0; depth1 < actionArrays.size(); depth1++) {
				putBodyParameter("ActionArray." + (depth1 + 1) + ".TestUrl" , actionArrays.get(depth1).getTestUrl());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".Used" , actionArrays.get(depth1).getUsed());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".ActionName" , actionArrays.get(depth1).getActionName());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".WsTr" , actionArrays.get(depth1).getWsTr());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".ElasticRouteRule" , actionArrays.get(depth1).getElasticRouteRule());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".RollbackMethodName" , actionArrays.get(depth1).getRollbackMethodName());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".InstanceId" , actionArrays.get(depth1).getInstanceId());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".AppName" , actionArrays.get(depth1).getAppName());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".ClassName" , actionArrays.get(depth1).getClassName());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".CommitMethodParamsType" , actionArrays.get(depth1).getCommitMethodParamsType());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".CommitMethodName" , actionArrays.get(depth1).getCommitMethodName());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".ElasticKey" , actionArrays.get(depth1).getElasticKey());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".RollbackMethodParamsType" , actionArrays.get(depth1).getRollbackMethodParamsType());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".Id" , actionArrays.get(depth1).getId());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".UniqueId" , actionArrays.get(depth1).getUniqueId());
				putBodyParameter("ActionArray." + (depth1 + 1) + ".IsZoneRoute" , actionArrays.get(depth1).getIsZoneRoute());
			}
		}	
	}

	public String getDbRuleName() {
		return this.dbRuleName;
	}

	public void setDbRuleName(String dbRuleName) {
		this.dbRuleName = dbRuleName;
		if(dbRuleName != null){
			putBodyParameter("DbRuleName", dbRuleName);
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

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	public static class RecoveryArray {

		private String clientVersion;

		private Long recoveryThreadNum;

		private String groupId;

		private Long recoveryLimit;

		private Long id;

		private Boolean isAsyn;

		private Boolean isLoadTest;

		private Boolean isMix;

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public Long getRecoveryThreadNum() {
			return this.recoveryThreadNum;
		}

		public void setRecoveryThreadNum(Long recoveryThreadNum) {
			this.recoveryThreadNum = recoveryThreadNum;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Long getRecoveryLimit() {
			return this.recoveryLimit;
		}

		public void setRecoveryLimit(Long recoveryLimit) {
			this.recoveryLimit = recoveryLimit;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getIsAsyn() {
			return this.isAsyn;
		}

		public void setIsAsyn(Boolean isAsyn) {
			this.isAsyn = isAsyn;
		}

		public Boolean getIsLoadTest() {
			return this.isLoadTest;
		}

		public void setIsLoadTest(Boolean isLoadTest) {
			this.isLoadTest = isLoadTest;
		}

		public Boolean getIsMix() {
			return this.isMix;
		}

		public void setIsMix(Boolean isMix) {
			this.isMix = isMix;
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

	public static class ActionArray {

		private String testUrl;

		private Boolean used;

		private String actionName;

		private String wsTr;

		private String elasticRouteRule;

		private String rollbackMethodName;

		private String instanceId;

		private String appName;

		private String className;

		private Long commitMethodParamsType;

		private String commitMethodName;

		private String elasticKey;

		private Long rollbackMethodParamsType;

		private Long id;

		private String uniqueId;

		private Boolean isZoneRoute;

		public String getTestUrl() {
			return this.testUrl;
		}

		public void setTestUrl(String testUrl) {
			this.testUrl = testUrl;
		}

		public Boolean getUsed() {
			return this.used;
		}

		public void setUsed(Boolean used) {
			this.used = used;
		}

		public String getActionName() {
			return this.actionName;
		}

		public void setActionName(String actionName) {
			this.actionName = actionName;
		}

		public String getWsTr() {
			return this.wsTr;
		}

		public void setWsTr(String wsTr) {
			this.wsTr = wsTr;
		}

		public String getElasticRouteRule() {
			return this.elasticRouteRule;
		}

		public void setElasticRouteRule(String elasticRouteRule) {
			this.elasticRouteRule = elasticRouteRule;
		}

		public String getRollbackMethodName() {
			return this.rollbackMethodName;
		}

		public void setRollbackMethodName(String rollbackMethodName) {
			this.rollbackMethodName = rollbackMethodName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public Long getCommitMethodParamsType() {
			return this.commitMethodParamsType;
		}

		public void setCommitMethodParamsType(Long commitMethodParamsType) {
			this.commitMethodParamsType = commitMethodParamsType;
		}

		public String getCommitMethodName() {
			return this.commitMethodName;
		}

		public void setCommitMethodName(String commitMethodName) {
			this.commitMethodName = commitMethodName;
		}

		public String getElasticKey() {
			return this.elasticKey;
		}

		public void setElasticKey(String elasticKey) {
			this.elasticKey = elasticKey;
		}

		public Long getRollbackMethodParamsType() {
			return this.rollbackMethodParamsType;
		}

		public void setRollbackMethodParamsType(Long rollbackMethodParamsType) {
			this.rollbackMethodParamsType = rollbackMethodParamsType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}

		public Boolean getIsZoneRoute() {
			return this.isZoneRoute;
		}

		public void setIsZoneRoute(Boolean isZoneRoute) {
			this.isZoneRoute = isZoneRoute;
		}
	}

	@Override
	public Class<BatchcreateDTXAppsResponse> getResponseClass() {
		return BatchcreateDTXAppsResponse.class;
	}

}
