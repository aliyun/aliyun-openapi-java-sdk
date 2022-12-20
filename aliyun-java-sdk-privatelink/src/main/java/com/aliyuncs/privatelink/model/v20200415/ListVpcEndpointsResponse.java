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
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<Endpoint> endpoints;

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

	public List<Endpoint> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}

	public static class Endpoint {

		private String vpcId;

		private String endpointName;

		private String endpointType;

		private String createTime;

		private String serviceId;

		private Boolean zoneAffinityEnabled;

		private String endpointDomain;

		private String endpointStatus;

		private String regionId;

		private Boolean resourceOwner;

		private Long bandwidth;

		private String connectionStatus;

		private String endpointDescription;

		private String endpointId;

		private String endpointBusinessStatus;

		private String serviceName;

		private String resourceGroupId;

		private List<TagModel> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getEndpointName() {
			return this.endpointName;
		}

		public void setEndpointName(String endpointName) {
			this.endpointName = endpointName;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public Boolean getZoneAffinityEnabled() {
			return this.zoneAffinityEnabled;
		}

		public void setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
			this.zoneAffinityEnabled = zoneAffinityEnabled;
		}

		public String getEndpointDomain() {
			return this.endpointDomain;
		}

		public void setEndpointDomain(String endpointDomain) {
			this.endpointDomain = endpointDomain;
		}

		public String getEndpointStatus() {
			return this.endpointStatus;
		}

		public void setEndpointStatus(String endpointStatus) {
			this.endpointStatus = endpointStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getResourceOwner() {
			return this.resourceOwner;
		}

		public void setResourceOwner(Boolean resourceOwner) {
			this.resourceOwner = resourceOwner;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getEndpointDescription() {
			return this.endpointDescription;
		}

		public void setEndpointDescription(String endpointDescription) {
			this.endpointDescription = endpointDescription;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getEndpointBusinessStatus() {
			return this.endpointBusinessStatus;
		}

		public void setEndpointBusinessStatus(String endpointBusinessStatus) {
			this.endpointBusinessStatus = endpointBusinessStatus;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagModel> getTags() {
			return this.tags;
		}

		public void setTags(List<TagModel> tags) {
			this.tags = tags;
		}

		public static class TagModel {

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
	public ListVpcEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
