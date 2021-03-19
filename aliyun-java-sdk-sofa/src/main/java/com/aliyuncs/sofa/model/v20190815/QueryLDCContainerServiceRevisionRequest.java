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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLDCContainerServiceRevisionRequest extends RpcAcsRequest<QueryLDCContainerServiceRevisionResponse> {
	   

	private Long pageNumber;

	private String workspaceGroup;

	private Long pageSize;

	private List<String> metadataStatusRepeatLists;

	private String name;

	private String namespace;

	private List<String> deploymentStatusRepeatLists;
	public QueryLDCContainerServiceRevisionRequest() {
		super("SOFA", "2019-08-15", "QueryLDCContainerServiceRevision", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getWorkspaceGroup() {
		return this.workspaceGroup;
	}

	public void setWorkspaceGroup(String workspaceGroup) {
		this.workspaceGroup = workspaceGroup;
		if(workspaceGroup != null){
			putBodyParameter("WorkspaceGroup", workspaceGroup);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getMetadataStatusRepeatLists() {
		return this.metadataStatusRepeatLists;
	}

	public void setMetadataStatusRepeatLists(List<String> metadataStatusRepeatLists) {
		this.metadataStatusRepeatLists = metadataStatusRepeatLists;	
		if (metadataStatusRepeatLists != null) {
			for (int i = 0; i < metadataStatusRepeatLists.size(); i++) {
				putBodyParameter("MetadataStatusRepeatList." + (i + 1) , metadataStatusRepeatLists.get(i));
			}
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public List<String> getDeploymentStatusRepeatLists() {
		return this.deploymentStatusRepeatLists;
	}

	public void setDeploymentStatusRepeatLists(List<String> deploymentStatusRepeatLists) {
		this.deploymentStatusRepeatLists = deploymentStatusRepeatLists;	
		if (deploymentStatusRepeatLists != null) {
			for (int i = 0; i < deploymentStatusRepeatLists.size(); i++) {
				putBodyParameter("DeploymentStatusRepeatList." + (i + 1) , deploymentStatusRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryLDCContainerServiceRevisionResponse> getResponseClass() {
		return QueryLDCContainerServiceRevisionResponse.class;
	}

}
