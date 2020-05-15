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

import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstanceNewestResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstanceNewestResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.QueryTSTriggerInstanceNewestResponse.ListItem.RuntimeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTriggerInstanceNewestResponseUnmarshaller {

	public static QueryTSTriggerInstanceNewestResponse unmarshall(QueryTSTriggerInstanceNewestResponse queryTSTriggerInstanceNewestResponse, UnmarshallerContext _ctx) {
		
		queryTSTriggerInstanceNewestResponse.setRequestId(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.RequestId"));
		queryTSTriggerInstanceNewestResponse.setResultCode(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.ResultCode"));
		queryTSTriggerInstanceNewestResponse.setResultMessage(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.ResultMessage"));
		queryTSTriggerInstanceNewestResponse.setPageNum(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.PageNum"));
		queryTSTriggerInstanceNewestResponse.setPageSize(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.PageSize"));
		queryTSTriggerInstanceNewestResponse.setTotalCount(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTriggerInstanceNewestResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setActivityInstanceId(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].ActivityInstanceId"));
			listItem.setConsume(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Consume"));
			listItem.setContext(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Context"));
			listItem.setGmtEnd(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].GmtEnd"));
			listItem.setGmtExpectTrigger(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].GmtExpectTrigger"));
			listItem.setGmtModify(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].GmtModify"));
			listItem.setGmtTrigger(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].GmtTrigger"));
			listItem.setId(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Id"));
			listItem.setJobItemId(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].JobItemId"));
			listItem.setJobName(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].JobName"));
			listItem.setJobType(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].JobType"));
			listItem.setJobZone(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].JobZone"));
			listItem.setMsg(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Msg"));
			listItem.setOperator(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Operator"));
			listItem.setRequestId(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].RequestId"));
			listItem.setShardingCount(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].ShardingCount"));
			listItem.setStatus(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Status"));
			listItem.setType(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Type"));

			List<String> handlers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Handlers.Length"); j++) {
				handlers.add(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].Handlers["+ j +"]"));
			}
			listItem.setHandlers(handlers);

			RuntimeConfig runtimeConfig = new RuntimeConfig();
			runtimeConfig.setMaxExecutingChunks(_ctx.stringValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].RuntimeConfig.MaxExecutingChunks"));
			runtimeConfig.setMaxExecutingChunksPerClient(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].RuntimeConfig.MaxExecutingChunksPerClient"));
			runtimeConfig.setPermitsPerSecond(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].RuntimeConfig.PermitsPerSecond"));
			runtimeConfig.setTolerateProcessFailedCount(_ctx.longValue("QueryTSTriggerInstanceNewestResponse.List["+ i +"].RuntimeConfig.TolerateProcessFailedCount"));
			listItem.setRuntimeConfig(runtimeConfig);

			list.add(listItem);
		}
		queryTSTriggerInstanceNewestResponse.setList(list);
	 
	 	return queryTSTriggerInstanceNewestResponse;
	}
}