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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySummarySceneRuleLogResponse;
import com.aliyuncs.iot.model.v20180120.QuerySummarySceneRuleLogResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySummarySceneRuleLogResponse.Data.LogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySummarySceneRuleLogResponseUnmarshaller {

	public static QuerySummarySceneRuleLogResponse unmarshall(QuerySummarySceneRuleLogResponse querySummarySceneRuleLogResponse, UnmarshallerContext _ctx) {
		
		querySummarySceneRuleLogResponse.setRequestId(_ctx.stringValue("QuerySummarySceneRuleLogResponse.RequestId"));
		querySummarySceneRuleLogResponse.setSuccess(_ctx.booleanValue("QuerySummarySceneRuleLogResponse.Success"));
		querySummarySceneRuleLogResponse.setErrorMessage(_ctx.stringValue("QuerySummarySceneRuleLogResponse.ErrorMessage"));
		querySummarySceneRuleLogResponse.setCode(_ctx.stringValue("QuerySummarySceneRuleLogResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySummarySceneRuleLogResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QuerySummarySceneRuleLogResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QuerySummarySceneRuleLogResponse.Data.CurrentPage"));

		List<LogInfo> logList = new ArrayList<LogInfo>();
		for (int i = 0; i < _ctx.lengthValue("QuerySummarySceneRuleLogResponse.Data.LogList.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setLogTime(_ctx.integerValue("QuerySummarySceneRuleLogResponse.Data.LogList["+ i +"].LogTime"));
			logInfo.setResult(_ctx.stringValue("QuerySummarySceneRuleLogResponse.Data.LogList["+ i +"].Result"));
			logInfo.setTraceId(_ctx.stringValue("QuerySummarySceneRuleLogResponse.Data.LogList["+ i +"].TraceId"));

			logList.add(logInfo);
		}
		data.setLogList(logList);
		querySummarySceneRuleLogResponse.setData(data);
	 
	 	return querySummarySceneRuleLogResponse;
	}
}