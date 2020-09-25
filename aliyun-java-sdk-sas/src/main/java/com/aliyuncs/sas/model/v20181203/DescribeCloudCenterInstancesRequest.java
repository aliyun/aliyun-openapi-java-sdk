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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudCenterInstancesRequest extends RpcAcsRequest<DescribeCloudCenterInstancesResponse> {
	   

	private String criteria;

	private Integer importance;

	private Boolean noPage;

	private Integer pageSize;

	private String logicalExp;

	private Integer currentPage;

	private String machineTypes;
	public DescribeCloudCenterInstancesRequest() {
		super("Sas", "2018-12-03", "DescribeCloudCenterInstances", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
		if(criteria != null){
			putQueryParameter("Criteria", criteria);
		}
	}

	public Integer getImportance() {
		return this.importance;
	}

	public void setImportance(Integer importance) {
		this.importance = importance;
		if(importance != null){
			putQueryParameter("Importance", importance.toString());
		}
	}

	public Boolean getNoPage() {
		return this.noPage;
	}

	public void setNoPage(Boolean noPage) {
		this.noPage = noPage;
		if(noPage != null){
			putQueryParameter("NoPage", noPage.toString());
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

	public String getLogicalExp() {
		return this.logicalExp;
	}

	public void setLogicalExp(String logicalExp) {
		this.logicalExp = logicalExp;
		if(logicalExp != null){
			putQueryParameter("LogicalExp", logicalExp);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getMachineTypes() {
		return this.machineTypes;
	}

	public void setMachineTypes(String machineTypes) {
		this.machineTypes = machineTypes;
		if(machineTypes != null){
			putQueryParameter("MachineTypes", machineTypes);
		}
	}

	@Override
	public Class<DescribeCloudCenterInstancesResponse> getResponseClass() {
		return DescribeCloudCenterInstancesResponse.class;
	}

}
