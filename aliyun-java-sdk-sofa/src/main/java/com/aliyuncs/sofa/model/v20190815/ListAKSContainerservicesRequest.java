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
public class ListAKSContainerservicesRequest extends RpcAcsRequest<ListAKSContainerservicesResponse> {
	   

	private String workspace;

	private String clusterName;

	private List<String> metadataStatess;

	private String containerServiceName;

	private Boolean enableMesh;

	private String paginationQueryJsonStr;

	private String queryType;

	private List<String> deploymentStatess;

	private String namespace;
	public ListAKSContainerservicesRequest() {
		super("SOFA", "2019-08-15", "ListAKSContainerservices", "ApplySidecarCert");
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

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putBodyParameter("ClusterName", clusterName);
		}
	}

	public List<String> getMetadataStatess() {
		return this.metadataStatess;
	}

	public void setMetadataStatess(List<String> metadataStatess) {
		this.metadataStatess = metadataStatess;	
		if (metadataStatess != null) {
			for (int i = 0; i < metadataStatess.size(); i++) {
				putBodyParameter("MetadataStates." + (i + 1) , metadataStatess.get(i));
			}
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

	public Boolean getEnableMesh() {
		return this.enableMesh;
	}

	public void setEnableMesh(Boolean enableMesh) {
		this.enableMesh = enableMesh;
		if(enableMesh != null){
			putBodyParameter("EnableMesh", enableMesh.toString());
		}
	}

	public String getPaginationQueryJsonStr() {
		return this.paginationQueryJsonStr;
	}

	public void setPaginationQueryJsonStr(String paginationQueryJsonStr) {
		this.paginationQueryJsonStr = paginationQueryJsonStr;
		if(paginationQueryJsonStr != null){
			putBodyParameter("PaginationQueryJsonStr", paginationQueryJsonStr);
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putBodyParameter("QueryType", queryType);
		}
	}

	public List<String> getDeploymentStatess() {
		return this.deploymentStatess;
	}

	public void setDeploymentStatess(List<String> deploymentStatess) {
		this.deploymentStatess = deploymentStatess;	
		if (deploymentStatess != null) {
			for (int i = 0; i < deploymentStatess.size(); i++) {
				putBodyParameter("DeploymentStates." + (i + 1) , deploymentStatess.get(i));
			}
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

	@Override
	public Class<ListAKSContainerservicesResponse> getResponseClass() {
		return ListAKSContainerservicesResponse.class;
	}

}
