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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.SearchDirectoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchDirectoriesResponse extends AcsResponse {

	private String requestId;

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String pageNum;

		private String pageSize;

		private String totalNum;

		private List<ContentItem> content;

		public String getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(String pageNum) {
			this.pageNum = pageNum;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(String totalNum) {
			this.totalNum = totalNum;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private Long gmtCreate;

			private Long gmtModified;

			private String name;

			private String id;

			private String dbName;

			private String createUserName;

			private Integer type;

			private String modifyUser;

			private String modifyUserName;

			private String defaultCube;

			private String subtype;

			private String aiplSubType;

			private Integer typeSource;

			private String factTable;

			private String workspaceId;

			private String dsId;

			private String errorMessage;

			private String dbType;

			private String permission;

			private Boolean fuseCube;

			private String version;

			private String parentId;

			private Integer isMark;

			private String desc;

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
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

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public String getCreateUserName() {
				return this.createUserName;
			}

			public void setCreateUserName(String createUserName) {
				this.createUserName = createUserName;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public String getModifyUser() {
				return this.modifyUser;
			}

			public void setModifyUser(String modifyUser) {
				this.modifyUser = modifyUser;
			}

			public String getModifyUserName() {
				return this.modifyUserName;
			}

			public void setModifyUserName(String modifyUserName) {
				this.modifyUserName = modifyUserName;
			}

			public String getDefaultCube() {
				return this.defaultCube;
			}

			public void setDefaultCube(String defaultCube) {
				this.defaultCube = defaultCube;
			}

			public String getSubtype() {
				return this.subtype;
			}

			public void setSubtype(String subtype) {
				this.subtype = subtype;
			}

			public String getAiplSubType() {
				return this.aiplSubType;
			}

			public void setAiplSubType(String aiplSubType) {
				this.aiplSubType = aiplSubType;
			}

			public Integer getTypeSource() {
				return this.typeSource;
			}

			public void setTypeSource(Integer typeSource) {
				this.typeSource = typeSource;
			}

			public String getFactTable() {
				return this.factTable;
			}

			public void setFactTable(String factTable) {
				this.factTable = factTable;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getDsId() {
				return this.dsId;
			}

			public void setDsId(String dsId) {
				this.dsId = dsId;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public String getPermission() {
				return this.permission;
			}

			public void setPermission(String permission) {
				this.permission = permission;
			}

			public Boolean getFuseCube() {
				return this.fuseCube;
			}

			public void setFuseCube(Boolean fuseCube) {
				this.fuseCube = fuseCube;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public Integer getIsMark() {
				return this.isMark;
			}

			public void setIsMark(Integer isMark) {
				this.isMark = isMark;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}
		}
	}

	@Override
	public SearchDirectoriesResponse getInstance(UnmarshallerContext context) {
		return	SearchDirectoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
