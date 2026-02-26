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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeFilesetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFilesetsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String fileSystemId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Entrie> entries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
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

	public List<Entrie> getEntries() {
		return this.entries;
	}

	public void setEntries(List<Entrie> entries) {
		this.entries = entries;
	}

	public static class Entrie {

		private String description;

		private String fileSystemPath;

		private String fsetId;

		private String status;

		private String createTime;

		private String updateTime;

		private Boolean deletionProtection;

		private Long fileCountUsage;

		private Long spaceUsage;

		private String fileSystemId;

		private Quota quota;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFileSystemPath() {
			return this.fileSystemPath;
		}

		public void setFileSystemPath(String fileSystemPath) {
			this.fileSystemPath = fileSystemPath;
		}

		public String getFsetId() {
			return this.fsetId;
		}

		public void setFsetId(String fsetId) {
			this.fsetId = fsetId;
		}

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

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public Long getFileCountUsage() {
			return this.fileCountUsage;
		}

		public void setFileCountUsage(Long fileCountUsage) {
			this.fileCountUsage = fileCountUsage;
		}

		public Long getSpaceUsage() {
			return this.spaceUsage;
		}

		public void setSpaceUsage(Long spaceUsage) {
			this.spaceUsage = spaceUsage;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public static class Quota {

			private Long sizeLimit;

			private Long fileCountLimit;

			public Long getSizeLimit() {
				return this.sizeLimit;
			}

			public void setSizeLimit(Long sizeLimit) {
				this.sizeLimit = sizeLimit;
			}

			public Long getFileCountLimit() {
				return this.fileCountLimit;
			}

			public void setFileCountLimit(Long fileCountLimit) {
				this.fileCountLimit = fileCountLimit;
			}
		}
	}

	@Override
	public DescribeFilesetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFilesetsResponseUnmarshaller.unmarshall(this, context);
	}
}
