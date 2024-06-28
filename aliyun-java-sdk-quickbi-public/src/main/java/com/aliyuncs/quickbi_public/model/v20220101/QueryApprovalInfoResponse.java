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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryApprovalInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryApprovalInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer total;

		private Integer totalPages;

		private Integer start;

		private Integer pageSize;

		private Integer page;

		private List<ApprovalsResultModel> data;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getStart() {
			return this.start;
		}

		public void setStart(Integer start) {
			this.start = start;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public List<ApprovalsResultModel> getData() {
			return this.data;
		}

		public void setData(List<ApprovalsResultModel> data) {
			this.data = data;
		}

		public static class ApprovalsResultModel {

			private String workspaceName;

			private String applicationId;

			private String applicantId;

			private String applicantName;

			private String approverId;

			private String approverName;

			private String resourceId;

			private String resourceName;

			private String resourceType;

			private String applyReason;

			private String handleReason;

			private Long expireDate;

			private Long gmtCreate;

			private Long gmtModified;

			private Integer flagStatus;

			private Boolean deleteFlag;

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}

			public String getApplicationId() {
				return this.applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}

			public String getApplicantId() {
				return this.applicantId;
			}

			public void setApplicantId(String applicantId) {
				this.applicantId = applicantId;
			}

			public String getApplicantName() {
				return this.applicantName;
			}

			public void setApplicantName(String applicantName) {
				this.applicantName = applicantName;
			}

			public String getApproverId() {
				return this.approverId;
			}

			public void setApproverId(String approverId) {
				this.approverId = approverId;
			}

			public String getApproverName() {
				return this.approverName;
			}

			public void setApproverName(String approverName) {
				this.approverName = approverName;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getApplyReason() {
				return this.applyReason;
			}

			public void setApplyReason(String applyReason) {
				this.applyReason = applyReason;
			}

			public String getHandleReason() {
				return this.handleReason;
			}

			public void setHandleReason(String handleReason) {
				this.handleReason = handleReason;
			}

			public Long getExpireDate() {
				return this.expireDate;
			}

			public void setExpireDate(Long expireDate) {
				this.expireDate = expireDate;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Integer getFlagStatus() {
				return this.flagStatus;
			}

			public void setFlagStatus(Integer flagStatus) {
				this.flagStatus = flagStatus;
			}

			public Boolean getDeleteFlag() {
				return this.deleteFlag;
			}

			public void setDeleteFlag(Boolean deleteFlag) {
				this.deleteFlag = deleteFlag;
			}
		}
	}

	@Override
	public QueryApprovalInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryApprovalInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
