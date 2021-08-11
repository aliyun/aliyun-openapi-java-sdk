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
import com.aliyuncs.retailadvqa_public.transform.v20200515.SearchAudiencesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAudiencesResponse extends AcsResponse {

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

		private Integer pageNum;

		private Integer pageSize;

		private Long totalNum;

		private List<ContentItem> content;

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

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String dataModelName;

			private Long gmtModified;

			private String dbName;

			private Long numberOfAudiences;

			private String errorMessage;

			private String dbType;

			private String permission;

			private Integer type;

			private Long gmtCreate;

			private String version;

			private String parentId;

			private String modifyUser;

			private String modifyUserName;

			private Integer latestDataModifyStatus;

			private Boolean _public;

			private Integer subtype;

			private String name;

			private Boolean autoUpdateData;

			private String createUser;

			private String id;

			private Long latestDataModifyTime;

			private String desc;

			public String getDataModelName() {
				return this.dataModelName;
			}

			public void setDataModelName(String dataModelName) {
				this.dataModelName = dataModelName;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public Long getNumberOfAudiences() {
				return this.numberOfAudiences;
			}

			public void setNumberOfAudiences(Long numberOfAudiences) {
				this.numberOfAudiences = numberOfAudiences;
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

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
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

			public Integer getLatestDataModifyStatus() {
				return this.latestDataModifyStatus;
			}

			public void setLatestDataModifyStatus(Integer latestDataModifyStatus) {
				this.latestDataModifyStatus = latestDataModifyStatus;
			}

			public Boolean get_Public() {
				return this._public;
			}

			public void set_Public(Boolean _public) {
				this._public = _public;
			}

			public Integer getSubtype() {
				return this.subtype;
			}

			public void setSubtype(Integer subtype) {
				this.subtype = subtype;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getAutoUpdateData() {
				return this.autoUpdateData;
			}

			public void setAutoUpdateData(Boolean autoUpdateData) {
				this.autoUpdateData = autoUpdateData;
			}

			public String getCreateUser() {
				return this.createUser;
			}

			public void setCreateUser(String createUser) {
				this.createUser = createUser;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Long getLatestDataModifyTime() {
				return this.latestDataModifyTime;
			}

			public void setLatestDataModifyTime(Long latestDataModifyTime) {
				this.latestDataModifyTime = latestDataModifyTime;
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
	public SearchAudiencesResponse getInstance(UnmarshallerContext context) {
		return	SearchAudiencesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
