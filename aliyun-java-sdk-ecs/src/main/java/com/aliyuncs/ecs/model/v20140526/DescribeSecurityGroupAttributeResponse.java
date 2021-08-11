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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeSecurityGroupAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityGroupAttributeResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String securityGroupId;

	private String description;

	private String securityGroupName;

	private String vpcId;

	private String innerAccessPolicy;

	private List<Permission> permissions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getInnerAccessPolicy() {
		return this.innerAccessPolicy;
	}

	public void setInnerAccessPolicy(String innerAccessPolicy) {
		this.innerAccessPolicy = innerAccessPolicy;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public static class Permission {

		private String ipProtocol;

		private String portRange;

		private String sourcePortRange;

		private String sourceGroupId;

		private String sourceGroupName;

		private String sourceCidrIp;

		private String ipv6SourceCidrIp;

		private String sourcePrefixListId;

		private String sourcePrefixListName;

		private String policy;

		private String nicType;

		private String sourceGroupOwnerAccount;

		private String destGroupId;

		private String destGroupName;

		private String destCidrIp;

		private String ipv6DestCidrIp;

		private String destPrefixListId;

		private String destPrefixListName;

		private String destGroupOwnerAccount;

		private String priority;

		private String direction;

		private String description;

		private String createTime;

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public String getSourceGroupId() {
			return this.sourceGroupId;
		}

		public void setSourceGroupId(String sourceGroupId) {
			this.sourceGroupId = sourceGroupId;
		}

		public String getSourceGroupName() {
			return this.sourceGroupName;
		}

		public void setSourceGroupName(String sourceGroupName) {
			this.sourceGroupName = sourceGroupName;
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

		public String getSourcePrefixListId() {
			return this.sourcePrefixListId;
		}

		public void setSourcePrefixListId(String sourcePrefixListId) {
			this.sourcePrefixListId = sourcePrefixListId;
		}

		public String getSourcePrefixListName() {
			return this.sourcePrefixListName;
		}

		public void setSourcePrefixListName(String sourcePrefixListName) {
			this.sourcePrefixListName = sourcePrefixListName;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getNicType() {
			return this.nicType;
		}

		public void setNicType(String nicType) {
			this.nicType = nicType;
		}

		public String getSourceGroupOwnerAccount() {
			return this.sourceGroupOwnerAccount;
		}

		public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
			this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
		}

		public String getDestGroupId() {
			return this.destGroupId;
		}

		public void setDestGroupId(String destGroupId) {
			this.destGroupId = destGroupId;
		}

		public String getDestGroupName() {
			return this.destGroupName;
		}

		public void setDestGroupName(String destGroupName) {
			this.destGroupName = destGroupName;
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

		public String getDestPrefixListId() {
			return this.destPrefixListId;
		}

		public void setDestPrefixListId(String destPrefixListId) {
			this.destPrefixListId = destPrefixListId;
		}

		public String getDestPrefixListName() {
			return this.destPrefixListName;
		}

		public void setDestPrefixListName(String destPrefixListName) {
			this.destPrefixListName = destPrefixListName;
		}

		public String getDestGroupOwnerAccount() {
			return this.destGroupOwnerAccount;
		}

		public void setDestGroupOwnerAccount(String destGroupOwnerAccount) {
			this.destGroupOwnerAccount = destGroupOwnerAccount;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeSecurityGroupAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityGroupAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
