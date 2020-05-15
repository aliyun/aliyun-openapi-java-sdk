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
import com.aliyuncs.hbr.transform.v20170908.DescribeBackupSourceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSourceGroupsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<BackupSourceGroup> backupSourceGroups;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<BackupSourceGroup> getBackupSourceGroups() {
		return this.backupSourceGroups;
	}

	public void setBackupSourceGroups(List<BackupSourceGroup> backupSourceGroups) {
		this.backupSourceGroups = backupSourceGroups;
	}

	public static class BackupSourceGroup {

		private String backupSourceGroupId;

		private String description;

		private String sourceType;

		private Integer backupSourceCount;

		private String clusterId;

		private Long createdTime;

		private Long updatedTime;

		public String getBackupSourceGroupId() {
			return this.backupSourceGroupId;
		}

		public void setBackupSourceGroupId(String backupSourceGroupId) {
			this.backupSourceGroupId = backupSourceGroupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Integer getBackupSourceCount() {
			return this.backupSourceCount;
		}

		public void setBackupSourceCount(Integer backupSourceCount) {
			this.backupSourceCount = backupSourceCount;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
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
	}

	@Override
	public DescribeBackupSourceGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupSourceGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
