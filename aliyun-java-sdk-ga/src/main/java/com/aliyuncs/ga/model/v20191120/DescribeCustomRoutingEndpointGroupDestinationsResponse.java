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
import com.aliyuncs.ga.transform.v20191120.DescribeCustomRoutingEndpointGroupDestinationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomRoutingEndpointGroupDestinationsResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private String listenerId;

	private String endpointGroupId;

	private String destinationId;

	private Integer fromPort;

	private Integer toPort;

	private List<String> protocols;

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

	public String getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

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

	public List<String> getProtocols() {
		return this.protocols;
	}

	public void setProtocols(List<String> protocols) {
		this.protocols = protocols;
	}

	@Override
	public DescribeCustomRoutingEndpointGroupDestinationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomRoutingEndpointGroupDestinationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
