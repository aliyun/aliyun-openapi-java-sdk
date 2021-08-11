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

package com.aliyuncs.openanalytics_open.model.v20180619;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.ListSparkJobAttemptResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSparkJobAttemptResponse extends AcsResponse {

	private String requestId;

	private DataResult dataResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DataResult getDataResult() {
		return this.dataResult;
	}

	public void setDataResult(DataResult dataResult) {
		this.dataResult = dataResult;
	}

	public static class DataResult {

		private String pageNumber;

		private String pageSize;

		private String totalCount;

		private List<Data> jobAttemptList;

		public String getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(String pageNumber) {
			this.pageNumber = pageNumber;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public List<Data> getJobAttemptList() {
			return this.jobAttemptList;
		}

		public void setJobAttemptList(List<Data> jobAttemptList) {
			this.jobAttemptList = jobAttemptList;
		}

		public static class Data {

			private String createTime;

			private String createTimeValue;

			private String detail;

			private String jobId;

			private String jobName;

			private String sparkUI;

			private String status;

			private String terminatedTime;

			private String terminatedTimeValue;

			private String vcName;

			private String jobAttemptId;

			private String durationTime;

			private String durationTimeValue;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCreateTimeValue() {
				return this.createTimeValue;
			}

			public void setCreateTimeValue(String createTimeValue) {
				this.createTimeValue = createTimeValue;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}

			public String getSparkUI() {
				return this.sparkUI;
			}

			public void setSparkUI(String sparkUI) {
				this.sparkUI = sparkUI;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTerminatedTime() {
				return this.terminatedTime;
			}

			public void setTerminatedTime(String terminatedTime) {
				this.terminatedTime = terminatedTime;
			}

			public String getTerminatedTimeValue() {
				return this.terminatedTimeValue;
			}

			public void setTerminatedTimeValue(String terminatedTimeValue) {
				this.terminatedTimeValue = terminatedTimeValue;
			}

			public String getVcName() {
				return this.vcName;
			}

			public void setVcName(String vcName) {
				this.vcName = vcName;
			}

			public String getJobAttemptId() {
				return this.jobAttemptId;
			}

			public void setJobAttemptId(String jobAttemptId) {
				this.jobAttemptId = jobAttemptId;
			}

			public String getDurationTime() {
				return this.durationTime;
			}

			public void setDurationTime(String durationTime) {
				this.durationTime = durationTime;
			}

			public String getDurationTimeValue() {
				return this.durationTimeValue;
			}

			public void setDurationTimeValue(String durationTimeValue) {
				this.durationTimeValue = durationTimeValue;
			}
		}
	}

	@Override
	public ListSparkJobAttemptResponse getInstance(UnmarshallerContext context) {
		return	ListSparkJobAttemptResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
