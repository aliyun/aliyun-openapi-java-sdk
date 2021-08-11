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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingConfigurationsRequest extends RpcAcsRequest<DescribeScalingConfigurationsResponse> {
	   

	private Long resourceOwnerId;

	private String scalingGroupId;

	private Integer pageNumber;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> scalingConfigurationNames;

	private List<String> scalingConfigurationIds;
	public DescribeScalingConfigurationsRequest() {
		super("Ess", "2014-08-28", "DescribeScalingConfigurations", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public List<String> getScalingConfigurationNames() {
		return this.scalingConfigurationNames;
	}

	public void setScalingConfigurationNames(List<String> scalingConfigurationNames) {
		this.scalingConfigurationNames = scalingConfigurationNames;	
		if (scalingConfigurationNames != null) {
			for (int i = 0; i < scalingConfigurationNames.size(); i++) {
				putQueryParameter("ScalingConfigurationName." + (i + 1) , scalingConfigurationNames.get(i));
			}
		}	
	}

	public List<String> getScalingConfigurationIds() {
		return this.scalingConfigurationIds;
	}

	public void setScalingConfigurationIds(List<String> scalingConfigurationIds) {
		this.scalingConfigurationIds = scalingConfigurationIds;	
		if (scalingConfigurationIds != null) {
			for (int i = 0; i < scalingConfigurationIds.size(); i++) {
				putQueryParameter("ScalingConfigurationId." + (i + 1) , scalingConfigurationIds.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeScalingConfigurationsResponse> getResponseClass() {
		return DescribeScalingConfigurationsResponse.class;
	}

}
