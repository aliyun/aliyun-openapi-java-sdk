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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.ListJMeterReportsResponse;
import com.aliyuncs.pts.model.v20201020.ListJMeterReportsResponse.JMeterReportView;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJMeterReportsResponseUnmarshaller {

	public static ListJMeterReportsResponse unmarshall(ListJMeterReportsResponse listJMeterReportsResponse, UnmarshallerContext _ctx) {
		
		listJMeterReportsResponse.setRequestId(_ctx.stringValue("ListJMeterReportsResponse.RequestId"));
		listJMeterReportsResponse.setTotalCount(_ctx.longValue("ListJMeterReportsResponse.TotalCount"));
		listJMeterReportsResponse.setMessage(_ctx.stringValue("ListJMeterReportsResponse.Message"));
		listJMeterReportsResponse.setPageSize(_ctx.integerValue("ListJMeterReportsResponse.PageSize"));
		listJMeterReportsResponse.setPageNumber(_ctx.integerValue("ListJMeterReportsResponse.PageNumber"));
		listJMeterReportsResponse.setHttpStatusCode(_ctx.integerValue("ListJMeterReportsResponse.HttpStatusCode"));
		listJMeterReportsResponse.setCode(_ctx.stringValue("ListJMeterReportsResponse.Code"));
		listJMeterReportsResponse.setSuccess(_ctx.booleanValue("ListJMeterReportsResponse.Success"));

		List<JMeterReportView> reports = new ArrayList<JMeterReportView>();
		for (int i = 0; i < _ctx.lengthValue("ListJMeterReportsResponse.Reports.Length"); i++) {
			JMeterReportView jMeterReportView = new JMeterReportView();
			jMeterReportView.setReportName(_ctx.stringValue("ListJMeterReportsResponse.Reports["+ i +"].ReportName"));
			jMeterReportView.setDuration(_ctx.stringValue("ListJMeterReportsResponse.Reports["+ i +"].Duration"));
			jMeterReportView.setReportId(_ctx.stringValue("ListJMeterReportsResponse.Reports["+ i +"].ReportId"));
			jMeterReportView.setVum(_ctx.longValue("ListJMeterReportsResponse.Reports["+ i +"].Vum"));
			jMeterReportView.setActualStartTime(_ctx.longValue("ListJMeterReportsResponse.Reports["+ i +"].ActualStartTime"));

			reports.add(jMeterReportView);
		}
		listJMeterReportsResponse.setReports(reports);
	 
	 	return listJMeterReportsResponse;
	}
}