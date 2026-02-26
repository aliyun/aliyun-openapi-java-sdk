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
public class AttachServerGroupsRequest extends RpcAcsRequest<AttachServerGroupsResponse> {
	   

	private String clientToken;

	private String scalingGroupId;

	private Boolean forceAttach;

	private List<ServerGroup> serverGroups;

	private String resourceOwnerAccount;

	private Long ownerId;
	public AttachServerGroupsRequest() {
		super("Ess", "2014-08-28", "AttachServerGroups", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public Boolean getForceAttach() {
		return this.forceAttach;
	}

	public void setForceAttach(Boolean forceAttach) {
		this.forceAttach = forceAttach;
		if(forceAttach != null){
			putQueryParameter("ForceAttach", forceAttach.toString());
		}
	}

	public List<ServerGroup> getServerGroups() {
		return this.serverGroups;
	}

	public void setServerGroups(List<ServerGroup> serverGroups) {
		this.serverGroups = serverGroups;	
		if (serverGroups != null) {
			for (int depth1 = 0; depth1 < serverGroups.size(); depth1++) {
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".ServerGroupId" , serverGroups.get(depth1).getServerGroupId());
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".Port" , serverGroups.get(depth1).getPort());
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".Weight" , serverGroups.get(depth1).getWeight());
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".Type" , serverGroups.get(depth1).getType());
			}
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

	public static class ServerGroup {

		private String serverGroupId;

		private Integer port;

		private Integer weight;

		private String type;

		public String getServerGroupId() {
			return this.serverGroupId;
		}

		public void setServerGroupId(String serverGroupId) {
			this.serverGroupId = serverGroupId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<AttachServerGroupsResponse> getResponseClass() {
		return AttachServerGroupsResponse.class;
	}

}
