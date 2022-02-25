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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetSqlAnalysisReportResponse;
import com.aliyuncs.das.model.v20200116.GetSqlAnalysisReportResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSqlAnalysisReportResponseUnmarshaller {

	public static GetSqlAnalysisReportResponse unmarshall(GetSqlAnalysisReportResponse getSqlAnalysisReportResponse, UnmarshallerContext _ctx) {
		
		getSqlAnalysisReportResponse.setRequestId(_ctx.stringValue("GetSqlAnalysisReportResponse.RequestId"));
		getSqlAnalysisReportResponse.setMessage(_ctx.stringValue("GetSqlAnalysisReportResponse.Message"));
		getSqlAnalysisReportResponse.setCode(_ctx.longValue("GetSqlAnalysisReportResponse.Code"));
		getSqlAnalysisReportResponse.setSuccess(_ctx.booleanValue("GetSqlAnalysisReportResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSqlAnalysisReportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setResult(_ctx.stringValue("GetSqlAnalysisReportResponse.Data["+ i +"].Result"));
			dataItem.setInstanceId(_ctx.stringValue("GetSqlAnalysisReportResponse.Data["+ i +"].InstanceId"));
			dataItem.setModuleName(_ctx.stringValue("GetSqlAnalysisReportResponse.Data["+ i +"].ModuleName"));
			dataItem.setTaskId(_ctx.stringValue("GetSqlAnalysisReportResponse.Data["+ i +"].TaskId"));
			dataItem.setUserId(_ctx.stringValue("GetSqlAnalysisReportResponse.Data["+ i +"].UserId"));

			data.add(dataItem);
		}
		getSqlAnalysisReportResponse.setData(data);
	 
	 	return getSqlAnalysisReportResponse;
	}
}