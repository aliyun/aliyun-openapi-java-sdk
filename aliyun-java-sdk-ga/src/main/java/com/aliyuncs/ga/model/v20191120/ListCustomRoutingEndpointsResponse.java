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
import com.aliyuncs.ga.transform.v20191120.ListCustomRoutingEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomRoutingEndpointsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<EndpointsItem> endpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EndpointsItem> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<EndpointsItem> endpoints) {
		this.endpoints = endpoints;
	}

	public static class EndpointsItem {

		private String acceleratorId;

		private String listenerId;

		private String endpointGroupId;

		private String endpointId;

		private String type;

		private String endpoint;

		private String trafficToEndpointPolicy;

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getEndpointGroupId() {
			return this.endpointGroupId;
		}

		public void setEndpointGroupId(String endpointGroupId) {
			this.endpointGroupId = endpointGroupId;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getTrafficToEndpointPolicy() {
			return this.trafficToEndpointPolicy;
		}

		public void setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
			this.trafficToEndpointPolicy = trafficToEndpointPolicy;
		}
	}

	@Override
	public ListCustomRoutingEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListCustomRoutingEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
