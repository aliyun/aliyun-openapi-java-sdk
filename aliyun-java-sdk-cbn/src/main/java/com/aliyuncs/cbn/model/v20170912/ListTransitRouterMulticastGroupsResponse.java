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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterMulticastGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterMulticastGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<TransitRouterMulticastGroup> transitRouterMulticastGroups;

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

	public List<TransitRouterMulticastGroup> getTransitRouterMulticastGroups() {
		return this.transitRouterMulticastGroups;
	}

	public void setTransitRouterMulticastGroups(List<TransitRouterMulticastGroup> transitRouterMulticastGroups) {
		this.transitRouterMulticastGroups = transitRouterMulticastGroups;
	}

	public static class TransitRouterMulticastGroup {

		private String groupIpAddress;

		private String transitRouterAttachmentId;

		private String vSwitchId;

		private String networkInterfaceId;

		private String peerTransitRouterMulticastDomainId;

		private String status;

		private Boolean groupSource;

		private Boolean groupMember;

		private String memberType;

		private String sourceType;

		private String resourceType;

		private Long resourceOwnerId;

		private String resourceId;

		public String getGroupIpAddress() {
			return this.groupIpAddress;
		}

		public void setGroupIpAddress(String groupIpAddress) {
			this.groupIpAddress = groupIpAddress;
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

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getPeerTransitRouterMulticastDomainId() {
			return this.peerTransitRouterMulticastDomainId;
		}

		public void setPeerTransitRouterMulticastDomainId(String peerTransitRouterMulticastDomainId) {
			this.peerTransitRouterMulticastDomainId = peerTransitRouterMulticastDomainId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getGroupSource() {
			return this.groupSource;
		}

		public void setGroupSource(Boolean groupSource) {
			this.groupSource = groupSource;
		}

		public Boolean getGroupMember() {
			return this.groupMember;
		}

		public void setGroupMember(Boolean groupMember) {
			this.groupMember = groupMember;
		}

		public String getMemberType() {
			return this.memberType;
		}

		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
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
	public ListTransitRouterMulticastGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterMulticastGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
