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
public class ListAKSKubernetesResourcesRequest extends RpcAcsRequest<ListAKSKubernetesResourcesResponse> {
	   

	private String cluster;

	private String workspace;

	private Long pageNumber;

	private String path;

	private String labelSelector;

	private Long pageSize;

	private Boolean queryAll;

	private String name;
	public ListAKSKubernetesResourcesRequest() {
		super("SOFA", "2019-08-15", "ListAKSKubernetesResources", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putBodyParameter("Cluster", cluster);
		}
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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putBodyParameter("Path", path);
		}
	}

	public String getLabelSelector() {
		return this.labelSelector;
	}

	public void setLabelSelector(String labelSelector) {
		this.labelSelector = labelSelector;
		if(labelSelector != null){
			putBodyParameter("LabelSelector", labelSelector);
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

	public Boolean getQueryAll() {
		return this.queryAll;
	}

	public void setQueryAll(Boolean queryAll) {
		this.queryAll = queryAll;
		if(queryAll != null){
			putBodyParameter("QueryAll", queryAll.toString());
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

	@Override
	public Class<ListAKSKubernetesResourcesResponse> getResponseClass() {
		return ListAKSKubernetesResourcesResponse.class;
	}

}
