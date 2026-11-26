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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListBranchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBranchesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private String nextToken;

	private Integer pageNumber;

	private Integer maxResults;

	private List<Branch> branches;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Branch> getBranches() {
		return this.branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public static class Branch {

		private Boolean isDefault;

		private String status;

		private Boolean _protected;

		private String description;

		private String parentLSN;

		private String createTime;

		private String projectId;

		private String branchId;

		private String parentBranchName;

		private String spbProjectId;

		private String parentBranchId;

		private String serviceType;

		private String initSource;

		private String branchName;

		private String expiresAt;

		private String parentTimestamp;

		private List<Tag> tags;

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean get_Protected() {
			return this._protected;
		}

		public void set_Protected(Boolean _protected) {
			this._protected = _protected;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getParentLSN() {
			return this.parentLSN;
		}

		public void setParentLSN(String parentLSN) {
			this.parentLSN = parentLSN;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getBranchId() {
			return this.branchId;
		}

		public void setBranchId(String branchId) {
			this.branchId = branchId;
		}

		public String getParentBranchName() {
			return this.parentBranchName;
		}

		public void setParentBranchName(String parentBranchName) {
			this.parentBranchName = parentBranchName;
		}

		public String getSpbProjectId() {
			return this.spbProjectId;
		}

		public void setSpbProjectId(String spbProjectId) {
			this.spbProjectId = spbProjectId;
		}

		public String getParentBranchId() {
			return this.parentBranchId;
		}

		public void setParentBranchId(String parentBranchId) {
			this.parentBranchId = parentBranchId;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getInitSource() {
			return this.initSource;
		}

		public void setInitSource(String initSource) {
			this.initSource = initSource;
		}

		public String getBranchName() {
			return this.branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getExpiresAt() {
			return this.expiresAt;
		}

		public void setExpiresAt(String expiresAt) {
			this.expiresAt = expiresAt;
		}

		public String getParentTimestamp() {
			return this.parentTimestamp;
		}

		public void setParentTimestamp(String parentTimestamp) {
			this.parentTimestamp = parentTimestamp;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public ListBranchesResponse getInstance(UnmarshallerContext context) {
		return	ListBranchesResponseUnmarshaller.unmarshall(this, context);
	}
}
