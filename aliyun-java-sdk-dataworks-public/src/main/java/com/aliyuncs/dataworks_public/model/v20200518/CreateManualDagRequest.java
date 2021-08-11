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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateManualDagRequest extends RpcAcsRequest<CreateManualDagResponse> {
	   

	private String projectEnv;

	private String projectName;

	private String dagParameters;

	private String includeNodeIds;

	private String bizDate;

	private String excludeNodeIds;

	private String flowName;

	private String nodeParameters;
	public CreateManualDagRequest() {
		super("dataworks-public", "2020-05-18", "CreateManualDag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectEnv() {
		return this.projectEnv;
	}

	public void setProjectEnv(String projectEnv) {
		this.projectEnv = projectEnv;
		if(projectEnv != null){
			putBodyParameter("ProjectEnv", projectEnv);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getDagParameters() {
		return this.dagParameters;
	}

	public void setDagParameters(String dagParameters) {
		this.dagParameters = dagParameters;
		if(dagParameters != null){
			putBodyParameter("DagParameters", dagParameters);
		}
	}

	public String getIncludeNodeIds() {
		return this.includeNodeIds;
	}

	public void setIncludeNodeIds(String includeNodeIds) {
		this.includeNodeIds = includeNodeIds;
		if(includeNodeIds != null){
			putBodyParameter("IncludeNodeIds", includeNodeIds);
		}
	}

	public String getBizDate() {
		return this.bizDate;
	}

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
		if(bizDate != null){
			putBodyParameter("BizDate", bizDate);
		}
	}

	public String getExcludeNodeIds() {
		return this.excludeNodeIds;
	}

	public void setExcludeNodeIds(String excludeNodeIds) {
		this.excludeNodeIds = excludeNodeIds;
		if(excludeNodeIds != null){
			putBodyParameter("ExcludeNodeIds", excludeNodeIds);
		}
	}

	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
		if(flowName != null){
			putBodyParameter("FlowName", flowName);
		}
	}

	public String getNodeParameters() {
		return this.nodeParameters;
	}

	public void setNodeParameters(String nodeParameters) {
		this.nodeParameters = nodeParameters;
		if(nodeParameters != null){
			putBodyParameter("NodeParameters", nodeParameters);
		}
	}

	@Override
	public Class<CreateManualDagResponse> getResponseClass() {
		return CreateManualDagResponse.class;
	}

}
