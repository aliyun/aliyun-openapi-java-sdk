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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryWorksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryWorksResponse extends AcsResponse {

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

		private Integer status;

		private String ownerName;

		private Long publicInvalidTime;

		private String description;

		private String workType;

		private String modifyName;

		private String workspaceId;

		private Integer auth3rdFlag;

		private String gmtCreate;

		private String ownerId;

		private String gmtModify;

		private String securityLevel;

		private String workName;

		private String workspaceName;

		private Boolean publicFlag;

		private String worksId;

		private List<GlobalParamVoListItem> globalParamVoList;

		private Directory directory;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Long getPublicInvalidTime() {
			return this.publicInvalidTime;
		}

		public void setPublicInvalidTime(Long publicInvalidTime) {
			this.publicInvalidTime = publicInvalidTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWorkType() {
			return this.workType;
		}

		public void setWorkType(String workType) {
			this.workType = workType;
		}

		public String getModifyName() {
			return this.modifyName;
		}

		public void setModifyName(String modifyName) {
			this.modifyName = modifyName;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public Integer getAuth3rdFlag() {
			return this.auth3rdFlag;
		}

		public void setAuth3rdFlag(Integer auth3rdFlag) {
			this.auth3rdFlag = auth3rdFlag;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getSecurityLevel() {
			return this.securityLevel;
		}

		public void setSecurityLevel(String securityLevel) {
			this.securityLevel = securityLevel;
		}

		public String getWorkName() {
			return this.workName;
		}

		public void setWorkName(String workName) {
			this.workName = workName;
		}

		public String getWorkspaceName() {
			return this.workspaceName;
		}

		public void setWorkspaceName(String workspaceName) {
			this.workspaceName = workspaceName;
		}

		public Boolean getPublicFlag() {
			return this.publicFlag;
		}

		public void setPublicFlag(Boolean publicFlag) {
			this.publicFlag = publicFlag;
		}

		public String getWorksId() {
			return this.worksId;
		}

		public void setWorksId(String worksId) {
			this.worksId = worksId;
		}

		public List<GlobalParamVoListItem> getGlobalParamVoList() {
			return this.globalParamVoList;
		}

		public void setGlobalParamVoList(List<GlobalParamVoListItem> globalParamVoList) {
			this.globalParamVoList = globalParamVoList;
		}

		public Directory getDirectory() {
			return this.directory;
		}

		public void setDirectory(Directory directory) {
			this.directory = directory;
		}

		public static class GlobalParamVoListItem {

			private Boolean required;

			private String dataType;

			private String paramAlias;

			private String paramName;

			public Boolean getRequired() {
				return this.required;
			}

			public void setRequired(Boolean required) {
				this.required = required;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getParamAlias() {
				return this.paramAlias;
			}

			public void setParamAlias(String paramAlias) {
				this.paramAlias = paramAlias;
			}

			public String getParamName() {
				return this.paramName;
			}

			public void setParamName(String paramName) {
				this.paramName = paramName;
			}
		}

		public static class Directory {

			private String pathId;

			private String id;

			private String pathName;

			private String name;

			public String getPathId() {
				return this.pathId;
			}

			public void setPathId(String pathId) {
				this.pathId = pathId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
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
		}
	}

	@Override
	public QueryWorksResponse getInstance(UnmarshallerContext context) {
		return	QueryWorksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
