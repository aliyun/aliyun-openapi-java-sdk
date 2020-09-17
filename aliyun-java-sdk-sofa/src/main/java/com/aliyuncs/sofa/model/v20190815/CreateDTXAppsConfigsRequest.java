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
public class CreateDTXAppsConfigsRequest extends RpcAcsRequest<CreateDTXAppsConfigsResponse> {
	   

	private Long activityMode;

	private String appName;

	private String shardingRuleJsonStr;

	private String initiatorJsonStr;

	private List<Participators> participatorss;

	private String instanceId;

	private String desc;
	public CreateDTXAppsConfigsRequest() {
		super("SOFA", "2019-08-15", "CreateDTXAppsConfigs", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getShardingRuleJsonStr() {
		return this.shardingRuleJsonStr;
	}

	public void setShardingRuleJsonStr(String shardingRuleJsonStr) {
		this.shardingRuleJsonStr = shardingRuleJsonStr;
		if(shardingRuleJsonStr != null){
			putBodyParameter("ShardingRuleJsonStr", shardingRuleJsonStr);
		}
	}

	public String getInitiatorJsonStr() {
		return this.initiatorJsonStr;
	}

	public void setInitiatorJsonStr(String initiatorJsonStr) {
		this.initiatorJsonStr = initiatorJsonStr;
		if(initiatorJsonStr != null){
			putBodyParameter("InitiatorJsonStr", initiatorJsonStr);
		}
	}

	public List<Participators> getParticipatorss() {
		return this.participatorss;
	}

	public void setParticipatorss(List<Participators> participatorss) {
		this.participatorss = participatorss;	
		if (participatorss != null) {
			for (int depth1 = 0; depth1 < participatorss.size(); depth1++) {
				putBodyParameter("Participators." + (depth1 + 1) + ".TestUrl" , participatorss.get(depth1).getTestUrl());
				putBodyParameter("Participators." + (depth1 + 1) + ".Used" , participatorss.get(depth1).getUsed());
				putBodyParameter("Participators." + (depth1 + 1) + ".ActionName" , participatorss.get(depth1).getActionName());
				putBodyParameter("Participators." + (depth1 + 1) + ".WsTr" , participatorss.get(depth1).getWsTr());
				putBodyParameter("Participators." + (depth1 + 1) + ".ElasticRouteRule" , participatorss.get(depth1).getElasticRouteRule());
				putBodyParameter("Participators." + (depth1 + 1) + ".RollbackMethodName" , participatorss.get(depth1).getRollbackMethodName());
				putBodyParameter("Participators." + (depth1 + 1) + ".InstanceId" , participatorss.get(depth1).getInstanceId());
				putBodyParameter("Participators." + (depth1 + 1) + ".AppName" , participatorss.get(depth1).getAppName());
				putBodyParameter("Participators." + (depth1 + 1) + ".ClassName" , participatorss.get(depth1).getClassName());
				putBodyParameter("Participators." + (depth1 + 1) + ".CommitMethodParamsType" , participatorss.get(depth1).getCommitMethodParamsType());
				putBodyParameter("Participators." + (depth1 + 1) + ".CommitMethodName" , participatorss.get(depth1).getCommitMethodName());
				putBodyParameter("Participators." + (depth1 + 1) + ".ElasticKey" , participatorss.get(depth1).getElasticKey());
				putBodyParameter("Participators." + (depth1 + 1) + ".RollbackMethodParamsType" , participatorss.get(depth1).getRollbackMethodParamsType());
				putBodyParameter("Participators." + (depth1 + 1) + ".Id" , participatorss.get(depth1).getId());
				putBodyParameter("Participators." + (depth1 + 1) + ".UniqueId" , participatorss.get(depth1).getUniqueId());
				putBodyParameter("Participators." + (depth1 + 1) + ".IsZoneRoute" , participatorss.get(depth1).getIsZoneRoute());
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

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	public static class Participators {

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
	public Class<CreateDTXAppsConfigsResponse> getResponseClass() {
		return CreateDTXAppsConfigsResponse.class;
	}

}
