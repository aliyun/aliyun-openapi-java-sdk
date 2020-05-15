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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTriggerRequest extends RpcAcsRequest<CreateTriggerResponse> {
	   

	private Integer production;

	private String source;

	private String functionIds;

	private String projectId;

	private Integer sandbox;

	private String fileIds;

	private Integer invocationMode;

	private String namespace;
	public CreateTriggerRequest() {
		super("iovcc", "2018-05-01", "CreateTrigger", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getProduction() {
		return this.production;
	}

	public void setProduction(Integer production) {
		this.production = production;
		if(production != null){
			putQueryParameter("Production", production.toString());
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getFunctionIds() {
		return this.functionIds;
	}

	public void setFunctionIds(String functionIds) {
		this.functionIds = functionIds;
		if(functionIds != null){
			putQueryParameter("FunctionIds", functionIds);
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

	public Integer getSandbox() {
		return this.sandbox;
	}

	public void setSandbox(Integer sandbox) {
		this.sandbox = sandbox;
		if(sandbox != null){
			putQueryParameter("Sandbox", sandbox.toString());
		}
	}

	public String getFileIds() {
		return this.fileIds;
	}

	public void setFileIds(String fileIds) {
		this.fileIds = fileIds;
		if(fileIds != null){
			putQueryParameter("FileIds", fileIds);
		}
	}

	public Integer getInvocationMode() {
		return this.invocationMode;
	}

	public void setInvocationMode(Integer invocationMode) {
		this.invocationMode = invocationMode;
		if(invocationMode != null){
			putQueryParameter("InvocationMode", invocationMode.toString());
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<CreateTriggerResponse> getResponseClass() {
		return CreateTriggerResponse.class;
	}

}
