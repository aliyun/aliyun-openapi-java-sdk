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
import com.aliyuncs.ga.transform.v20191120.CreateBasicEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBasicEndpointsResponse extends AcsResponse {

	private String requestId;

	private String endpointGroupId;

	private List<EndpointsItem> endpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
	}

	public List<EndpointsItem> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<EndpointsItem> endpoints) {
		this.endpoints = endpoints;
	}

	public static class EndpointsItem {

		private String endpointId;

		private String endpointType;

		private String endpointAddress;

		private String endpointSubAddress;

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
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
	}

	@Override
	public CreateBasicEndpointsResponse getInstance(UnmarshallerContext context) {
		return	CreateBasicEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
