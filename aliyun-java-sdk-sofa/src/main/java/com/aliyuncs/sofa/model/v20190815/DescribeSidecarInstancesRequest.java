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
public class DescribeSidecarInstancesRequest extends RpcAcsRequest<DescribeSidecarInstancesResponse> {
	   

	private String clusterName;

	private String workspaceName;

	private String type;

	private String appServiceName;

	private String sidecarVersion;

	private Long pageSize;

	private Long pageIndex;

	private String sortOrder;

	private String sidecarStatus;

	private String sidecarType;

	private String podIp;

	private String namespace;

	private String podStatus;

	private String sortField;
	public DescribeSidecarInstancesRequest() {
		super("SOFA", "2019-08-15", "DescribeSidecarInstances", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getAppServiceName() {
		return this.appServiceName;
	}

	public void setAppServiceName(String appServiceName) {
		this.appServiceName = appServiceName;
		if(appServiceName != null){
			putBodyParameter("AppServiceName", appServiceName);
		}
	}

	public String getSidecarVersion() {
		return this.sidecarVersion;
	}

	public void setSidecarVersion(String sidecarVersion) {
		this.sidecarVersion = sidecarVersion;
		if(sidecarVersion != null){
			putBodyParameter("SidecarVersion", sidecarVersion);
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

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putBodyParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putBodyParameter("SortOrder", sortOrder);
		}
	}

	public String getSidecarStatus() {
		return this.sidecarStatus;
	}

	public void setSidecarStatus(String sidecarStatus) {
		this.sidecarStatus = sidecarStatus;
		if(sidecarStatus != null){
			putBodyParameter("SidecarStatus", sidecarStatus);
		}
	}

	public String getSidecarType() {
		return this.sidecarType;
	}

	public void setSidecarType(String sidecarType) {
		this.sidecarType = sidecarType;
		if(sidecarType != null){
			putBodyParameter("SidecarType", sidecarType);
		}
	}

	public String getPodIp() {
		return this.podIp;
	}

	public void setPodIp(String podIp) {
		this.podIp = podIp;
		if(podIp != null){
			putBodyParameter("PodIp", podIp);
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

	public String getPodStatus() {
		return this.podStatus;
	}

	public void setPodStatus(String podStatus) {
		this.podStatus = podStatus;
		if(podStatus != null){
			putBodyParameter("PodStatus", podStatus);
		}
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putBodyParameter("SortField", sortField);
		}
	}

	@Override
	public Class<DescribeSidecarInstancesResponse> getResponseClass() {
		return DescribeSidecarInstancesResponse.class;
	}

}
