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

		private String chargeType;

		private List<ZoneMapping> zoneMappings;

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

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public List<ZoneMapping> getZoneMappings() {
			return this.zoneMappings;
		}

		public void setZoneMappings(List<ZoneMapping> zoneMappings) {
			this.zoneMappings = zoneMappings;
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
