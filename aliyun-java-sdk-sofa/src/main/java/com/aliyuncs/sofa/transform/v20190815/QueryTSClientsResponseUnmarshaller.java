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

import com.aliyuncs.sofa.model.v20190815.QueryTSClientsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSClientsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSClientsResponseUnmarshaller {

	public static QueryTSClientsResponse unmarshall(QueryTSClientsResponse queryTSClientsResponse, UnmarshallerContext _ctx) {
		
		queryTSClientsResponse.setRequestId(_ctx.stringValue("QueryTSClientsResponse.RequestId"));
		queryTSClientsResponse.setResultCode(_ctx.stringValue("QueryTSClientsResponse.ResultCode"));
		queryTSClientsResponse.setResultMessage(_ctx.stringValue("QueryTSClientsResponse.ResultMessage"));
		queryTSClientsResponse.setPageNum(_ctx.longValue("QueryTSClientsResponse.PageNum"));
		queryTSClientsResponse.setPageSize(_ctx.longValue("QueryTSClientsResponse.PageSize"));
		queryTSClientsResponse.setTotalCount(_ctx.longValue("QueryTSClientsResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSClientsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setApp(_ctx.stringValue("QueryTSClientsResponse.List["+ i +"].App"));
			listItem.setInstanceId(_ctx.stringValue("QueryTSClientsResponse.List["+ i +"].InstanceId"));
			listItem.setIp(_ctx.stringValue("QueryTSClientsResponse.List["+ i +"].Ip"));
			listItem.setVersion(_ctx.stringValue("QueryTSClientsResponse.List["+ i +"].Version"));
			listItem.setZone(_ctx.stringValue("QueryTSClientsResponse.List["+ i +"].Zone"));

			list.add(listItem);
		}
		queryTSClientsResponse.setList(list);
	 
	 	return queryTSClientsResponse;
	}
}