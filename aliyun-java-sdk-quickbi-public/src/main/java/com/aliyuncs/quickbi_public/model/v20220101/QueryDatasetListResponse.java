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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryDatasetListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDatasetListResponse extends AcsResponse {

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

		private Integer totalPages;

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalNum;

		private List<DataItem> data;

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

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private Boolean rowLevel;

			private String workspaceId;

			private String description;

			private String createTime;

			private String ownerName;

			private String workspaceName;

			private String ownerId;

			private String modifyTime;

			private String datasetName;

			private String datasetId;

			private DataSource dataSource;

			private Directory directory;

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

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getDatasetName() {
				return this.datasetName;
			}

			public void setDatasetName(String datasetName) {
				this.datasetName = datasetName;
			}

			public String getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(String datasetId) {
				this.datasetId = datasetId;
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

				private String dsType;

				private String dsName;

				private String dsId;

				public String getDsType() {
					return this.dsType;
				}

				public void setDsType(String dsType) {
					this.dsType = dsType;
				}

				public String getDsName() {
					return this.dsName;
				}

				public void setDsName(String dsName) {
					this.dsName = dsName;
				}

				public String getDsId() {
					return this.dsId;
				}

				public void setDsId(String dsId) {
					this.dsId = dsId;
				}
			}

			public static class Directory {

				private String pathId;

				private String pathName;

				private String name;

				private String id;

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

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
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
