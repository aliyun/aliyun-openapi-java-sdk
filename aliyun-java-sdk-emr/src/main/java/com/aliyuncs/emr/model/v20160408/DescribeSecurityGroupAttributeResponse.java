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
import com.aliyuncs.emr.transform.v20160408.DescribeSecurityGroupAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityGroupAttributeResponse extends AcsResponse {

	private String requestId;

	private List<SecurityGroup> availableGroupList;

	private List<SecurityGroupAttribute> securityGroupAttributeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecurityGroup> getAvailableGroupList() {
		return this.availableGroupList;
	}

	public void setAvailableGroupList(List<SecurityGroup> availableGroupList) {
		this.availableGroupList = availableGroupList;
	}

	public List<SecurityGroupAttribute> getSecurityGroupAttributeList() {
		return this.securityGroupAttributeList;
	}

	public void setSecurityGroupAttributeList(List<SecurityGroupAttribute> securityGroupAttributeList) {
		this.securityGroupAttributeList = securityGroupAttributeList;
	}

	public static class SecurityGroup {

		private String securityGroupId;

		private String description;

		private String securityGroupName;

		private String vpcId;

		private String creationTime;

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

	public static class SecurityGroupAttribute {

		private String bizType;

		private String bizContent;

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBizContent() {
			return this.bizContent;
		}

		public void setBizContent(String bizContent) {
			this.bizContent = bizContent;
		}
	}

	@Override
	public DescribeSecurityGroupAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityGroupAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
