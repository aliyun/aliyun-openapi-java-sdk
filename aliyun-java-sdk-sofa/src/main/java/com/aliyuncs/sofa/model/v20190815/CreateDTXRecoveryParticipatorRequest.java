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
public class CreateDTXRecoveryParticipatorRequest extends RpcAcsRequest<CreateDTXRecoveryParticipatorResponse> {
	   

	private String bizType;

	private Long actionMode;

	private List<Actions> actionss;
	public CreateDTXRecoveryParticipatorRequest() {
		super("SOFA", "2019-08-15", "CreateDTXRecoveryParticipator", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getActionMode() {
		return this.actionMode;
	}

	public void setActionMode(Long actionMode) {
		this.actionMode = actionMode;
		if(actionMode != null){
			putBodyParameter("ActionMode", actionMode.toString());
		}
	}

	public List<Actions> getActionss() {
		return this.actionss;
	}

	public void setActionss(List<Actions> actionss) {
		this.actionss = actionss;	
		if (actionss != null) {
			for (int depth1 = 0; depth1 < actionss.size(); depth1++) {
				putBodyParameter("Actions." + (depth1 + 1) + ".TestUrl" , actionss.get(depth1).getTestUrl());
				putBodyParameter("Actions." + (depth1 + 1) + ".ActionName" , actionss.get(depth1).getActionName());
				putBodyParameter("Actions." + (depth1 + 1) + ".WsTr" , actionss.get(depth1).getWsTr());
				putBodyParameter("Actions." + (depth1 + 1) + ".ElasticRouteRule" , actionss.get(depth1).getElasticRouteRule());
				putBodyParameter("Actions." + (depth1 + 1) + ".RollbackMethodName" , actionss.get(depth1).getRollbackMethodName());
				putBodyParameter("Actions." + (depth1 + 1) + ".InstanceId" , actionss.get(depth1).getInstanceId());
				putBodyParameter("Actions." + (depth1 + 1) + ".AppName" , actionss.get(depth1).getAppName());
				putBodyParameter("Actions." + (depth1 + 1) + ".ClassName" , actionss.get(depth1).getClassName());
				putBodyParameter("Actions." + (depth1 + 1) + ".CommitMethodParamsType" , actionss.get(depth1).getCommitMethodParamsType());
				putBodyParameter("Actions." + (depth1 + 1) + ".CommitMethodName" , actionss.get(depth1).getCommitMethodName());
				putBodyParameter("Actions." + (depth1 + 1) + ".ElasticKey" , actionss.get(depth1).getElasticKey());
				putBodyParameter("Actions." + (depth1 + 1) + ".RollbackMethodParamsType" , actionss.get(depth1).getRollbackMethodParamsType());
				putBodyParameter("Actions." + (depth1 + 1) + ".Id" , actionss.get(depth1).getId());
				putBodyParameter("Actions." + (depth1 + 1) + ".UniqueId" , actionss.get(depth1).getUniqueId());
				putBodyParameter("Actions." + (depth1 + 1) + ".IsZoneRoute" , actionss.get(depth1).getIsZoneRoute());
			}
		}	
	}

	public static class Actions {

		private String testUrl;

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
	public Class<CreateDTXRecoveryParticipatorResponse> getResponseClass() {
		return CreateDTXRecoveryParticipatorResponse.class;
	}

}
