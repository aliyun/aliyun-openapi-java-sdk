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
import com.aliyuncs.ga.transform.v20191120.ListBasicEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBasicEndpointsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String nextToken;

	private String maxResults;

	private List<EndpointsItem> endpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public List<EndpointsItem> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<EndpointsItem> endpoints) {
		this.endpoints = endpoints;
	}

	public static class EndpointsItem {

		private String acceleratorId;

		private String endpointGroupId;

		private String endpointId;

		private String name;

		private String endpointType;

		private String endpointAddress;

		private String endpointSubAddress;

		private String endpointSubAddressType;

		private String endpointZoneId;

		private String state;

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getEndpointAddress() {
			return this.endpointAddress;
		}

		public void setEndpointAddress(String endpointAddress) {
			this.endpointAddress = endpointAddress;
		}

		public String getEndpointSubAddress() {
			return this.endpointSubAddress;
		}

		public void setEndpointSubAddress(String endpointSubAddress) {
			this.endpointSubAddress = endpointSubAddress;
		}

		public String getEndpointSubAddressType() {
			return this.endpointSubAddressType;
		}

		public void setEndpointSubAddressType(String endpointSubAddressType) {
			this.endpointSubAddressType = endpointSubAddressType;
		}

		public String getEndpointZoneId() {
			return this.endpointZoneId;
		}

		public void setEndpointZoneId(String endpointZoneId) {
			this.endpointZoneId = endpointZoneId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public ListBasicEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListBasicEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
