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

package com.aliyuncs.eas.model.v20210701;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListServiceInstancesRequest extends RoaAcsRequest<ListServiceInstancesResponse> {
	   

	private String instanceStatus;

	private String role;

	private String hostIP;

	private String clusterId;

	private String sort;

	private String resourceType;

	private Integer pageNumber;

	private String filter;

	private String instanceName;

	private Integer pageSize;

	private String instanceType;

	private String serviceName;

	private Boolean isSpot;

	private String instanceIP;

	private String order;
	public ListServiceInstancesRequest() {
		super("eas", "2021-07-01", "ListServiceInstances", "eas");
		setUriPattern("/api/v2/services/[ClusterId]/[ServiceName]/instances");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}

	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
		if(instanceStatus != null){
			putQueryParameter("InstanceStatus", instanceStatus);
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getHostIP() {
		return this.hostIP;
	}

	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
		if(hostIP != null){
			putQueryParameter("HostIP", hostIP);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putQueryParameter("Filter", filter);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putPathParameter("ServiceName", serviceName);
		}
	}

	public Boolean getIsSpot() {
		return this.isSpot;
	}

	public void setIsSpot(Boolean isSpot) {
		this.isSpot = isSpot;
		if(isSpot != null){
			putQueryParameter("IsSpot", isSpot.toString());
		}
	}

	public String getInstanceIP() {
		return this.instanceIP;
	}

	public void setInstanceIP(String instanceIP) {
		this.instanceIP = instanceIP;
		if(instanceIP != null){
			putQueryParameter("InstanceIP", instanceIP);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<ListServiceInstancesResponse> getResponseClass() {
		return ListServiceInstancesResponse.class;
	}

}
