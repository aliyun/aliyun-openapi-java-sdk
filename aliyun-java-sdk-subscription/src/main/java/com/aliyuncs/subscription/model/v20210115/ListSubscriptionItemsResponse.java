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
import com.aliyuncs.subscription.transform.v20210115.ListSubscriptionItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubscriptionItemsResponse extends AcsResponse {

	private Integer totalCount;

	private String message;

	private Integer nextToken;

	private String requestId;

	private String code;

	private Boolean success;

	private List<SubscriptionItem> subscriptionItems;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
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

	public List<SubscriptionItem> getSubscriptionItems() {
		return this.subscriptionItems;
	}

	public void setSubscriptionItems(List<SubscriptionItem> subscriptionItems) {
		this.subscriptionItems = subscriptionItems;
	}

	public static class SubscriptionItem {

		private Integer pmsgStatus;

		private Integer webhookStatus;

		private String description;

		private Integer smsStatus;

		private String channel;

		private Integer emailStatus;

		private Integer ttsStatus;

		private String itemName;

		private Integer itemId;

		private List<Long> webhookIds;

		private List<Long> contactIds;

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

		public Integer getItemId() {
			return this.itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public List<Long> getWebhookIds() {
			return this.webhookIds;
		}

		public void setWebhookIds(List<Long> webhookIds) {
			this.webhookIds = webhookIds;
		}

		public List<Long> getContactIds() {
			return this.contactIds;
		}

		public void setContactIds(List<Long> contactIds) {
			this.contactIds = contactIds;
		}
	}

	@Override
	public ListSubscriptionItemsResponse getInstance(UnmarshallerContext context) {
		return	ListSubscriptionItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
