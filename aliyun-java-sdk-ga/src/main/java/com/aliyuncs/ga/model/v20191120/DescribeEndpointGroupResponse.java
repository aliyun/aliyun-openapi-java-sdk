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
import com.aliyuncs.ga.transform.v20191120.DescribeEndpointGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEndpointGroupResponse extends AcsResponse {

	private Integer healthCheckIntervalSeconds;

	private Integer trafficPercentage;

	private String endpointGroupId;

	private String description;

	private String requestId;

	private String healthCheckPath;

	private Integer thresholdCount;

	private String name;

	private String endpointGroupRegion;

	private Integer totalCount;

	private String state;

	private String healthCheckProtocol;

	private Integer healthCheckPort;

	private String endpointRequestProtocol;

	private String endpointGroupType;

	private String acceleratorId;

	private String listenerId;

	private String slsRegion;

	private String slsProjectName;

	private String slsLogStoreName;

	private String accessLogSwitch;

	private Boolean enableAccessLog;

	private Boolean healthCheckEnabled;

	private List<EndpointConfigurationsItem> endpointConfigurations;

	private List<PortOverridesItem> portOverrides;

	private List<TagsItem> tags;

	private List<String> endpointGroupIpList;

	private List<String> endpointGroupUnconfirmedIpList;

	private List<String> forwardingRuleIds;

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

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHealthCheckPath() {
		return this.healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
	}

	public Integer getThresholdCount() {
		return this.thresholdCount;
	}

	public void setThresholdCount(Integer thresholdCount) {
		this.thresholdCount = thresholdCount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndpointGroupRegion() {
		return this.endpointGroupRegion;
	}

	public void setEndpointGroupRegion(String endpointGroupRegion) {
		this.endpointGroupRegion = endpointGroupRegion;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHealthCheckProtocol() {
		return this.healthCheckProtocol;
	}

	public void setHealthCheckProtocol(String healthCheckProtocol) {
		this.healthCheckProtocol = healthCheckProtocol;
	}

	public Integer getHealthCheckPort() {
		return this.healthCheckPort;
	}

	public void setHealthCheckPort(Integer healthCheckPort) {
		this.healthCheckPort = healthCheckPort;
	}

	public String getEndpointRequestProtocol() {
		return this.endpointRequestProtocol;
	}

	public void setEndpointRequestProtocol(String endpointRequestProtocol) {
		this.endpointRequestProtocol = endpointRequestProtocol;
	}

	public String getEndpointGroupType() {
		return this.endpointGroupType;
	}

	public void setEndpointGroupType(String endpointGroupType) {
		this.endpointGroupType = endpointGroupType;
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

	public String getSlsRegion() {
		return this.slsRegion;
	}

	public void setSlsRegion(String slsRegion) {
		this.slsRegion = slsRegion;
	}

	public String getSlsProjectName() {
		return this.slsProjectName;
	}

	public void setSlsProjectName(String slsProjectName) {
		this.slsProjectName = slsProjectName;
	}

	public String getSlsLogStoreName() {
		return this.slsLogStoreName;
	}

	public void setSlsLogStoreName(String slsLogStoreName) {
		this.slsLogStoreName = slsLogStoreName;
	}

	public String getAccessLogSwitch() {
		return this.accessLogSwitch;
	}

	public void setAccessLogSwitch(String accessLogSwitch) {
		this.accessLogSwitch = accessLogSwitch;
	}

	public Boolean getEnableAccessLog() {
		return this.enableAccessLog;
	}

	public void setEnableAccessLog(Boolean enableAccessLog) {
		this.enableAccessLog = enableAccessLog;
	}

	public Boolean getHealthCheckEnabled() {
		return this.healthCheckEnabled;
	}

	public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
		this.healthCheckEnabled = healthCheckEnabled;
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

	@Override
	public DescribeEndpointGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeEndpointGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
