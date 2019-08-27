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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionPlanInstancesRequest extends RpcAcsRequest<ListExecutionPlanInstancesResponse> {
	
	public ListExecutionPlanInstancesRequest() {
		super("Emr", "2016-04-08", "ListExecutionPlanInstances", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean onlyLastInstance;

	private Long resourceOwnerId;

	private List<String> executionPlanIdLists;

	private List<String> statusLists;

	private Integer pageSize;

	private Boolean isDesc;

	private Integer pageNumber;

	public Boolean getOnlyLastInstance() {
		return this.onlyLastInstance;
	}

	public void setOnlyLastInstance(Boolean onlyLastInstance) {
		this.onlyLastInstance = onlyLastInstance;
		if(onlyLastInstance != null){
			putQueryParameter("OnlyLastInstance", onlyLastInstance.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getExecutionPlanIdLists() {
		return this.executionPlanIdLists;
	}

	public void setExecutionPlanIdLists(List<String> executionPlanIdLists) {
		this.executionPlanIdLists = executionPlanIdLists;	
		if (executionPlanIdLists != null) {
			for (int i = 0; i < executionPlanIdLists.size(); i++) {
				putQueryParameter("ExecutionPlanIdList." + (i + 1) , executionPlanIdLists.get(i));
			}
		}	
	}

	public List<String> getStatusLists() {
		return this.statusLists;
	}

	public void setStatusLists(List<String> statusLists) {
		this.statusLists = statusLists;	
		if (statusLists != null) {
			for (int i = 0; i < statusLists.size(); i++) {
				putQueryParameter("StatusList." + (i + 1) , statusLists.get(i));
			}
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

	public Boolean getIsDesc() {
		return this.isDesc;
	}

	public void setIsDesc(Boolean isDesc) {
		this.isDesc = isDesc;
		if(isDesc != null){
			putQueryParameter("IsDesc", isDesc.toString());
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

	@Override
	public Class<ListExecutionPlanInstancesResponse> getResponseClass() {
		return ListExecutionPlanInstancesResponse.class;
	}

}
