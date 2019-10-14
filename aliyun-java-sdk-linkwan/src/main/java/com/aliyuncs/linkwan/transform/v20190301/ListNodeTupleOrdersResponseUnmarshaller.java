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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListNodeTupleOrdersResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodeTupleOrdersResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodeTupleOrdersResponse.Data.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeTupleOrdersResponseUnmarshaller {

	public static ListNodeTupleOrdersResponse unmarshall(ListNodeTupleOrdersResponse listNodeTupleOrdersResponse, UnmarshallerContext _ctx) {
		
		listNodeTupleOrdersResponse.setRequestId(_ctx.stringValue("ListNodeTupleOrdersResponse.RequestId"));
		listNodeTupleOrdersResponse.setSuccess(_ctx.booleanValue("ListNodeTupleOrdersResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodeTupleOrdersResponse.Data.TotalCount"));

		List<Order> list = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeTupleOrdersResponse.Data.List.Length"); i++) {
			Order order = new Order();
			order.setOrderId(_ctx.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].OrderId"));
			order.setIsKpm(_ctx.booleanValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].IsKpm"));
			order.setOrderState(_ctx.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].OrderState"));
			order.setRequiredCount(_ctx.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].RequiredCount"));
			order.setCreatedMillis(_ctx.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].CreatedMillis"));
			order.setAcceptedMillis(_ctx.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].AcceptedMillis"));
			order.setLoraVersion(_ctx.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].LoraVersion"));
			order.setSuccessCount(_ctx.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].SuccessCount"));
			order.setFailedCount(_ctx.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].FailedCount"));
			order.setTupleType(_ctx.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].TupleType"));

			list.add(order);
		}
		data.setList(list);
		listNodeTupleOrdersResponse.setData(data);
	 
	 	return listNodeTupleOrdersResponse;
	}
}