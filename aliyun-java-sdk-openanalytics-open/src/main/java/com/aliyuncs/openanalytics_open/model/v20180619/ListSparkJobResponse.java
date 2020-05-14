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
import com.aliyuncs.openanalytics_open.transform.v20180619.ListSparkJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSparkJobResponse extends AcsResponse {

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

		private List<Data> jobList;

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

		public List<Data> getJobList() {
			return this.jobList;
		}

		public void setJobList(List<Data> jobList) {
			this.jobList = jobList;
		}

		public static class Data {

			private String jobId;

			private String jobName;

			private String status;

			private String detail;

			private String sparkUI;

			private String createTime;

			private String createTimeValue;

			private String updateTime;

			private String updateTimeValue;

			private String submitTime;

			private String submitTimeValue;

			private String vcName;

			private String driverResourceSpec;

			private String executorResourceSpec;

			private String executorInstances;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public String getSparkUI() {
				return this.sparkUI;
			}

			public void setSparkUI(String sparkUI) {
				this.sparkUI = sparkUI;
			}

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

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getUpdateTimeValue() {
				return this.updateTimeValue;
			}

			public void setUpdateTimeValue(String updateTimeValue) {
				this.updateTimeValue = updateTimeValue;
			}

			public String getSubmitTime() {
				return this.submitTime;
			}

			public void setSubmitTime(String submitTime) {
				this.submitTime = submitTime;
			}

			public String getSubmitTimeValue() {
				return this.submitTimeValue;
			}

			public void setSubmitTimeValue(String submitTimeValue) {
				this.submitTimeValue = submitTimeValue;
			}

			public String getVcName() {
				return this.vcName;
			}

			public void setVcName(String vcName) {
				this.vcName = vcName;
			}

			public String getDriverResourceSpec() {
				return this.driverResourceSpec;
			}

			public void setDriverResourceSpec(String driverResourceSpec) {
				this.driverResourceSpec = driverResourceSpec;
			}

			public String getExecutorResourceSpec() {
				return this.executorResourceSpec;
			}

			public void setExecutorResourceSpec(String executorResourceSpec) {
				this.executorResourceSpec = executorResourceSpec;
			}

			public String getExecutorInstances() {
				return this.executorInstances;
			}

			public void setExecutorInstances(String executorInstances) {
				this.executorInstances = executorInstances;
			}
		}
	}

	@Override
	public ListSparkJobResponse getInstance(UnmarshallerContext context) {
		return	ListSparkJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
