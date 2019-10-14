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

import com.aliyuncs.linkwan.model.v20190301.ListGatewayTupleOrdersResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayTupleOrdersResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayTupleOrdersResponse.Data.GatewayTupleOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayTupleOrdersResponseUnmarshaller {

	public static ListGatewayTupleOrdersResponse unmarshall(ListGatewayTupleOrdersResponse listGatewayTupleOrdersResponse, UnmarshallerContext _ctx) {
		
		listGatewayTupleOrdersResponse.setRequestId(_ctx.stringValue("ListGatewayTupleOrdersResponse.RequestId"));
		listGatewayTupleOrdersResponse.setSuccess(_ctx.booleanValue("ListGatewayTupleOrdersResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListGatewayTupleOrdersResponse.Data.TotalCount"));

		List<GatewayTupleOrder> list = new ArrayList<GatewayTupleOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayTupleOrdersResponse.Data.List.Length"); i++) {
			GatewayTupleOrder gatewayTupleOrder = new GatewayTupleOrder();
			gatewayTupleOrder.setOrderId(_ctx.stringValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].OrderId"));
			gatewayTupleOrder.setOrderState(_ctx.stringValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].OrderState"));
			gatewayTupleOrder.setRequiredCount(_ctx.longValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].RequiredCount"));
			gatewayTupleOrder.setCreatedMillis(_ctx.longValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].CreatedMillis"));
			gatewayTupleOrder.setAcceptedMillis(_ctx.longValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].AcceptedMillis"));
			gatewayTupleOrder.setTupleType(_ctx.stringValue("ListGatewayTupleOrdersResponse.Data.List["+ i +"].TupleType"));

			list.add(gatewayTupleOrder);
		}
		data.setList(list);
		listGatewayTupleOrdersResponse.setData(data);
	 
	 	return listGatewayTupleOrdersResponse;
	}
}