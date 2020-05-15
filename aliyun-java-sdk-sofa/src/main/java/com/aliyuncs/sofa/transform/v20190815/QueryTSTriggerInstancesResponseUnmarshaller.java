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

import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstancesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstancesResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstancesResponse.ListItem.RuntimeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTriggerInstancesResponseUnmarshaller {

	public static QueryTSTriggerInstancesResponse unmarshall(QueryTSTriggerInstancesResponse queryTSTriggerInstancesResponse, UnmarshallerContext _ctx) {
		
		queryTSTriggerInstancesResponse.setRequestId(_ctx.stringValue("QueryTSTriggerInstancesResponse.RequestId"));
		queryTSTriggerInstancesResponse.setResultCode(_ctx.stringValue("QueryTSTriggerInstancesResponse.ResultCode"));
		queryTSTriggerInstancesResponse.setResultMessage(_ctx.stringValue("QueryTSTriggerInstancesResponse.ResultMessage"));
		queryTSTriggerInstancesResponse.setPageNum(_ctx.longValue("QueryTSTriggerInstancesResponse.PageNum"));
		queryTSTriggerInstancesResponse.setPageSize(_ctx.longValue("QueryTSTriggerInstancesResponse.PageSize"));
		queryTSTriggerInstancesResponse.setTotalCount(_ctx.stringValue("QueryTSTriggerInstancesResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTriggerInstancesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setActivityInstanceId(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].ActivityInstanceId"));
			listItem.setConsume(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].Consume"));
			listItem.setContext(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].Context"));
			listItem.setGmtEnd(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].GmtEnd"));
			listItem.setGmtExpectTrigger(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].GmtExpectTrigger"));
			listItem.setGmtModify(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].GmtModify"));
			listItem.setGmtTrigger(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].GmtTrigger"));
			listItem.setId(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].Id"));
			listItem.setJobItemId(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].JobItemId"));
			listItem.setJobName(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].JobName"));
			listItem.setJobType(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].JobType"));
			listItem.setJobZone(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].JobZone"));
			listItem.setMsg(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].Msg"));
			listItem.setOperator(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].Operator"));
			listItem.setRequestId(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].RequestId"));
			listItem.setShardingCount(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].ShardingCount"));
			listItem.setStatus(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].Status"));
			listItem.setType(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].Type"));

			List<String> handlers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSTriggerInstancesResponse.List["+ i +"].Handlers.Length"); j++) {
				handlers.add(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].Handlers["+ j +"]"));
			}
			listItem.setHandlers(handlers);

			RuntimeConfig runtimeConfig = new RuntimeConfig();
			runtimeConfig.setMaxExecutingChunks(_ctx.stringValue("QueryTSTriggerInstancesResponse.List["+ i +"].RuntimeConfig.MaxExecutingChunks"));
			runtimeConfig.setMaxExecutingChunksPerClient(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].RuntimeConfig.MaxExecutingChunksPerClient"));
			runtimeConfig.setPermitsPerSecond(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].RuntimeConfig.PermitsPerSecond"));
			runtimeConfig.setTolerateProcessFailedCount(_ctx.longValue("QueryTSTriggerInstancesResponse.List["+ i +"].RuntimeConfig.TolerateProcessFailedCount"));
			listItem.setRuntimeConfig(runtimeConfig);

			list.add(listItem);
		}
		queryTSTriggerInstancesResponse.setList(list);
	 
	 	return queryTSTriggerInstancesResponse;
	}
}