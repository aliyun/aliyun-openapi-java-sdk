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

package com.aliyuncs.smc.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicationJobsRequest extends RpcAcsRequest<DescribeReplicationJobsResponse> {
	   

	private Integer pageNumber;

	private List<String> jobIds;

	private Integer pageSize;

	private List<String> sourceIds;

	private String businessStatus;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String name;

	private String status;
	public DescribeReplicationJobsRequest() {
		super("smc", "2019-06-01", "DescribeReplicationJobs", "smc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getJobIds() {
		return this.jobIds;
	}

	public void setJobIds(List<String> jobIds) {
		this.jobIds = jobIds;	
		if (jobIds != null) {
			for (int i = 0; i < jobIds.size(); i++) {
				putQueryParameter("JobId." + (i + 1) , jobIds.get(i));
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

	public List<String> getSourceIds() {
		return this.sourceIds;
	}

	public void setSourceIds(List<String> sourceIds) {
		this.sourceIds = sourceIds;	
		if (sourceIds != null) {
			for (int i = 0; i < sourceIds.size(); i++) {
				putQueryParameter("SourceId." + (i + 1) , sourceIds.get(i));
			}
		}	
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
		if(businessStatus != null){
			putQueryParameter("BusinessStatus", businessStatus);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeReplicationJobsResponse> getResponseClass() {
		return DescribeReplicationJobsResponse.class;
	}

}
