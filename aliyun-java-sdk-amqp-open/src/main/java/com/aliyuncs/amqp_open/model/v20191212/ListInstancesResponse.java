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

		private Integer maxResults;

		private String nextToken;

		private List<InstanceVO> instances;

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

		public List<InstanceVO> getInstances() {
			return this.instances;
		}

		public void setInstances(List<InstanceVO> instances) {
			this.instances = instances;
		}

		public static class InstanceVO {

			private String instanceId;

			private String instanceName;

			private String instanceType;

			private String status;

			private String orderType;

			private Long orderCreateTime;

			private Long expireTime;

			private Boolean autoRenewInstance;

			private Boolean supportEIP;

			private String privateEndpoint;

			private String publicEndpoint;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public Long getOrderCreateTime() {
				return this.orderCreateTime;
			}

			public void setOrderCreateTime(Long orderCreateTime) {
				this.orderCreateTime = orderCreateTime;
			}

			public Long getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(Long expireTime) {
				this.expireTime = expireTime;
			}

			public Boolean getAutoRenewInstance() {
				return this.autoRenewInstance;
			}

			public void setAutoRenewInstance(Boolean autoRenewInstance) {
				this.autoRenewInstance = autoRenewInstance;
			}

			public Boolean getSupportEIP() {
				return this.supportEIP;
			}

			public void setSupportEIP(Boolean supportEIP) {
				this.supportEIP = supportEIP;
			}

			public String getPrivateEndpoint() {
				return this.privateEndpoint;
			}

			public void setPrivateEndpoint(String privateEndpoint) {
				this.privateEndpoint = privateEndpoint;
			}

			public String getPublicEndpoint() {
				return this.publicEndpoint;
			}

			public void setPublicEndpoint(String publicEndpoint) {
				this.publicEndpoint = publicEndpoint;
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
