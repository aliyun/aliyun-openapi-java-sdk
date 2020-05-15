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

import com.aliyuncs.sofa.model.v20190815.QueryTSJobsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSJobsResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.QueryTSJobsResponse.ListItem.CustomParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSJobsResponseUnmarshaller {

	public static QueryTSJobsResponse unmarshall(QueryTSJobsResponse queryTSJobsResponse, UnmarshallerContext _ctx) {
		
		queryTSJobsResponse.setRequestId(_ctx.stringValue("QueryTSJobsResponse.RequestId"));
		queryTSJobsResponse.setResultCode(_ctx.stringValue("QueryTSJobsResponse.ResultCode"));
		queryTSJobsResponse.setResultMessage(_ctx.stringValue("QueryTSJobsResponse.ResultMessage"));
		queryTSJobsResponse.setPageNum(_ctx.longValue("QueryTSJobsResponse.PageNum"));
		queryTSJobsResponse.setPageSize(_ctx.longValue("QueryTSJobsResponse.PageSize"));
		queryTSJobsResponse.setTotalCount(_ctx.longValue("QueryTSJobsResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSJobsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setApp(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].App"));
			listItem.setCountOfActiveZone(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].CountOfActiveZone"));
			listItem.setCountOfClient(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].CountOfClient"));
			listItem.setCron(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Cron"));
			listItem.setDes(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Des"));
			listItem.setExclusive(_ctx.booleanValue("QueryTSJobsResponse.List["+ i +"].Exclusive"));
			listItem.setFailHandleStrategy(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].FailHandleStrategy"));
			listItem.setGmtCreate(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].GmtCreate"));
			listItem.setGroupId(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].GroupId"));
			listItem.setGroupName(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].GroupName"));
			listItem.setId(_ctx.longValue("QueryTSJobsResponse.List["+ i +"].Id"));
			listItem.setInstanceId(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].InstanceId"));
			listItem.setInvokeType(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].InvokeType"));
			listItem.setJobId(_ctx.longValue("QueryTSJobsResponse.List["+ i +"].JobId"));
			listItem.setJobItemId(_ctx.longValue("QueryTSJobsResponse.List["+ i +"].JobItemId"));
			listItem.setJobZone(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].JobZone"));
			listItem.setMaxExecutingChunks(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].MaxExecutingChunks"));
			listItem.setMaxExecutingChunksPerClient(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].MaxExecutingChunksPerClient"));
			listItem.setMisfireStrategy(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].MisfireStrategy"));
			listItem.setName(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Name"));
			listItem.setOperator(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Operator"));
			listItem.setPermitsPerSecond(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].PermitsPerSecond"));
			listItem.setPriority(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Priority"));
			listItem.setRouteStrategy(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].RouteStrategy"));
			listItem.setShardingCount(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].ShardingCount"));
			listItem.setSleepTime(_ctx.longValue("QueryTSJobsResponse.List["+ i +"].SleepTime"));
			listItem.setStatus(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Status"));
			listItem.setTimeout(_ctx.longValue("QueryTSJobsResponse.List["+ i +"].Timeout"));
			listItem.setTimeoutStrategy(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TimeoutStrategy"));
			listItem.setTimeUnit(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TimeUnit"));
			listItem.setTimeZone(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TimeZone"));
			listItem.setTolerateProcessFailedCount(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TolerateProcessFailedCount"));
			listItem.setTotalZone(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TotalZone"));
			listItem.setTriggerMode(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TriggerMode"));
			listItem.setTriggerType(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].TriggerType"));
			listItem.setType(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Type"));

			List<String> handlers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSJobsResponse.List["+ i +"].Handlers.Length"); j++) {
				handlers.add(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].Handlers["+ j +"]"));
			}
			listItem.setHandlers(handlers);

			CustomParams customParams = new CustomParams();
			customParams.setParamKey(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].CustomParams.ParamKey"));
			customParams.setParamType(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].CustomParams.ParamType"));
			customParams.setParamValue(_ctx.stringValue("QueryTSJobsResponse.List["+ i +"].CustomParams.ParamValue"));
			listItem.setCustomParams(customParams);

			list.add(listItem);
		}
		queryTSJobsResponse.setList(list);
	 
	 	return queryTSJobsResponse;
	}
}