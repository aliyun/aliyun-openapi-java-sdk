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
public class OpsCreateChangePlanRequest extends RpcAcsRequest<OpsCreateChangePlanResponse> {
	   

	private String extension;

	private String description;

	private String planType;

	private String operator;

	private String strategyName;

	private String scope;

	private String serviceVersion;

	private Boolean aswTypePlanFlag;

	private List<String> groups;

	private Boolean hostListTypePlanFlag;

	private String auditParamStr;
	public OpsCreateChangePlanRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateChangePlan", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
		if(extension != null){
			putQueryParameter("Extension", extension);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getPlanType() {
		return this.planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
		if(planType != null){
			putQueryParameter("PlanType", planType);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
		if(strategyName != null){
			putQueryParameter("StrategyName", strategyName);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putBodyParameter("Scope", scope);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public Boolean getAswTypePlanFlag() {
		return this.aswTypePlanFlag;
	}

	public void setAswTypePlanFlag(Boolean aswTypePlanFlag) {
		this.aswTypePlanFlag = aswTypePlanFlag;
		if(aswTypePlanFlag != null){
			putQueryParameter("AswTypePlanFlag", aswTypePlanFlag.toString());
		}
	}

	public List<String> getGroups() {
		return this.groups;
	}

	public void setGroups(List<String> groups) {
		this.groups = groups;	
		if (groups != null) {
			for (int i = 0; i < groups.size(); i++) {
				putQueryParameter("Group." + (i + 1) , groups.get(i));
			}
		}	
	}

	public Boolean getHostListTypePlanFlag() {
		return this.hostListTypePlanFlag;
	}

	public void setHostListTypePlanFlag(Boolean hostListTypePlanFlag) {
		this.hostListTypePlanFlag = hostListTypePlanFlag;
		if(hostListTypePlanFlag != null){
			putQueryParameter("HostListTypePlanFlag", hostListTypePlanFlag.toString());
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

	@Override
	public Class<OpsCreateChangePlanResponse> getResponseClass() {
		return OpsCreateChangePlanResponse.class;
	}

}
