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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRoleResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<RoleItem> roleList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RoleItem> getRoleList() {
		return this.roleList;
	}

	public void setRoleList(List<RoleItem> roleList) {
		this.roleList = roleList;
	}

	public static class RoleItem {

		private List<Action> actionList;

		private Role role;

		public List<Action> getActionList() {
			return this.actionList;
		}

		public void setActionList(List<Action> actionList) {
			this.actionList = actionList;
		}

		public Role getRole() {
			return this.role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public static class Action {

			private String code;

			private String description;

			private String groupId;

			private String name;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Role {

			private Long updateTime;

			private Boolean isDefault;

			private String adminUserId;

			private Long createTime;

			private String name;

			private Integer id;

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}

			public String getAdminUserId() {
				return this.adminUserId;
			}

			public void setAdminUserId(String adminUserId) {
				this.adminUserId = adminUserId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
		}
	}

	@Override
	public ListRoleResponse getInstance(UnmarshallerContext context) {
		return	ListRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
