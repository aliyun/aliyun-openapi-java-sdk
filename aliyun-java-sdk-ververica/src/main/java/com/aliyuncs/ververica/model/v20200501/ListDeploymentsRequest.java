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

package com.aliyuncs.ververica.model.v20200501;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ververica.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDeploymentsRequest extends RoaAcsRequest<ListDeploymentsResponse> {
	   

	private String workspace;

	private String creator;

	private String modifier;

	private String priority;

	private Boolean batchMode;

	private String sortName;

	private String deploymentId;

	private String namespace;

	private String pageSize;

	private String name;

	private String pageIndex;

	private String sortOrder;

	private String state;

	private String status;
	public ListDeploymentsRequest() {
		super("ververica", "2020-05-01", "ListDeployments");
		setUriPattern("/pop/workspaces/[workspace]/api/v1/namespaces/[namespace]/deployments");
		setMethod(MethodType.GET);
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
			putPathParameter("workspace", workspace);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("creator", creator);
		}
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
		if(modifier != null){
			putQueryParameter("modifier", modifier);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("priority", priority);
		}
	}

	public Boolean getBatchMode() {
		return this.batchMode;
	}

	public void setBatchMode(Boolean batchMode) {
		this.batchMode = batchMode;
		if(batchMode != null){
			putQueryParameter("batchMode", batchMode.toString());
		}
	}

	public String getSortName() {
		return this.sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
		if(sortName != null){
			putQueryParameter("sortName", sortName);
		}
	}

	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		if(deploymentId != null){
			putQueryParameter("deploymentId", deploymentId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putPathParameter("namespace", namespace);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	public String getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("pageIndex", pageIndex);
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("sortOrder", sortOrder);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("state", state);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status);
		}
	}

	@Override
	public Class<ListDeploymentsResponse> getResponseClass() {
		return ListDeploymentsResponse.class;
	}

}
