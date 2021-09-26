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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListMetaDBResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetaDBResponse extends AcsResponse {

	private String requestId;

	private DatabaseInfo databaseInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DatabaseInfo getDatabaseInfo() {
		return this.databaseInfo;
	}

	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}

	public static class DatabaseInfo {

		private Long totalCount;

		private List<DbListItem> dbList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<DbListItem> getDbList() {
			return this.dbList;
		}

		public void setDbList(List<DbListItem> dbList) {
			this.dbList = dbList;
		}

		public static class DbListItem {

			private String type;

			private Long createTimeStamp;

			private String uUID;

			private Long modifiedTimeStamp;

			private String name;

			private String ownerId;

			private String location;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getCreateTimeStamp() {
				return this.createTimeStamp;
			}

			public void setCreateTimeStamp(Long createTimeStamp) {
				this.createTimeStamp = createTimeStamp;
			}

			public String getUUID() {
				return this.uUID;
			}

			public void setUUID(String uUID) {
				this.uUID = uUID;
			}

			public Long getModifiedTimeStamp() {
				return this.modifiedTimeStamp;
			}

			public void setModifiedTimeStamp(Long modifiedTimeStamp) {
				this.modifiedTimeStamp = modifiedTimeStamp;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}
		}
	}

	@Override
	public ListMetaDBResponse getInstance(UnmarshallerContext context) {
		return	ListMetaDBResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
