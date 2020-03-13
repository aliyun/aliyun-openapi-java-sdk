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

import com.aliyuncs.sofa.model.v20190815.QueryTSTopologiesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologiesResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTopologiesResponseUnmarshaller {

	public static QueryTSTopologiesResponse unmarshall(QueryTSTopologiesResponse queryTSTopologiesResponse, UnmarshallerContext _ctx) {
		
		queryTSTopologiesResponse.setRequestId(_ctx.stringValue("QueryTSTopologiesResponse.RequestId"));
		queryTSTopologiesResponse.setResultCode(_ctx.stringValue("QueryTSTopologiesResponse.ResultCode"));
		queryTSTopologiesResponse.setResultMessage(_ctx.stringValue("QueryTSTopologiesResponse.ResultMessage"));
		queryTSTopologiesResponse.setPageNum(_ctx.longValue("QueryTSTopologiesResponse.PageNum"));
		queryTSTopologiesResponse.setPageSize(_ctx.longValue("QueryTSTopologiesResponse.PageSize"));
		queryTSTopologiesResponse.setTotalCount(_ctx.longValue("QueryTSTopologiesResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTopologiesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setApp(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].App"));
			listItem.setCountOfActiveZone(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].CountOfActiveZone"));
			listItem.setCountOfClient(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].CountOfClient"));
			listItem.setCron(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Cron"));
			listItem.setCustomParams(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].CustomParams"));
			listItem.setDes(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Des"));
			listItem.setExclusive(_ctx.booleanValue("QueryTSTopologiesResponse.List["+ i +"].Exclusive"));
			listItem.setFailHandleStrategy(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].FailHandleStrategy"));
			listItem.setGmtCreate(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].GmtCreate"));
			listItem.setGroupId(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].GroupId"));
			listItem.setGroupName(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].GroupName"));
			listItem.setId(_ctx.longValue("QueryTSTopologiesResponse.List["+ i +"].Id"));
			listItem.setInstanceId(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].InstanceId"));
			listItem.setInvokeType(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].InvokeType"));
			listItem.setJobId(_ctx.longValue("QueryTSTopologiesResponse.List["+ i +"].JobId"));
			listItem.setJobItemId(_ctx.longValue("QueryTSTopologiesResponse.List["+ i +"].JobItemId"));
			listItem.setJobZone(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].JobZone"));
			listItem.setMaxExecutingChunks(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].MaxExecutingChunks"));
			listItem.setMaxExecutingChunksPerClient(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].MaxExecutingChunksPerClient"));
			listItem.setMisfireStrategy(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].MisfireStrategy"));
			listItem.setName(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Name"));
			listItem.setOperator(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Operator"));
			listItem.setPermitsPerSecond(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].PermitsPerSecond"));
			listItem.setPriority(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Priority"));
			listItem.setRouteStrategy(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].RouteStrategy"));
			listItem.setShardingCount(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].ShardingCount"));
			listItem.setSleepTime(_ctx.longValue("QueryTSTopologiesResponse.List["+ i +"].SleepTime"));
			listItem.setStatus(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Status"));
			listItem.setTimeout(_ctx.longValue("QueryTSTopologiesResponse.List["+ i +"].Timeout"));
			listItem.setTimeoutStrategy(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TimeoutStrategy"));
			listItem.setTimeUnit(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TimeUnit"));
			listItem.setTimeZone(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TimeZone"));
			listItem.setTolerateProcessFailedCount(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TolerateProcessFailedCount"));
			listItem.setTotalZone(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TotalZone"));
			listItem.setTriggerMode(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TriggerMode"));
			listItem.setTriggerType(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].TriggerType"));
			listItem.setType(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Type"));

			List<String> handlers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSTopologiesResponse.List["+ i +"].Handlers.Length"); j++) {
				handlers.add(_ctx.stringValue("QueryTSTopologiesResponse.List["+ i +"].Handlers["+ j +"]"));
			}
			listItem.setHandlers(handlers);

			list.add(listItem);
		}
		queryTSTopologiesResponse.setList(list);
	 
	 	return queryTSTopologiesResponse;
	}
}