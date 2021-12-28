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

import com.aliyuncs.config.model.v20200907.GetAggregateConfigRulesReportResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRulesReportResponse.ConfigRulesReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateConfigRulesReportResponseUnmarshaller {

	public static GetAggregateConfigRulesReportResponse unmarshall(GetAggregateConfigRulesReportResponse getAggregateConfigRulesReportResponse, UnmarshallerContext _ctx) {
		
		getAggregateConfigRulesReportResponse.setRequestId(_ctx.stringValue("GetAggregateConfigRulesReportResponse.RequestId"));

		ConfigRulesReport configRulesReport = new ConfigRulesReport();
		configRulesReport.setReportUrl(_ctx.stringValue("GetAggregateConfigRulesReportResponse.ConfigRulesReport.ReportUrl"));
		configRulesReport.setReportStatus(_ctx.stringValue("GetAggregateConfigRulesReportResponse.ConfigRulesReport.ReportStatus"));
		configRulesReport.setAccountId(_ctx.longValue("GetAggregateConfigRulesReportResponse.ConfigRulesReport.AccountId"));
		configRulesReport.setAggregatorId(_ctx.stringValue("GetAggregateConfigRulesReportResponse.ConfigRulesReport.AggregatorId"));
		configRulesReport.setReportCreateTimestamp(_ctx.longValue("GetAggregateConfigRulesReportResponse.ConfigRulesReport.ReportCreateTimestamp"));
		configRulesReport.setReportId(_ctx.stringValue("GetAggregateConfigRulesReportResponse.ConfigRulesReport.ReportId"));
		getAggregateConfigRulesReportResponse.setConfigRulesReport(configRulesReport);
	 
	 	return getAggregateConfigRulesReportResponse;
	}
}