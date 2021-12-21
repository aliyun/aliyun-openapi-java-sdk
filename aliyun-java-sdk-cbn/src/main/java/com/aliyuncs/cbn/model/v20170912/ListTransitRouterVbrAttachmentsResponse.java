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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterVbrAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterVbrAttachmentsResponse extends AcsResponse {

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

		private String vbrRegionId;

		private String transitRouterAttachmentDescription;

		private Long vbrOwnerId;

		private Boolean autoPublishRouteEnabled;

		private String vbrId;

		private String transitRouterAttachmentName;

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

		public String getVbrRegionId() {
			return this.vbrRegionId;
		}

		public void setVbrRegionId(String vbrRegionId) {
			this.vbrRegionId = vbrRegionId;
		}

		public String getTransitRouterAttachmentDescription() {
			return this.transitRouterAttachmentDescription;
		}

		public void setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
			this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
		}

		public Long getVbrOwnerId() {
			return this.vbrOwnerId;
		}

		public void setVbrOwnerId(Long vbrOwnerId) {
			this.vbrOwnerId = vbrOwnerId;
		}

		public Boolean getAutoPublishRouteEnabled() {
			return this.autoPublishRouteEnabled;
		}

		public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
			this.autoPublishRouteEnabled = autoPublishRouteEnabled;
		}

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public String getTransitRouterAttachmentName() {
			return this.transitRouterAttachmentName;
		}

		public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
			this.transitRouterAttachmentName = transitRouterAttachmentName;
		}
	}

	@Override
	public ListTransitRouterVbrAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterVbrAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
