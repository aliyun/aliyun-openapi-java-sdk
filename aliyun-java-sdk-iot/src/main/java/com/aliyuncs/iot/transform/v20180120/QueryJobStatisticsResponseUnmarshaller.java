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

import com.aliyuncs.iot.model.v20180120.QueryJobStatisticsResponse;
import com.aliyuncs.iot.model.v20180120.QueryJobStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobStatisticsResponseUnmarshaller {

	public static QueryJobStatisticsResponse unmarshall(QueryJobStatisticsResponse queryJobStatisticsResponse, UnmarshallerContext _ctx) {
		
		queryJobStatisticsResponse.setRequestId(_ctx.stringValue("QueryJobStatisticsResponse.RequestId"));
		queryJobStatisticsResponse.setSuccess(_ctx.booleanValue("QueryJobStatisticsResponse.Success"));
		queryJobStatisticsResponse.setCode(_ctx.stringValue("QueryJobStatisticsResponse.Code"));
		queryJobStatisticsResponse.setErrorMessage(_ctx.stringValue("QueryJobStatisticsResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryJobStatisticsResponse.Data.Total"));
		data.setQueued(_ctx.integerValue("QueryJobStatisticsResponse.Data.Queued"));
		data.setSent(_ctx.integerValue("QueryJobStatisticsResponse.Data.Sent"));
		data.setInProgress(_ctx.integerValue("QueryJobStatisticsResponse.Data.InProgress"));
		data.setSucceeded(_ctx.integerValue("QueryJobStatisticsResponse.Data.Succeeded"));
		data.setFailed(_ctx.integerValue("QueryJobStatisticsResponse.Data.Failed"));
		data.setRejected(_ctx.integerValue("QueryJobStatisticsResponse.Data.Rejected"));
		data.setTimeOut(_ctx.integerValue("QueryJobStatisticsResponse.Data.TimeOut"));
		data.setCancelled(_ctx.integerValue("QueryJobStatisticsResponse.Data.Cancelled"));
		queryJobStatisticsResponse.setData(data);
	 
	 	return queryJobStatisticsResponse;
	}
}