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
import com.aliyuncs.quickbi_public.transform.v20220101.ListRecentViewReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRecentViewReportsResponse extends AcsResponse {

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

		private String attention;

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalNum;

		private Integer totalPages;

		private List<DataItem> data;

		public String getAttention() {
			return this.attention;
		}

		public void setAttention(String attention) {
			this.attention = attention;
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

			private Boolean favorite;

			private String gmtCreate;

			private String gmtModified;

			private Boolean hasEditAuth;

			private Boolean hasViewAuth;

			private String latestViewTime;

			private String name;

			private String ownerName;

			private String ownerNum;

			private Integer publishStatus;

			private String treeId;

			private String type;

			private Long viewCount;

			private String workspaceId;

			private String workspaceName;

			public Boolean getFavorite() {
				return this.favorite;
			}

			public void setFavorite(Boolean favorite) {
				this.favorite = favorite;
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

			public Boolean getHasEditAuth() {
				return this.hasEditAuth;
			}

			public void setHasEditAuth(Boolean hasEditAuth) {
				this.hasEditAuth = hasEditAuth;
			}

			public Boolean getHasViewAuth() {
				return this.hasViewAuth;
			}

			public void setHasViewAuth(Boolean hasViewAuth) {
				this.hasViewAuth = hasViewAuth;
			}

			public String getLatestViewTime() {
				return this.latestViewTime;
			}

			public void setLatestViewTime(String latestViewTime) {
				this.latestViewTime = latestViewTime;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getOwnerNum() {
				return this.ownerNum;
			}

			public void setOwnerNum(String ownerNum) {
				this.ownerNum = ownerNum;
			}

			public Integer getPublishStatus() {
				return this.publishStatus;
			}

			public void setPublishStatus(Integer publishStatus) {
				this.publishStatus = publishStatus;
			}

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

			public Long getViewCount() {
				return this.viewCount;
			}

			public void setViewCount(Long viewCount) {
				this.viewCount = viewCount;
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
	public ListRecentViewReportsResponse getInstance(UnmarshallerContext context) {
		return	ListRecentViewReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
