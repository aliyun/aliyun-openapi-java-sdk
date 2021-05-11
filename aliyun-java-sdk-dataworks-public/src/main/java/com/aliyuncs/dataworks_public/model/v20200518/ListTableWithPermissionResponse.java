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
import com.aliyuncs.dataworks_public.transform.v20200518.ListTableWithPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTableWithPermissionResponse extends AcsResponse {

	private String requestId;

	private Tables tables;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Tables getTables() {
		return this.tables;
	}

	public void setTables(Tables tables) {
		this.tables = tables;
	}

	public static class Tables {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<TableListItem> tableList;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<TableListItem> getTableList() {
			return this.tableList;
		}

		public void setTableList(List<TableListItem> tableList) {
			this.tableList = tableList;
		}

		public static class TableListItem {

			private String projectGuid;

			private String guid;

			private String name;

			private String nameCn;

			private String comment;

			private String owner;

			private List<String> action;

			public String getProjectGuid() {
				return this.projectGuid;
			}

			public void setProjectGuid(String projectGuid) {
				this.projectGuid = projectGuid;
			}

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNameCn() {
				return this.nameCn;
			}

			public void setNameCn(String nameCn) {
				this.nameCn = nameCn;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public List<String> getAction() {
				return this.action;
			}

			public void setAction(List<String> action) {
				this.action = action;
			}
		}
	}

	@Override
	public ListTableWithPermissionResponse getInstance(UnmarshallerContext context) {
		return	ListTableWithPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
