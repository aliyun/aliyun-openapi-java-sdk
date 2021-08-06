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
public class DetachAlbServerGroupsRequest extends RpcAcsRequest<DetachAlbServerGroupsResponse> {
	   

	private String clientToken;

	private String scalingGroupId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private List<AlbServerGroup> albServerGroups;

	private Boolean forceDetach;
	public DetachAlbServerGroupsRequest() {
		super("Ess", "2014-08-28", "DetachAlbServerGroups", "ess");
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

	public List<AlbServerGroup> getAlbServerGroups() {
		return this.albServerGroups;
	}

	public void setAlbServerGroups(List<AlbServerGroup> albServerGroups) {
		this.albServerGroups = albServerGroups;	
		if (albServerGroups != null) {
			for (int depth1 = 0; depth1 < albServerGroups.size(); depth1++) {
				putQueryParameter("AlbServerGroup." + (depth1 + 1) + ".AlbServerGroupId" , albServerGroups.get(depth1).getAlbServerGroupId());
				putQueryParameter("AlbServerGroup." + (depth1 + 1) + ".Port" , albServerGroups.get(depth1).getPort());
			}
		}	
	}

	public Boolean getForceDetach() {
		return this.forceDetach;
	}

	public void setForceDetach(Boolean forceDetach) {
		this.forceDetach = forceDetach;
		if(forceDetach != null){
			putQueryParameter("ForceDetach", forceDetach.toString());
		}
	}

	public static class AlbServerGroup {

		private String albServerGroupId;

		private Integer port;

		public String getAlbServerGroupId() {
			return this.albServerGroupId;
		}

		public void setAlbServerGroupId(String albServerGroupId) {
			this.albServerGroupId = albServerGroupId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}
	}

	@Override
	public Class<DetachAlbServerGroupsResponse> getResponseClass() {
		return DetachAlbServerGroupsResponse.class;
	}

}
