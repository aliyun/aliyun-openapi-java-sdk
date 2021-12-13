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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetConfigRulesReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConfigRulesReportResponse extends AcsResponse {

	private String requestId;

	private ConfigRulesReport configRulesReport;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConfigRulesReport getConfigRulesReport() {
		return this.configRulesReport;
	}

	public void setConfigRulesReport(ConfigRulesReport configRulesReport) {
		this.configRulesReport = configRulesReport;
	}

	public static class ConfigRulesReport {

		private String reportStatus;

		private String reportUrl;

		private Long accountId;

		private Long reportCreateTimestamp;

		public String getReportStatus() {
			return this.reportStatus;
		}

		public void setReportStatus(String reportStatus) {
			this.reportStatus = reportStatus;
		}

		public String getReportUrl() {
			return this.reportUrl;
		}

		public void setReportUrl(String reportUrl) {
			this.reportUrl = reportUrl;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public Long getReportCreateTimestamp() {
			return this.reportCreateTimestamp;
		}

		public void setReportCreateTimestamp(Long reportCreateTimestamp) {
			this.reportCreateTimestamp = reportCreateTimestamp;
		}
	}

	@Override
	public GetConfigRulesReportResponse getInstance(UnmarshallerContext context) {
		return	GetConfigRulesReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
