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
import com.aliyuncs.dataworks_public.transform.v20200518.ListTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTablesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private String nextToken;

		private List<TableEntityListItem> tableEntityList;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<TableEntityListItem> getTableEntityList() {
			return this.tableEntityList;
		}

		public void setTableEntityList(List<TableEntityListItem> tableEntityList) {
			this.tableEntityList = tableEntityList;
		}

		public static class TableEntityListItem {

			private String entityQualifiedName;

			private EntityContent entityContent;

			public String getEntityQualifiedName() {
				return this.entityQualifiedName;
			}

			public void setEntityQualifiedName(String entityQualifiedName) {
				this.entityQualifiedName = entityQualifiedName;
			}

			public EntityContent getEntityContent() {
				return this.entityContent;
			}

			public void setEntityContent(EntityContent entityContent) {
				this.entityContent = entityContent;
			}

			public static class EntityContent {

				private String tableName;

				private String dataSourceQualifiedName;

				private String dataSourceUniqueId;

				private String databaseName;

				private String projectName;

				private String instanceId;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getDataSourceQualifiedName() {
					return this.dataSourceQualifiedName;
				}

				public void setDataSourceQualifiedName(String dataSourceQualifiedName) {
					this.dataSourceQualifiedName = dataSourceQualifiedName;
				}

				public String getDataSourceUniqueId() {
					return this.dataSourceUniqueId;
				}

				public void setDataSourceUniqueId(String dataSourceUniqueId) {
					this.dataSourceUniqueId = dataSourceUniqueId;
				}

				public String getDatabaseName() {
					return this.databaseName;
				}

				public void setDatabaseName(String databaseName) {
					this.databaseName = databaseName;
				}

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}
			}
		}
	}

	@Override
	public ListTablesResponse getInstance(UnmarshallerContext context) {
		return	ListTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
