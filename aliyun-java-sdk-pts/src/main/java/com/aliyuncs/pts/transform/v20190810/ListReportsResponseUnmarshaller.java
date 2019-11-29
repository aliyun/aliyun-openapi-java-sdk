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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.ListReportsResponse;
import com.aliyuncs.pts.model.v20190810.ListReportsResponse.Report;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListReportsResponseUnmarshaller {

	public static ListReportsResponse unmarshall(ListReportsResponse listReportsResponse, UnmarshallerContext _ctx) {
		
		listReportsResponse.setRequestId(_ctx.stringValue("ListReportsResponse.RequestId"));
		listReportsResponse.setPageNumber(_ctx.integerValue("ListReportsResponse.PageNumber"));
		listReportsResponse.setCode(_ctx.stringValue("ListReportsResponse.Code"));
		listReportsResponse.setSuccess(_ctx.booleanValue("ListReportsResponse.Success"));
		listReportsResponse.setPageSize(_ctx.integerValue("ListReportsResponse.PageSize"));
		listReportsResponse.setTotalCount(_ctx.integerValue("ListReportsResponse.TotalCount"));
		listReportsResponse.setMessage(_ctx.stringValue("ListReportsResponse.Message"));
		listReportsResponse.setHttpStatusCode(_ctx.integerValue("ListReportsResponse.HttpStatusCode"));

		List<Report> reports = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("ListReportsResponse.Reports.Length"); i++) {
			Report report = new Report();
			report.setReportId(_ctx.stringValue("ListReportsResponse.Reports["+ i +"].ReportId"));
			report.setSceneId(_ctx.stringValue("ListReportsResponse.Reports["+ i +"].SceneId"));
			report.setSceneName(_ctx.stringValue("ListReportsResponse.Reports["+ i +"].SceneName"));
			report.setSceneType(_ctx.stringValue("ListReportsResponse.Reports["+ i +"].SceneType"));
			report.setMaxConcurrency(_ctx.integerValue("ListReportsResponse.Reports["+ i +"].MaxConcurrency"));
			report.setVum(_ctx.integerValue("ListReportsResponse.Reports["+ i +"].Vum"));
			report.setDuration(_ctx.stringValue("ListReportsResponse.Reports["+ i +"].Duration"));
			report.setBeginTime(_ctx.longValue("ListReportsResponse.Reports["+ i +"].BeginTime"));
			report.setSceneDeleted(_ctx.booleanValue("ListReportsResponse.Reports["+ i +"].SceneDeleted"));
			report.setRequestId(_ctx.stringValue("ListReportsResponse.Reports["+ i +"].RequestId"));

			reports.add(report);
		}
		listReportsResponse.setReports(reports);
	 
	 	return listReportsResponse;
	}
}