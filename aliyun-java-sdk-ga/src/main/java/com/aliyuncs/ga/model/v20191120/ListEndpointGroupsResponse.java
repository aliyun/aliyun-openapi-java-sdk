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
import com.aliyuncs.ga.transform.v20191120.ListEndpointGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEndpointGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<EndpointGroupsItem> endpointGroups;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EndpointGroupsItem> getEndpointGroups() {
		return this.endpointGroups;
	}

	public void setEndpointGroups(List<EndpointGroupsItem> endpointGroups) {
		this.endpointGroups = endpointGroups;
	}

	public static class EndpointGroupsItem {

		private String endpointGroupId;

		private String state;

		private String healthCheckPath;

		private String endpointGroupRegion;

		private Integer healthCheckIntervalSeconds;

		private Integer trafficPercentage;

		private String healthCheckProtocol;

		private Integer thresholdCount;

		private String listenerId;

		private String acceleratorId;

		private String endpointGroupType;

		private String endpointRequestProtocol;

		private String description;

		private String name;

		private Integer healthCheckPort;

		private Boolean healthCheckEnabled;

		private String serviceId;

		private Boolean serviceManaged;

		private List<EndpointConfigurationsItem> endpointConfigurations;

		private List<PortOverridesItem> portOverrides;

		private List<ServiceManagedInfosItem> serviceManagedInfos;

		private List<TagsItem> tags;

		private List<String> endpointGroupIpList;

		private List<String> endpointGroupUnconfirmedIpList;

		private List<String> forwardingRuleIds;

		public String getEndpointGroupId() {
			return this.endpointGroupId;
		}

		public void setEndpointGroupId(String endpointGroupId) {
			this.endpointGroupId = endpointGroupId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getHealthCheckPath() {
			return this.healthCheckPath;
		}

		public void setHealthCheckPath(String healthCheckPath) {
			this.healthCheckPath = healthCheckPath;
		}

		public String getEndpointGroupRegion() {
			return this.endpointGroupRegion;
		}

		public void setEndpointGroupRegion(String endpointGroupRegion) {
			this.endpointGroupRegion = endpointGroupRegion;
		}

		public Integer getHealthCheckIntervalSeconds() {
			return this.healthCheckIntervalSeconds;
		}

		public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
			this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
		}

		public Integer getTrafficPercentage() {
			return this.trafficPercentage;
		}

		public void setTrafficPercentage(Integer trafficPercentage) {
			this.trafficPercentage = trafficPercentage;
		}

		public String getHealthCheckProtocol() {
			return this.healthCheckProtocol;
		}

		public void setHealthCheckProtocol(String healthCheckProtocol) {
			this.healthCheckProtocol = healthCheckProtocol;
		}

		public Integer getThresholdCount() {
			return this.thresholdCount;
		}

		public void setThresholdCount(Integer thresholdCount) {
			this.thresholdCount = thresholdCount;
		}

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}

		public String getEndpointGroupType() {
			return this.endpointGroupType;
		}

		public void setEndpointGroupType(String endpointGroupType) {
			this.endpointGroupType = endpointGroupType;
		}

		public String getEndpointRequestProtocol() {
			return this.endpointRequestProtocol;
		}

		public void setEndpointRequestProtocol(String endpointRequestProtocol) {
			this.endpointRequestProtocol = endpointRequestProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getHealthCheckPort() {
			return this.healthCheckPort;
		}

		public void setHealthCheckPort(Integer healthCheckPort) {
			this.healthCheckPort = healthCheckPort;
		}

		public Boolean getHealthCheckEnabled() {
			return this.healthCheckEnabled;
		}

		public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
			this.healthCheckEnabled = healthCheckEnabled;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public Boolean getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Boolean serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public List<EndpointConfigurationsItem> getEndpointConfigurations() {
			return this.endpointConfigurations;
		}

		public void setEndpointConfigurations(List<EndpointConfigurationsItem> endpointConfigurations) {
			this.endpointConfigurations = endpointConfigurations;
		}

		public List<PortOverridesItem> getPortOverrides() {
			return this.portOverrides;
		}

		public void setPortOverrides(List<PortOverridesItem> portOverrides) {
			this.portOverrides = portOverrides;
		}

		public List<ServiceManagedInfosItem> getServiceManagedInfos() {
			return this.serviceManagedInfos;
		}

		public void setServiceManagedInfos(List<ServiceManagedInfosItem> serviceManagedInfos) {
			this.serviceManagedInfos = serviceManagedInfos;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getEndpointGroupIpList() {
			return this.endpointGroupIpList;
		}

		public void setEndpointGroupIpList(List<String> endpointGroupIpList) {
			this.endpointGroupIpList = endpointGroupIpList;
		}

		public List<String> getEndpointGroupUnconfirmedIpList() {
			return this.endpointGroupUnconfirmedIpList;
		}

		public void setEndpointGroupUnconfirmedIpList(List<String> endpointGroupUnconfirmedIpList) {
			this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
		}

		public List<String> getForwardingRuleIds() {
			return this.forwardingRuleIds;
		}

		public void setForwardingRuleIds(List<String> forwardingRuleIds) {
			this.forwardingRuleIds = forwardingRuleIds;
		}

		public static class EndpointConfigurationsItem {

			private String type;

			private Boolean enableClientIPPreservation;

			private Integer weight;

			private String probeProtocol;

			private String endpoint;

			private Boolean enableProxyProtocol;

			private Integer probePort;

			private String endpointId;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getEnableClientIPPreservation() {
				return this.enableClientIPPreservation;
			}

			public void setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
				this.enableClientIPPreservation = enableClientIPPreservation;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public String getProbeProtocol() {
				return this.probeProtocol;
			}

			public void setProbeProtocol(String probeProtocol) {
				this.probeProtocol = probeProtocol;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public Boolean getEnableProxyProtocol() {
				return this.enableProxyProtocol;
			}

			public void setEnableProxyProtocol(Boolean enableProxyProtocol) {
				this.enableProxyProtocol = enableProxyProtocol;
			}

			public Integer getProbePort() {
				return this.probePort;
			}

			public void setProbePort(Integer probePort) {
				this.probePort = probePort;
			}

			public String getEndpointId() {
				return this.endpointId;
			}

			public void setEndpointId(String endpointId) {
				this.endpointId = endpointId;
			}
		}

		public static class PortOverridesItem {

			private Integer listenerPort;

			private Integer endpointPort;

			public Integer getListenerPort() {
				return this.listenerPort;
			}

			public void setListenerPort(Integer listenerPort) {
				this.listenerPort = listenerPort;
			}

			public Integer getEndpointPort() {
				return this.endpointPort;
			}

			public void setEndpointPort(Integer endpointPort) {
				this.endpointPort = endpointPort;
			}
		}

		public static class ServiceManagedInfosItem {

			private String action;

			private String childType;

			private Boolean isManaged;

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getChildType() {
				return this.childType;
			}

			public void setChildType(String childType) {
				this.childType = childType;
			}

			public Boolean getIsManaged() {
				return this.isManaged;
			}

			public void setIsManaged(Boolean isManaged) {
				this.isManaged = isManaged;
			}
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListEndpointGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListEndpointGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
