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
import com.aliyuncs.rds.transform.v20140815.DescribeRCSecurityGroupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCSecurityGroupListResponse extends AcsResponse {

	private String requestId;

	private List<RCSecurityGroup> rCSecurityGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RCSecurityGroup> getRCSecurityGroups() {
		return this.rCSecurityGroups;
	}

	public void setRCSecurityGroups(List<RCSecurityGroup> rCSecurityGroups) {
		this.rCSecurityGroups = rCSecurityGroups;
	}

	public static class RCSecurityGroup {

		private String securityGroupId;

		private String description;

		private String securityGroupType;

		private String vpcId;

		private String creationTime;

		private Integer instanceCount;

		private Integer availableInstanceAmount;

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

		public String getSecurityGroupType() {
			return this.securityGroupType;
		}

		public void setSecurityGroupType(String securityGroupType) {
			this.securityGroupType = securityGroupType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getAvailableInstanceAmount() {
			return this.availableInstanceAmount;
		}

		public void setAvailableInstanceAmount(Integer availableInstanceAmount) {
			this.availableInstanceAmount = availableInstanceAmount;
		}
	}

	@Override
	public DescribeRCSecurityGroupListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCSecurityGroupListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
