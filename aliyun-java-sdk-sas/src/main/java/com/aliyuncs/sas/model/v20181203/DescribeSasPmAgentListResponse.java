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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSasPmAgentListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSasPmAgentListResponse extends AcsResponse {

	private String requestId;

	private List<ReportRecipient> sasPmAgentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ReportRecipient> getSasPmAgentList() {
		return this.sasPmAgentList;
	}

	public void setSasPmAgentList(List<ReportRecipient> sasPmAgentList) {
		this.sasPmAgentList = sasPmAgentList;
	}

	public static class ReportRecipient {

		private String aliyunAssistId;

		private String aliyunMonitorId;

		private Integer assistInstallStatus;

		private Integer monitorInstallStatus;

		private Integer assistInstallResult;

		private Integer monitorInstallResult;

		private String uuid;

		public String getAliyunAssistId() {
			return this.aliyunAssistId;
		}

		public void setAliyunAssistId(String aliyunAssistId) {
			this.aliyunAssistId = aliyunAssistId;
		}

		public String getAliyunMonitorId() {
			return this.aliyunMonitorId;
		}

		public void setAliyunMonitorId(String aliyunMonitorId) {
			this.aliyunMonitorId = aliyunMonitorId;
		}

		public Integer getAssistInstallStatus() {
			return this.assistInstallStatus;
		}

		public void setAssistInstallStatus(Integer assistInstallStatus) {
			this.assistInstallStatus = assistInstallStatus;
		}

		public Integer getMonitorInstallStatus() {
			return this.monitorInstallStatus;
		}

		public void setMonitorInstallStatus(Integer monitorInstallStatus) {
			this.monitorInstallStatus = monitorInstallStatus;
		}

		public Integer getAssistInstallResult() {
			return this.assistInstallResult;
		}

		public void setAssistInstallResult(Integer assistInstallResult) {
			this.assistInstallResult = assistInstallResult;
		}

		public Integer getMonitorInstallResult() {
			return this.monitorInstallResult;
		}

		public void setMonitorInstallResult(Integer monitorInstallResult) {
			this.monitorInstallResult = monitorInstallResult;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}

	@Override
	public DescribeSasPmAgentListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSasPmAgentListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
