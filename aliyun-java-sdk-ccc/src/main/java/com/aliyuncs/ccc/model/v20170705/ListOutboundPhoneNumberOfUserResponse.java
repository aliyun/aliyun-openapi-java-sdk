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
import com.aliyuncs.ccc.transform.v20170705.ListOutboundPhoneNumberOfUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOutboundPhoneNumberOfUserResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<PhoneNumber> outboundPhoneNumbers;

	private List<String> numberList;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<PhoneNumber> getOutboundPhoneNumbers() {
		return this.outboundPhoneNumbers;
	}

	public void setOutboundPhoneNumbers(List<PhoneNumber> outboundPhoneNumbers) {
		this.outboundPhoneNumbers = outboundPhoneNumbers;
	}

	public List<String> getNumberList() {
		return this.numberList;
	}

	public void setNumberList(List<String> numberList) {
		this.numberList = numberList;
	}

	public static class PhoneNumber {

		private String phoneNumberId;

		private String instanceId;

		private String number;

		private String phoneNumberDescription;

		private Boolean testOnly;

		private Integer remainingTime;

		private Boolean allowOutbound;

		private String usage;

		private Integer trunks;

		private String city;

		private String province;

		private Boolean privateFlag;

		private String sipTelX;

		private PrivacyNumber privacyNumber;

		public String getPhoneNumberId() {
			return this.phoneNumberId;
		}

		public void setPhoneNumberId(String phoneNumberId) {
			this.phoneNumberId = phoneNumberId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public Boolean getTestOnly() {
			return this.testOnly;
		}

		public void setTestOnly(Boolean testOnly) {
			this.testOnly = testOnly;
		}

		public Integer getRemainingTime() {
			return this.remainingTime;
		}

		public void setRemainingTime(Integer remainingTime) {
			this.remainingTime = remainingTime;
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

		public Integer getTrunks() {
			return this.trunks;
		}

		public void setTrunks(Integer trunks) {
			this.trunks = trunks;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public Boolean getPrivateFlag() {
			return this.privateFlag;
		}

		public void setPrivateFlag(Boolean privateFlag) {
			this.privateFlag = privateFlag;
		}

		public String getSipTelX() {
			return this.sipTelX;
		}

		public void setSipTelX(String sipTelX) {
			this.sipTelX = sipTelX;
		}

		public PrivacyNumber getPrivacyNumber() {
			return this.privacyNumber;
		}

		public void setPrivacyNumber(PrivacyNumber privacyNumber) {
			this.privacyNumber = privacyNumber;
		}

		public static class PrivacyNumber {

			private String poolId;

			private String type;

			private String telX;

			private String poolName;

			private String phoneNumber;

			private String extra;

			private String bizId;

			private String subId;

			private String regionNameCity;

			public String getPoolId() {
				return this.poolId;
			}

			public void setPoolId(String poolId) {
				this.poolId = poolId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getTelX() {
				return this.telX;
			}

			public void setTelX(String telX) {
				this.telX = telX;
			}

			public String getPoolName() {
				return this.poolName;
			}

			public void setPoolName(String poolName) {
				this.poolName = poolName;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getSubId() {
				return this.subId;
			}

			public void setSubId(String subId) {
				this.subId = subId;
			}

			public String getRegionNameCity() {
				return this.regionNameCity;
			}

			public void setRegionNameCity(String regionNameCity) {
				this.regionNameCity = regionNameCity;
			}
		}
	}

	@Override
	public ListOutboundPhoneNumberOfUserResponse getInstance(UnmarshallerContext context) {
		return	ListOutboundPhoneNumberOfUserResponseUnmarshaller.unmarshall(this, context);
	}
}
