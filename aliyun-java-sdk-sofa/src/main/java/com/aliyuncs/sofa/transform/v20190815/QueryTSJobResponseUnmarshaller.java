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

import com.aliyuncs.sofa.model.v20190815.QueryTSJobResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSJobResponseUnmarshaller {

	public static QueryTSJobResponse unmarshall(QueryTSJobResponse queryTSJobResponse, UnmarshallerContext _ctx) {
		
		queryTSJobResponse.setRequestId(_ctx.stringValue("QueryTSJobResponse.RequestId"));
		queryTSJobResponse.setResultCode(_ctx.stringValue("QueryTSJobResponse.ResultCode"));
		queryTSJobResponse.setResultMessage(_ctx.stringValue("QueryTSJobResponse.ResultMessage"));

		Data data = new Data();
		data.setApp(_ctx.stringValue("QueryTSJobResponse.Data.App"));
		data.setCountOfActiveZone(_ctx.stringValue("QueryTSJobResponse.Data.CountOfActiveZone"));
		data.setCountOfClient(_ctx.stringValue("QueryTSJobResponse.Data.CountOfClient"));
		data.setCron(_ctx.stringValue("QueryTSJobResponse.Data.Cron"));
		data.setCustomParams(_ctx.stringValue("QueryTSJobResponse.Data.CustomParams"));
		data.setDes(_ctx.stringValue("QueryTSJobResponse.Data.Des"));
		data.setExclusive(_ctx.booleanValue("QueryTSJobResponse.Data.Exclusive"));
		data.setFailHandleStrategy(_ctx.stringValue("QueryTSJobResponse.Data.FailHandleStrategy"));
		data.setGmtCreate(_ctx.stringValue("QueryTSJobResponse.Data.GmtCreate"));
		data.setGroupId(_ctx.stringValue("QueryTSJobResponse.Data.GroupId"));
		data.setGroupName(_ctx.stringValue("QueryTSJobResponse.Data.GroupName"));
		data.setId(_ctx.longValue("QueryTSJobResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("QueryTSJobResponse.Data.InstanceId"));
		data.setInvokeType(_ctx.stringValue("QueryTSJobResponse.Data.InvokeType"));
		data.setJobId(_ctx.longValue("QueryTSJobResponse.Data.JobId"));
		data.setJobItemId(_ctx.longValue("QueryTSJobResponse.Data.JobItemId"));
		data.setJobZone(_ctx.stringValue("QueryTSJobResponse.Data.JobZone"));
		data.setMaxExecutingChunks(_ctx.stringValue("QueryTSJobResponse.Data.MaxExecutingChunks"));
		data.setMaxExecutingChunksPerClient(_ctx.stringValue("QueryTSJobResponse.Data.MaxExecutingChunksPerClient"));
		data.setMisfireStrategy(_ctx.stringValue("QueryTSJobResponse.Data.MisfireStrategy"));
		data.setName(_ctx.stringValue("QueryTSJobResponse.Data.Name"));
		data.setOperator(_ctx.stringValue("QueryTSJobResponse.Data.Operator"));
		data.setPermitsPerSecond(_ctx.stringValue("QueryTSJobResponse.Data.PermitsPerSecond"));
		data.setPriority(_ctx.stringValue("QueryTSJobResponse.Data.Priority"));
		data.setRouteStrategy(_ctx.stringValue("QueryTSJobResponse.Data.RouteStrategy"));
		data.setShardingCount(_ctx.stringValue("QueryTSJobResponse.Data.ShardingCount"));
		data.setSleepTime(_ctx.longValue("QueryTSJobResponse.Data.SleepTime"));
		data.setStatus(_ctx.stringValue("QueryTSJobResponse.Data.Status"));
		data.setTimeout(_ctx.longValue("QueryTSJobResponse.Data.Timeout"));
		data.setTimeoutStrategy(_ctx.stringValue("QueryTSJobResponse.Data.TimeoutStrategy"));
		data.setTimeUnit(_ctx.stringValue("QueryTSJobResponse.Data.TimeUnit"));
		data.setTimeZone(_ctx.stringValue("QueryTSJobResponse.Data.TimeZone"));
		data.setTolerateProcessFailedCount(_ctx.stringValue("QueryTSJobResponse.Data.TolerateProcessFailedCount"));
		data.setTotalZone(_ctx.stringValue("QueryTSJobResponse.Data.TotalZone"));
		data.setTriggerMode(_ctx.stringValue("QueryTSJobResponse.Data.TriggerMode"));
		data.setTriggerType(_ctx.stringValue("QueryTSJobResponse.Data.TriggerType"));
		data.setType(_ctx.stringValue("QueryTSJobResponse.Data.Type"));

		List<String> handlers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSJobResponse.Data.Handlers.Length"); i++) {
			handlers.add(_ctx.stringValue("QueryTSJobResponse.Data.Handlers["+ i +"]"));
		}
		data.setHandlers(handlers);
		queryTSJobResponse.setData(data);
	 
	 	return queryTSJobResponse;
	}
}