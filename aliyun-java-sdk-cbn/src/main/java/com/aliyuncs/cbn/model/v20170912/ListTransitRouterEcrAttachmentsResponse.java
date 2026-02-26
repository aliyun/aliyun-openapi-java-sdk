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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterEcrAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterEcrAttachmentsResponse extends AcsResponse {

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

		private String transitRouterAttachmentId;

		private String transitRouterId;

		private String resourceType;

		private String transitRouterRegionId;

		private String transitRouterAttachmentDescription;

		private Long ecrOwnerId;

		private Boolean autoPublishRouteEnabled;

		private String ecrId;

		private String transitRouterAttachmentName;

		private String cenId;

		private String orderType;

		private List<Tag> tags;

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

		public String getTransitRouterRegionId() {
			return this.transitRouterRegionId;
		}

		public void setTransitRouterRegionId(String transitRouterRegionId) {
			this.transitRouterRegionId = transitRouterRegionId;
		}

		public String getTransitRouterAttachmentDescription() {
			return this.transitRouterAttachmentDescription;
		}

		public void setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
			this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
		}

		public Long getEcrOwnerId() {
			return this.ecrOwnerId;
		}

		public void setEcrOwnerId(Long ecrOwnerId) {
			this.ecrOwnerId = ecrOwnerId;
		}

		public Boolean getAutoPublishRouteEnabled() {
			return this.autoPublishRouteEnabled;
		}

		public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
			this.autoPublishRouteEnabled = autoPublishRouteEnabled;
		}

		public String getEcrId() {
			return this.ecrId;
		}

		public void setEcrId(String ecrId) {
			this.ecrId = ecrId;
		}

		public String getTransitRouterAttachmentName() {
			return this.transitRouterAttachmentName;
		}

		public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
			this.transitRouterAttachmentName = transitRouterAttachmentName;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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
	}

	@Override
	public ListTransitRouterEcrAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterEcrAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
