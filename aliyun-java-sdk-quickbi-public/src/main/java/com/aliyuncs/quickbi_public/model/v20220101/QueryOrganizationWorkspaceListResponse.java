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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryOrganizationWorkspaceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrganizationWorkspaceListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Result result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalNum;

		private Integer totalPages;

		private List<DataItem> data;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private Boolean allowPublishOperation;

			private Boolean allowShareOperation;

			private String createTime;

			private String createUser;

			private String createUserAccountName;

			private String modifiedTime;

			private String modifyUser;

			private String modifyUserAccountName;

			private String organizationId;

			private String owner;

			private String ownerAccountName;

			private String workspaceDescription;

			private String workspaceId;

			private String workspaceName;

			public Boolean getAllowPublishOperation() {
				return this.allowPublishOperation;
			}

			public void setAllowPublishOperation(Boolean allowPublishOperation) {
				this.allowPublishOperation = allowPublishOperation;
			}

			public Boolean getAllowShareOperation() {
				return this.allowShareOperation;
			}

			public void setAllowShareOperation(Boolean allowShareOperation) {
				this.allowShareOperation = allowShareOperation;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public String getCreateUserAccountName() {
				return this.createUserAccountName;
			}

			public void setCreateUserAccountName(String createUserAccountName) {
				this.createUserAccountName = createUserAccountName;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getModifyUser() {
				return this.modifyUser;
			}

			public void setModifyUser(String modifyUser) {
				this.modifyUser = modifyUser;
			}

			public String getModifyUserAccountName() {
				return this.modifyUserAccountName;
			}

			public void setModifyUserAccountName(String modifyUserAccountName) {
				this.modifyUserAccountName = modifyUserAccountName;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getOwnerAccountName() {
				return this.ownerAccountName;
			}

			public void setOwnerAccountName(String ownerAccountName) {
				this.ownerAccountName = ownerAccountName;
			}

			public String getWorkspaceDescription() {
				return this.workspaceDescription;
			}

			public void setWorkspaceDescription(String workspaceDescription) {
				this.workspaceDescription = workspaceDescription;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}
		}
	}

	@Override
	public QueryOrganizationWorkspaceListResponse getInstance(UnmarshallerContext context) {
		return	QueryOrganizationWorkspaceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
