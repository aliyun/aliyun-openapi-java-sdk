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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterMulticastDomainAssociationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterMulticastDomainAssociationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<TransitRouterMulticastAssociation> transitRouterMulticastAssociations;

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

	public List<TransitRouterMulticastAssociation> getTransitRouterMulticastAssociations() {
		return this.transitRouterMulticastAssociations;
	}

	public void setTransitRouterMulticastAssociations(List<TransitRouterMulticastAssociation> transitRouterMulticastAssociations) {
		this.transitRouterMulticastAssociations = transitRouterMulticastAssociations;
	}

	public static class TransitRouterMulticastAssociation {

		private String transitRouterMulticastDomainId;

		private String transitRouterAttachmentId;

		private String vSwitchId;

		private String status;

		private String resourceType;

		private Long resourceOwnerId;

		private String resourceId;

		public String getTransitRouterMulticastDomainId() {
			return this.transitRouterMulticastDomainId;
		}

		public void setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
			this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
		}

		public String getTransitRouterAttachmentId() {
			return this.transitRouterAttachmentId;
		}

		public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
			this.transitRouterAttachmentId = transitRouterAttachmentId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}
	}

	@Override
	public ListTransitRouterMulticastDomainAssociationsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterMulticastDomainAssociationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
