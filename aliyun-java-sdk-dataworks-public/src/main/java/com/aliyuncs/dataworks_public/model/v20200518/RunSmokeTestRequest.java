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
public class RunSmokeTestRequest extends RpcAcsRequest<RunSmokeTestResponse> {
	   

	private String projectEnv;

	private String bizdate;

	private String name;

	private String nodeParams;

	private Long nodeId;
	public RunSmokeTestRequest() {
		super("dataworks-public", "2020-05-18", "RunSmokeTest");
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

	public String getBizdate() {
		return this.bizdate;
	}

	public void setBizdate(String bizdate) {
		this.bizdate = bizdate;
		if(bizdate != null){
			putBodyParameter("Bizdate", bizdate);
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

	public String getNodeParams() {
		return this.nodeParams;
	}

	public void setNodeParams(String nodeParams) {
		this.nodeParams = nodeParams;
		if(nodeParams != null){
			putBodyParameter("NodeParams", nodeParams);
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	@Override
	public Class<RunSmokeTestResponse> getResponseClass() {
		return RunSmokeTestResponse.class;
	}

}
