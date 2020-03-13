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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstanceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstanceResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstanceResponse.Data.RuntimeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTriggerInstanceResponseUnmarshaller {

	public static QueryTSTriggerInstanceResponse unmarshall(QueryTSTriggerInstanceResponse queryTSTriggerInstanceResponse, UnmarshallerContext _ctx) {
		
		queryTSTriggerInstanceResponse.setRequestId(_ctx.stringValue("QueryTSTriggerInstanceResponse.RequestId"));
		queryTSTriggerInstanceResponse.setResultCode(_ctx.stringValue("QueryTSTriggerInstanceResponse.ResultCode"));
		queryTSTriggerInstanceResponse.setResultMessage(_ctx.stringValue("QueryTSTriggerInstanceResponse.ResultMessage"));

		Data data = new Data();
		data.setActivityInstanceId(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.ActivityInstanceId"));
		data.setConsume(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.Consume"));
		data.setContext(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.Context"));
		data.setGmtEnd(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.GmtEnd"));
		data.setGmtExpectTrigger(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.GmtExpectTrigger"));
		data.setGmtModify(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.GmtModify"));
		data.setGmtTrigger(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.GmtTrigger"));
		data.setId(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.Id"));
		data.setJobItemId(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.JobItemId"));
		data.setJobName(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.JobName"));
		data.setJobType(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.JobType"));
		data.setJobZone(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.JobZone"));
		data.setMsg(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.Msg"));
		data.setOperator(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.Operator"));
		data.setRequestId(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.RequestId"));
		data.setShardingCount(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.ShardingCount"));
		data.setStatus(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.Status"));
		data.setType(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.Type"));

		List<String> handlers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTriggerInstanceResponse.Data.Handlers.Length"); i++) {
			handlers.add(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.Handlers["+ i +"]"));
		}
		data.setHandlers(handlers);

		RuntimeConfig runtimeConfig = new RuntimeConfig();
		runtimeConfig.setMaxExecutingChunks(_ctx.stringValue("QueryTSTriggerInstanceResponse.Data.RuntimeConfig.MaxExecutingChunks"));
		runtimeConfig.setMaxExecutingChunksPerClient(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.RuntimeConfig.MaxExecutingChunksPerClient"));
		runtimeConfig.setPermitsPerSecond(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.RuntimeConfig.PermitsPerSecond"));
		runtimeConfig.setTolerateProcessFailedCount(_ctx.longValue("QueryTSTriggerInstanceResponse.Data.RuntimeConfig.TolerateProcessFailedCount"));
		data.setRuntimeConfig(runtimeConfig);
		queryTSTriggerInstanceResponse.setData(data);
	 
	 	return queryTSTriggerInstanceResponse;
	}
}