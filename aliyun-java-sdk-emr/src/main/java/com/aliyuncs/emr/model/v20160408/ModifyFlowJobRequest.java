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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyFlowJobRequest extends RpcAcsRequest<ModifyFlowJobResponse> {
	
	public ModifyFlowJobRequest() {
		super("Emr", "2016-04-08", "ModifyFlowJob");
	}

	private String runConf;

	private String envConf;

	private String description;

	private String clusterId;

	private String params;

	private String paramConf;

	private List<ResourceList> resourceLists;

	private String failAct;

	private String customVariables;

	private String mode;

	private Long retryInterval;

	private String monitorConf;

	private String name;

	private String id;

	private Integer maxRetry;

	private String alertConf;

	private String projectId;

	public String getRunConf() {
		return this.runConf;
	}

	public void setRunConf(String runConf) {
		this.runConf = runConf;
		if(runConf != null){
			putQueryParameter("RunConf", runConf);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getCustomVariables() {
		return this.customVariables;
	}

	public void setCustomVariables(String customVariables) {
		this.customVariables = customVariables;
		if(customVariables != null){
			putQueryParameter("CustomVariables", customVariables);
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

	public Long getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Long retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Integer getMaxRetry() {
		return this.maxRetry;
	}

	public void setMaxRetry(Integer maxRetry) {
		this.maxRetry = maxRetry;
		if(maxRetry != null){
			putQueryParameter("MaxRetry", maxRetry.toString());
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
	public Class<ModifyFlowJobResponse> getResponseClass() {
		return ModifyFlowJobResponse.class;
	}

}
