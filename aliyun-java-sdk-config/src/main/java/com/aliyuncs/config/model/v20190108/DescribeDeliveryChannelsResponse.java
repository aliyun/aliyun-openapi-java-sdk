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

package com.aliyuncs.config.model.v20190108;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.DescribeDeliveryChannelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeliveryChannelsResponse extends AcsResponse {

	private String requestId;

	private List<DeliveryChannel> deliveryChannels;

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

		private Integer status;

		private String deliveryChannelName;

		private String deliveryChannelId;

		private String deliveryChannelType;

		private String deliveryChannelAssumeRoleArn;

		private String description;

		private String deliveryChannelCondition;

		private String deliveryChannelTargetArn;

		private Boolean configurationSnapshot;

		private Boolean configurationItemChangeNotification;

		private Boolean nonCompliantNotification;

		private String oversizedDataOSSTargetArn;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDeliveryChannelName() {
			return this.deliveryChannelName;
		}

		public void setDeliveryChannelName(String deliveryChannelName) {
			this.deliveryChannelName = deliveryChannelName;
		}

		public String getDeliveryChannelId() {
			return this.deliveryChannelId;
		}

		public void setDeliveryChannelId(String deliveryChannelId) {
			this.deliveryChannelId = deliveryChannelId;
		}

		public String getDeliveryChannelType() {
			return this.deliveryChannelType;
		}

		public void setDeliveryChannelType(String deliveryChannelType) {
			this.deliveryChannelType = deliveryChannelType;
		}

		public String getDeliveryChannelAssumeRoleArn() {
			return this.deliveryChannelAssumeRoleArn;
		}

		public void setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
			this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDeliveryChannelCondition() {
			return this.deliveryChannelCondition;
		}

		public void setDeliveryChannelCondition(String deliveryChannelCondition) {
			this.deliveryChannelCondition = deliveryChannelCondition;
		}

		public String getDeliveryChannelTargetArn() {
			return this.deliveryChannelTargetArn;
		}

		public void setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
			this.deliveryChannelTargetArn = deliveryChannelTargetArn;
		}

		public Boolean getConfigurationSnapshot() {
			return this.configurationSnapshot;
		}

		public void setConfigurationSnapshot(Boolean configurationSnapshot) {
			this.configurationSnapshot = configurationSnapshot;
		}

		public Boolean getConfigurationItemChangeNotification() {
			return this.configurationItemChangeNotification;
		}

		public void setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
			this.configurationItemChangeNotification = configurationItemChangeNotification;
		}

		public Boolean getNonCompliantNotification() {
			return this.nonCompliantNotification;
		}

		public void setNonCompliantNotification(Boolean nonCompliantNotification) {
			this.nonCompliantNotification = nonCompliantNotification;
		}

		public String getOversizedDataOSSTargetArn() {
			return this.oversizedDataOSSTargetArn;
		}

		public void setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
			this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
		}
	}

	@Override
	public DescribeDeliveryChannelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeliveryChannelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
