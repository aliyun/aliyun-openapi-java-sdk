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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeKmsAssociateResourcesRequest extends RpcAcsRequest<DescribeKmsAssociateResourcesResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String kmsResourceRegionId;

	private String kmsResourceUser;

	private String resourceGroupId;

	private String kmsResourceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String ownerId;

	private String kmsResourceType;
	public DescribeKmsAssociateResourcesRequest() {
		super("Rds", "2014-08-15", "DescribeKmsAssociateResources", "rds");
		setProtocol(ProtocolType.HTTPS);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getKmsResourceRegionId() {
		return this.kmsResourceRegionId;
	}

	public void setKmsResourceRegionId(String kmsResourceRegionId) {
		this.kmsResourceRegionId = kmsResourceRegionId;
		if(kmsResourceRegionId != null){
			putQueryParameter("KmsResourceRegionId", kmsResourceRegionId);
		}
	}

	public String getKmsResourceUser() {
		return this.kmsResourceUser;
	}

	public void setKmsResourceUser(String kmsResourceUser) {
		this.kmsResourceUser = kmsResourceUser;
		if(kmsResourceUser != null){
			putQueryParameter("KmsResourceUser", kmsResourceUser);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getKmsResourceId() {
		return this.kmsResourceId;
	}

	public void setKmsResourceId(String kmsResourceId) {
		this.kmsResourceId = kmsResourceId;
		if(kmsResourceId != null){
			putQueryParameter("KmsResourceId", kmsResourceId);
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

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getKmsResourceType() {
		return this.kmsResourceType;
	}

	public void setKmsResourceType(String kmsResourceType) {
		this.kmsResourceType = kmsResourceType;
		if(kmsResourceType != null){
			putQueryParameter("KmsResourceType", kmsResourceType);
		}
	}

	@Override
	public Class<DescribeKmsAssociateResourcesResponse> getResponseClass() {
		return DescribeKmsAssociateResourcesResponse.class;
	}

}
