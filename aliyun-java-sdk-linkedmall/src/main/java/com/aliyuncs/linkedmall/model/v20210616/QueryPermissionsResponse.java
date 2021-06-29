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

package com.aliyuncs.linkedmall.model.v20210616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20210616.QueryPermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPermissionsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<Permission> permissionList;

	private List<PermissionItem> permissionItemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<Permission> getPermissionList() {
		return this.permissionList;
	}

	public void setPermissionList(List<Permission> permissionList) {
		this.permissionList = permissionList;
	}

	public List<PermissionItem> getPermissionItemList() {
		return this.permissionItemList;
	}

	public void setPermissionItemList(List<PermissionItem> permissionItemList) {
		this.permissionItemList = permissionItemList;
	}

	public static class Permission {

		private String permissionId;

		private String name;

		private String code;

		private String description;

		public String getPermissionId() {
			return this.permissionId;
		}

		public void setPermissionId(String permissionId) {
			this.permissionId = permissionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

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
	}

	public static class PermissionItem {

		private String permissionItemId;

		private String actionType;

		private String permissionType;

		public String getPermissionItemId() {
			return this.permissionItemId;
		}

		public void setPermissionItemId(String permissionItemId) {
			this.permissionItemId = permissionItemId;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getPermissionType() {
			return this.permissionType;
		}

		public void setPermissionType(String permissionType) {
			this.permissionType = permissionType;
		}
	}

	@Override
	public QueryPermissionsResponse getInstance(UnmarshallerContext context) {
		return	QueryPermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
