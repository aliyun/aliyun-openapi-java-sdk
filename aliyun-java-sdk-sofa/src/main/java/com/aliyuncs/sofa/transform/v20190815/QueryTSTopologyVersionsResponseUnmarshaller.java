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

import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyVersionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSTopologyVersionsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSTopologyVersionsResponseUnmarshaller {

	public static QueryTSTopologyVersionsResponse unmarshall(QueryTSTopologyVersionsResponse queryTSTopologyVersionsResponse, UnmarshallerContext _ctx) {
		
		queryTSTopologyVersionsResponse.setRequestId(_ctx.stringValue("QueryTSTopologyVersionsResponse.RequestId"));
		queryTSTopologyVersionsResponse.setResultCode(_ctx.stringValue("QueryTSTopologyVersionsResponse.ResultCode"));
		queryTSTopologyVersionsResponse.setResultMessage(_ctx.stringValue("QueryTSTopologyVersionsResponse.ResultMessage"));
		queryTSTopologyVersionsResponse.setPageNum(_ctx.longValue("QueryTSTopologyVersionsResponse.PageNum"));
		queryTSTopologyVersionsResponse.setPageSize(_ctx.longValue("QueryTSTopologyVersionsResponse.PageSize"));
		queryTSTopologyVersionsResponse.setTotalCount(_ctx.longValue("QueryTSTopologyVersionsResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSTopologyVersionsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBaseVersion(_ctx.longValue("QueryTSTopologyVersionsResponse.List["+ i +"].BaseVersion"));
			listItem.setGmtCreate(_ctx.stringValue("QueryTSTopologyVersionsResponse.List["+ i +"].GmtCreate"));
			listItem.setGmtEffective(_ctx.stringValue("QueryTSTopologyVersionsResponse.List["+ i +"].GmtEffective"));
			listItem.setId(_ctx.longValue("QueryTSTopologyVersionsResponse.List["+ i +"].Id"));
			listItem.setJobId(_ctx.longValue("QueryTSTopologyVersionsResponse.List["+ i +"].JobId"));
			listItem.setOperator(_ctx.stringValue("QueryTSTopologyVersionsResponse.List["+ i +"].Operator"));
			listItem.setRemark(_ctx.stringValue("QueryTSTopologyVersionsResponse.List["+ i +"].Remark"));
			listItem.setStatus(_ctx.stringValue("QueryTSTopologyVersionsResponse.List["+ i +"].Status"));
			listItem.setVersion(_ctx.longValue("QueryTSTopologyVersionsResponse.List["+ i +"].Version"));

			list.add(listItem);
		}
		queryTSTopologyVersionsResponse.setList(list);
	 
	 	return queryTSTopologyVersionsResponse;
	}
}