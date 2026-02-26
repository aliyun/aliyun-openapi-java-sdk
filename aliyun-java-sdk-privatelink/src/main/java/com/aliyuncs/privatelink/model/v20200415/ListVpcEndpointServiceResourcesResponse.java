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
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointServiceResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointServiceResourcesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<Resource> resources;

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

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String vpcId;

		private String vSwitchId;

		private String resourceType;

		private String zoneId;

		private String ip;

		private String resourceId;

		private String regionId;

		private Long relatedEndpointCount;

		private Long relatedDeprecatedEndpointCount;

		private Boolean autoAllocatedEnabled;

		private String statusInfo;

		private Boolean resourceSupportIPv6;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getRelatedEndpointCount() {
			return this.relatedEndpointCount;
		}

		public void setRelatedEndpointCount(Long relatedEndpointCount) {
			this.relatedEndpointCount = relatedEndpointCount;
		}

		public Long getRelatedDeprecatedEndpointCount() {
			return this.relatedDeprecatedEndpointCount;
		}

		public void setRelatedDeprecatedEndpointCount(Long relatedDeprecatedEndpointCount) {
			this.relatedDeprecatedEndpointCount = relatedDeprecatedEndpointCount;
		}

		public Boolean getAutoAllocatedEnabled() {
			return this.autoAllocatedEnabled;
		}

		public void setAutoAllocatedEnabled(Boolean autoAllocatedEnabled) {
			this.autoAllocatedEnabled = autoAllocatedEnabled;
		}

		public String getStatusInfo() {
			return this.statusInfo;
		}

		public void setStatusInfo(String statusInfo) {
			this.statusInfo = statusInfo;
		}

		public Boolean getResourceSupportIPv6() {
			return this.resourceSupportIPv6;
		}

		public void setResourceSupportIPv6(Boolean resourceSupportIPv6) {
			this.resourceSupportIPv6 = resourceSupportIPv6;
		}
	}

	@Override
	public ListVpcEndpointServiceResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointServiceResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
