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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListCalculationJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCalculationJobsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<CalculationJobsItem> calculationJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<CalculationJobsItem> getCalculationJobs() {
		return this.calculationJobs;
	}

	public void setCalculationJobs(List<CalculationJobsItem> calculationJobs) {
		this.calculationJobs = calculationJobs;
	}

	public static class CalculationJobsItem {

		private String calculationJobId;

		private String aBMetricName;

		private String status;

		private String config;

		private String gmtRanTime;

		private String bizDate;

		private String jobSource;

		private List<String> jobMessage;

		public String getCalculationJobId() {
			return this.calculationJobId;
		}

		public void setCalculationJobId(String calculationJobId) {
			this.calculationJobId = calculationJobId;
		}

		public String getABMetricName() {
			return this.aBMetricName;
		}

		public void setABMetricName(String aBMetricName) {
			this.aBMetricName = aBMetricName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getGmtRanTime() {
			return this.gmtRanTime;
		}

		public void setGmtRanTime(String gmtRanTime) {
			this.gmtRanTime = gmtRanTime;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getJobSource() {
			return this.jobSource;
		}

		public void setJobSource(String jobSource) {
			this.jobSource = jobSource;
		}

		public List<String> getJobMessage() {
			return this.jobMessage;
		}

		public void setJobMessage(List<String> jobMessage) {
			this.jobMessage = jobMessage;
		}
	}

	@Override
	public ListCalculationJobsResponse getInstance(UnmarshallerContext context) {
		return	ListCalculationJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
