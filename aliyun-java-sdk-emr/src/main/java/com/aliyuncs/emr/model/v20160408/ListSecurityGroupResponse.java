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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListSecurityGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityGroupResponse extends AcsResponse {

	private String requestId;

	private List<SecurityGroup> securityGroupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecurityGroup> getSecurityGroupList() {
		return this.securityGroupList;
	}

	public void setSecurityGroupList(List<SecurityGroup> securityGroupList) {
		this.securityGroupList = securityGroupList;
	}

	public static class SecurityGroup {

		private String securityGroupId;

		private String description;

		private String securityGroupName;

		private String vpcId;

		private String creationTime;

		private String securityGroupType;

		private Integer availableInstanceAmount;

		private Integer ecsCount;

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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getSecurityGroupType() {
			return this.securityGroupType;
		}

		public void setSecurityGroupType(String securityGroupType) {
			this.securityGroupType = securityGroupType;
		}

		public Integer getAvailableInstanceAmount() {
			return this.availableInstanceAmount;
		}

		public void setAvailableInstanceAmount(Integer availableInstanceAmount) {
			this.availableInstanceAmount = availableInstanceAmount;
		}

		public Integer getEcsCount() {
			return this.ecsCount;
		}

		public void setEcsCount(Integer ecsCount) {
			this.ecsCount = ecsCount;
		}
	}

	@Override
	public ListSecurityGroupResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
