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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.AcceptResourceShareInvitationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AcceptResourceShareInvitationResponse extends AcsResponse {

	private String requestId;

	private ResourceShareInvitation resourceShareInvitation;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceShareInvitation getResourceShareInvitation() {
		return this.resourceShareInvitation;
	}

	public void setResourceShareInvitation(ResourceShareInvitation resourceShareInvitation) {
		this.resourceShareInvitation = resourceShareInvitation;
	}

	public static class ResourceShareInvitation {

		private String resourceShareInvitationId;

		private String resourceShareId;

		private String resourceShareName;

		private String senderAccountId;

		private String receiverAccountId;

		private String createTime;

		private String status;

		public String getResourceShareInvitationId() {
			return this.resourceShareInvitationId;
		}

		public void setResourceShareInvitationId(String resourceShareInvitationId) {
			this.resourceShareInvitationId = resourceShareInvitationId;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public AcceptResourceShareInvitationResponse getInstance(UnmarshallerContext context) {
		return	AcceptResourceShareInvitationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
