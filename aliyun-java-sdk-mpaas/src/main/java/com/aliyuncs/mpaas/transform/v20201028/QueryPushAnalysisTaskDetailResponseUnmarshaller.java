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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.QueryPushAnalysisTaskDetailResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryPushAnalysisTaskDetailResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.QueryPushAnalysisTaskDetailResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushAnalysisTaskDetailResponseUnmarshaller {

	public static QueryPushAnalysisTaskDetailResponse unmarshall(QueryPushAnalysisTaskDetailResponse queryPushAnalysisTaskDetailResponse, UnmarshallerContext _ctx) {
		
		queryPushAnalysisTaskDetailResponse.setRequestId(_ctx.stringValue("QueryPushAnalysisTaskDetailResponse.RequestId"));
		queryPushAnalysisTaskDetailResponse.setResultCode(_ctx.stringValue("QueryPushAnalysisTaskDetailResponse.ResultCode"));
		queryPushAnalysisTaskDetailResponse.setResultMessage(_ctx.stringValue("QueryPushAnalysisTaskDetailResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();

		Data data = new Data();
		data.setTaskId(_ctx.longValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.TaskId"));
		data.setPushNum(_ctx.floatValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.PushNum"));
		data.setPushSuccessNum(_ctx.floatValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.PushSuccessNum"));
		data.setPushArrivalNum(_ctx.floatValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.PushArrivalNum"));
		data.setStartTime(_ctx.longValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.StartTime"));
		data.setEndTime(_ctx.longValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.EndTime"));
		data.setDuration(_ctx.stringValue("QueryPushAnalysisTaskDetailResponse.ResultContent.Data.Duration"));
		resultContent.setData(data);
		queryPushAnalysisTaskDetailResponse.setResultContent(resultContent);
	 
	 	return queryPushAnalysisTaskDetailResponse;
	}
}