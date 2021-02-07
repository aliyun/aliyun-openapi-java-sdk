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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListInstanceStateReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceStateReportsResponse extends AcsResponse {

	private String requestId;

	private Integer maxResults;

	private String nextToken;

	private List<StateReport> stateReports;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<StateReport> getStateReports() {
		return this.stateReports;
	}

	public void setStateReports(List<StateReport> stateReports) {
		this.stateReports = stateReports;
	}

	public static class StateReport {

		private String reportTime;

		private String instanceId;

		private String stateConfigurationId;

		private String mode;

		private String reportStatus;

		private String successApplyTime;

		private String reportInfo;

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getStateConfigurationId() {
			return this.stateConfigurationId;
		}

		public void setStateConfigurationId(String stateConfigurationId) {
			this.stateConfigurationId = stateConfigurationId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getReportStatus() {
			return this.reportStatus;
		}

		public void setReportStatus(String reportStatus) {
			this.reportStatus = reportStatus;
		}

		public String getSuccessApplyTime() {
			return this.successApplyTime;
		}

		public void setSuccessApplyTime(String successApplyTime) {
			this.successApplyTime = successApplyTime;
		}

		public String getReportInfo() {
			return this.reportInfo;
		}

		public void setReportInfo(String reportInfo) {
			this.reportInfo = reportInfo;
		}
	}

	@Override
	public ListInstanceStateReportsResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceStateReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
