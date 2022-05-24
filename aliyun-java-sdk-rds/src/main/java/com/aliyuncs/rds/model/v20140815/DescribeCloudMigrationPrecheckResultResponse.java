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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeCloudMigrationPrecheckResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudMigrationPrecheckResultResponse extends AcsResponse {

	private Integer totalSize;

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private List<MigrateCloudTaskList> items;

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<MigrateCloudTaskList> getItems() {
		return this.items;
	}

	public void setItems(List<MigrateCloudTaskList> items) {
		this.items = items;
	}

	public static class MigrateCloudTaskList {

		private String gmtCreated;

		private String gmtModified;

		private Long taskId;

		private String taskName;

		private String status;

		private String sourceCategory;

		private String sourceIpAddress;

		private Long sourcePort;

		private String sourceAccount;

		private String sourcePassword;

		private String targetEip;

		private String targetInstanceName;

		private String detail;

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceCategory() {
			return this.sourceCategory;
		}

		public void setSourceCategory(String sourceCategory) {
			this.sourceCategory = sourceCategory;
		}

		public String getSourceIpAddress() {
			return this.sourceIpAddress;
		}

		public void setSourceIpAddress(String sourceIpAddress) {
			this.sourceIpAddress = sourceIpAddress;
		}

		public Long getSourcePort() {
			return this.sourcePort;
		}

		public void setSourcePort(Long sourcePort) {
			this.sourcePort = sourcePort;
		}

		public String getSourceAccount() {
			return this.sourceAccount;
		}

		public void setSourceAccount(String sourceAccount) {
			this.sourceAccount = sourceAccount;
		}

		public String getSourcePassword() {
			return this.sourcePassword;
		}

		public void setSourcePassword(String sourcePassword) {
			this.sourcePassword = sourcePassword;
		}

		public String getTargetEip() {
			return this.targetEip;
		}

		public void setTargetEip(String targetEip) {
			this.targetEip = targetEip;
		}

		public String getTargetInstanceName() {
			return this.targetInstanceName;
		}

		public void setTargetInstanceName(String targetInstanceName) {
			this.targetInstanceName = targetInstanceName;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
	}

	@Override
	public DescribeCloudMigrationPrecheckResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudMigrationPrecheckResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
