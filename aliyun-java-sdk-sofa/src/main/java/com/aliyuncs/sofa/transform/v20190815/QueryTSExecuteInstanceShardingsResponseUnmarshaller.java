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

import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceShardingsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceShardingsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSExecuteInstanceShardingsResponseUnmarshaller {

	public static QueryTSExecuteInstanceShardingsResponse unmarshall(QueryTSExecuteInstanceShardingsResponse queryTSExecuteInstanceShardingsResponse, UnmarshallerContext _ctx) {
		
		queryTSExecuteInstanceShardingsResponse.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.RequestId"));
		queryTSExecuteInstanceShardingsResponse.setResultCode(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.ResultCode"));
		queryTSExecuteInstanceShardingsResponse.setResultMessage(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.ResultMessage"));
		queryTSExecuteInstanceShardingsResponse.setInstanceId(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.InstanceId"));
		queryTSExecuteInstanceShardingsResponse.setPageNum(_ctx.longValue("QueryTSExecuteInstanceShardingsResponse.PageNum"));
		queryTSExecuteInstanceShardingsResponse.setPageSize(_ctx.longValue("QueryTSExecuteInstanceShardingsResponse.PageSize"));
		queryTSExecuteInstanceShardingsResponse.setTotalCount(_ctx.longValue("QueryTSExecuteInstanceShardingsResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSExecuteInstanceShardingsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setConsume(_ctx.longValue("QueryTSExecuteInstanceShardingsResponse.List["+ i +"].Consume"));
			listItem.setGmtBegin(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.List["+ i +"].GmtBegin"));
			listItem.setGmtEnd(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.List["+ i +"].GmtEnd"));
			listItem.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.List["+ i +"].RequestId"));
			listItem.setSharding(_ctx.longValue("QueryTSExecuteInstanceShardingsResponse.List["+ i +"].Sharding"));
			listItem.setStatus(_ctx.stringValue("QueryTSExecuteInstanceShardingsResponse.List["+ i +"].Status"));

			list.add(listItem);
		}
		queryTSExecuteInstanceShardingsResponse.setList(list);
	 
	 	return queryTSExecuteInstanceShardingsResponse;
	}
}