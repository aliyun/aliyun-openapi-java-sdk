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
import com.aliyuncs.pairecservice.transform.v20221213.ListFeatureConsistencyCheckJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureConsistencyCheckJobsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private List<FeatureConsistencyCheckJobsItem> featureConsistencyCheckJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<FeatureConsistencyCheckJobsItem> getFeatureConsistencyCheckJobs() {
		return this.featureConsistencyCheckJobs;
	}

	public void setFeatureConsistencyCheckJobs(List<FeatureConsistencyCheckJobsItem> featureConsistencyCheckJobs) {
		this.featureConsistencyCheckJobs = featureConsistencyCheckJobs;
	}

	public static class FeatureConsistencyCheckJobsItem {

		private String featureConsistencyCheckJobId;

		private String featureConsistencyCheckJobConfigId;

		private String featureConsistencyCheckJobConfigName;

		private String gmtStartTime;

		private String gmtEndTime;

		private String status;

		private String config;

		private List<String> logs;

		public String getFeatureConsistencyCheckJobId() {
			return this.featureConsistencyCheckJobId;
		}

		public void setFeatureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
			this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
		}

		public String getFeatureConsistencyCheckJobConfigId() {
			return this.featureConsistencyCheckJobConfigId;
		}

		public void setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
			this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
		}

		public String getFeatureConsistencyCheckJobConfigName() {
			return this.featureConsistencyCheckJobConfigName;
		}

		public void setFeatureConsistencyCheckJobConfigName(String featureConsistencyCheckJobConfigName) {
			this.featureConsistencyCheckJobConfigName = featureConsistencyCheckJobConfigName;
		}

		public String getGmtStartTime() {
			return this.gmtStartTime;
		}

		public void setGmtStartTime(String gmtStartTime) {
			this.gmtStartTime = gmtStartTime;
		}

		public String getGmtEndTime() {
			return this.gmtEndTime;
		}

		public void setGmtEndTime(String gmtEndTime) {
			this.gmtEndTime = gmtEndTime;
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

		public List<String> getLogs() {
			return this.logs;
		}

		public void setLogs(List<String> logs) {
			this.logs = logs;
		}
	}

	@Override
	public ListFeatureConsistencyCheckJobsResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureConsistencyCheckJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
