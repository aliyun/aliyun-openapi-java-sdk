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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetTableDesignProjectInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableDesignProjectInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private ProjectInfo projectInfo;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public static class ProjectInfo {

		private Long orderId;

		private Long projectId;

		private String gmtCreate;

		private String gmtModified;

		private String status;

		private String title;

		private String description;

		private Long creatorId;

		private BaseDatabase baseDatabase;

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public BaseDatabase getBaseDatabase() {
			return this.baseDatabase;
		}

		public void setBaseDatabase(BaseDatabase baseDatabase) {
			this.baseDatabase = baseDatabase;
		}

		public static class BaseDatabase {

			private String searchName;

			private String schemaName;

			private Integer dbId;

			private Boolean logic;

			private String alias;

			private String envType;

			private String dbType;

			public String getSearchName() {
				return this.searchName;
			}

			public void setSearchName(String searchName) {
				this.searchName = searchName;
			}

			public String getSchemaName() {
				return this.schemaName;
			}

			public void setSchemaName(String schemaName) {
				this.schemaName = schemaName;
			}

			public Integer getDbId() {
				return this.dbId;
			}

			public void setDbId(Integer dbId) {
				this.dbId = dbId;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}
		}
	}

	@Override
	public GetTableDesignProjectInfoResponse getInstance(UnmarshallerContext context) {
		return	GetTableDesignProjectInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
