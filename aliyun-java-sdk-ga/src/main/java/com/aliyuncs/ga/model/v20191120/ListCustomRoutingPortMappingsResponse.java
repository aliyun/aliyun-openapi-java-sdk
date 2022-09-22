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
import com.aliyuncs.ga.transform.v20191120.ListCustomRoutingPortMappingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomRoutingPortMappingsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<PortMappingsItem> portMappings;

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

	public List<PortMappingsItem> getPortMappings() {
		return this.portMappings;
	}

	public void setPortMappings(List<PortMappingsItem> portMappings) {
		this.portMappings = portMappings;
	}

	public static class PortMappingsItem {

		private String acceleratorId;

		private String listenerId;

		private String endpointGroupId;

		private String endpointId;

		private String endpointGroupRegion;

		private String vswitch;

		private Integer acceleratorPort;

		private String destinationTrafficState;

		private List<String> protocols;

		private DestinationSocketAddress destinationSocketAddress;

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

		public String getEndpointGroupRegion() {
			return this.endpointGroupRegion;
		}

		public void setEndpointGroupRegion(String endpointGroupRegion) {
			this.endpointGroupRegion = endpointGroupRegion;
		}

		public String getVswitch() {
			return this.vswitch;
		}

		public void setVswitch(String vswitch) {
			this.vswitch = vswitch;
		}

		public Integer getAcceleratorPort() {
			return this.acceleratorPort;
		}

		public void setAcceleratorPort(Integer acceleratorPort) {
			this.acceleratorPort = acceleratorPort;
		}

		public String getDestinationTrafficState() {
			return this.destinationTrafficState;
		}

		public void setDestinationTrafficState(String destinationTrafficState) {
			this.destinationTrafficState = destinationTrafficState;
		}

		public List<String> getProtocols() {
			return this.protocols;
		}

		public void setProtocols(List<String> protocols) {
			this.protocols = protocols;
		}

		public DestinationSocketAddress getDestinationSocketAddress() {
			return this.destinationSocketAddress;
		}

		public void setDestinationSocketAddress(DestinationSocketAddress destinationSocketAddress) {
			this.destinationSocketAddress = destinationSocketAddress;
		}

		public static class DestinationSocketAddress {

			private String ipAddress;

			private Integer port;

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}
	}

	@Override
	public ListCustomRoutingPortMappingsResponse getInstance(UnmarshallerContext context) {
		return	ListCustomRoutingPortMappingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
