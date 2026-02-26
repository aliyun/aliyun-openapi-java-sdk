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
import com.aliyuncs.quickbi_public.transform.v20220101.QueryReadableResourcesListByUserIdV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryReadableResourcesListByUserIdV2Response extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<Data> result;

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

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private Integer status;

		private String modifyTime;

		private String ownerName;

		private String description;

		private String workType;

		private String modifyName;

		private String createTime;

		private String workspaceId;

		private Integer thirdPartAuthFlag;

		private String ownerId;

		private String securityLevel;

		private String workName;

		private String workspaceName;

		private String worksId;

		private Directory directory;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public Integer getThirdPartAuthFlag() {
			return this.thirdPartAuthFlag;
		}

		public void setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
			this.thirdPartAuthFlag = thirdPartAuthFlag;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
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

		public String getWorksId() {
			return this.worksId;
		}

		public void setWorksId(String worksId) {
			this.worksId = worksId;
		}

		public Directory getDirectory() {
			return this.directory;
		}

		public void setDirectory(Directory directory) {
			this.directory = directory;
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
	public QueryReadableResourcesListByUserIdV2Response getInstance(UnmarshallerContext context) {
		return	QueryReadableResourcesListByUserIdV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
