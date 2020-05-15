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

import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceByIpResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceByIpResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSExecuteInstanceByIpResponseUnmarshaller {

	public static QueryTSExecuteInstanceByIpResponse unmarshall(QueryTSExecuteInstanceByIpResponse queryTSExecuteInstanceByIpResponse, UnmarshallerContext _ctx) {
		
		queryTSExecuteInstanceByIpResponse.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.RequestId"));
		queryTSExecuteInstanceByIpResponse.setResultCode(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.ResultCode"));
		queryTSExecuteInstanceByIpResponse.setResultMessage(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.ResultMessage"));
		queryTSExecuteInstanceByIpResponse.setPageNum(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.PageNum"));
		queryTSExecuteInstanceByIpResponse.setPageSize(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.PageSize"));
		queryTSExecuteInstanceByIpResponse.setTotalCount(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSExecuteInstanceByIpResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setConsume(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Consume"));
			listItem.setContext(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Context"));
			listItem.setExecuteId(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].ExecuteId"));
			listItem.setGmtBegin(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].GmtBegin"));
			listItem.setGmtEnd(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].GmtEnd"));
			listItem.setHandler(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Handler"));
			listItem.setId(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Id"));
			listItem.setJobItemId(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].JobItemId"));
			listItem.setMsg(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Msg"));
			listItem.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].RequestId"));
			listItem.setSharding(_ctx.longValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Sharding"));
			listItem.setStatus(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Status"));
			listItem.setTargerServer(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].TargerServer"));
			listItem.setTriggerServer(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].TriggerServer"));
			listItem.setType(_ctx.stringValue("QueryTSExecuteInstanceByIpResponse.List["+ i +"].Type"));

			list.add(listItem);
		}
		queryTSExecuteInstanceByIpResponse.setList(list);
	 
	 	return queryTSExecuteInstanceByIpResponse;
	}
}