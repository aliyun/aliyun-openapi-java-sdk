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

package com.aliyuncs.privatelink.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointConnectionsResponse extends AcsResponse {

	private String maxResults;

	private String nextToken;

	private String requestId;

	private List<Connection> connections;

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Connection> getConnections() {
		return this.connections;
	}

	public void setConnections(List<Connection> connections) {
		this.connections = connections;
	}

	public static class Connection {

		private String serviceId;

		private String endpointId;

		private Long endpointOwnerId;

		private String connectionStatus;

		private String endpointVpcId;

		private Integer bandwidth;

		private String modifiedTime;

		private Boolean resourceOwner;

		private List<Zone> zones;

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public Long getEndpointOwnerId() {
			return this.endpointOwnerId;
		}

		public void setEndpointOwnerId(Long endpointOwnerId) {
			this.endpointOwnerId = endpointOwnerId;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getEndpointVpcId() {
			return this.endpointVpcId;
		}

		public void setEndpointVpcId(String endpointVpcId) {
			this.endpointVpcId = endpointVpcId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Boolean getResourceOwner() {
			return this.resourceOwner;
		}

		public void setResourceOwner(Boolean resourceOwner) {
			this.resourceOwner = resourceOwner;
		}

		public List<Zone> getZones() {
			return this.zones;
		}

		public void setZones(List<Zone> zones) {
			this.zones = zones;
		}

		public static class Zone {

			private String zoneId;

			private String eniId;

			private String zoneDomain;

			private String vSwitchId;

			private String resourceId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getEniId() {
				return this.eniId;
			}

			public void setEniId(String eniId) {
				this.eniId = eniId;
			}

			public String getZoneDomain() {
				return this.zoneDomain;
			}

			public void setZoneDomain(String zoneDomain) {
				this.zoneDomain = zoneDomain;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}
		}
	}

	@Override
	public ListVpcEndpointConnectionsResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointConnectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
