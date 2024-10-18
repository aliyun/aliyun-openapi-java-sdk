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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryIntlFixedPriceOrderListResponse;
import com.aliyuncs.domain.model.v20180129.QueryIntlFixedPriceOrderListResponse.Module;
import com.aliyuncs.domain.model.v20180129.QueryIntlFixedPriceOrderListResponse.Module.OrderList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIntlFixedPriceOrderListResponseUnmarshaller {

	public static QueryIntlFixedPriceOrderListResponse unmarshall(QueryIntlFixedPriceOrderListResponse queryIntlFixedPriceOrderListResponse, UnmarshallerContext _ctx) {
		
		queryIntlFixedPriceOrderListResponse.setRequestId(_ctx.stringValue("QueryIntlFixedPriceOrderListResponse.RequestId"));

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("QueryIntlFixedPriceOrderListResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("QueryIntlFixedPriceOrderListResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("QueryIntlFixedPriceOrderListResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("QueryIntlFixedPriceOrderListResponse.Module.TotalPageNum"));

		List<OrderList> data = new ArrayList<OrderList>();
		for (int i = 0; i < _ctx.lengthValue("QueryIntlFixedPriceOrderListResponse.Module.Data.Length"); i++) {
			OrderList orderList = new OrderList();
			orderList.setOrderType(_ctx.integerValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].OrderType"));
			orderList.setBizId(_ctx.stringValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].BizId"));
			orderList.setUserId(_ctx.stringValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].UserId"));
			orderList.setStatus(_ctx.integerValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].Status"));
			orderList.setPrice(_ctx.longValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].Price"));
			orderList.setDomain(_ctx.stringValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].Domain"));
			orderList.setCreateTime(_ctx.longValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].CreateTime"));
			orderList.setUpdateTime(_ctx.longValue("QueryIntlFixedPriceOrderListResponse.Module.Data["+ i +"].UpdateTime"));

			data.add(orderList);
		}
		module.setData(data);
		queryIntlFixedPriceOrderListResponse.setModule(module);
	 
	 	return queryIntlFixedPriceOrderListResponse;
	}
}