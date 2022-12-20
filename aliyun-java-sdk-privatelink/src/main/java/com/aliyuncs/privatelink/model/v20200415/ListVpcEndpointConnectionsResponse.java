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

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<Connection> connections;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Connection> getConnections() {
		return this.connections;
	}

	public void setConnections(List<Connection> connections) {
		this.connections = connections;
	}

	public static class Connection {

		private Boolean resourceOwner;

		private String modifiedTime;

		private Integer bandwidth;

		private Long endpointOwnerId;

		private String serviceId;

		private String connectionStatus;

		private String endpointId;

		private String endpointVpcId;

		private String resourceGroupId;

		private List<Zone> zones;

		public Boolean getResourceOwner() {
			return this.resourceOwner;
		}

		public void setResourceOwner(Boolean resourceOwner) {
			this.resourceOwner = resourceOwner;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Long getEndpointOwnerId() {
			return this.endpointOwnerId;
		}

		public void setEndpointOwnerId(Long endpointOwnerId) {
			this.endpointOwnerId = endpointOwnerId;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getEndpointVpcId() {
			return this.endpointVpcId;
		}

		public void setEndpointVpcId(String endpointVpcId) {
			this.endpointVpcId = endpointVpcId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Zone> getZones() {
			return this.zones;
		}

		public void setZones(List<Zone> zones) {
			this.zones = zones;
		}

		public static class Zone {

			private String vSwitchId;

			private String zoneId;

			private String resourceId;

			private String eniId;

			private String zoneDomain;

			private String zoneStatus;

			private String replacedResourceId;

			private String replacedEniId;

			private String statusInfo;

			private Long connectionId;

			private String connectionStringId;

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
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

			public String getZoneStatus() {
				return this.zoneStatus;
			}

			public void setZoneStatus(String zoneStatus) {
				this.zoneStatus = zoneStatus;
			}

			public String getReplacedResourceId() {
				return this.replacedResourceId;
			}

			public void setReplacedResourceId(String replacedResourceId) {
				this.replacedResourceId = replacedResourceId;
			}

			public String getReplacedEniId() {
				return this.replacedEniId;
			}

			public void setReplacedEniId(String replacedEniId) {
				this.replacedEniId = replacedEniId;
			}

			public String getStatusInfo() {
				return this.statusInfo;
			}

			public void setStatusInfo(String statusInfo) {
				this.statusInfo = statusInfo;
			}

			public Long getConnectionId() {
				return this.connectionId;
			}

			public void setConnectionId(Long connectionId) {
				this.connectionId = connectionId;
			}

			public String getConnectionStringId() {
				return this.connectionStringId;
			}

			public void setConnectionStringId(String connectionStringId) {
				this.connectionStringId = connectionStringId;
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
