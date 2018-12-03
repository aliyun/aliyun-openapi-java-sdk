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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeUserUsageDataExportTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserUsageDataExportTaskResponse extends AcsResponse {

	private String requestId;

	private UsageDataPerPage usageDataPerPage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UsageDataPerPage getUsageDataPerPage() {
		return this.usageDataPerPage;
	}

	public void setUsageDataPerPage(UsageDataPerPage usageDataPerPage) {
		this.usageDataPerPage = usageDataPerPage;
	}

	public static class UsageDataPerPage {

		private Integer totalCount;

		private Integer pageSize;

		private Integer pageNumber;

		private List<DataItem> data;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String taskName;

			private String taskId;

			private String createTime;

			private String updateTime;

			private String status;

			private String downloadUrl;

			private TaskConfig taskConfig;

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public TaskConfig getTaskConfig() {
				return this.taskConfig;
			}

			public void setTaskConfig(TaskConfig taskConfig) {
				this.taskConfig = taskConfig;
			}

			public static class TaskConfig {

				private String startTime;

				private String endTime;

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}
		}
	}

	@Override
	public DescribeUserUsageDataExportTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserUsageDataExportTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
