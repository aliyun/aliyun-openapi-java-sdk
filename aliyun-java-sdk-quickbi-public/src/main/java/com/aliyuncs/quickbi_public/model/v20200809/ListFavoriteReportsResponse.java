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

package com.aliyuncs.quickbi_public.model.v20200809;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200809.ListFavoriteReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFavoriteReportsResponse extends AcsResponse {

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

		private Integer totalNum;

		private Integer totalPages;

		private Integer pageNum;

		private Integer pageSize;

		private List<DataItem> data;

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

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String treeId;

			private String type;

			private String name;

			private String ownerNum;

			private String ownerName;

			private String gmtCreate;

			private String gmtModified;

			private Integer publishStatus;

			private Boolean favorite;

			private Boolean hasViewAuth;

			private Boolean hasEditAuth;

			private String workspaceId;

			private String workspaceName;

			public String getTreeId() {
				return this.treeId;
			}

			public void setTreeId(String treeId) {
				this.treeId = treeId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerNum() {
				return this.ownerNum;
			}

			public void setOwnerNum(String ownerNum) {
				this.ownerNum = ownerNum;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Integer getPublishStatus() {
				return this.publishStatus;
			}

			public void setPublishStatus(Integer publishStatus) {
				this.publishStatus = publishStatus;
			}

			public Boolean getFavorite() {
				return this.favorite;
			}

			public void setFavorite(Boolean favorite) {
				this.favorite = favorite;
			}

			public Boolean getHasViewAuth() {
				return this.hasViewAuth;
			}

			public void setHasViewAuth(Boolean hasViewAuth) {
				this.hasViewAuth = hasViewAuth;
			}

			public Boolean getHasEditAuth() {
				return this.hasEditAuth;
			}

			public void setHasEditAuth(Boolean hasEditAuth) {
				this.hasEditAuth = hasEditAuth;
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
	public ListFavoriteReportsResponse getInstance(UnmarshallerContext context) {
		return	ListFavoriteReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
