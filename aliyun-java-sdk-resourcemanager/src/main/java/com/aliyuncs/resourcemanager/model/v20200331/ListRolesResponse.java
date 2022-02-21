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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListRolesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRolesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Role> roles;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public static class Role {

		private String rolePrincipalName;

		private String updateDate;

		private String description;

		private Long maxSessionDuration;

		private String roleName;

		private String createDate;

		private String roleId;

		private String arn;

		private Boolean isServiceLinkedRole;

		private LatestDeletionTask latestDeletionTask;

		public String getRolePrincipalName() {
			return this.rolePrincipalName;
		}

		public void setRolePrincipalName(String rolePrincipalName) {
			this.rolePrincipalName = rolePrincipalName;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getMaxSessionDuration() {
			return this.maxSessionDuration;
		}

		public void setMaxSessionDuration(Long maxSessionDuration) {
			this.maxSessionDuration = maxSessionDuration;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public Boolean getIsServiceLinkedRole() {
			return this.isServiceLinkedRole;
		}

		public void setIsServiceLinkedRole(Boolean isServiceLinkedRole) {
			this.isServiceLinkedRole = isServiceLinkedRole;
		}

		public LatestDeletionTask getLatestDeletionTask() {
			return this.latestDeletionTask;
		}

		public void setLatestDeletionTask(LatestDeletionTask latestDeletionTask) {
			this.latestDeletionTask = latestDeletionTask;
		}

		public static class LatestDeletionTask {

			private String deletionTaskId;

			private String createDate;

			public String getDeletionTaskId() {
				return this.deletionTaskId;
			}

			public void setDeletionTaskId(String deletionTaskId) {
				this.deletionTaskId = deletionTaskId;
			}

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}
		}
	}

	@Override
	public ListRolesResponse getInstance(UnmarshallerContext context) {
		return	ListRolesResponseUnmarshaller.unmarshall(this, context);
	}
}
