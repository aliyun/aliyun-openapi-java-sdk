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

/**
 * @author auto create
 * @version 
 */
public class DetachVServerGroupsRequest extends RpcAcsRequest<DetachVServerGroupsResponse> {
	   

	private String scalingGroupId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private Boolean forceDetach;

	private List<VServerGroup> vServerGroups;
	public DetachVServerGroupsRequest() {
		super("Ess", "2014-08-28", "DetachVServerGroups", "ess");
		setMethod(MethodType.POST);
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

	public Boolean getForceDetach() {
		return this.forceDetach;
	}

	public void setForceDetach(Boolean forceDetach) {
		this.forceDetach = forceDetach;
		if(forceDetach != null){
			putQueryParameter("ForceDetach", forceDetach.toString());
		}
	}

	public List<VServerGroup> getVServerGroups() {
		return this.vServerGroups;
	}

	public void setVServerGroups(List<VServerGroup> vServerGroups) {
		this.vServerGroups = vServerGroups;	
		if (vServerGroups != null) {
			for (int depth1 = 0; depth1 < vServerGroups.size(); depth1++) {
				putQueryParameter("VServerGroup." + (depth1 + 1) + ".LoadBalancerId" , vServerGroups.get(depth1).getLoadBalancerId());
				if (vServerGroups.get(depth1).getVServerGroupAttributes() != null) {
					for (int depth2 = 0; depth2 < vServerGroups.get(depth1).getVServerGroupAttributes().size(); depth2++) {
						putQueryParameter("VServerGroup." + (depth1 + 1) + ".VServerGroupAttribute." + (depth2 + 1) + ".VServerGroupId" , vServerGroups.get(depth1).getVServerGroupAttributes().get(depth2).getVServerGroupId());
						putQueryParameter("VServerGroup." + (depth1 + 1) + ".VServerGroupAttribute." + (depth2 + 1) + ".Port" , vServerGroups.get(depth1).getVServerGroupAttributes().get(depth2).getPort());
					}
				}
			}
		}	
	}

	public static class VServerGroup {

		private String loadBalancerId;

		private List<VServerGroupAttribute> vServerGroupAttributes;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public List<VServerGroupAttribute> getVServerGroupAttributes() {
			return this.vServerGroupAttributes;
		}

		public void setVServerGroupAttributes(List<VServerGroupAttribute> vServerGroupAttributes) {
			this.vServerGroupAttributes = vServerGroupAttributes;
		}

		public static class VServerGroupAttribute {

			private String vServerGroupId;

			private Integer port;

			public String getVServerGroupId() {
				return this.vServerGroupId;
			}

			public void setVServerGroupId(String vServerGroupId) {
				this.vServerGroupId = vServerGroupId;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}
	}

	@Override
	public Class<DetachVServerGroupsResponse> getResponseClass() {
		return DetachVServerGroupsResponse.class;
	}

}
