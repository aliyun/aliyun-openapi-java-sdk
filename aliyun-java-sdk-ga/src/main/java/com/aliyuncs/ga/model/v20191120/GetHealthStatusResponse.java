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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.GetHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHealthStatusResponse extends AcsResponse {

	private String requestId;

	private String listenerId;

	private String healthStatus;

	private List<EndpointGroupHealthStatuses> endpointGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}

	public String getHealthStatus() {
		return this.healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public List<EndpointGroupHealthStatuses> getEndpointGroups() {
		return this.endpointGroups;
	}

	public void setEndpointGroups(List<EndpointGroupHealthStatuses> endpointGroups) {
		this.endpointGroups = endpointGroups;
	}

	public static class EndpointGroupHealthStatuses {

		private String endpointGroupId;

		private String endpointGroupType;

		private String healthStatus;

		private List<EndpointHealthStatuses> endpoints;

		private List<String> forwardingRuleIds;

		public String getEndpointGroupId() {
			return this.endpointGroupId;
		}

		public void setEndpointGroupId(String endpointGroupId) {
			this.endpointGroupId = endpointGroupId;
		}

		public String getEndpointGroupType() {
			return this.endpointGroupType;
		}

		public void setEndpointGroupType(String endpointGroupType) {
			this.endpointGroupType = endpointGroupType;
		}

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public List<EndpointHealthStatuses> getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(List<EndpointHealthStatuses> endpoints) {
			this.endpoints = endpoints;
		}

		public List<String> getForwardingRuleIds() {
			return this.forwardingRuleIds;
		}

		public void setForwardingRuleIds(List<String> forwardingRuleIds) {
			this.forwardingRuleIds = forwardingRuleIds;
		}

		public static class EndpointHealthStatuses {

			private String endpointId;

			private String address;

			private String healthStatus;

			private String healthDetail;

			private Long port;

			private String type;

			public String getEndpointId() {
				return this.endpointId;
			}

			public void setEndpointId(String endpointId) {
				this.endpointId = endpointId;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getHealthStatus() {
				return this.healthStatus;
			}

			public void setHealthStatus(String healthStatus) {
				this.healthStatus = healthStatus;
			}

			public String getHealthDetail() {
				return this.healthDetail;
			}

			public void setHealthDetail(String healthDetail) {
				this.healthDetail = healthDetail;
			}

			public Long getPort() {
				return this.port;
			}

			public void setPort(Long port) {
				this.port = port;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public GetHealthStatusResponse getInstance(UnmarshallerContext context) {
		return	GetHealthStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
