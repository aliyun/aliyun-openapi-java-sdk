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

import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSExecuteInstanceResponseUnmarshaller {

	public static QueryTSExecuteInstanceResponse unmarshall(QueryTSExecuteInstanceResponse queryTSExecuteInstanceResponse, UnmarshallerContext _ctx) {
		
		queryTSExecuteInstanceResponse.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceResponse.RequestId"));
		queryTSExecuteInstanceResponse.setResultCode(_ctx.stringValue("QueryTSExecuteInstanceResponse.ResultCode"));
		queryTSExecuteInstanceResponse.setResultMessage(_ctx.stringValue("QueryTSExecuteInstanceResponse.ResultMessage"));
		queryTSExecuteInstanceResponse.setPageNum(_ctx.longValue("QueryTSExecuteInstanceResponse.PageNum"));
		queryTSExecuteInstanceResponse.setPageSize(_ctx.longValue("QueryTSExecuteInstanceResponse.PageSize"));
		queryTSExecuteInstanceResponse.setTotalCount(_ctx.longValue("QueryTSExecuteInstanceResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSExecuteInstanceResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setConsume(_ctx.longValue("QueryTSExecuteInstanceResponse.List["+ i +"].Consume"));
			listItem.setContext(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].Context"));
			listItem.setExecuteId(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].ExecuteId"));
			listItem.setGmtBegin(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].GmtBegin"));
			listItem.setGmtEnd(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].GmtEnd"));
			listItem.setHandler(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].Handler"));
			listItem.setId(_ctx.longValue("QueryTSExecuteInstanceResponse.List["+ i +"].Id"));
			listItem.setJobItemId(_ctx.longValue("QueryTSExecuteInstanceResponse.List["+ i +"].JobItemId"));
			listItem.setMsg(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].Msg"));
			listItem.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].RequestId"));
			listItem.setSharding(_ctx.longValue("QueryTSExecuteInstanceResponse.List["+ i +"].Sharding"));
			listItem.setStatus(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].Status"));
			listItem.setTargerServer(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].TargerServer"));
			listItem.setTriggerServer(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].TriggerServer"));
			listItem.setType(_ctx.stringValue("QueryTSExecuteInstanceResponse.List["+ i +"].Type"));

			list.add(listItem);
		}
		queryTSExecuteInstanceResponse.setList(list);
	 
	 	return queryTSExecuteInstanceResponse;
	}
}