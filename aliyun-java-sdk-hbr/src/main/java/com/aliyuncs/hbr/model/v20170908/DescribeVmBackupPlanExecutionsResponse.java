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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeVmBackupPlanExecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmBackupPlanExecutionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Execution> executions;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Execution> getExecutions() {
		return this.executions;
	}

	public void setExecutions(List<Execution> executions) {
		this.executions = executions;
	}

	public static class Execution {

		private String executionId;

		private String vmBackupPlanId;

		private String backupType;

		private String status;

		private String errorMessage;

		private String detail;

		private Long createdTime;

		private Long updatedTime;

		private String vmBackupPlanName;

		private Boolean backupPlanExisted;

		public String getExecutionId() {
			return this.executionId;
		}

		public void setExecutionId(String executionId) {
			this.executionId = executionId;
		}

		public String getVmBackupPlanId() {
			return this.vmBackupPlanId;
		}

		public void setVmBackupPlanId(String vmBackupPlanId) {
			this.vmBackupPlanId = vmBackupPlanId;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getVmBackupPlanName() {
			return this.vmBackupPlanName;
		}

		public void setVmBackupPlanName(String vmBackupPlanName) {
			this.vmBackupPlanName = vmBackupPlanName;
		}

		public Boolean getBackupPlanExisted() {
			return this.backupPlanExisted;
		}

		public void setBackupPlanExisted(Boolean backupPlanExisted) {
			this.backupPlanExisted = backupPlanExisted;
		}
	}

	@Override
	public DescribeVmBackupPlanExecutionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmBackupPlanExecutionsResponseUnmarshaller.unmarshall(this, context);
	}
}
