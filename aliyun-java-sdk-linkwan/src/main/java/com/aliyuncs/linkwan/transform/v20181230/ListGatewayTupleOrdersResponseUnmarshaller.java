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

import com.aliyuncs.linkwan.model.v20181230.ListGatewayTupleOrdersResponse;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayTupleOrdersResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayTupleOrdersResponse.Data.GatewayTupleOrder;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayTupleOrdersResponseUnmarshaller {

	public static ListGatewayTupleOrdersResponse unmarshall(ListGatewayTupleOrdersResponse listGatewayTupleOrdersResponse, UnmarshallerContext context) {
		
		listGatewayTupleOrdersResponse.setRequestId(context.stringValue("ListGatewayTupleOrdersResponse.RequestId"));
		listGatewayTupleOrdersResponse.setSuccess(context.booleanValue("ListGatewayTupleOrdersResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListGatewayTupleOrdersResponse.Data.TotalCount"));

		List<GatewayTupleOrder> list = new ArrayList<GatewayTupleOrder>();
		for (int i = 0; i < context.lengthValue("ListGatewayTupleOrdersResponse.Data.List.Length"); i++) {
			GatewayTupleOrder gatewayTupleOrder = new GatewayTupleOrder();
			gatewayTupleOrder.setOrderId(context.stringValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].OrderId"));
			gatewayTupleOrder.setOrderState(context.stringValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].OrderState"));
			gatewayTupleOrder.setRequiredCount(context.longValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].RequiredCount"));
			gatewayTupleOrder.setCreatedMillis(context.longValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].CreatedMillis"));
			gatewayTupleOrder.setAcceptedMillis(context.longValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].AcceptedMillis"));

			list.add(gatewayTupleOrder);
		}
		data.setList(list);
		listGatewayTupleOrdersResponse.setData(data);
	 
	 	return listGatewayTupleOrdersResponse;
	}
}