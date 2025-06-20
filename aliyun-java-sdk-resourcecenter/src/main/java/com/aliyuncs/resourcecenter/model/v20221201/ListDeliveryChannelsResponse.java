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

package com.aliyuncs.resourcecenter.model.v20221201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.ListDeliveryChannelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeliveryChannelsResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private List<DeliveryChannel> deliveryChannels;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

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

	public List<DeliveryChannel> getDeliveryChannels() {
		return this.deliveryChannels;
	}

	public void setDeliveryChannels(List<DeliveryChannel> deliveryChannels) {
		this.deliveryChannels = deliveryChannels;
	}

	public static class DeliveryChannel {

		private String createTime;

		private String deliveryChannelDescription;

		private String deliveryChannelId;

		private String deliveryChannelName;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeliveryChannelDescription() {
			return this.deliveryChannelDescription;
		}

		public void setDeliveryChannelDescription(String deliveryChannelDescription) {
			this.deliveryChannelDescription = deliveryChannelDescription;
		}

		public String getDeliveryChannelId() {
			return this.deliveryChannelId;
		}

		public void setDeliveryChannelId(String deliveryChannelId) {
			this.deliveryChannelId = deliveryChannelId;
		}

		public String getDeliveryChannelName() {
			return this.deliveryChannelName;
		}

		public void setDeliveryChannelName(String deliveryChannelName) {
			this.deliveryChannelName = deliveryChannelName;
		}
	}

	@Override
	public ListDeliveryChannelsResponse getInstance(UnmarshallerContext context) {
		return	ListDeliveryChannelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
