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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPortRangeListRequest extends RpcAcsRequest<ModifyPortRangeListResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String description;

	private List<AddEntry> addEntrys;

	private String portRangeListId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String portRangeListName;

	private List<RemoveEntry> removeEntrys;
	public ModifyPortRangeListRequest() {
		super("Ecs", "2014-05-26", "ModifyPortRangeList", "ecs");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<AddEntry> getAddEntrys() {
		return this.addEntrys;
	}

	public void setAddEntrys(List<AddEntry> addEntrys) {
		this.addEntrys = addEntrys;	
		if (addEntrys != null) {
			for (int depth1 = 0; depth1 < addEntrys.size(); depth1++) {
				putQueryParameter("AddEntry." + (depth1 + 1) + ".PortRange" , addEntrys.get(depth1).getPortRange());
				putQueryParameter("AddEntry." + (depth1 + 1) + ".Description" , addEntrys.get(depth1).getDescription());
			}
		}	
	}

	public String getPortRangeListId() {
		return this.portRangeListId;
	}

	public void setPortRangeListId(String portRangeListId) {
		this.portRangeListId = portRangeListId;
		if(portRangeListId != null){
			putQueryParameter("PortRangeListId", portRangeListId);
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

	public String getPortRangeListName() {
		return this.portRangeListName;
	}

	public void setPortRangeListName(String portRangeListName) {
		this.portRangeListName = portRangeListName;
		if(portRangeListName != null){
			putQueryParameter("PortRangeListName", portRangeListName);
		}
	}

	public List<RemoveEntry> getRemoveEntrys() {
		return this.removeEntrys;
	}

	public void setRemoveEntrys(List<RemoveEntry> removeEntrys) {
		this.removeEntrys = removeEntrys;	
		if (removeEntrys != null) {
			for (int depth1 = 0; depth1 < removeEntrys.size(); depth1++) {
				putQueryParameter("RemoveEntry." + (depth1 + 1) + ".PortRange" , removeEntrys.get(depth1).getPortRange());
			}
		}	
	}

	public static class AddEntry {

		private String portRange;

		private String description;

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class RemoveEntry {

		private String portRange;

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}
	}

	@Override
	public Class<ModifyPortRangeListResponse> getResponseClass() {
		return ModifyPortRangeListResponse.class;
	}

}
