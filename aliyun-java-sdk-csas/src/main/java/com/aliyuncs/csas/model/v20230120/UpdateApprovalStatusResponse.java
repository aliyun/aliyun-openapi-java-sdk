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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.UpdateApprovalStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateApprovalStatusResponse extends AcsResponse {

	private String requestId;

	private List<Data> approval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getApproval() {
		return this.approval;
	}

	public void setApproval(List<Data> approval) {
		this.approval = approval;
	}

	public static class Data {

		private String approvalId;

		private Long endTimestamp;

		private String approvalDetail;

		private String status;

		private String processId;

		private String processName;

		private String policyType;

		private String schemaId;

		private String schemaName;

		private String schemaContent;

		private String creatorUserId;

		private String creatorDevTag;

		private String createTime;

		private String reason;

		private List<ApprovalProgressesItem> approvalProgresses;

		public String getApprovalId() {
			return this.approvalId;
		}

		public void setApprovalId(String approvalId) {
			this.approvalId = approvalId;
		}

		public Long getEndTimestamp() {
			return this.endTimestamp;
		}

		public void setEndTimestamp(Long endTimestamp) {
			this.endTimestamp = endTimestamp;
		}

		public String getApprovalDetail() {
			return this.approvalDetail;
		}

		public void setApprovalDetail(String approvalDetail) {
			this.approvalDetail = approvalDetail;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public String getProcessName() {
			return this.processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}

		public String getSchemaId() {
			return this.schemaId;
		}

		public void setSchemaId(String schemaId) {
			this.schemaId = schemaId;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getSchemaContent() {
			return this.schemaContent;
		}

		public void setSchemaContent(String schemaContent) {
			this.schemaContent = schemaContent;
		}

		public String getCreatorUserId() {
			return this.creatorUserId;
		}

		public void setCreatorUserId(String creatorUserId) {
			this.creatorUserId = creatorUserId;
		}

		public String getCreatorDevTag() {
			return this.creatorDevTag;
		}

		public void setCreatorDevTag(String creatorDevTag) {
			this.creatorDevTag = creatorDevTag;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public List<ApprovalProgressesItem> getApprovalProgresses() {
			return this.approvalProgresses;
		}

		public void setApprovalProgresses(List<ApprovalProgressesItem> approvalProgresses) {
			this.approvalProgresses = approvalProgresses;
		}

		public static class ApprovalProgressesItem {

			private String status;

			private String executor;

			private String action;

			private String comment;

			private Long timestamp;

			private List<OperatorsItem> operators;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getExecutor() {
				return this.executor;
			}

			public void setExecutor(String executor) {
				this.executor = executor;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public List<OperatorsItem> getOperators() {
				return this.operators;
			}

			public void setOperators(List<OperatorsItem> operators) {
				this.operators = operators;
			}

			public static class OperatorsItem {

				private String saseUserId;

				private String username;

				public String getSaseUserId() {
					return this.saseUserId;
				}

				public void setSaseUserId(String saseUserId) {
					this.saseUserId = saseUserId;
				}

				public String getUsername() {
					return this.username;
				}

				public void setUsername(String username) {
					this.username = username;
				}
			}
		}
	}

	@Override
	public UpdateApprovalStatusResponse getInstance(UnmarshallerContext context) {
		return	UpdateApprovalStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
