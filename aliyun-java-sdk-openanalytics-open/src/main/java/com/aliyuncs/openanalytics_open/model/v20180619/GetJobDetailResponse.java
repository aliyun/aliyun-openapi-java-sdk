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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.GetJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobDetailResponse extends AcsResponse {

	private String requestId;

	private JobDetail jobDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public JobDetail getJobDetail() {
		return this.jobDetail;
	}

	public void setJobDetail(JobDetail jobDetail) {
		this.jobDetail = jobDetail;
	}

	public static class JobDetail {

		private String jobId;

		private String jobName;

		private String status;

		private String detail;

		private String sparkUI;

		private String createTime;

		private String updateTime;

		private String submitTime;

		private String createTimeValue;

		private String updateTimeValue;

		private String submitTimeValue;

		private String vcName;

		private String driverResourceSpec;

		private String executorResourceSpec;

		private String executorInstances;

		private String lastJobAttemptId;

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

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(String submitTime) {
			this.submitTime = submitTime;
		}

		public String getCreateTimeValue() {
			return this.createTimeValue;
		}

		public void setCreateTimeValue(String createTimeValue) {
			this.createTimeValue = createTimeValue;
		}

		public String getUpdateTimeValue() {
			return this.updateTimeValue;
		}

		public void setUpdateTimeValue(String updateTimeValue) {
			this.updateTimeValue = updateTimeValue;
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

		public String getLastJobAttemptId() {
			return this.lastJobAttemptId;
		}

		public void setLastJobAttemptId(String lastJobAttemptId) {
			this.lastJobAttemptId = lastJobAttemptId;
		}
	}

	@Override
	public GetJobDetailResponse getInstance(UnmarshallerContext context) {
		return	GetJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
