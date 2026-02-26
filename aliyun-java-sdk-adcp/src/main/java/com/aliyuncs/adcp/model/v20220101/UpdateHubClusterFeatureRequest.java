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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adcp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHubClusterFeatureRequest extends RpcAcsRequest<UpdateHubClusterFeatureResponse> {
	   

	@SerializedName("accessControlList")
	private List<String> accessControlList;

	private Boolean monitorEnabled;

	private Boolean deletionProtection;

	private Boolean enableMesh;

	private Boolean argoCDHAEnabled;

	private Boolean argoCDEnabled;

	@SerializedName("vSwitches")
	private List<String> vSwitches;

	private String name;

	private Boolean publicAccessEnabled;

	private Boolean publicApiServerEnabled;

	private Boolean argoServerEnabled;

	private String workflowScheduleMode;

	private Boolean auditLogEnabled;

	private String clusterId;

	private String priceLimit;

	private String apiServerEipId;
	public UpdateHubClusterFeatureRequest() {
		super("adcp", "2022-01-01", "UpdateHubClusterFeature", "adcp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getAccessControlList() {
		return this.accessControlList;
	}

	public void setAccessControlList(List<String> accessControlList) {
		this.accessControlList = accessControlList;	
		if (accessControlList != null) {
			putQueryParameter("AccessControlList" , new Gson().toJson(accessControlList));
		}	
	}

	public Boolean getMonitorEnabled() {
		return this.monitorEnabled;
	}

	public void setMonitorEnabled(Boolean monitorEnabled) {
		this.monitorEnabled = monitorEnabled;
		if(monitorEnabled != null){
			putQueryParameter("MonitorEnabled", monitorEnabled.toString());
		}
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
		}
	}

	public Boolean getEnableMesh() {
		return this.enableMesh;
	}

	public void setEnableMesh(Boolean enableMesh) {
		this.enableMesh = enableMesh;
		if(enableMesh != null){
			putQueryParameter("EnableMesh", enableMesh.toString());
		}
	}

	public Boolean getArgoCDHAEnabled() {
		return this.argoCDHAEnabled;
	}

	public void setArgoCDHAEnabled(Boolean argoCDHAEnabled) {
		this.argoCDHAEnabled = argoCDHAEnabled;
		if(argoCDHAEnabled != null){
			putQueryParameter("ArgoCDHAEnabled", argoCDHAEnabled.toString());
		}
	}

	public Boolean getArgoCDEnabled() {
		return this.argoCDEnabled;
	}

	public void setArgoCDEnabled(Boolean argoCDEnabled) {
		this.argoCDEnabled = argoCDEnabled;
		if(argoCDEnabled != null){
			putQueryParameter("ArgoCDEnabled", argoCDEnabled.toString());
		}
	}

	public List<String> getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(List<String> vSwitches) {
		this.vSwitches = vSwitches;	
		if (vSwitches != null) {
			putQueryParameter("VSwitches" , new Gson().toJson(vSwitches));
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getPublicAccessEnabled() {
		return this.publicAccessEnabled;
	}

	public void setPublicAccessEnabled(Boolean publicAccessEnabled) {
		this.publicAccessEnabled = publicAccessEnabled;
		if(publicAccessEnabled != null){
			putQueryParameter("PublicAccessEnabled", publicAccessEnabled.toString());
		}
	}

	public Boolean getPublicApiServerEnabled() {
		return this.publicApiServerEnabled;
	}

	public void setPublicApiServerEnabled(Boolean publicApiServerEnabled) {
		this.publicApiServerEnabled = publicApiServerEnabled;
		if(publicApiServerEnabled != null){
			putQueryParameter("PublicApiServerEnabled", publicApiServerEnabled.toString());
		}
	}

	public Boolean getArgoServerEnabled() {
		return this.argoServerEnabled;
	}

	public void setArgoServerEnabled(Boolean argoServerEnabled) {
		this.argoServerEnabled = argoServerEnabled;
		if(argoServerEnabled != null){
			putQueryParameter("ArgoServerEnabled", argoServerEnabled.toString());
		}
	}

	public String getWorkflowScheduleMode() {
		return this.workflowScheduleMode;
	}

	public void setWorkflowScheduleMode(String workflowScheduleMode) {
		this.workflowScheduleMode = workflowScheduleMode;
		if(workflowScheduleMode != null){
			putQueryParameter("WorkflowScheduleMode", workflowScheduleMode);
		}
	}

	public Boolean getAuditLogEnabled() {
		return this.auditLogEnabled;
	}

	public void setAuditLogEnabled(Boolean auditLogEnabled) {
		this.auditLogEnabled = auditLogEnabled;
		if(auditLogEnabled != null){
			putQueryParameter("AuditLogEnabled", auditLogEnabled.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getPriceLimit() {
		return this.priceLimit;
	}

	public void setPriceLimit(String priceLimit) {
		this.priceLimit = priceLimit;
		if(priceLimit != null){
			putQueryParameter("PriceLimit", priceLimit);
		}
	}

	public String getApiServerEipId() {
		return this.apiServerEipId;
	}

	public void setApiServerEipId(String apiServerEipId) {
		this.apiServerEipId = apiServerEipId;
		if(apiServerEipId != null){
			putQueryParameter("ApiServerEipId", apiServerEipId);
		}
	}

	@Override
	public Class<UpdateHubClusterFeatureResponse> getResponseClass() {
		return UpdateHubClusterFeatureResponse.class;
	}

}
