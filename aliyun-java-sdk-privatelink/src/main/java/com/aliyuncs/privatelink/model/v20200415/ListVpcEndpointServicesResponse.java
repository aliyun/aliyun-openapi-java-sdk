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
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointServicesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private Integer totalCount;

	private List<Service> services;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public static class Service {

		private Boolean autoAcceptEnabled;

		private String serviceId;

		private String createTime;

		private Integer minBandwidth;

		private Integer maxBandwidth;

		private String serviceStatus;

		private Boolean zoneAffinityEnabled;

		private String regionId;

		private String serviceDomain;

		private String payer;

		private String serviceBusinessStatus;

		private Integer connectBandwidth;

		private String serviceName;

		private String serviceDescription;

		private String serviceResourceType;

		private String serviceType;

		private Boolean serviceSupportIPv6;

		private String resourceGroupId;

		private List<TagModel> tags;

		public Boolean getAutoAcceptEnabled() {
			return this.autoAcceptEnabled;
		}

		public void setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
			this.autoAcceptEnabled = autoAcceptEnabled;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getMinBandwidth() {
			return this.minBandwidth;
		}

		public void setMinBandwidth(Integer minBandwidth) {
			this.minBandwidth = minBandwidth;
		}

		public Integer getMaxBandwidth() {
			return this.maxBandwidth;
		}

		public void setMaxBandwidth(Integer maxBandwidth) {
			this.maxBandwidth = maxBandwidth;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public Boolean getZoneAffinityEnabled() {
			return this.zoneAffinityEnabled;
		}

		public void setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
			this.zoneAffinityEnabled = zoneAffinityEnabled;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getServiceDomain() {
			return this.serviceDomain;
		}

		public void setServiceDomain(String serviceDomain) {
			this.serviceDomain = serviceDomain;
		}

		public String getPayer() {
			return this.payer;
		}

		public void setPayer(String payer) {
			this.payer = payer;
		}

		public String getServiceBusinessStatus() {
			return this.serviceBusinessStatus;
		}

		public void setServiceBusinessStatus(String serviceBusinessStatus) {
			this.serviceBusinessStatus = serviceBusinessStatus;
		}

		public Integer getConnectBandwidth() {
			return this.connectBandwidth;
		}

		public void setConnectBandwidth(Integer connectBandwidth) {
			this.connectBandwidth = connectBandwidth;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDescription() {
			return this.serviceDescription;
		}

		public void setServiceDescription(String serviceDescription) {
			this.serviceDescription = serviceDescription;
		}

		public String getServiceResourceType() {
			return this.serviceResourceType;
		}

		public void setServiceResourceType(String serviceResourceType) {
			this.serviceResourceType = serviceResourceType;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public Boolean getServiceSupportIPv6() {
			return this.serviceSupportIPv6;
		}

		public void setServiceSupportIPv6(Boolean serviceSupportIPv6) {
			this.serviceSupportIPv6 = serviceSupportIPv6;
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
	public ListVpcEndpointServicesResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
