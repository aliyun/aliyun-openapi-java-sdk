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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InnerUnlinkNetworkInterfacesRequest extends RpcAcsRequest<InnerUnlinkNetworkInterfacesResponse> {
	
	public InnerUnlinkNetworkInterfacesRequest() {
		super("EcsInc", "2016-03-14", "InnerUnlinkNetworkInterfaces", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private List<String> srcNetworkInterfaceIds;

	private String destNetworkInterfaceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getSrcNetworkInterfaceIds() {
		return this.srcNetworkInterfaceIds;
	}

	public void setSrcNetworkInterfaceIds(List<String> srcNetworkInterfaceIds) {
		this.srcNetworkInterfaceIds = srcNetworkInterfaceIds;	
		if (srcNetworkInterfaceIds != null) {
			for (int i = 0; i < srcNetworkInterfaceIds.size(); i++) {
				putQueryParameter("SrcNetworkInterfaceId." + (i + 1) , srcNetworkInterfaceIds.get(i));
			}
		}	
	}

	public String getDestNetworkInterfaceId() {
		return this.destNetworkInterfaceId;
	}

	public void setDestNetworkInterfaceId(String destNetworkInterfaceId) {
		this.destNetworkInterfaceId = destNetworkInterfaceId;
		if(destNetworkInterfaceId != null){
			putQueryParameter("DestNetworkInterfaceId", destNetworkInterfaceId);
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

	@Override
	public Class<InnerUnlinkNetworkInterfacesResponse> getResponseClass() {
		return InnerUnlinkNetworkInterfacesResponse.class;
	}

}
