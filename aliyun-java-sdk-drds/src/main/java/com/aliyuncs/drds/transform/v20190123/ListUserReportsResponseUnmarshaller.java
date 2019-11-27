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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.ListUserReportsResponse;
import com.aliyuncs.drds.model.v20190123.ListUserReportsResponse.SqlComparisonReport;
import com.aliyuncs.drds.model.v20190123.ListUserReportsResponse.SqlComparisonReport.ExecuteDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserReportsResponseUnmarshaller {

	public static ListUserReportsResponse unmarshall(ListUserReportsResponse listUserReportsResponse, UnmarshallerContext _ctx) {
		
		listUserReportsResponse.setRequestId(_ctx.stringValue("ListUserReportsResponse.RequestId"));
		listUserReportsResponse.setSuccess(_ctx.booleanValue("ListUserReportsResponse.Success"));

		SqlComparisonReport sqlComparisonReport = new SqlComparisonReport();
		sqlComparisonReport.setSqlPassFailNum(_ctx.longValue("ListUserReportsResponse.sqlComparisonReport.SqlPassFailNum"));
		sqlComparisonReport.setSqlPassRate(_ctx.stringValue("ListUserReportsResponse.sqlComparisonReport.SqlPassRate"));
		sqlComparisonReport.setSqlPassSuccNum(_ctx.longValue("ListUserReportsResponse.sqlComparisonReport.SqlPassSuccNum"));
		sqlComparisonReport.setVersion(_ctx.stringValue("ListUserReportsResponse.sqlComparisonReport.Version"));

		List<ExecuteDetail> executeDetailList = new ArrayList<ExecuteDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListUserReportsResponse.sqlComparisonReport.executeDetailList.Length"); i++) {
			ExecuteDetail executeDetail = new ExecuteDetail();
			executeDetail.setExecDetailMsg(_ctx.stringValue("ListUserReportsResponse.sqlComparisonReport.executeDetailList["+ i +"].ExecDetailMsg"));
			executeDetail.setExecute(_ctx.stringValue("ListUserReportsResponse.sqlComparisonReport.executeDetailList["+ i +"].Execute"));
			executeDetail.setSqlContent(_ctx.stringValue("ListUserReportsResponse.sqlComparisonReport.executeDetailList["+ i +"].SqlContent"));
			executeDetail.setDbName(_ctx.stringValue("ListUserReportsResponse.sqlComparisonReport.executeDetailList["+ i +"].DbName"));

			executeDetailList.add(executeDetail);
		}
		sqlComparisonReport.setExecuteDetailList(executeDetailList);
		listUserReportsResponse.setSqlComparisonReport(sqlComparisonReport);
	 
	 	return listUserReportsResponse;
	}
}