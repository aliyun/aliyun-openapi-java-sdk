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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribePolicyGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyGroupsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DescribePolicyGroup> describePolicyGroups;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DescribePolicyGroup> getDescribePolicyGroups() {
		return this.describePolicyGroups;
	}

	public void setDescribePolicyGroups(List<DescribePolicyGroup> describePolicyGroups) {
		this.describePolicyGroups = describePolicyGroups;
	}

	public static class DescribePolicyGroup {

		private String policyGroupId;

		private String policyGroupType;

		private String clipboard;

		private String localDrive;

		private String usbRedirect;

		private String visualQuality;

		private String watermark;

		private String name;

		private String watermarkType;

		private String watermarkCustomText;

		private String watermarkTransparency;

		private String policyStatus;

		private Integer edsCount;

		private String preemptLogin;

		private List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules;

		private List<String> preemptLoginUsers;

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getPolicyGroupType() {
			return this.policyGroupType;
		}

		public void setPolicyGroupType(String policyGroupType) {
			this.policyGroupType = policyGroupType;
		}

		public String getClipboard() {
			return this.clipboard;
		}

		public void setClipboard(String clipboard) {
			this.clipboard = clipboard;
		}

		public String getLocalDrive() {
			return this.localDrive;
		}

		public void setLocalDrive(String localDrive) {
			this.localDrive = localDrive;
		}

		public String getUsbRedirect() {
			return this.usbRedirect;
		}

		public void setUsbRedirect(String usbRedirect) {
			this.usbRedirect = usbRedirect;
		}

		public String getVisualQuality() {
			return this.visualQuality;
		}

		public void setVisualQuality(String visualQuality) {
			this.visualQuality = visualQuality;
		}

		public String getWatermark() {
			return this.watermark;
		}

		public void setWatermark(String watermark) {
			this.watermark = watermark;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWatermarkType() {
			return this.watermarkType;
		}

		public void setWatermarkType(String watermarkType) {
			this.watermarkType = watermarkType;
		}

		public String getWatermarkCustomText() {
			return this.watermarkCustomText;
		}

		public void setWatermarkCustomText(String watermarkCustomText) {
			this.watermarkCustomText = watermarkCustomText;
		}

		public String getWatermarkTransparency() {
			return this.watermarkTransparency;
		}

		public void setWatermarkTransparency(String watermarkTransparency) {
			this.watermarkTransparency = watermarkTransparency;
		}

		public String getPolicyStatus() {
			return this.policyStatus;
		}

		public void setPolicyStatus(String policyStatus) {
			this.policyStatus = policyStatus;
		}

		public Integer getEdsCount() {
			return this.edsCount;
		}

		public void setEdsCount(Integer edsCount) {
			this.edsCount = edsCount;
		}

		public String getPreemptLogin() {
			return this.preemptLogin;
		}

		public void setPreemptLogin(String preemptLogin) {
			this.preemptLogin = preemptLogin;
		}

		public List<AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRules() {
			return this.authorizeSecurityPolicyRules;
		}

		public void setAuthorizeSecurityPolicyRules(List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules) {
			this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
		}

		public List<String> getPreemptLoginUsers() {
			return this.preemptLoginUsers;
		}

		public void setPreemptLoginUsers(List<String> preemptLoginUsers) {
			this.preemptLoginUsers = preemptLoginUsers;
		}

		public static class AuthorizeSecurityPolicyRule {

			private String type;

			private String ipProtocol;

			private String portRange;

			private String cidrIp;

			private String policy;

			private String priority;

			private String description;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

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

			public String getCidrIp() {
				return this.cidrIp;
			}

			public void setCidrIp(String cidrIp) {
				this.cidrIp = cidrIp;
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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public DescribePolicyGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
