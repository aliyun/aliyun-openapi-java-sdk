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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCSecurityGroupPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCSecurityGroupPermissionResponse extends AcsResponse {

	private String requestId;

	private String securityGroupId;

	private String regionId;

	private String vpcId;

	private String innerAccessPolicy;

	private List<SecurityGroupPermissionsItem> securityGroupPermissions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
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

	public List<SecurityGroupPermissionsItem> getSecurityGroupPermissions() {
		return this.securityGroupPermissions;
	}

	public void setSecurityGroupPermissions(List<SecurityGroupPermissionsItem> securityGroupPermissions) {
		this.securityGroupPermissions = securityGroupPermissions;
	}

	public static class SecurityGroupPermissionsItem {

		private String securityGroupRuleId;

		private String direction;

		private String policy;

		private String priority;

		private String ipProtocol;

		private String sourceCidrIp;

		private String portRange;

		private String destCidrIp;

		private String sourcePortRange;

		private String createTime;

		public String getSecurityGroupRuleId() {
			return this.securityGroupRuleId;
		}

		public void setSecurityGroupRuleId(String securityGroupRuleId) {
			this.securityGroupRuleId = securityGroupRuleId;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

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

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeRCSecurityGroupPermissionResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCSecurityGroupPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
