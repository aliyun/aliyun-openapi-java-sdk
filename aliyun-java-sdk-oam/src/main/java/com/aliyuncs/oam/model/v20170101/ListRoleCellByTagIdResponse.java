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

package com.aliyuncs.oam.model.v20170101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oam.transform.v20170101.ListRoleCellByTagIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRoleCellByTagIdResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<OamMutexTagMiddleResult> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public List<OamMutexTagMiddleResult> getData() {
		return this.data;
	}

	public void setData(List<OamMutexTagMiddleResult> data) {
		this.data = data;
	}

	public static class OamMutexTagMiddleResult {

		private String roleCellId;

		private String type;

		private RoleCell roleCell;

		public String getRoleCellId() {
			return this.roleCellId;
		}

		public void setRoleCellId(String roleCellId) {
			this.roleCellId = roleCellId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public RoleCell getRoleCell() {
			return this.roleCell;
		}

		public void setRoleCell(RoleCell roleCell) {
			this.roleCell = roleCell;
		}

		public static class RoleCell {

			private String roleName;

			private String attribute;

			private String roleId;

			private String roleCellId;

			private String description;

			private String gmtModified;

			private String grantOption;

			private List<String> actionList;

			public String getRoleName() {
				return this.roleName;
			}

			public void setRoleName(String roleName) {
				this.roleName = roleName;
			}

			public String getAttribute() {
				return this.attribute;
			}

			public void setAttribute(String attribute) {
				this.attribute = attribute;
			}

			public String getRoleId() {
				return this.roleId;
			}

			public void setRoleId(String roleId) {
				this.roleId = roleId;
			}

			public String getRoleCellId() {
				return this.roleCellId;
			}

			public void setRoleCellId(String roleCellId) {
				this.roleCellId = roleCellId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getGrantOption() {
				return this.grantOption;
			}

			public void setGrantOption(String grantOption) {
				this.grantOption = grantOption;
			}

			public List<String> getActionList() {
				return this.actionList;
			}

			public void setActionList(List<String> actionList) {
				this.actionList = actionList;
			}
		}
	}

	@Override
	public ListRoleCellByTagIdResponse getInstance(UnmarshallerContext context) {
		return	ListRoleCellByTagIdResponseUnmarshaller.unmarshall(this, context);
	}
}
