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

import com.aliyuncs.sofa.model.v20190815.QueryTSJobGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSJobGroupsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSJobGroupsResponseUnmarshaller {

	public static QueryTSJobGroupsResponse unmarshall(QueryTSJobGroupsResponse queryTSJobGroupsResponse, UnmarshallerContext _ctx) {
		
		queryTSJobGroupsResponse.setRequestId(_ctx.stringValue("QueryTSJobGroupsResponse.RequestId"));
		queryTSJobGroupsResponse.setResultCode(_ctx.stringValue("QueryTSJobGroupsResponse.ResultCode"));
		queryTSJobGroupsResponse.setResultMessage(_ctx.stringValue("QueryTSJobGroupsResponse.ResultMessage"));
		queryTSJobGroupsResponse.setPageNum(_ctx.longValue("QueryTSJobGroupsResponse.PageNum"));
		queryTSJobGroupsResponse.setPageSize(_ctx.longValue("QueryTSJobGroupsResponse.PageSize"));
		queryTSJobGroupsResponse.setTotalCount(_ctx.longValue("QueryTSJobGroupsResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSJobGroupsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setDescription(_ctx.stringValue("QueryTSJobGroupsResponse.List["+ i +"].Description"));
			listItem.setGmtCreate(_ctx.stringValue("QueryTSJobGroupsResponse.List["+ i +"].GmtCreate"));
			listItem.setGmtModify(_ctx.stringValue("QueryTSJobGroupsResponse.List["+ i +"].GmtModify"));
			listItem.setId(_ctx.longValue("QueryTSJobGroupsResponse.List["+ i +"].Id"));
			listItem.setInstanceId(_ctx.stringValue("QueryTSJobGroupsResponse.List["+ i +"].InstanceId"));
			listItem.setJobCount(_ctx.longValue("QueryTSJobGroupsResponse.List["+ i +"].JobCount"));
			listItem.setName(_ctx.stringValue("QueryTSJobGroupsResponse.List["+ i +"].Name"));
			listItem.setOperator(_ctx.stringValue("QueryTSJobGroupsResponse.List["+ i +"].Operator"));

			list.add(listItem);
		}
		queryTSJobGroupsResponse.setList(list);
	 
	 	return queryTSJobGroupsResponse;
	}
}