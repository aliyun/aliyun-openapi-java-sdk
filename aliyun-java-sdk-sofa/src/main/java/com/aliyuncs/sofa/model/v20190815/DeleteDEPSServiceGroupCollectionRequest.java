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
public class DeleteDEPSServiceGroupCollectionRequest extends RpcAcsRequest<DeleteDEPSServiceGroupCollectionResponse> {
	   

	private String workspace;

	private String arrangementId;

	private String processDefinitionId;
	public DeleteDEPSServiceGroupCollectionRequest() {
		super("SOFA", "2019-08-15", "DeleteDEPSServiceGroupCollection", "sofa");
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

	public String getArrangementId() {
		return this.arrangementId;
	}

	public void setArrangementId(String arrangementId) {
		this.arrangementId = arrangementId;
		if(arrangementId != null){
			putBodyParameter("ArrangementId", arrangementId);
		}
	}

	public String getProcessDefinitionId() {
		return this.processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
		if(processDefinitionId != null){
			putBodyParameter("ProcessDefinitionId", processDefinitionId);
		}
	}

	@Override
	public Class<DeleteDEPSServiceGroupCollectionResponse> getResponseClass() {
		return DeleteDEPSServiceGroupCollectionResponse.class;
	}

}
