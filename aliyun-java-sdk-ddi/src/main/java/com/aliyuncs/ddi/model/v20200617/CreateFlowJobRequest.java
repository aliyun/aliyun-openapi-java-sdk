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

package com.aliyuncs.ddi.model.v20200617;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowJobRequest extends RpcAcsRequest<CreateFlowJobResponse> {
	   

	private String retryPolicy;

	private String runConf;

	private String clientToken;

	private String description;

	private String type;

	private String paramConf;

	private List<ResourceList> resourceLists;

	private String failAct;

	private String mode;

	private String monitorConf;

	private String alertConf;

	private String projectId;

	private String envConf;

	private String clusterId;

	private String params;

	private String customVariables;

	private String name;

	private Boolean adhoc;

	private String parentCategory;
	public CreateFlowJobRequest() {
		super("Ddi", "2020-06-17", "CreateFlowJob", "spark");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRetryPolicy() {
		return this.retryPolicy;
	}

	public void setRetryPolicy(String retryPolicy) {
		this.retryPolicy = retryPolicy;
		if(retryPolicy != null){
			putQueryParameter("RetryPolicy", retryPolicy);
		}
	}

	public String getRunConf() {
		return this.runConf;
	}

	public void setRunConf(String runConf) {
		this.runConf = runConf;
		if(runConf != null){
			putQueryParameter("RunConf", runConf);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getParamConf() {
		return this.paramConf;
	}

	public void setParamConf(String paramConf) {
		this.paramConf = paramConf;
		if(paramConf != null){
			putQueryParameter("ParamConf", paramConf);
		}
	}

	public List<ResourceList> getResourceLists() {
		return this.resourceLists;
	}

	public void setResourceLists(List<ResourceList> resourceLists) {
		this.resourceLists = resourceLists;	
		if (resourceLists != null) {
			for (int depth1 = 0; depth1 < resourceLists.size(); depth1++) {
				putQueryParameter("ResourceList." + (depth1 + 1) + ".Path" , resourceLists.get(depth1).getPath());
				putQueryParameter("ResourceList." + (depth1 + 1) + ".Alias" , resourceLists.get(depth1).getAlias());
			}
		}	
	}

	public String getFailAct() {
		return this.failAct;
	}

	public void setFailAct(String failAct) {
		this.failAct = failAct;
		if(failAct != null){
			putQueryParameter("FailAct", failAct);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getMonitorConf() {
		return this.monitorConf;
	}

	public void setMonitorConf(String monitorConf) {
		this.monitorConf = monitorConf;
		if(monitorConf != null){
			putQueryParameter("MonitorConf", monitorConf);
		}
	}

	public String getAlertConf() {
		return this.alertConf;
	}

	public void setAlertConf(String alertConf) {
		this.alertConf = alertConf;
		if(alertConf != null){
			putQueryParameter("AlertConf", alertConf);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getEnvConf() {
		return this.envConf;
	}

	public void setEnvConf(String envConf) {
		this.envConf = envConf;
		if(envConf != null){
			putQueryParameter("EnvConf", envConf);
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

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getCustomVariables() {
		return this.customVariables;
	}

	public void setCustomVariables(String customVariables) {
		this.customVariables = customVariables;
		if(customVariables != null){
			putQueryParameter("CustomVariables", customVariables);
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

	public Boolean getAdhoc() {
		return this.adhoc;
	}

	public void setAdhoc(Boolean adhoc) {
		this.adhoc = adhoc;
		if(adhoc != null){
			putQueryParameter("Adhoc", adhoc.toString());
		}
	}

	public String getParentCategory() {
		return this.parentCategory;
	}

	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
		if(parentCategory != null){
			putQueryParameter("ParentCategory", parentCategory);
		}
	}

	public static class ResourceList {

		private String path;

		private String alias;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}
	}

	@Override
	public Class<CreateFlowJobResponse> getResponseClass() {
		return CreateFlowJobResponse.class;
	}

}
