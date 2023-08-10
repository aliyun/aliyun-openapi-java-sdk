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

package com.aliyuncs.adcp.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adcp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHubClusterRequest extends RpcAcsRequest<CreateHubClusterResponse> {
	   

	private String profile;

	private String vSwitches;

	private String name;

	private Boolean argoServerEnabled;

	private String workflowScheduleMode;

	private Boolean apiServerPublicEip;

	private Boolean auditLogEnabled;

	private String priceLimit;

	private Boolean isEnterpriseSecurityGroup;

	private String vpcId;
	public CreateHubClusterRequest() {
		super("adcp", "2022-01-01", "CreateHubCluster", "adcp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
		if(profile != null){
			putBodyParameter("Profile", profile);
		}
	}

	public String getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(String vSwitches) {
		this.vSwitches = vSwitches;
		if(vSwitches != null){
			putBodyParameter("VSwitches", vSwitches);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Boolean getArgoServerEnabled() {
		return this.argoServerEnabled;
	}

	public void setArgoServerEnabled(Boolean argoServerEnabled) {
		this.argoServerEnabled = argoServerEnabled;
		if(argoServerEnabled != null){
			putBodyParameter("ArgoServerEnabled", argoServerEnabled.toString());
		}
	}

	public String getWorkflowScheduleMode() {
		return this.workflowScheduleMode;
	}

	public void setWorkflowScheduleMode(String workflowScheduleMode) {
		this.workflowScheduleMode = workflowScheduleMode;
		if(workflowScheduleMode != null){
			putBodyParameter("WorkflowScheduleMode", workflowScheduleMode);
		}
	}

	public Boolean getApiServerPublicEip() {
		return this.apiServerPublicEip;
	}

	public void setApiServerPublicEip(Boolean apiServerPublicEip) {
		this.apiServerPublicEip = apiServerPublicEip;
		if(apiServerPublicEip != null){
			putBodyParameter("ApiServerPublicEip", apiServerPublicEip.toString());
		}
	}

	public Boolean getAuditLogEnabled() {
		return this.auditLogEnabled;
	}

	public void setAuditLogEnabled(Boolean auditLogEnabled) {
		this.auditLogEnabled = auditLogEnabled;
		if(auditLogEnabled != null){
			putBodyParameter("AuditLogEnabled", auditLogEnabled.toString());
		}
	}

	public String getPriceLimit() {
		return this.priceLimit;
	}

	public void setPriceLimit(String priceLimit) {
		this.priceLimit = priceLimit;
		if(priceLimit != null){
			putBodyParameter("PriceLimit", priceLimit);
		}
	}

	public Boolean getIsEnterpriseSecurityGroup() {
		return this.isEnterpriseSecurityGroup;
	}

	public void setIsEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
		this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
		if(isEnterpriseSecurityGroup != null){
			putBodyParameter("IsEnterpriseSecurityGroup", isEnterpriseSecurityGroup.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<CreateHubClusterResponse> getResponseClass() {
		return CreateHubClusterResponse.class;
	}

}
