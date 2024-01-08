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

package com.aliyuncs.resourcesharing.model.v20200110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.ListResourceShareInvitationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceShareInvitationsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<ResourceShareInvitation> resourceShareInvitations;

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

	public List<ResourceShareInvitation> getResourceShareInvitations() {
		return this.resourceShareInvitations;
	}

	public void setResourceShareInvitations(List<ResourceShareInvitation> resourceShareInvitations) {
		this.resourceShareInvitations = resourceShareInvitations;
	}

	public static class ResourceShareInvitation {

		private String status;

		private String createTime;

		private String resourceShareId;

		private String resourceShareName;

		private String senderAccountId;

		private String receiverAccountId;

		private String resourceShareInvitationId;

		private List<InvitationFailedDetail> invitationFailedDetails;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getResourceShareId() {
			return this.resourceShareId;
		}

		public void setResourceShareId(String resourceShareId) {
			this.resourceShareId = resourceShareId;
		}

		public String getResourceShareName() {
			return this.resourceShareName;
		}

		public void setResourceShareName(String resourceShareName) {
			this.resourceShareName = resourceShareName;
		}

		public String getSenderAccountId() {
			return this.senderAccountId;
		}

		public void setSenderAccountId(String senderAccountId) {
			this.senderAccountId = senderAccountId;
		}

		public String getReceiverAccountId() {
			return this.receiverAccountId;
		}

		public void setReceiverAccountId(String receiverAccountId) {
			this.receiverAccountId = receiverAccountId;
		}

		public String getResourceShareInvitationId() {
			return this.resourceShareInvitationId;
		}

		public void setResourceShareInvitationId(String resourceShareInvitationId) {
			this.resourceShareInvitationId = resourceShareInvitationId;
		}

		public List<InvitationFailedDetail> getInvitationFailedDetails() {
			return this.invitationFailedDetails;
		}

		public void setInvitationFailedDetails(List<InvitationFailedDetail> invitationFailedDetails) {
			this.invitationFailedDetails = invitationFailedDetails;
		}

		public static class InvitationFailedDetail {

			private String status;

			private String statusMessage;

			private String associateType;

			private String resourceId;

			private String resourceType;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String statusMessage) {
				this.statusMessage = statusMessage;
			}

			public String getAssociateType() {
				return this.associateType;
			}

			public void setAssociateType(String associateType) {
				this.associateType = associateType;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}
		}
	}

	@Override
	public ListResourceShareInvitationsResponse getInstance(UnmarshallerContext context) {
		return	ListResourceShareInvitationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
