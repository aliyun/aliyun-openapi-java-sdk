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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idaas_doraemon.model.v20210520.ListCostUnitOrdersResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListCostUnitOrdersResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCostUnitOrdersResponseUnmarshaller {

	public static ListCostUnitOrdersResponse unmarshall(ListCostUnitOrdersResponse listCostUnitOrdersResponse, UnmarshallerContext _ctx) {
		
		listCostUnitOrdersResponse.setRequestId(_ctx.stringValue("ListCostUnitOrdersResponse.RequestId"));
		listCostUnitOrdersResponse.setTotalPages(_ctx.longValue("ListCostUnitOrdersResponse.TotalPages"));
		listCostUnitOrdersResponse.setTotalElements(_ctx.longValue("ListCostUnitOrdersResponse.TotalElements"));
		listCostUnitOrdersResponse.setPageSize(_ctx.longValue("ListCostUnitOrdersResponse.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListCostUnitOrdersResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setAliOrderCode(_ctx.stringValue("ListCostUnitOrdersResponse.Items["+ i +"].AliOrderCode"));
			item.setAliOrderInstanceId(_ctx.stringValue("ListCostUnitOrdersResponse.Items["+ i +"].AliOrderInstanceId"));
			item.setTotalCostUnit(_ctx.longValue("ListCostUnitOrdersResponse.Items["+ i +"].TotalCostUnit"));
			item.setUsedCostUnit(_ctx.longValue("ListCostUnitOrdersResponse.Items["+ i +"].UsedCostUnit"));
			item.setOrderStatus(_ctx.stringValue("ListCostUnitOrdersResponse.Items["+ i +"].OrderStatus"));
			item.setCreateTime(_ctx.longValue("ListCostUnitOrdersResponse.Items["+ i +"].CreateTime"));
			item.setExpiredTime(_ctx.longValue("ListCostUnitOrdersResponse.Items["+ i +"].ExpiredTime"));
			item.setRefundTime(_ctx.longValue("ListCostUnitOrdersResponse.Items["+ i +"].RefundTime"));

			items.add(item);
		}
		listCostUnitOrdersResponse.setItems(items);
	 
	 	return listCostUnitOrdersResponse;
	}
}