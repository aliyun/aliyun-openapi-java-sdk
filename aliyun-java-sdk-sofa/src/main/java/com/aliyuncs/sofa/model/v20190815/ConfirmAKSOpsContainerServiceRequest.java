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
public class ConfirmAKSOpsContainerServiceRequest extends RpcAcsRequest<ConfirmAKSOpsContainerServiceResponse> {
	   

	private String workspace;

	private String containerServiceName;

	private String opsContainerServiceId;

	private String revision;

	private String token;

	private String operatorName;
	public ConfirmAKSOpsContainerServiceRequest() {
		super("SOFA", "2019-08-15", "ConfirmAKSOpsContainerService", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getContainerServiceName() {
		return this.containerServiceName;
	}

	public void setContainerServiceName(String containerServiceName) {
		this.containerServiceName = containerServiceName;
		if(containerServiceName != null){
			putBodyParameter("ContainerServiceName", containerServiceName);
		}
	}

	public String getOpsContainerServiceId() {
		return this.opsContainerServiceId;
	}

	public void setOpsContainerServiceId(String opsContainerServiceId) {
		this.opsContainerServiceId = opsContainerServiceId;
		if(opsContainerServiceId != null){
			putBodyParameter("OpsContainerServiceId", opsContainerServiceId);
		}
	}

	public String getRevision() {
		return this.revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
		if(revision != null){
			putBodyParameter("Revision", revision);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	@Override
	public Class<ConfirmAKSOpsContainerServiceResponse> getResponseClass() {
		return ConfirmAKSOpsContainerServiceResponse.class;
	}

}
