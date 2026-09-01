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

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalPages;

		private List<DataItem> data;

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
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

			private String workspaceDescription;

			private String realOwnerAccountName;

			private String owner;

			private String modifyUser;

			private String createTime;

			private String ownerAccountName;

			private String workspaceId;

			private String createUser;

			private String organizationId;

			private String modifyUserAccountName;

			private String modifiedTime;

			private Boolean allowShareOperation;

			private String workspaceName;

			private Boolean allowPublishOperation;

			private String createUserAccountName;

			private WorkspaceExportConfig workspaceExportConfig;

			public String getWorkspaceDescription() {
				return this.workspaceDescription;
			}

			public void setWorkspaceDescription(String workspaceDescription) {
				this.workspaceDescription = workspaceDescription;
			}

			public String getRealOwnerAccountName() {
				return this.realOwnerAccountName;
			}

			public void setRealOwnerAccountName(String realOwnerAccountName) {
				this.realOwnerAccountName = realOwnerAccountName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getModifyUser() {
				return this.modifyUser;
			}

			public void setModifyUser(String modifyUser) {
				this.modifyUser = modifyUser;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getOwnerAccountName() {
				return this.ownerAccountName;
			}

			public void setOwnerAccountName(String ownerAccountName) {
				this.ownerAccountName = ownerAccountName;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public String getModifyUserAccountName() {
				return this.modifyUserAccountName;
			}

			public void setModifyUserAccountName(String modifyUserAccountName) {
				this.modifyUserAccountName = modifyUserAccountName;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Boolean getAllowShareOperation() {
				return this.allowShareOperation;
			}

			public void setAllowShareOperation(Boolean allowShareOperation) {
				this.allowShareOperation = allowShareOperation;
			}

			public String getWorkspaceName() {
				return this.workspaceName;
			}

			public void setWorkspaceName(String workspaceName) {
				this.workspaceName = workspaceName;
			}

			public Boolean getAllowPublishOperation() {
				return this.allowPublishOperation;
			}

			public void setAllowPublishOperation(Boolean allowPublishOperation) {
				this.allowPublishOperation = allowPublishOperation;
			}

			public String getCreateUserAccountName() {
				return this.createUserAccountName;
			}

			public void setCreateUserAccountName(String createUserAccountName) {
				this.createUserAccountName = createUserAccountName;
			}

			public WorkspaceExportConfig getWorkspaceExportConfig() {
				return this.workspaceExportConfig;
			}

			public void setWorkspaceExportConfig(WorkspaceExportConfig workspaceExportConfig) {
				this.workspaceExportConfig = workspaceExportConfig;
			}

			public static class WorkspaceExportConfig {

				private Boolean defaultExportType;

				private Boolean pdfExport;

				private Boolean imageExport;

				private Boolean exportToServer;

				private Boolean exportToLocal;

				private Boolean exportMainSwitch;

				private Boolean allowExcelImageFile;

				private Boolean dataExport;

				private Boolean exportToPublicWork;

				public Boolean getDefaultExportType() {
					return this.defaultExportType;
				}

				public void setDefaultExportType(Boolean defaultExportType) {
					this.defaultExportType = defaultExportType;
				}

				public Boolean getPdfExport() {
					return this.pdfExport;
				}

				public void setPdfExport(Boolean pdfExport) {
					this.pdfExport = pdfExport;
				}

				public Boolean getImageExport() {
					return this.imageExport;
				}

				public void setImageExport(Boolean imageExport) {
					this.imageExport = imageExport;
				}

				public Boolean getExportToServer() {
					return this.exportToServer;
				}

				public void setExportToServer(Boolean exportToServer) {
					this.exportToServer = exportToServer;
				}

				public Boolean getExportToLocal() {
					return this.exportToLocal;
				}

				public void setExportToLocal(Boolean exportToLocal) {
					this.exportToLocal = exportToLocal;
				}

				public Boolean getExportMainSwitch() {
					return this.exportMainSwitch;
				}

				public void setExportMainSwitch(Boolean exportMainSwitch) {
					this.exportMainSwitch = exportMainSwitch;
				}

				public Boolean getAllowExcelImageFile() {
					return this.allowExcelImageFile;
				}

				public void setAllowExcelImageFile(Boolean allowExcelImageFile) {
					this.allowExcelImageFile = allowExcelImageFile;
				}

				public Boolean getDataExport() {
					return this.dataExport;
				}

				public void setDataExport(Boolean dataExport) {
					this.dataExport = dataExport;
				}

				public Boolean getExportToPublicWork() {
					return this.exportToPublicWork;
				}

				public void setExportToPublicWork(Boolean exportToPublicWork) {
					this.exportToPublicWork = exportToPublicWork;
				}
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
