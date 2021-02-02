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

package com.aliyuncs.quickbi_public.model.v20200806;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200806.QueryDatasetListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDatasetListResponse extends AcsResponse {

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

			private String datasetId;

			private String datasetName;

			private String description;

			private String createTime;

			private String modifyTime;

			private String ownerId;

			private String ownerName;

			private Boolean rowLevel;

			private String workspaceId;

			private String workspaceName;

			private DataSource dataSource;

			private Directory directory;

			public String getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(String datasetId) {
				this.datasetId = datasetId;
			}

			public String getDatasetName() {
				return this.datasetName;
			}

			public void setDatasetName(String datasetName) {
				this.datasetName = datasetName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
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

			public Boolean getRowLevel() {
				return this.rowLevel;
			}

			public void setRowLevel(Boolean rowLevel) {
				this.rowLevel = rowLevel;
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

			public DataSource getDataSource() {
				return this.dataSource;
			}

			public void setDataSource(DataSource dataSource) {
				this.dataSource = dataSource;
			}

			public Directory getDirectory() {
				return this.directory;
			}

			public void setDirectory(Directory directory) {
				this.directory = directory;
			}

			public static class DataSource {

				private String dsId;

				private String dsName;

				private String dsType;

				public String getDsId() {
					return this.dsId;
				}

				public void setDsId(String dsId) {
					this.dsId = dsId;
				}

				public String getDsName() {
					return this.dsName;
				}

				public void setDsName(String dsName) {
					this.dsName = dsName;
				}

				public String getDsType() {
					return this.dsType;
				}

				public void setDsType(String dsType) {
					this.dsType = dsType;
				}
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
	public QueryDatasetListResponse getInstance(UnmarshallerContext context) {
		return	QueryDatasetListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
