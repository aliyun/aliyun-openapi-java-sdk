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

package com.aliyuncs.config.transform.v20200907;

import com.aliyuncs.config.model.v20200907.GetCompliancePackReportResponse;
import com.aliyuncs.config.model.v20200907.GetCompliancePackReportResponse.CompliancePackReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompliancePackReportResponseUnmarshaller {

	public static GetCompliancePackReportResponse unmarshall(GetCompliancePackReportResponse getCompliancePackReportResponse, UnmarshallerContext _ctx) {
		
		getCompliancePackReportResponse.setRequestId(_ctx.stringValue("GetCompliancePackReportResponse.RequestId"));

		CompliancePackReport compliancePackReport = new CompliancePackReport();
		compliancePackReport.setReportUrl(_ctx.stringValue("GetCompliancePackReportResponse.CompliancePackReport.ReportUrl"));
		compliancePackReport.setReportStatus(_ctx.stringValue("GetCompliancePackReportResponse.CompliancePackReport.ReportStatus"));
		compliancePackReport.setCompliancePackId(_ctx.stringValue("GetCompliancePackReportResponse.CompliancePackReport.CompliancePackId"));
		compliancePackReport.setAccountId(_ctx.longValue("GetCompliancePackReportResponse.CompliancePackReport.AccountId"));
		compliancePackReport.setReportCreateTimestamp(_ctx.longValue("GetCompliancePackReportResponse.CompliancePackReport.ReportCreateTimestamp"));
		getCompliancePackReportResponse.setCompliancePackReport(compliancePackReport);
	 
	 	return getCompliancePackReportResponse;
	}
}