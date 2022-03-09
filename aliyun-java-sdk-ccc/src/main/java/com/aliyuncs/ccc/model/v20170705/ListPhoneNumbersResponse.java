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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListPhoneNumbersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhoneNumbersResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<PhoneNumber> phoneNumbers;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public static class PhoneNumber {

		private Boolean testOnly;

		private String sipTelX;

		private Integer remainingTime;

		private String city;

		private String instanceId;

		private Boolean allowOutbound;

		private String usage;

		private String assignee;

		private String phoneNumberId;

		private Integer trunks;

		private String number;

		private String phoneNumberDescription;

		private Integer numberCommodityStatus;

		private String province;

		private List<SkillGroup> skillGroups;

		private ContactFlow contactFlow;

		private PrivacyNumber privacyNumber;

		public Boolean getTestOnly() {
			return this.testOnly;
		}

		public void setTestOnly(Boolean testOnly) {
			this.testOnly = testOnly;
		}

		public String getSipTelX() {
			return this.sipTelX;
		}

		public void setSipTelX(String sipTelX) {
			this.sipTelX = sipTelX;
		}

		public Integer getRemainingTime() {
			return this.remainingTime;
		}

		public void setRemainingTime(Integer remainingTime) {
			this.remainingTime = remainingTime;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getAllowOutbound() {
			return this.allowOutbound;
		}

		public void setAllowOutbound(Boolean allowOutbound) {
			this.allowOutbound = allowOutbound;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public String getAssignee() {
			return this.assignee;
		}

		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}

		public String getPhoneNumberId() {
			return this.phoneNumberId;
		}

		public void setPhoneNumberId(String phoneNumberId) {
			this.phoneNumberId = phoneNumberId;
		}

		public Integer getTrunks() {
			return this.trunks;
		}

		public void setTrunks(Integer trunks) {
			this.trunks = trunks;
		}

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getPhoneNumberDescription() {
			return this.phoneNumberDescription;
		}

		public void setPhoneNumberDescription(String phoneNumberDescription) {
			this.phoneNumberDescription = phoneNumberDescription;
		}

		public Integer getNumberCommodityStatus() {
			return this.numberCommodityStatus;
		}

		public void setNumberCommodityStatus(Integer numberCommodityStatus) {
			this.numberCommodityStatus = numberCommodityStatus;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public List<SkillGroup> getSkillGroups() {
			return this.skillGroups;
		}

		public void setSkillGroups(List<SkillGroup> skillGroups) {
			this.skillGroups = skillGroups;
		}

		public ContactFlow getContactFlow() {
			return this.contactFlow;
		}

		public void setContactFlow(ContactFlow contactFlow) {
			this.contactFlow = contactFlow;
		}

		public PrivacyNumber getPrivacyNumber() {
			return this.privacyNumber;
		}

		public void setPrivacyNumber(PrivacyNumber privacyNumber) {
			this.privacyNumber = privacyNumber;
		}

		public static class SkillGroup {

			private String skillGroupName;

			private String skillGroupId;

			public String getSkillGroupName() {
				return this.skillGroupName;
			}

			public void setSkillGroupName(String skillGroupName) {
				this.skillGroupName = skillGroupName;
			}

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}
		}

		public static class ContactFlow {

			private String type;

			private String contactFlowDescription;

			private String instanceId;

			private String contactFlowName;

			private String contactFlowId;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getContactFlowDescription() {
				return this.contactFlowDescription;
			}

			public void setContactFlowDescription(String contactFlowDescription) {
				this.contactFlowDescription = contactFlowDescription;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getContactFlowName() {
				return this.contactFlowName;
			}

			public void setContactFlowName(String contactFlowName) {
				this.contactFlowName = contactFlowName;
			}

			public String getContactFlowId() {
				return this.contactFlowId;
			}

			public void setContactFlowId(String contactFlowId) {
				this.contactFlowId = contactFlowId;
			}
		}

		public static class PrivacyNumber {

			private String type;

			private String poolId;

			private String subId;

			private String phoneNumber;

			private String poolName;

			private String bizId;

			private String regionNameCity;

			private String extra;

			private String telX;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getPoolId() {
				return this.poolId;
			}

			public void setPoolId(String poolId) {
				this.poolId = poolId;
			}

			public String getSubId() {
				return this.subId;
			}

			public void setSubId(String subId) {
				this.subId = subId;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getPoolName() {
				return this.poolName;
			}

			public void setPoolName(String poolName) {
				this.poolName = poolName;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getRegionNameCity() {
				return this.regionNameCity;
			}

			public void setRegionNameCity(String regionNameCity) {
				this.regionNameCity = regionNameCity;
			}

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
			}

			public String getTelX() {
				return this.telX;
			}

			public void setTelX(String telX) {
				this.telX = telX;
			}
		}
	}

	@Override
	public ListPhoneNumbersResponse getInstance(UnmarshallerContext context) {
		return	ListPhoneNumbersResponseUnmarshaller.unmarshall(this, context);
	}
}
