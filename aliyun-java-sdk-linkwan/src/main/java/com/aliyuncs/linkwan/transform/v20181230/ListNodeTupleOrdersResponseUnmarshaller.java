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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListNodeTupleOrdersResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodeTupleOrdersResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNodeTupleOrdersResponse.Data.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeTupleOrdersResponseUnmarshaller {

	public static ListNodeTupleOrdersResponse unmarshall(ListNodeTupleOrdersResponse listNodeTupleOrdersResponse, UnmarshallerContext context) {
		
		listNodeTupleOrdersResponse.setRequestId(context.stringValue("ListNodeTupleOrdersResponse.RequestId"));
		listNodeTupleOrdersResponse.setSuccess(context.booleanValue("ListNodeTupleOrdersResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNodeTupleOrdersResponse.Data.TotalCount"));

		List<Order> list = new ArrayList<Order>();
		for (int i = 0; i < context.lengthValue("ListNodeTupleOrdersResponse.Data.List.Length"); i++) {
			Order order = new Order();
			order.setOrderId(context.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].OrderId"));
			order.setIsKpm(context.booleanValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].IsKpm"));
			order.setOrderState(context.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].OrderState"));
			order.setRequiredCount(context.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].RequiredCount"));
			order.setCreatedMillis(context.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].CreatedMillis"));
			order.setAcceptedMillis(context.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].AcceptedMillis"));
			order.setLoraVersion(context.stringValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].LoraVersion"));
			order.setSuccessCount(context.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].SuccessCount"));
			order.setFailedCount(context.longValue("ListNodeTupleOrdersResponse.Data.List["+ i +"].FailedCount"));

			list.add(order);
		}
		data.setList(list);
		listNodeTupleOrdersResponse.setData(data);
	 
	 	return listNodeTupleOrdersResponse;
	}
}