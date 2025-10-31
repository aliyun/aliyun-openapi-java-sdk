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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterVpcAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterVpcAttachmentsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<TransitRouterAttachment> transitRouterAttachments;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<TransitRouterAttachment> getTransitRouterAttachments() {
		return this.transitRouterAttachments;
	}

	public void setTransitRouterAttachments(List<TransitRouterAttachment> transitRouterAttachments) {
		this.transitRouterAttachments = transitRouterAttachments;
	}

	public static class TransitRouterAttachment {

		private String creationTime;

		private String status;

		private String vpcId;

		private String transitRouterAttachmentId;

		private String transitRouterId;

		private String resourceType;

		private String transitRouterAttachmentDescription;

		private Long vpcOwnerId;

		private String vpcRegionId;

		private String transitRouterAttachmentName;

		private String serviceMode;

		private Boolean autoPublishRouteEnabled;

		private String chargeType;

		private String orderType;

		private String managedService;

		private Map<Object,Object> transitRouterVPCAttachmentOptions;

		private String cenId;

		private List<ZoneMapping> zoneMappings;

		private List<Tag> tags;

		private Options options;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getTransitRouterAttachmentId() {
			return this.transitRouterAttachmentId;
		}

		public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
			this.transitRouterAttachmentId = transitRouterAttachmentId;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getTransitRouterAttachmentDescription() {
			return this.transitRouterAttachmentDescription;
		}

		public void setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
			this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
		}

		public Long getVpcOwnerId() {
			return this.vpcOwnerId;
		}

		public void setVpcOwnerId(Long vpcOwnerId) {
			this.vpcOwnerId = vpcOwnerId;
		}

		public String getVpcRegionId() {
			return this.vpcRegionId;
		}

		public void setVpcRegionId(String vpcRegionId) {
			this.vpcRegionId = vpcRegionId;
		}

		public String getTransitRouterAttachmentName() {
			return this.transitRouterAttachmentName;
		}

		public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
			this.transitRouterAttachmentName = transitRouterAttachmentName;
		}

		public String getServiceMode() {
			return this.serviceMode;
		}

		public void setServiceMode(String serviceMode) {
			this.serviceMode = serviceMode;
		}

		public Boolean getAutoPublishRouteEnabled() {
			return this.autoPublishRouteEnabled;
		}

		public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
			this.autoPublishRouteEnabled = autoPublishRouteEnabled;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getManagedService() {
			return this.managedService;
		}

		public void setManagedService(String managedService) {
			this.managedService = managedService;
		}

		public Map<Object,Object> getTransitRouterVPCAttachmentOptions() {
			return this.transitRouterVPCAttachmentOptions;
		}

		public void setTransitRouterVPCAttachmentOptions(Map<Object,Object> transitRouterVPCAttachmentOptions) {
			this.transitRouterVPCAttachmentOptions = transitRouterVPCAttachmentOptions;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public List<ZoneMapping> getZoneMappings() {
			return this.zoneMappings;
		}

		public void setZoneMappings(List<ZoneMapping> zoneMappings) {
			this.zoneMappings = zoneMappings;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Options getOptions() {
			return this.options;
		}

		public void setOptions(Options options) {
			this.options = options;
		}

		public static class ZoneMapping {

			private String zoneId;

			private String vSwitchId;

			private String networkInterfaceId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}
		}

		public static class Tag {

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

		public static class Options {

			private String ipv6Support;

			private String applianceModeSupport;

			public String getIpv6Support() {
				return this.ipv6Support;
			}

			public void setIpv6Support(String ipv6Support) {
				this.ipv6Support = ipv6Support;
			}

			public String getApplianceModeSupport() {
				return this.applianceModeSupport;
			}

			public void setApplianceModeSupport(String applianceModeSupport) {
				this.applianceModeSupport = applianceModeSupport;
			}
		}
	}

	@Override
	public ListTransitRouterVpcAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterVpcAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
