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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigureSecurityGroupPermissionsRequest extends RpcAcsRequest<ConfigureSecurityGroupPermissionsResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String securityGroupId;

	private List<AuthorizePermission> authorizePermissions;

	private String resourceOwnerAccount;

	private List<RevokePermission> revokePermissions;

	private String ownerAccount;

	private Long ownerId;
	public ConfigureSecurityGroupPermissionsRequest() {
		super("Ecs", "2016-03-14", "ConfigureSecurityGroupPermissions", "ecs");
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public List<AuthorizePermission> getAuthorizePermissions() {
		return this.authorizePermissions;
	}

	public void setAuthorizePermissions(List<AuthorizePermission> authorizePermissions) {
		this.authorizePermissions = authorizePermissions;	
		if (authorizePermissions != null) {
			for (int depth1 = 0; depth1 < authorizePermissions.size(); depth1++) {
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".SourceGroupId" , authorizePermissions.get(depth1).getSourceGroupId());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".DestPrefixListId" , authorizePermissions.get(depth1).getDestPrefixListId());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".SourceCidrIp" , authorizePermissions.get(depth1).getSourceCidrIp());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".Ipv6DestCidrIp" , authorizePermissions.get(depth1).getIpv6DestCidrIp());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".Ipv6SourceCidrIp" , authorizePermissions.get(depth1).getIpv6SourceCidrIp());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".DestGroupId" , authorizePermissions.get(depth1).getDestGroupId());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".IpProtocol" , authorizePermissions.get(depth1).getIpProtocol());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".DestCidrIp" , authorizePermissions.get(depth1).getDestCidrIp());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".Priority" , authorizePermissions.get(depth1).getPriority());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".GressFlow" , authorizePermissions.get(depth1).getGressFlow());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".Direction" , authorizePermissions.get(depth1).getDirection());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".GroupOwnerAccount" , authorizePermissions.get(depth1).getGroupOwnerAccount());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".GroupOwnerId" , authorizePermissions.get(depth1).getGroupOwnerId());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".NicType" , authorizePermissions.get(depth1).getNicType());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".Policy" , authorizePermissions.get(depth1).getPolicy());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".PortRange" , authorizePermissions.get(depth1).getPortRange());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".Description" , authorizePermissions.get(depth1).getDescription());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".SourcePrefixListId" , authorizePermissions.get(depth1).getSourcePrefixListId());
				putQueryParameter("AuthorizePermission." + (depth1 + 1) + ".SourcePortRange" , authorizePermissions.get(depth1).getSourcePortRange());
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

	public List<RevokePermission> getRevokePermissions() {
		return this.revokePermissions;
	}

	public void setRevokePermissions(List<RevokePermission> revokePermissions) {
		this.revokePermissions = revokePermissions;	
		if (revokePermissions != null) {
			for (int depth1 = 0; depth1 < revokePermissions.size(); depth1++) {
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".SourceGroupId" , revokePermissions.get(depth1).getSourceGroupId());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".DestPrefixListId" , revokePermissions.get(depth1).getDestPrefixListId());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".SourceCidrIp" , revokePermissions.get(depth1).getSourceCidrIp());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".Ipv6DestCidrIp" , revokePermissions.get(depth1).getIpv6DestCidrIp());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".Ipv6SourceCidrIp" , revokePermissions.get(depth1).getIpv6SourceCidrIp());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".DestGroupId" , revokePermissions.get(depth1).getDestGroupId());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".IpProtocol" , revokePermissions.get(depth1).getIpProtocol());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".DestCidrIp" , revokePermissions.get(depth1).getDestCidrIp());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".Priority" , revokePermissions.get(depth1).getPriority());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".GressFlow" , revokePermissions.get(depth1).getGressFlow());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".Direction" , revokePermissions.get(depth1).getDirection());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".GroupOwnerAccount" , revokePermissions.get(depth1).getGroupOwnerAccount());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".GroupOwnerId" , revokePermissions.get(depth1).getGroupOwnerId());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".NicType" , revokePermissions.get(depth1).getNicType());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".Policy" , revokePermissions.get(depth1).getPolicy());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".PortRange" , revokePermissions.get(depth1).getPortRange());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".Description" , revokePermissions.get(depth1).getDescription());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".SourcePrefixListId" , revokePermissions.get(depth1).getSourcePrefixListId());
				putQueryParameter("RevokePermission." + (depth1 + 1) + ".SourcePortRange" , revokePermissions.get(depth1).getSourcePortRange());
			}
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

	public static class AuthorizePermission {

		private String sourceGroupId;

		private String destPrefixListId;

		private String sourceCidrIp;

		private String ipv6DestCidrIp;

		private String ipv6SourceCidrIp;

		private String destGroupId;

		private String ipProtocol;

		private String destCidrIp;

		private String priority;

		private String gressFlow;

		private String direction;

		private String groupOwnerAccount;

		private Long groupOwnerId;

		private String nicType;

		private String policy;

		private String portRange;

		private String description;

		private String sourcePrefixListId;

		private String sourcePortRange;

		public String getSourceGroupId() {
			return this.sourceGroupId;
		}

		public void setSourceGroupId(String sourceGroupId) {
			this.sourceGroupId = sourceGroupId;
		}

		public String getDestPrefixListId() {
			return this.destPrefixListId;
		}

		public void setDestPrefixListId(String destPrefixListId) {
			this.destPrefixListId = destPrefixListId;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getIpv6DestCidrIp() {
			return this.ipv6DestCidrIp;
		}

		public void setIpv6DestCidrIp(String ipv6DestCidrIp) {
			this.ipv6DestCidrIp = ipv6DestCidrIp;
		}

		public String getIpv6SourceCidrIp() {
			return this.ipv6SourceCidrIp;
		}

		public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
			this.ipv6SourceCidrIp = ipv6SourceCidrIp;
		}

		public String getDestGroupId() {
			return this.destGroupId;
		}

		public void setDestGroupId(String destGroupId) {
			this.destGroupId = destGroupId;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDestCidrIp() {
			return this.destCidrIp;
		}

		public void setDestCidrIp(String destCidrIp) {
			this.destCidrIp = destCidrIp;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getGressFlow() {
			return this.gressFlow;
		}

		public void setGressFlow(String gressFlow) {
			this.gressFlow = gressFlow;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getGroupOwnerAccount() {
			return this.groupOwnerAccount;
		}

		public void setGroupOwnerAccount(String groupOwnerAccount) {
			this.groupOwnerAccount = groupOwnerAccount;
		}

		public Long getGroupOwnerId() {
			return this.groupOwnerId;
		}

		public void setGroupOwnerId(Long groupOwnerId) {
			this.groupOwnerId = groupOwnerId;
		}

		public String getNicType() {
			return this.nicType;
		}

		public void setNicType(String nicType) {
			this.nicType = nicType;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

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

		public String getSourcePrefixListId() {
			return this.sourcePrefixListId;
		}

		public void setSourcePrefixListId(String sourcePrefixListId) {
			this.sourcePrefixListId = sourcePrefixListId;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}
	}

	public static class RevokePermission {

		private String sourceGroupId;

		private String destPrefixListId;

		private String sourceCidrIp;

		private String ipv6DestCidrIp;

		private String ipv6SourceCidrIp;

		private String destGroupId;

		private String ipProtocol;

		private String destCidrIp;

		private String priority;

		private String gressFlow;

		private String direction;

		private String groupOwnerAccount;

		private Long groupOwnerId;

		private String nicType;

		private String policy;

		private String portRange;

		private String description;

		private String sourcePrefixListId;

		private String sourcePortRange;

		public String getSourceGroupId() {
			return this.sourceGroupId;
		}

		public void setSourceGroupId(String sourceGroupId) {
			this.sourceGroupId = sourceGroupId;
		}

		public String getDestPrefixListId() {
			return this.destPrefixListId;
		}

		public void setDestPrefixListId(String destPrefixListId) {
			this.destPrefixListId = destPrefixListId;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getIpv6DestCidrIp() {
			return this.ipv6DestCidrIp;
		}

		public void setIpv6DestCidrIp(String ipv6DestCidrIp) {
			this.ipv6DestCidrIp = ipv6DestCidrIp;
		}

		public String getIpv6SourceCidrIp() {
			return this.ipv6SourceCidrIp;
		}

		public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
			this.ipv6SourceCidrIp = ipv6SourceCidrIp;
		}

		public String getDestGroupId() {
			return this.destGroupId;
		}

		public void setDestGroupId(String destGroupId) {
			this.destGroupId = destGroupId;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDestCidrIp() {
			return this.destCidrIp;
		}

		public void setDestCidrIp(String destCidrIp) {
			this.destCidrIp = destCidrIp;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getGressFlow() {
			return this.gressFlow;
		}

		public void setGressFlow(String gressFlow) {
			this.gressFlow = gressFlow;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getGroupOwnerAccount() {
			return this.groupOwnerAccount;
		}

		public void setGroupOwnerAccount(String groupOwnerAccount) {
			this.groupOwnerAccount = groupOwnerAccount;
		}

		public Long getGroupOwnerId() {
			return this.groupOwnerId;
		}

		public void setGroupOwnerId(Long groupOwnerId) {
			this.groupOwnerId = groupOwnerId;
		}

		public String getNicType() {
			return this.nicType;
		}

		public void setNicType(String nicType) {
			this.nicType = nicType;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

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

		public String getSourcePrefixListId() {
			return this.sourcePrefixListId;
		}

		public void setSourcePrefixListId(String sourcePrefixListId) {
			this.sourcePrefixListId = sourcePrefixListId;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}
	}

	@Override
	public Class<ConfigureSecurityGroupPermissionsResponse> getResponseClass() {
		return ConfigureSecurityGroupPermissionsResponse.class;
	}

}
