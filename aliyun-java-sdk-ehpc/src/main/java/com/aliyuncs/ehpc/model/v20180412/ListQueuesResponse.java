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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListQueuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQueuesResponse extends AcsResponse {

	private String requestId;

	private List<QueueInfo> queues;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QueueInfo> getQueues() {
		return this.queues;
	}

	public void setQueues(List<QueueInfo> queues) {
		this.queues = queues;
	}

	public static class QueueInfo {

		private String queueName;

		private String type;

		private String resourceGroupId;

		private String hostNamePrefix;

		private String hostNameSuffix;

		private String spotStrategy;

		private String imageId;

		private Boolean enableAutoGrow;

		private List<Instance> spotInstanceTypes;

		private List<String> computeInstanceType;

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getHostNamePrefix() {
			return this.hostNamePrefix;
		}

		public void setHostNamePrefix(String hostNamePrefix) {
			this.hostNamePrefix = hostNamePrefix;
		}

		public String getHostNameSuffix() {
			return this.hostNameSuffix;
		}

		public void setHostNameSuffix(String hostNameSuffix) {
			this.hostNameSuffix = hostNameSuffix;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Boolean getEnableAutoGrow() {
			return this.enableAutoGrow;
		}

		public void setEnableAutoGrow(Boolean enableAutoGrow) {
			this.enableAutoGrow = enableAutoGrow;
		}

		public List<Instance> getSpotInstanceTypes() {
			return this.spotInstanceTypes;
		}

		public void setSpotInstanceTypes(List<Instance> spotInstanceTypes) {
			this.spotInstanceTypes = spotInstanceTypes;
		}

		public List<String> getComputeInstanceType() {
			return this.computeInstanceType;
		}

		public void setComputeInstanceType(List<String> computeInstanceType) {
			this.computeInstanceType = computeInstanceType;
		}

		public static class Instance {

			private String instanceType;

			private Float spotPriceLimit;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Float getSpotPriceLimit() {
				return this.spotPriceLimit;
			}

			public void setSpotPriceLimit(Float spotPriceLimit) {
				this.spotPriceLimit = spotPriceLimit;
			}
		}
	}

	@Override
	public ListQueuesResponse getInstance(UnmarshallerContext context) {
		return	ListQueuesResponseUnmarshaller.unmarshall(this, context);
	}
}
