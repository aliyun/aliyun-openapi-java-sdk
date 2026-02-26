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

package com.aliyuncs.amqp_open.model.v20191212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.amqp_open.transform.v20191212.ListInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer maxResults;

		private List<InstanceVO> instances;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public List<InstanceVO> getInstances() {
			return this.instances;
		}

		public void setInstances(List<InstanceVO> instances) {
			this.instances = instances;
		}

		public static class InstanceVO {

			private String status;

			private Boolean supportEIP;

			private Long expireTime;

			private Long orderCreateTime;

			private String privateEndpoint;

			private Integer storageSize;

			private Integer maxEipTps;

			private String instanceId;

			private String instanceType;

			private String publicEndpoint;

			private String classicEndpoint;

			private Integer maxVhost;

			private Integer maxTps;

			private Boolean autoRenewInstance;

			private String instanceName;

			private Integer maxQueue;

			private String orderType;

			private List<TagsItem> tags;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Boolean getSupportEIP() {
				return this.supportEIP;
			}

			public void setSupportEIP(Boolean supportEIP) {
				this.supportEIP = supportEIP;
			}

			public Long getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(Long expireTime) {
				this.expireTime = expireTime;
			}

			public Long getOrderCreateTime() {
				return this.orderCreateTime;
			}

			public void setOrderCreateTime(Long orderCreateTime) {
				this.orderCreateTime = orderCreateTime;
			}

			public String getPrivateEndpoint() {
				return this.privateEndpoint;
			}

			public void setPrivateEndpoint(String privateEndpoint) {
				this.privateEndpoint = privateEndpoint;
			}

			public Integer getStorageSize() {
				return this.storageSize;
			}

			public void setStorageSize(Integer storageSize) {
				this.storageSize = storageSize;
			}

			public Integer getMaxEipTps() {
				return this.maxEipTps;
			}

			public void setMaxEipTps(Integer maxEipTps) {
				this.maxEipTps = maxEipTps;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getPublicEndpoint() {
				return this.publicEndpoint;
			}

			public void setPublicEndpoint(String publicEndpoint) {
				this.publicEndpoint = publicEndpoint;
			}

			public String getClassicEndpoint() {
				return this.classicEndpoint;
			}

			public void setClassicEndpoint(String classicEndpoint) {
				this.classicEndpoint = classicEndpoint;
			}

			public Integer getMaxVhost() {
				return this.maxVhost;
			}

			public void setMaxVhost(Integer maxVhost) {
				this.maxVhost = maxVhost;
			}

			public Integer getMaxTps() {
				return this.maxTps;
			}

			public void setMaxTps(Integer maxTps) {
				this.maxTps = maxTps;
			}

			public Boolean getAutoRenewInstance() {
				return this.autoRenewInstance;
			}

			public void setAutoRenewInstance(Boolean autoRenewInstance) {
				this.autoRenewInstance = autoRenewInstance;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Integer getMaxQueue() {
				return this.maxQueue;
			}

			public void setMaxQueue(Integer maxQueue) {
				this.maxQueue = maxQueue;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public static class TagsItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
