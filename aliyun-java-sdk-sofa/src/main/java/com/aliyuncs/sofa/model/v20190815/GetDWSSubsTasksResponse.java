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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDWSSubsTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDWSSubsTasksResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long currentPageCount;

		private Long totalCount;

		private List<TasksItem> tasks;

		public Long getCurrentPageCount() {
			return this.currentPageCount;
		}

		public void setCurrentPageCount(Long currentPageCount) {
			this.currentPageCount = currentPageCount;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<TasksItem> getTasks() {
			return this.tasks;
		}

		public void setTasks(List<TasksItem> tasks) {
			this.tasks = tasks;
		}

		public static class TasksItem {

			private String clusterUrl;

			private String comment;

			private String connectionString;

			private String consumer;

			private Long gmtCreate;

			private Long gmtModify;

			private String group;

			private Long id;

			private String name;

			private String status;

			private String tableId;

			public String getClusterUrl() {
				return this.clusterUrl;
			}

			public void setClusterUrl(String clusterUrl) {
				this.clusterUrl = clusterUrl;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getConnectionString() {
				return this.connectionString;
			}

			public void setConnectionString(String connectionString) {
				this.connectionString = connectionString;
			}

			public String getConsumer() {
				return this.consumer;
			}

			public void setConsumer(String consumer) {
				this.consumer = consumer;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(Long gmtModify) {
				this.gmtModify = gmtModify;
			}

			public String getGroup() {
				return this.group;
			}

			public void setGroup(String group) {
				this.group = group;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTableId() {
				return this.tableId;
			}

			public void setTableId(String tableId) {
				this.tableId = tableId;
			}
		}
	}

	@Override
	public GetDWSSubsTasksResponse getInstance(UnmarshallerContext context) {
		return	GetDWSSubsTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
