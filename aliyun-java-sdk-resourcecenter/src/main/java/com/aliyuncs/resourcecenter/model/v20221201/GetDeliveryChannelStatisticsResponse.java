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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.GetDeliveryChannelStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeliveryChannelStatisticsResponse extends AcsResponse {

	private String requestId;

	private DeliveryChannelStatistics deliveryChannelStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeliveryChannelStatistics getDeliveryChannelStatistics() {
		return this.deliveryChannelStatistics;
	}

	public void setDeliveryChannelStatistics(DeliveryChannelStatistics deliveryChannelStatistics) {
		this.deliveryChannelStatistics = deliveryChannelStatistics;
	}

	public static class DeliveryChannelStatistics {

		private String deliveryChannelId;

		private String deliveryChannelName;

		private String latestChangeDeliveryTime;

		private String latestSnapshotDeliveryTime;

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

		public String getLatestChangeDeliveryTime() {
			return this.latestChangeDeliveryTime;
		}

		public void setLatestChangeDeliveryTime(String latestChangeDeliveryTime) {
			this.latestChangeDeliveryTime = latestChangeDeliveryTime;
		}

		public String getLatestSnapshotDeliveryTime() {
			return this.latestSnapshotDeliveryTime;
		}

		public void setLatestSnapshotDeliveryTime(String latestSnapshotDeliveryTime) {
			this.latestSnapshotDeliveryTime = latestSnapshotDeliveryTime;
		}
	}

	@Override
	public GetDeliveryChannelStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetDeliveryChannelStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
