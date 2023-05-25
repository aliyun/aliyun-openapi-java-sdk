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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RevokeSecurityGroupRequest extends RpcAcsRequest<RevokeSecurityGroupResponse> {
	   

	private String nicType;

	private Long resourceOwnerId;

	private String sourcePrefixListId;

	private String sourcePortRange;

	private String clientToken;

	private String securityGroupId;

	private String description;

	private Long sourceGroupOwnerId;

	private String sourceGroupOwnerAccount;

	private List<Permissions> permissions;

	private String policy;

	private String ipv6SourceCidrIp;

	private String ipv6DestCidrIp;

	private String portRange;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private String sourceCidrIp;

	private Long ownerId;

	private String priority;

	private String destCidrIp;

	private String sourceGroupId;

	private List<String> securityGroupRuleIds;
	public RevokeSecurityGroupRequest() {
		super("Ecs", "2014-05-26", "RevokeSecurityGroup", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNicType() {
		return this.nicType;
	}

	public void setNicType(String nicType) {
		this.nicType = nicType;
		if(nicType != null){
			putQueryParameter("NicType", nicType);
		}
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

	public String getSourcePrefixListId() {
		return this.sourcePrefixListId;
	}

	public void setSourcePrefixListId(String sourcePrefixListId) {
		this.sourcePrefixListId = sourcePrefixListId;
		if(sourcePrefixListId != null){
			putQueryParameter("SourcePrefixListId", sourcePrefixListId);
		}
	}

	public String getSourcePortRange() {
		return this.sourcePortRange;
	}

	public void setSourcePortRange(String sourcePortRange) {
		this.sourcePortRange = sourcePortRange;
		if(sourcePortRange != null){
			putQueryParameter("SourcePortRange", sourcePortRange);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getSourceGroupOwnerId() {
		return this.sourceGroupOwnerId;
	}

	public void setSourceGroupOwnerId(Long sourceGroupOwnerId) {
		this.sourceGroupOwnerId = sourceGroupOwnerId;
		if(sourceGroupOwnerId != null){
			putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId.toString());
		}
	}

	public String getSourceGroupOwnerAccount() {
		return this.sourceGroupOwnerAccount;
	}

	public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
		this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
		if(sourceGroupOwnerAccount != null){
			putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
		}
	}

	public List<Permissions> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permissions> permissions) {
		this.permissions = permissions;	
		if (permissions != null) {
			for (int depth1 = 0; depth1 < permissions.size(); depth1++) {
				if (permissions.get(depth1) != null) {
					
						putQueryParameter("Permissions." + (depth1 + 1) + ".Policy" , permissions.get(depth1).getPolicy());
						putQueryParameter("Permissions." + (depth1 + 1) + ".Priority" , permissions.get(depth1).getPriority());
						putQueryParameter("Permissions." + (depth1 + 1) + ".IpProtocol" , permissions.get(depth1).getIpProtocol());
						putQueryParameter("Permissions." + (depth1 + 1) + ".SourceCidrIp" , permissions.get(depth1).getSourceCidrIp());
						putQueryParameter("Permissions." + (depth1 + 1) + ".Ipv6SourceCidrIp" , permissions.get(depth1).getIpv6SourceCidrIp());
						putQueryParameter("Permissions." + (depth1 + 1) + ".SourceGroupId" , permissions.get(depth1).getSourceGroupId());
						putQueryParameter("Permissions." + (depth1 + 1) + ".SourcePrefixListId" , permissions.get(depth1).getSourcePrefixListId());
						putQueryParameter("Permissions." + (depth1 + 1) + ".PortRange" , permissions.get(depth1).getPortRange());
						putQueryParameter("Permissions." + (depth1 + 1) + ".DestCidrIp" , permissions.get(depth1).getDestCidrIp());
						putQueryParameter("Permissions." + (depth1 + 1) + ".Ipv6DestCidrIp" , permissions.get(depth1).getIpv6DestCidrIp());
						putQueryParameter("Permissions." + (depth1 + 1) + ".SourcePortRange" , permissions.get(depth1).getSourcePortRange());
						putQueryParameter("Permissions." + (depth1 + 1) + ".SourceGroupOwnerAccount" , permissions.get(depth1).getSourceGroupOwnerAccount());
						putQueryParameter("Permissions." + (depth1 + 1) + ".SourceGroupOwnerId" , permissions.get(depth1).getSourceGroupOwnerId());
						putQueryParameter("Permissions." + (depth1 + 1) + ".NicType" , permissions.get(depth1).getNicType());
						putQueryParameter("Permissions." + (depth1 + 1) + ".Description" , permissions.get(depth1).getDescription());
				}
			}
		}	
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public String getIpv6SourceCidrIp() {
		return this.ipv6SourceCidrIp;
	}

	public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
		this.ipv6SourceCidrIp = ipv6SourceCidrIp;
		if(ipv6SourceCidrIp != null){
			putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
		}
	}

	public String getIpv6DestCidrIp() {
		return this.ipv6DestCidrIp;
	}

	public void setIpv6DestCidrIp(String ipv6DestCidrIp) {
		this.ipv6DestCidrIp = ipv6DestCidrIp;
		if(ipv6DestCidrIp != null){
			putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
		}
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		if(portRange != null){
			putQueryParameter("PortRange", portRange);
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
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

	public String getSourceCidrIp() {
		return this.sourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		this.sourceCidrIp = sourceCidrIp;
		if(sourceCidrIp != null){
			putQueryParameter("SourceCidrIp", sourceCidrIp);
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

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getDestCidrIp() {
		return this.destCidrIp;
	}

	public void setDestCidrIp(String destCidrIp) {
		this.destCidrIp = destCidrIp;
		if(destCidrIp != null){
			putQueryParameter("DestCidrIp", destCidrIp);
		}
	}

	public String getSourceGroupId() {
		return this.sourceGroupId;
	}

	public void setSourceGroupId(String sourceGroupId) {
		this.sourceGroupId = sourceGroupId;
		if(sourceGroupId != null){
			putQueryParameter("SourceGroupId", sourceGroupId);
		}
	}

	public List<String> getSecurityGroupRuleIds() {
		return this.securityGroupRuleIds;
	}

	public void setSecurityGroupRuleIds(List<String> securityGroupRuleIds) {
		this.securityGroupRuleIds = securityGroupRuleIds;	
		if (securityGroupRuleIds != null) {
			for (int i = 0; i < securityGroupRuleIds.size(); i++) {
				putQueryParameter("SecurityGroupRuleId." + (i + 1) , securityGroupRuleIds.get(i));
			}
		}	
	}

	public static class Permissions {

		private String policy;

		private String priority;

		private String ipProtocol;

		private String sourceCidrIp;

		private String ipv6SourceCidrIp;

		private String sourceGroupId;

		private String sourcePrefixListId;

		private String portRange;

		private String destCidrIp;

		private String ipv6DestCidrIp;

		private String sourcePortRange;

		private String sourceGroupOwnerAccount;

		private Long sourceGroupOwnerId;

		private String nicType;

		private String description;

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getIpv6SourceCidrIp() {
			return this.ipv6SourceCidrIp;
		}

		public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
			this.ipv6SourceCidrIp = ipv6SourceCidrIp;
		}

		public String getSourceGroupId() {
			return this.sourceGroupId;
		}

		public void setSourceGroupId(String sourceGroupId) {
			this.sourceGroupId = sourceGroupId;
		}

		public String getSourcePrefixListId() {
			return this.sourcePrefixListId;
		}

		public void setSourcePrefixListId(String sourcePrefixListId) {
			this.sourcePrefixListId = sourcePrefixListId;
		}

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getDestCidrIp() {
			return this.destCidrIp;
		}

		public void setDestCidrIp(String destCidrIp) {
			this.destCidrIp = destCidrIp;
		}

		public String getIpv6DestCidrIp() {
			return this.ipv6DestCidrIp;
		}

		public void setIpv6DestCidrIp(String ipv6DestCidrIp) {
			this.ipv6DestCidrIp = ipv6DestCidrIp;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public String getSourceGroupOwnerAccount() {
			return this.sourceGroupOwnerAccount;
		}

		public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
			this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
		}

		public Long getSourceGroupOwnerId() {
			return this.sourceGroupOwnerId;
		}

		public void setSourceGroupOwnerId(Long sourceGroupOwnerId) {
			this.sourceGroupOwnerId = sourceGroupOwnerId;
		}

		public String getNicType() {
			return this.nicType;
		}

		public void setNicType(String nicType) {
			this.nicType = nicType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<RevokeSecurityGroupResponse> getResponseClass() {
		return RevokeSecurityGroupResponse.class;
	}

}
