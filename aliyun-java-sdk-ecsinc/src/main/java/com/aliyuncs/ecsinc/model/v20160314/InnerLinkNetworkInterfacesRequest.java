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
public class InnerLinkNetworkInterfacesRequest extends RpcAcsRequest<InnerLinkNetworkInterfacesResponse> {
	
	public InnerLinkNetworkInterfacesRequest() {
		super("EcsInc", "2016-03-14", "InnerLinkNetworkInterfaces", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String destNetworkInterfaceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<SrcNetworkInterface> srcNetworkInterfaces;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public List<SrcNetworkInterface> getSrcNetworkInterfaces() {
		return this.srcNetworkInterfaces;
	}

	public void setSrcNetworkInterfaces(List<SrcNetworkInterface> srcNetworkInterfaces) {
		this.srcNetworkInterfaces = srcNetworkInterfaces;	
		if (srcNetworkInterfaces != null) {
			for (int depth1 = 0; depth1 < srcNetworkInterfaces.size(); depth1++) {
				putQueryParameter("SrcNetworkInterface." + (depth1 + 1) + ".VlanId" , srcNetworkInterfaces.get(depth1).getVlanId());
				putQueryParameter("SrcNetworkInterface." + (depth1 + 1) + ".NetworkInterfaceId" , srcNetworkInterfaces.get(depth1).getNetworkInterfaceId());
			}
		}	
	}

	public static class SrcNetworkInterface {

		private Integer vlanId;

		private String networkInterfaceId;

		public Integer getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(Integer vlanId) {
			this.vlanId = vlanId;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}
	}

	@Override
	public Class<InnerLinkNetworkInterfacesResponse> getResponseClass() {
		return InnerLinkNetworkInterfacesResponse.class;
	}

}
