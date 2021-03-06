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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.ListEmrHiveAuditLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEmrHiveAuditLogsResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Data data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<AuditLog> pagedData;

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

		public List<AuditLog> getPagedData() {
			return this.pagedData;
		}

		public void setPagedData(List<AuditLog> pagedData) {
			this.pagedData = pagedData;
		}

		public static class AuditLog {

			private String table;

			private String database;

			private String user;

			private String operation;

			private Long eventTime;

			private List<String> groups;

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
			}

			public String getDatabase() {
				return this.database;
			}

			public void setDatabase(String database) {
				this.database = database;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getOperation() {
				return this.operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}

			public Long getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(Long eventTime) {
				this.eventTime = eventTime;
			}

			public List<String> getGroups() {
				return this.groups;
			}

			public void setGroups(List<String> groups) {
				this.groups = groups;
			}
		}
	}

	@Override
	public ListEmrHiveAuditLogsResponse getInstance(UnmarshallerContext context) {
		return	ListEmrHiveAuditLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
