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
import com.aliyuncs.resourcecenter.transform.v20221201.GetDeliveryChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeliveryChannelResponse extends AcsResponse {

	private String deliveryChannelDescription;

	private String deliveryChannelId;

	private String deliveryChannelName;

	private String requestId;

	private DeliveryChannelFilter deliveryChannelFilter;

	private ResourceChangeDelivery resourceChangeDelivery;

	private ResourceSnapshotDelivery resourceSnapshotDelivery;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeliveryChannelFilter getDeliveryChannelFilter() {
		return this.deliveryChannelFilter;
	}

	public void setDeliveryChannelFilter(DeliveryChannelFilter deliveryChannelFilter) {
		this.deliveryChannelFilter = deliveryChannelFilter;
	}

	public ResourceChangeDelivery getResourceChangeDelivery() {
		return this.resourceChangeDelivery;
	}

	public void setResourceChangeDelivery(ResourceChangeDelivery resourceChangeDelivery) {
		this.resourceChangeDelivery = resourceChangeDelivery;
	}

	public ResourceSnapshotDelivery getResourceSnapshotDelivery() {
		return this.resourceSnapshotDelivery;
	}

	public void setResourceSnapshotDelivery(ResourceSnapshotDelivery resourceSnapshotDelivery) {
		this.resourceSnapshotDelivery = resourceSnapshotDelivery;
	}

	public static class DeliveryChannelFilter {

		private List<String> resourceTypes;

		public List<String> getResourceTypes() {
			return this.resourceTypes;
		}

		public void setResourceTypes(List<String> resourceTypes) {
			this.resourceTypes = resourceTypes;
		}
	}

	public static class ResourceChangeDelivery {

		private String targetArn;

		private String targetType;

		private SlsProperties slsProperties;

		public String getTargetArn() {
			return this.targetArn;
		}

		public void setTargetArn(String targetArn) {
			this.targetArn = targetArn;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public SlsProperties getSlsProperties() {
			return this.slsProperties;
		}

		public void setSlsProperties(SlsProperties slsProperties) {
			this.slsProperties = slsProperties;
		}

		public static class SlsProperties {

			private String oversizedDataOssTargetArn;

			public String getOversizedDataOssTargetArn() {
				return this.oversizedDataOssTargetArn;
			}

			public void setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
				this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
			}
		}
	}

	public static class ResourceSnapshotDelivery {

		private String deliveryTime;

		private String targetArn;

		private String targetType;

		private String customExpression;

		private SlsProperties1 slsProperties1;

		public String getDeliveryTime() {
			return this.deliveryTime;
		}

		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		public String getTargetArn() {
			return this.targetArn;
		}

		public void setTargetArn(String targetArn) {
			this.targetArn = targetArn;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getCustomExpression() {
			return this.customExpression;
		}

		public void setCustomExpression(String customExpression) {
			this.customExpression = customExpression;
		}

		public SlsProperties1 getSlsProperties1() {
			return this.slsProperties1;
		}

		public void setSlsProperties1(SlsProperties1 slsProperties1) {
			this.slsProperties1 = slsProperties1;
		}

		public static class SlsProperties1 {

			private String oversizedDataOssTargetArn;

			public String getOversizedDataOssTargetArn() {
				return this.oversizedDataOssTargetArn;
			}

			public void setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
				this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
			}
		}
	}

	@Override
	public GetDeliveryChannelResponse getInstance(UnmarshallerContext context) {
		return	GetDeliveryChannelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
