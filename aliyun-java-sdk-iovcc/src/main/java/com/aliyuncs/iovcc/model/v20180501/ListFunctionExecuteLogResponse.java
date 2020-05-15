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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListFunctionExecuteLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionExecuteLogResponse extends AcsResponse {

	private String requestId;

	private LogList logList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LogList getLogList() {
		return this.logList;
	}

	public void setLogList(LogList logList) {
		this.logList = logList;
	}

	public static class LogList {

		private List<Log> logs;

		private Pagination pagination;

		public List<Log> getLogs() {
			return this.logs;
		}

		public void setLogs(List<Log> logs) {
			this.logs = logs;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class Log {

			private String message;

			private String backEndRequestId;

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getBackEndRequestId() {
				return this.backEndRequestId;
			}

			public void setBackEndRequestId(String backEndRequestId) {
				this.backEndRequestId = backEndRequestId;
			}
		}

		public static class Pagination {

			private Integer pageIndex;

			private Integer pageSize;

			private Boolean hasNextPage;

			public Integer getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Boolean getHasNextPage() {
				return this.hasNextPage;
			}

			public void setHasNextPage(Boolean hasNextPage) {
				this.hasNextPage = hasNextPage;
			}
		}
	}

	@Override
	public ListFunctionExecuteLogResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionExecuteLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
