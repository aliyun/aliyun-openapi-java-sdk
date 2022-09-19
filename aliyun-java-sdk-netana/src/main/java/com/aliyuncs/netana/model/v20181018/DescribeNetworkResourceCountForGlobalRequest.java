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

package com.aliyuncs.netana.model.v20181018;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.netana.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkResourceCountForGlobalRequest extends RpcAcsRequest<DescribeNetworkResourceCountForGlobalResponse> {
	   

	private Long resourceOwnerId;

	private String autoRenewal;

	private String resourceRegionId;

	private String resourceOwnerAccount;

	private String resourceType;

	private String expireDays;
	public DescribeNetworkResourceCountForGlobalRequest() {
		super("Netana", "2018-10-18", "DescribeNetworkResourceCountForGlobal", "netana");
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

	public String getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(String autoRenewal) {
		this.autoRenewal = autoRenewal;
		if(autoRenewal != null){
			putQueryParameter("AutoRenewal", autoRenewal);
		}
	}

	public String getResourceRegionId() {
		return this.resourceRegionId;
	}

	public void setResourceRegionId(String resourceRegionId) {
		this.resourceRegionId = resourceRegionId;
		if(resourceRegionId != null){
			putQueryParameter("ResourceRegionId", resourceRegionId);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getExpireDays() {
		return this.expireDays;
	}

	public void setExpireDays(String expireDays) {
		this.expireDays = expireDays;
		if(expireDays != null){
			putQueryParameter("ExpireDays", expireDays);
		}
	}

	@Override
	public Class<DescribeNetworkResourceCountForGlobalResponse> getResponseClass() {
		return DescribeNetworkResourceCountForGlobalResponse.class;
	}

}
