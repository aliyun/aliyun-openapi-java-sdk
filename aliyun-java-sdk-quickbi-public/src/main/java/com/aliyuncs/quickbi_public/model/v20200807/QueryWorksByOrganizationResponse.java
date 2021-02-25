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

package com.aliyuncs.quickbi_public.model.v20200807;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200807.QueryWorksByOrganizationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryWorksByOrganizationResponse extends AcsResponse {

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

			private Integer auth3rdFlag;

			private String description;

			private String gmtCreate;

			private String gmtModify;

			private String modifyName;

			private String ownerId;

			private String ownerName;

			private String securityLevel;

			private Integer status;

			private String workName;

			private String workType;

			private String worksId;

			private String workspaceId;

			private String workspaceName;

			private Directory directory;

			public Integer getAuth3rdFlag() {
				return this.auth3rdFlag;
			}

			public void setAuth3rdFlag(Integer auth3rdFlag) {
				this.auth3rdFlag = auth3rdFlag;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public String getModifyName() {
				return this.modifyName;
			}

			public void setModifyName(String modifyName) {
				this.modifyName = modifyName;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getSecurityLevel() {
				return this.securityLevel;
			}

			public void setSecurityLevel(String securityLevel) {
				this.securityLevel = securityLevel;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getWorkName() {
				return this.workName;
			}

			public void setWorkName(String workName) {
				this.workName = workName;
			}

			public String getWorkType() {
				return this.workType;
			}

			public void setWorkType(String workType) {
				this.workType = workType;
			}

			public String getWorksId() {
				return this.worksId;
			}

			public void setWorksId(String worksId) {
				this.worksId = worksId;
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

			public Directory getDirectory() {
				return this.directory;
			}

			public void setDirectory(Directory directory) {
				this.directory = directory;
			}

			public static class Directory {

				private String id;

				private String name;

				private String pathId;

				private String pathName;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getPathId() {
					return this.pathId;
				}

				public void setPathId(String pathId) {
					this.pathId = pathId;
				}

				public String getPathName() {
					return this.pathName;
				}

				public void setPathName(String pathName) {
					this.pathName = pathName;
				}
			}
		}
	}

	@Override
	public QueryWorksByOrganizationResponse getInstance(UnmarshallerContext context) {
		return	QueryWorksByOrganizationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
