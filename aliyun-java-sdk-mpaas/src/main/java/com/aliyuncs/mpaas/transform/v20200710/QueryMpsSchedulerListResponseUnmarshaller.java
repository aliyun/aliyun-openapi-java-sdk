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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.QueryMpsSchedulerListResponse;
import com.aliyuncs.mpaas.model.v20200710.QueryMpsSchedulerListResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20200710.QueryMpsSchedulerListResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20200710.QueryMpsSchedulerListResponse.ResultContent.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMpsSchedulerListResponseUnmarshaller {

	public static QueryMpsSchedulerListResponse unmarshall(QueryMpsSchedulerListResponse queryMpsSchedulerListResponse, UnmarshallerContext _ctx) {
		
		queryMpsSchedulerListResponse.setRequestId(_ctx.stringValue("QueryMpsSchedulerListResponse.RequestId"));
		queryMpsSchedulerListResponse.setResultMessage(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultMessage"));
		queryMpsSchedulerListResponse.setResultCode(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QueryMpsSchedulerListResponse.ResultContent.Data.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMpsSchedulerListResponse.ResultContent.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setType(_ctx.integerValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].Type"));
			listItem.setParentId(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].ParentId"));
			listItem.setExecutedStatus(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].ExecutedStatus"));
			listItem.setPushTitle(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].PushTitle"));
			listItem.setDeliveryType(_ctx.integerValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].DeliveryType"));
			listItem.setGmtCreate(_ctx.longValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].GmtCreate"));
			listItem.setUniqueId(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].UniqueId"));
			listItem.setPushContent(_ctx.stringValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].PushContent"));
			listItem.setPushTime(_ctx.longValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].PushTime"));
			listItem.setCreateType(_ctx.integerValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].CreateType"));
			listItem.setStrategyType(_ctx.integerValue("QueryMpsSchedulerListResponse.ResultContent.Data.List["+ i +"].StrategyType"));

			list.add(listItem);
		}
		data.setList(list);
		resultContent.setData(data);
		queryMpsSchedulerListResponse.setResultContent(resultContent);
	 
	 	return queryMpsSchedulerListResponse;
	}
}