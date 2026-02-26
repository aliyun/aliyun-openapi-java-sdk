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
import com.aliyuncs.dms_enterprise.transform.v20181101.PreviewWorkflowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreviewWorkflowResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private WorkflowDetail workflowDetail;

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

	public WorkflowDetail getWorkflowDetail() {
		return this.workflowDetail;
	}

	public void setWorkflowDetail(WorkflowDetail workflowDetail) {
		this.workflowDetail = workflowDetail;
	}

	public static class WorkflowDetail {

		private String wfCateName;

		private String comment;

		private List<WorkflowNode> workflowNodeList;

		public String getWfCateName() {
			return this.wfCateName;
		}

		public void setWfCateName(String wfCateName) {
			this.wfCateName = wfCateName;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public List<WorkflowNode> getWorkflowNodeList() {
			return this.workflowNodeList;
		}

		public void setWorkflowNodeList(List<WorkflowNode> workflowNodeList) {
			this.workflowNodeList = workflowNodeList;
		}

		public static class WorkflowNode {

			private String nodeName;

			private String nodeType;

			private String comment;

			private List<AuditUser> auditUserList;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public List<AuditUser> getAuditUserList() {
				return this.auditUserList;
			}

			public void setAuditUserList(List<AuditUser> auditUserList) {
				this.auditUserList = auditUserList;
			}

			public static class AuditUser {

				private Long userId;

				private String nickName;

				private String realName;

				public Long getUserId() {
					return this.userId;
				}

				public void setUserId(Long userId) {
					this.userId = userId;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getRealName() {
					return this.realName;
				}

				public void setRealName(String realName) {
					this.realName = realName;
				}
			}
		}
	}

	@Override
	public PreviewWorkflowResponse getInstance(UnmarshallerContext context) {
		return	PreviewWorkflowResponseUnmarshaller.unmarshall(this, context);
	}
}
