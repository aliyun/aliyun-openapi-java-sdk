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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDtxAppActionRequest extends RpcAcsRequest<CreateDtxAppActionResponse> {
	   

	private String elasticRouteRule;

	private String rollbackMethodName;

	private String appName;

	private String commitMethodName;

	private String elasticKey;

	private Long id;

	private String uniqueId;

	private String testUrl;

	private String actionName;

	private String wsTr;

	private String instanceId;

	private String className;

	private Long commitMethodParamsType;

	private Long rollbackMethodParamsType;

	private Boolean isZoneRoute;
	public CreateDtxAppActionRequest() {
		super("SOFA", "2019-08-15", "CreateDtxAppAction", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getElasticRouteRule() {
		return this.elasticRouteRule;
	}

	public void setElasticRouteRule(String elasticRouteRule) {
		this.elasticRouteRule = elasticRouteRule;
		if(elasticRouteRule != null){
			putBodyParameter("ElasticRouteRule", elasticRouteRule);
		}
	}

	public String getRollbackMethodName() {
		return this.rollbackMethodName;
	}

	public void setRollbackMethodName(String rollbackMethodName) {
		this.rollbackMethodName = rollbackMethodName;
		if(rollbackMethodName != null){
			putBodyParameter("RollbackMethodName", rollbackMethodName);
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

	public String getCommitMethodName() {
		return this.commitMethodName;
	}

	public void setCommitMethodName(String commitMethodName) {
		this.commitMethodName = commitMethodName;
		if(commitMethodName != null){
			putBodyParameter("CommitMethodName", commitMethodName);
		}
	}

	public String getElasticKey() {
		return this.elasticKey;
	}

	public void setElasticKey(String elasticKey) {
		this.elasticKey = elasticKey;
		if(elasticKey != null){
			putBodyParameter("ElasticKey", elasticKey);
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

	public String getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		if(uniqueId != null){
			putBodyParameter("UniqueId", uniqueId);
		}
	}

	public String getTestUrl() {
		return this.testUrl;
	}

	public void setTestUrl(String testUrl) {
		this.testUrl = testUrl;
		if(testUrl != null){
			putBodyParameter("TestUrl", testUrl);
		}
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
		if(actionName != null){
			putBodyParameter("ActionName", actionName);
		}
	}

	public String getWsTr() {
		return this.wsTr;
	}

	public void setWsTr(String wsTr) {
		this.wsTr = wsTr;
		if(wsTr != null){
			putBodyParameter("WsTr", wsTr);
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

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
		if(className != null){
			putBodyParameter("ClassName", className);
		}
	}

	public Long getCommitMethodParamsType() {
		return this.commitMethodParamsType;
	}

	public void setCommitMethodParamsType(Long commitMethodParamsType) {
		this.commitMethodParamsType = commitMethodParamsType;
		if(commitMethodParamsType != null){
			putBodyParameter("CommitMethodParamsType", commitMethodParamsType.toString());
		}
	}

	public Long getRollbackMethodParamsType() {
		return this.rollbackMethodParamsType;
	}

	public void setRollbackMethodParamsType(Long rollbackMethodParamsType) {
		this.rollbackMethodParamsType = rollbackMethodParamsType;
		if(rollbackMethodParamsType != null){
			putBodyParameter("RollbackMethodParamsType", rollbackMethodParamsType.toString());
		}
	}

	public Boolean getIsZoneRoute() {
		return this.isZoneRoute;
	}

	public void setIsZoneRoute(Boolean isZoneRoute) {
		this.isZoneRoute = isZoneRoute;
		if(isZoneRoute != null){
			putBodyParameter("IsZoneRoute", isZoneRoute.toString());
		}
	}

	@Override
	public Class<CreateDtxAppActionResponse> getResponseClass() {
		return CreateDtxAppActionResponse.class;
	}

}
