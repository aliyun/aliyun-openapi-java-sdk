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

import com.aliyuncs.das.model.v20200116.QuerySqlAnalysisDataResponse;
import com.aliyuncs.das.model.v20200116.QuerySqlAnalysisDataResponse.Data;
import com.aliyuncs.das.model.v20200116.QuerySqlAnalysisDataResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySqlAnalysisDataResponseUnmarshaller {

	public static QuerySqlAnalysisDataResponse unmarshall(QuerySqlAnalysisDataResponse querySqlAnalysisDataResponse, UnmarshallerContext _ctx) {
		
		querySqlAnalysisDataResponse.setRequestId(_ctx.stringValue("QuerySqlAnalysisDataResponse.RequestId"));
		querySqlAnalysisDataResponse.setMessage(_ctx.stringValue("QuerySqlAnalysisDataResponse.Message"));
		querySqlAnalysisDataResponse.setCode(_ctx.longValue("QuerySqlAnalysisDataResponse.Code"));
		querySqlAnalysisDataResponse.setSuccess(_ctx.booleanValue("QuerySqlAnalysisDataResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySqlAnalysisDataResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAvgRowsExamined(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].AvgRowsExamined"));
			listItem.setAvgRt(_ctx.doubleValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].AvgRt"));
			listItem.setCnt(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].Cnt"));
			listItem.setCurrentEndTime(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].CurrentEndTime"));
			listItem.setDbName(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].DbName"));
			listItem.setErrorCnt(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].ErrorCnt"));
			listItem.setFirstTime(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].FirstTime"));
			listItem.setInstanceId(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].InstanceId"));
			listItem.setMaxRowsExamined(_ctx.longValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].MaxRowsExamined"));
			listItem.setSql(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].Sql"));
			listItem.setSqlId(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].SqlId"));
			listItem.setSqlTextFeature(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].SqlTextFeature"));
			listItem.setSqlType(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].SqlType"));
			listItem.setSumRt(_ctx.doubleValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].SumRt"));
			listItem.setTableList(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].TableList"));
			listItem.setTaskId(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].TaskId"));
			listItem.setType(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].Type"));
			listItem.setUserId(_ctx.stringValue("QuerySqlAnalysisDataResponse.Data.List["+ i +"].UserId"));

			list.add(listItem);
		}
		data.setList(list);
		querySqlAnalysisDataResponse.setData(data);
	 
	 	return querySqlAnalysisDataResponse;
	}
}