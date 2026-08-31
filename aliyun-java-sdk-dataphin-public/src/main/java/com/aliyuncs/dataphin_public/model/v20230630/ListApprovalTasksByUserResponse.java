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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListApprovalTasksByUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApprovalTasksByUserResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<ApprovalTaskInfo> taskList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ApprovalTaskInfo> getTaskList() {
			return this.taskList;
		}

		public void setTaskList(List<ApprovalTaskInfo> taskList) {
			this.taskList = taskList;
		}

		public static class ApprovalTaskInfo {

			private String status;

			private String submittedAt;

			private String applicantId;

			private String relationType;

			private String applicantName;

			private String approvalType;

			private String title;

			private Long id;

			private String sourceSystem;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSubmittedAt() {
				return this.submittedAt;
			}

			public void setSubmittedAt(String submittedAt) {
				this.submittedAt = submittedAt;
			}

			public String getApplicantId() {
				return this.applicantId;
			}

			public void setApplicantId(String applicantId) {
				this.applicantId = applicantId;
			}

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}

			public String getApplicantName() {
				return this.applicantName;
			}

			public void setApplicantName(String applicantName) {
				this.applicantName = applicantName;
			}

			public String getApprovalType() {
				return this.approvalType;
			}

			public void setApprovalType(String approvalType) {
				this.approvalType = approvalType;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getSourceSystem() {
				return this.sourceSystem;
			}

			public void setSourceSystem(String sourceSystem) {
				this.sourceSystem = sourceSystem;
			}
		}
	}

	@Override
	public ListApprovalTasksByUserResponse getInstance(UnmarshallerContext context) {
		return	ListApprovalTasksByUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
