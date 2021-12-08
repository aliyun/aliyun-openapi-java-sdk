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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryAppTasksResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryAppTasksResponse.Data;
import com.aliyuncs.unimkt.model.v20181212.QueryAppTasksResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppTasksResponseUnmarshaller {

	public static QueryAppTasksResponse unmarshall(QueryAppTasksResponse queryAppTasksResponse, UnmarshallerContext _ctx) {
		
		queryAppTasksResponse.setRequestId(_ctx.stringValue("QueryAppTasksResponse.RequestId"));
		queryAppTasksResponse.setCode(_ctx.integerValue("QueryAppTasksResponse.Code"));
		queryAppTasksResponse.setSuccess(_ctx.booleanValue("QueryAppTasksResponse.Success"));

		Data data = new Data();
		data.setCount(_ctx.integerValue("QueryAppTasksResponse.Data.Count"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAppTasksResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStatus(_ctx.integerValue("QueryAppTasksResponse.Data.List["+ i +"].Status"));
			listItem.setTimeSchema(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].TimeSchema"));
			listItem.setQuota(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].Quota"));
			listItem.setContentIds(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].ContentIds"));
			listItem.setChargeCost(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].ChargeCost"));
			listItem.setProxyUserId(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].ProxyUserId"));
			listItem.setOpenScene(_ctx.integerValue("QueryAppTasksResponse.Data.List["+ i +"].OpenScene"));
			listItem.setPriority(_ctx.integerValue("QueryAppTasksResponse.Data.List["+ i +"].Priority"));
			listItem.setAccountNo(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].AccountNo"));
			listItem.setAllContentStatus(_ctx.integerValue("QueryAppTasksResponse.Data.List["+ i +"].AllContentStatus"));
			listItem.setQuotaDay(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].QuotaDay"));
			listItem.setEndTime(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].EndTime"));
			listItem.setStartTime(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].StartTime"));
			listItem.setBrandUserId(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].BrandUserId"));
			listItem.setPriceType(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].PriceType"));
			listItem.setName(_ctx.stringValue("QueryAppTasksResponse.Data.List["+ i +"].Name"));
			listItem.setBalanceDay(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].BalanceDay"));
			listItem.setPopularizePosition(_ctx.integerValue("QueryAppTasksResponse.Data.List["+ i +"].PopularizePosition"));
			listItem.setId(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].Id"));
			listItem.setBalance(_ctx.longValue("QueryAppTasksResponse.Data.List["+ i +"].Balance"));

			list.add(listItem);
		}
		data.setList(list);
		queryAppTasksResponse.setData(data);
	 
	 	return queryAppTasksResponse;
	}
}