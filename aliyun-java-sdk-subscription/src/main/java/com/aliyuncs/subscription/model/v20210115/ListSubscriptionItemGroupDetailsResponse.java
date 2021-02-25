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

package com.aliyuncs.subscription.model.v20210115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.subscription.transform.v20210115.ListSubscriptionItemGroupDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubscriptionItemGroupDetailsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<SubscriptionItemGroupDetail> subscriptionItemGroupDetails;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<SubscriptionItemGroupDetail> getSubscriptionItemGroupDetails() {
		return this.subscriptionItemGroupDetails;
	}

	public void setSubscriptionItemGroupDetails(List<SubscriptionItemGroupDetail> subscriptionItemGroupDetails) {
		this.subscriptionItemGroupDetails = subscriptionItemGroupDetails;
	}

	public static class SubscriptionItemGroupDetail {

		private String itemGroupName;

		private String description;

		private Integer itemGroupId;

		private List<SubscriptionItemDetail> itemDetails;

		public String getItemGroupName() {
			return this.itemGroupName;
		}

		public void setItemGroupName(String itemGroupName) {
			this.itemGroupName = itemGroupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getItemGroupId() {
			return this.itemGroupId;
		}

		public void setItemGroupId(Integer itemGroupId) {
			this.itemGroupId = itemGroupId;
		}

		public List<SubscriptionItemDetail> getItemDetails() {
			return this.itemDetails;
		}

		public void setItemDetails(List<SubscriptionItemDetail> itemDetails) {
			this.itemDetails = itemDetails;
		}

		public static class SubscriptionItemDetail {

			private Integer pmsgStatus;

			private Integer webhookStatus;

			private String description;

			private Integer smsStatus;

			private String channel;

			private Integer emailStatus;

			private Integer ttsStatus;

			private String itemName;

			private String regionId;

			private Integer itemId;

			private List<Contact> contacts;

			private List<Webhook> webhooks;

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

			public Integer getTtsStatus() {
				return this.ttsStatus;
			}

			public void setTtsStatus(Integer ttsStatus) {
				this.ttsStatus = ttsStatus;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getItemId() {
				return this.itemId;
			}

			public void setItemId(Integer itemId) {
				this.itemId = itemId;
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

				private String email;

				private Boolean isAccount;

				private String position;

				private Boolean isVerifiedEmail;

				private Long lastMobileVerificationTimeStamp;

				private Boolean isObsolete;

				private Boolean isVerifiedMobile;

				private Long contactId;

				private Long accountUID;

				private String mobile;

				private Long lastEmailVerificationTimeStamp;

				private String name;

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public Boolean getIsAccount() {
					return this.isAccount;
				}

				public void setIsAccount(Boolean isAccount) {
					this.isAccount = isAccount;
				}

				public String getPosition() {
					return this.position;
				}

				public void setPosition(String position) {
					this.position = position;
				}

				public Boolean getIsVerifiedEmail() {
					return this.isVerifiedEmail;
				}

				public void setIsVerifiedEmail(Boolean isVerifiedEmail) {
					this.isVerifiedEmail = isVerifiedEmail;
				}

				public Long getLastMobileVerificationTimeStamp() {
					return this.lastMobileVerificationTimeStamp;
				}

				public void setLastMobileVerificationTimeStamp(Long lastMobileVerificationTimeStamp) {
					this.lastMobileVerificationTimeStamp = lastMobileVerificationTimeStamp;
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

				public Long getLastEmailVerificationTimeStamp() {
					return this.lastEmailVerificationTimeStamp;
				}

				public void setLastEmailVerificationTimeStamp(Long lastEmailVerificationTimeStamp) {
					this.lastEmailVerificationTimeStamp = lastEmailVerificationTimeStamp;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Webhook {

				private String serverUrl;

				private Long webhookId;

				private String name;

				public String getServerUrl() {
					return this.serverUrl;
				}

				public void setServerUrl(String serverUrl) {
					this.serverUrl = serverUrl;
				}

				public Long getWebhookId() {
					return this.webhookId;
				}

				public void setWebhookId(Long webhookId) {
					this.webhookId = webhookId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public ListSubscriptionItemGroupDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListSubscriptionItemGroupDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
