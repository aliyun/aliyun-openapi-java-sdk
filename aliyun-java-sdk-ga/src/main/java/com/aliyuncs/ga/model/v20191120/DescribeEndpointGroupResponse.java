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

	private String requestId;

	private Integer totalCount;

	private String endpointGroupId;

	private String name;

	private String description;

	private Integer trafficPercentage;

	private String endpointGroupRegion;

	private String state;

	private String listenerId;

	private Integer healthCheckIntervalSeconds;

	private String healthCheckPath;

	private Integer healthCheckPort;

	private String healthCheckProtocol;

	private Integer thresholdCount;

	private List<EndpointConfigurationsItem> endpointConfigurations;

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

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTrafficPercentage() {
		return this.trafficPercentage;
	}

	public void setTrafficPercentage(Integer trafficPercentage) {
		this.trafficPercentage = trafficPercentage;
	}

	public String getEndpointGroupRegion() {
		return this.endpointGroupRegion;
	}

	public void setEndpointGroupRegion(String endpointGroupRegion) {
		this.endpointGroupRegion = endpointGroupRegion;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}

	public Integer getHealthCheckIntervalSeconds() {
		return this.healthCheckIntervalSeconds;
	}

	public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
		this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
	}

	public String getHealthCheckPath() {
		return this.healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
	}

	public Integer getHealthCheckPort() {
		return this.healthCheckPort;
	}

	public void setHealthCheckPort(Integer healthCheckPort) {
		this.healthCheckPort = healthCheckPort;
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

	public List<EndpointConfigurationsItem> getEndpointConfigurations() {
		return this.endpointConfigurations;
	}

	public void setEndpointConfigurations(List<EndpointConfigurationsItem> endpointConfigurations) {
		this.endpointConfigurations = endpointConfigurations;
	}

	public static class EndpointConfigurationsItem {

		private String endpoint;

		private Integer weight;

		private String type;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
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
