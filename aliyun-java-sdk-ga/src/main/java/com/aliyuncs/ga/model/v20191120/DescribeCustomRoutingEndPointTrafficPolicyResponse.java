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
import com.aliyuncs.ga.transform.v20191120.DescribeCustomRoutingEndPointTrafficPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomRoutingEndPointTrafficPolicyResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private String listenerId;

	private String endpointGroupId;

	private String endpointId;

	private String endpoint;

	private String policyId;

	private String address;

	private List<PortRangesItem> portRanges;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<PortRangesItem> getPortRanges() {
		return this.portRanges;
	}

	public void setPortRanges(List<PortRangesItem> portRanges) {
		this.portRanges = portRanges;
	}

	public static class PortRangesItem {

		private Integer fromPort;

		private Integer toPort;

		public Integer getFromPort() {
			return this.fromPort;
		}

		public void setFromPort(Integer fromPort) {
			this.fromPort = fromPort;
		}

		public Integer getToPort() {
			return this.toPort;
		}

		public void setToPort(Integer toPort) {
			this.toPort = toPort;
		}
	}

	@Override
	public DescribeCustomRoutingEndPointTrafficPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomRoutingEndPointTrafficPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
