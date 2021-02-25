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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListInstanceStateReportsResponse;
import com.aliyuncs.oos.model.v20190601.ListInstanceStateReportsResponse.StateReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceStateReportsResponseUnmarshaller {

	public static ListInstanceStateReportsResponse unmarshall(ListInstanceStateReportsResponse listInstanceStateReportsResponse, UnmarshallerContext _ctx) {
		
		listInstanceStateReportsResponse.setRequestId(_ctx.stringValue("ListInstanceStateReportsResponse.RequestId"));
		listInstanceStateReportsResponse.setMaxResults(_ctx.integerValue("ListInstanceStateReportsResponse.MaxResults"));
		listInstanceStateReportsResponse.setNextToken(_ctx.stringValue("ListInstanceStateReportsResponse.NextToken"));

		List<StateReport> stateReports = new ArrayList<StateReport>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceStateReportsResponse.StateReports.Length"); i++) {
			StateReport stateReport = new StateReport();
			stateReport.setReportTime(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].ReportTime"));
			stateReport.setInstanceId(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].InstanceId"));
			stateReport.setStateConfigurationId(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].StateConfigurationId"));
			stateReport.setMode(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].Mode"));
			stateReport.setReportStatus(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].ReportStatus"));
			stateReport.setSuccessApplyTime(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].SuccessApplyTime"));
			stateReport.setReportInfo(_ctx.stringValue("ListInstanceStateReportsResponse.StateReports["+ i +"].ReportInfo"));

			stateReports.add(stateReport);
		}
		listInstanceStateReportsResponse.setStateReports(stateReports);
	 
	 	return listInstanceStateReportsResponse;
	}
}