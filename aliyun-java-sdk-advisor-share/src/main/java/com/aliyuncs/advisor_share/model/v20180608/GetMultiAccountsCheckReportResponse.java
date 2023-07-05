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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetMultiAccountsCheckReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMultiAccountsCheckReportResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean reportExist;

		private String excelReportUrl;

		private String reportGenerateTime;

		private String pdfReportUrl;

		public Boolean getReportExist() {
			return this.reportExist;
		}

		public void setReportExist(Boolean reportExist) {
			this.reportExist = reportExist;
		}

		public String getExcelReportUrl() {
			return this.excelReportUrl;
		}

		public void setExcelReportUrl(String excelReportUrl) {
			this.excelReportUrl = excelReportUrl;
		}

		public String getReportGenerateTime() {
			return this.reportGenerateTime;
		}

		public void setReportGenerateTime(String reportGenerateTime) {
			this.reportGenerateTime = reportGenerateTime;
		}

		public String getPdfReportUrl() {
			return this.pdfReportUrl;
		}

		public void setPdfReportUrl(String pdfReportUrl) {
			this.pdfReportUrl = pdfReportUrl;
		}
	}

	@Override
	public GetMultiAccountsCheckReportResponse getInstance(UnmarshallerContext context) {
		return	GetMultiAccountsCheckReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
