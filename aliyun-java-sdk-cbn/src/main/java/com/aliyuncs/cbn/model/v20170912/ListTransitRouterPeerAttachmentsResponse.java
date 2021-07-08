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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterPeerAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterPeerAttachmentsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<TransitRouterAttachment> transitRouterAttachments;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<TransitRouterAttachment> getTransitRouterAttachments() {
		return this.transitRouterAttachments;
	}

	public void setTransitRouterAttachments(List<TransitRouterAttachment> transitRouterAttachments) {
		this.transitRouterAttachments = transitRouterAttachments;
	}

	public static class TransitRouterAttachment {

		private String transitRouterAttachmentId;

		private String peerTransitRouterRegionId;

		private Long peerTransitRouterOwnerId;

		private String peerTransitRouterId;

		private String transitRouterAttachmentName;

		private String resourceType;

		private String status;

		private String transitRouterAttachmentDescription;

		private String creationTime;

		private Boolean autoPublishRouteEnabled;

		private String transitRouterId;

		private Integer bandwidth;

		private String bandwidthPackageId;

		private String regionId;

		private String geographicSpanId;

		private String cenBandwidthPackageId;

		public String getTransitRouterAttachmentId() {
			return this.transitRouterAttachmentId;
		}

		public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
			this.transitRouterAttachmentId = transitRouterAttachmentId;
		}

		public String getPeerTransitRouterRegionId() {
			return this.peerTransitRouterRegionId;
		}

		public void setPeerTransitRouterRegionId(String peerTransitRouterRegionId) {
			this.peerTransitRouterRegionId = peerTransitRouterRegionId;
		}

		public Long getPeerTransitRouterOwnerId() {
			return this.peerTransitRouterOwnerId;
		}

		public void setPeerTransitRouterOwnerId(Long peerTransitRouterOwnerId) {
			this.peerTransitRouterOwnerId = peerTransitRouterOwnerId;
		}

		public String getPeerTransitRouterId() {
			return this.peerTransitRouterId;
		}

		public void setPeerTransitRouterId(String peerTransitRouterId) {
			this.peerTransitRouterId = peerTransitRouterId;
		}

		public String getTransitRouterAttachmentName() {
			return this.transitRouterAttachmentName;
		}

		public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
			this.transitRouterAttachmentName = transitRouterAttachmentName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTransitRouterAttachmentDescription() {
			return this.transitRouterAttachmentDescription;
		}

		public void setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
			this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Boolean getAutoPublishRouteEnabled() {
			return this.autoPublishRouteEnabled;
		}

		public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
			this.autoPublishRouteEnabled = autoPublishRouteEnabled;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGeographicSpanId() {
			return this.geographicSpanId;
		}

		public void setGeographicSpanId(String geographicSpanId) {
			this.geographicSpanId = geographicSpanId;
		}

		public String getCenBandwidthPackageId() {
			return this.cenBandwidthPackageId;
		}

		public void setCenBandwidthPackageId(String cenBandwidthPackageId) {
			this.cenBandwidthPackageId = cenBandwidthPackageId;
		}
	}

	@Override
	public ListTransitRouterPeerAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterPeerAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
