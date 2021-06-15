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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.ListDevopsProjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevopsProjectsResponse extends AcsResponse {

	private Boolean successful;

	private String errorCode;

	private String errorMsg;

	private String requestId;

	private Object object;

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String nextPageToken;

		private List<Project> result;

		public String getNextPageToken() {
			return this.nextPageToken;
		}

		public void setNextPageToken(String nextPageToken) {
			this.nextPageToken = nextPageToken;
		}

		public List<Project> getResult() {
			return this.result;
		}

		public void setResult(List<Project> result) {
			this.result = result;
		}

		public static class Project {

			private Integer roleId;

			private String organizationId;

			private String id;

			private String creatorId;

			private String visibility;

			private String updated;

			private Integer tasksCount;

			private String name;

			private Integer membersCount;

			private String logo;

			private Boolean isTemplate;

			private Boolean isStar;

			private Boolean isPublic;

			private Boolean isArchived;

			private String description;

			private String created;

			public Integer getRoleId() {
				return this.roleId;
			}

			public void setRoleId(Integer roleId) {
				this.roleId = roleId;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getVisibility() {
				return this.visibility;
			}

			public void setVisibility(String visibility) {
				this.visibility = visibility;
			}

			public String getUpdated() {
				return this.updated;
			}

			public void setUpdated(String updated) {
				this.updated = updated;
			}

			public Integer getTasksCount() {
				return this.tasksCount;
			}

			public void setTasksCount(Integer tasksCount) {
				this.tasksCount = tasksCount;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getMembersCount() {
				return this.membersCount;
			}

			public void setMembersCount(Integer membersCount) {
				this.membersCount = membersCount;
			}

			public String getLogo() {
				return this.logo;
			}

			public void setLogo(String logo) {
				this.logo = logo;
			}

			public Boolean getIsTemplate() {
				return this.isTemplate;
			}

			public void setIsTemplate(Boolean isTemplate) {
				this.isTemplate = isTemplate;
			}

			public Boolean getIsStar() {
				return this.isStar;
			}

			public void setIsStar(Boolean isStar) {
				this.isStar = isStar;
			}

			public Boolean getIsPublic() {
				return this.isPublic;
			}

			public void setIsPublic(Boolean isPublic) {
				this.isPublic = isPublic;
			}

			public Boolean getIsArchived() {
				return this.isArchived;
			}

			public void setIsArchived(Boolean isArchived) {
				this.isArchived = isArchived;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCreated() {
				return this.created;
			}

			public void setCreated(String created) {
				this.created = created;
			}
		}
	}

	@Override
	public ListDevopsProjectsResponse getInstance(UnmarshallerContext context) {
		return	ListDevopsProjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
