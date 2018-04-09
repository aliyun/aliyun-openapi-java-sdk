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

/**
 * @author auto create
 * @version 
 */
public class ModifyFlowJobRequest extends RpcAcsRequest<ModifyFlowJobResponse> {
	
	public ModifyFlowJobRequest() {
		super("Emr", "2016-04-08", "ModifyFlowJob");
	}

	private Long resourceOwnerId;

	private String runConf;

	private String envConf;

	private String description;

	private String params;

	private String paramConf;

	private String failAct;

	private String mode;

	private Long retryInterval;

	private String name;

	private String id;

	private Integer maxRetry;

	private String projectId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Long getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Long retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
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

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<ModifyFlowJobResponse> getResponseClass() {
		return ModifyFlowJobResponse.class;
	}

}
