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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListAuthorizedDatabasesForUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthorizedDatabasesForUserResponse extends AcsResponse {

	private String requestId;

	private List<DatabasesItem> databases;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DatabasesItem> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<DatabasesItem> databases) {
		this.databases = databases;
	}

	public static class DatabasesItem {

		private String dbId;

		private String schemaName;

		private String searchName;

		private String instanceId;

		private Boolean logic;

		private String dbType;

		private String userId;

		private String envType;

		private PermissionDetail permissionDetail;

		public String getDbId() {
			return this.dbId;
		}

		public void setDbId(String dbId) {
			this.dbId = dbId;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getSearchName() {
			return this.searchName;
		}

		public void setSearchName(String searchName) {
			this.searchName = searchName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public PermissionDetail getPermissionDetail() {
			return this.permissionDetail;
		}

		public void setPermissionDetail(PermissionDetail permissionDetail) {
			this.permissionDetail = permissionDetail;
		}

		public static class PermissionDetail {

			private String dsType;

			private String permType;

			private String expireDate;

			private String message;

			public String getDsType() {
				return this.dsType;
			}

			public void setDsType(String dsType) {
				this.dsType = dsType;
			}

			public String getPermType() {
				return this.permType;
			}

			public void setPermType(String permType) {
				this.permType = permType;
			}

			public String getExpireDate() {
				return this.expireDate;
			}

			public void setExpireDate(String expireDate) {
				this.expireDate = expireDate;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	@Override
	public ListAuthorizedDatabasesForUserResponse getInstance(UnmarshallerContext context) {
		return	ListAuthorizedDatabasesForUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
