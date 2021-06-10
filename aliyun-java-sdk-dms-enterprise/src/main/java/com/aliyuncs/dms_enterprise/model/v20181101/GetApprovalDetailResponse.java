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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetApprovalDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApprovalDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private ApprovalDetail approvalDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ApprovalDetail getApprovalDetail() {
		return this.approvalDetail;
	}

	public void setApprovalDetail(ApprovalDetail approvalDetail) {
		this.approvalDetail = approvalDetail;
	}

	public static class ApprovalDetail {

		private String description;

		private String orderType;

		private String title;

		private Long auditId;

		private Long orderId;

		private String workflowInsCode;

		private List<WorkflowNode> workflowNodes;

		private List<CurrentHandler> currentHandlers;

		private List<String> reasonList;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Long getAuditId() {
			return this.auditId;
		}

		public void setAuditId(Long auditId) {
			this.auditId = auditId;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getWorkflowInsCode() {
			return this.workflowInsCode;
		}

		public void setWorkflowInsCode(String workflowInsCode) {
			this.workflowInsCode = workflowInsCode;
		}

		public List<WorkflowNode> getWorkflowNodes() {
			return this.workflowNodes;
		}

		public void setWorkflowNodes(List<WorkflowNode> workflowNodes) {
			this.workflowNodes = workflowNodes;
		}

		public List<CurrentHandler> getCurrentHandlers() {
			return this.currentHandlers;
		}

		public void setCurrentHandlers(List<CurrentHandler> currentHandlers) {
			this.currentHandlers = currentHandlers;
		}

		public List<String> getReasonList() {
			return this.reasonList;
		}

		public void setReasonList(List<String> reasonList) {
			this.reasonList = reasonList;
		}

		public static class WorkflowNode {

			private String operateTime;

			private Long operatorId;

			private String nodeName;

			private String operateComment;

			private String workflowInsCode;

			private List<String> auditUserIdList;

			public String getOperateTime() {
				return this.operateTime;
			}

			public void setOperateTime(String operateTime) {
				this.operateTime = operateTime;
			}

			public Long getOperatorId() {
				return this.operatorId;
			}

			public void setOperatorId(Long operatorId) {
				this.operatorId = operatorId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getOperateComment() {
				return this.operateComment;
			}

			public void setOperateComment(String operateComment) {
				this.operateComment = operateComment;
			}

			public String getWorkflowInsCode() {
				return this.workflowInsCode;
			}

			public void setWorkflowInsCode(String workflowInsCode) {
				this.workflowInsCode = workflowInsCode;
			}

			public List<String> getAuditUserIdList() {
				return this.auditUserIdList;
			}

			public void setAuditUserIdList(List<String> auditUserIdList) {
				this.auditUserIdList = auditUserIdList;
			}
		}

		public static class CurrentHandler {

			private String nickName;

			private Long id;

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetApprovalDetailResponse getInstance(UnmarshallerContext context) {
		return	GetApprovalDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
