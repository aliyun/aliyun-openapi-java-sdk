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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20210616.QueryAllResourcesWithPermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAllResourcesWithPermissionsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<QueryAllResourcesWithPermissionsResponse1> data;

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

	public List<QueryAllResourcesWithPermissionsResponse1> getData() {
		return this.data;
	}

	public void setData(List<QueryAllResourcesWithPermissionsResponse1> data) {
		this.data = data;
	}

	public static class QueryAllResourcesWithPermissionsResponse1 {

		private String resourceId;

		private String name;

		private String code;

		private String description;

		private String type;

		private String content;

		private String creator;

		private List<PermissionOfResource> permissionOfResourceList;

		private List<Map<Object,Object>> resourceAttributeList;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public List<PermissionOfResource> getPermissionOfResourceList() {
			return this.permissionOfResourceList;
		}

		public void setPermissionOfResourceList(List<PermissionOfResource> permissionOfResourceList) {
			this.permissionOfResourceList = permissionOfResourceList;
		}

		public List<Map<Object,Object>> getResourceAttributeList() {
			return this.resourceAttributeList;
		}

		public void setResourceAttributeList(List<Map<Object,Object>> resourceAttributeList) {
			this.resourceAttributeList = resourceAttributeList;
		}

		public static class PermissionOfResource {

			private String name;

			private String code;

			private String description;

			private String permissionId;

			private List<PermissionItem> permissionItemList;

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

			public String getPermissionId() {
				return this.permissionId;
			}

			public void setPermissionId(String permissionId) {
				this.permissionId = permissionId;
			}

			public List<PermissionItem> getPermissionItemList() {
				return this.permissionItemList;
			}

			public void setPermissionItemList(List<PermissionItem> permissionItemList) {
				this.permissionItemList = permissionItemList;
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
		}
	}

	@Override
	public QueryAllResourcesWithPermissionsResponse getInstance(UnmarshallerContext context) {
		return	QueryAllResourcesWithPermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
