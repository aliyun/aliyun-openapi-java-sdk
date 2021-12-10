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

package com.aliyuncs.mscopensubscription.model.v20210713;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mscopensubscription.transform.v20210713.GetSubscriptionItemDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubscriptionItemDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private SubscriptionItemDetail subscriptionItemDetail;

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

	public SubscriptionItemDetail getSubscriptionItemDetail() {
		return this.subscriptionItemDetail;
	}

	public void setSubscriptionItemDetail(SubscriptionItemDetail subscriptionItemDetail) {
		this.subscriptionItemDetail = subscriptionItemDetail;
	}

	public static class SubscriptionItemDetail {

		private String description;

		private Integer smsStatus;

		private String channel;

		private Integer emailStatus;

		private Integer itemId;

		private Integer pmsgStatus;

		private Integer webhookStatus;

		private String itemName;

		private Integer ttsStatus;

		private String regionId;

		private List<Contact> contacts;

		private List<Webhook> webhooks;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getSmsStatus() {
			return this.smsStatus;
		}

		public void setSmsStatus(Integer smsStatus) {
			this.smsStatus = smsStatus;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		public Integer getEmailStatus() {
			return this.emailStatus;
		}

		public void setEmailStatus(Integer emailStatus) {
			this.emailStatus = emailStatus;
		}

		public Integer getItemId() {
			return this.itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public Integer getPmsgStatus() {
			return this.pmsgStatus;
		}

		public void setPmsgStatus(Integer pmsgStatus) {
			this.pmsgStatus = pmsgStatus;
		}

		public Integer getWebhookStatus() {
			return this.webhookStatus;
		}

		public void setWebhookStatus(Integer webhookStatus) {
			this.webhookStatus = webhookStatus;
		}

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Integer getTtsStatus() {
			return this.ttsStatus;
		}

		public void setTtsStatus(Integer ttsStatus) {
			this.ttsStatus = ttsStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Contact> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}

		public List<Webhook> getWebhooks() {
			return this.webhooks;
		}

		public void setWebhooks(List<Webhook> webhooks) {
			this.webhooks = webhooks;
		}

		public static class Contact {

			private Long lastMobileVerificationTimeStamp;

			private String email;

			private String position;

			private Long lastEmailVerificationTimeStamp;

			private Long contactId;

			private Long accountUID;

			private String mobile;

			private String name;

			private Boolean isAccount;

			private Boolean isVerifiedEmail;

			private Boolean isObsolete;

			private Boolean isVerifiedMobile;

			public Long getLastMobileVerificationTimeStamp() {
				return this.lastMobileVerificationTimeStamp;
			}

			public void setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
				this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPosition() {
				return this.position;
			}

			public void setPosition(String position) {
				this.position = position;
			}

			public Long getLastEmailVerificationTimeStamp() {
				return this.lastEmailVerificationTimeStamp;
			}

			public void setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
				this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
			}

			public Long getContactId() {
				return this.contactId;
			}

			public void setContactId(Long contactId) {
				this.contactId = contactId;
			}

			public Long getAccountUID() {
				return this.accountUID;
			}

			public void setAccountUID(Long accountUID) {
				this.accountUID = accountUID;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getIsAccount() {
				return this.isAccount;
			}

			public void setIsAccount(Boolean isAccount) {
				this.isAccount = isAccount;
			}

			public Boolean getIsVerifiedEmail() {
				return this.isVerifiedEmail;
			}

			public void setIsVerifiedEmail(Boolean isVerifiedEmail) {
				this.isVerifiedEmail = isVerifiedEmail;
			}

			public Boolean getIsObsolete() {
				return this.isObsolete;
			}

			public void setIsObsolete(Boolean isObsolete) {
				this.isObsolete = isObsolete;
			}

			public Boolean getIsVerifiedMobile() {
				return this.isVerifiedMobile;
			}

			public void setIsVerifiedMobile(Boolean isVerifiedMobile) {
				this.isVerifiedMobile = isVerifiedMobile;
			}
		}

		public static class Webhook {

			private Long webhookId;

			private String serverUrl;

			private String name;

			public Long getWebhookId() {
				return this.webhookId;
			}

			public void setWebhookId(Long webhookId) {
				this.webhookId = webhookId;
			}

			public String getServerUrl() {
				return this.serverUrl;
			}

			public void setServerUrl(String serverUrl) {
				this.serverUrl = serverUrl;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetSubscriptionItemDetailResponse getInstance(UnmarshallerContext context) {
		return	GetSubscriptionItemDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
