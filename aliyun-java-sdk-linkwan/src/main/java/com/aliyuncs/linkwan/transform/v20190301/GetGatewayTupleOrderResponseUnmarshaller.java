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

import com.aliyuncs.linkwan.model.v20190301.GetGatewayTupleOrderResponse;
import com.aliyuncs.linkwan.model.v20190301.GetGatewayTupleOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayTupleOrderResponseUnmarshaller {

	public static GetGatewayTupleOrderResponse unmarshall(GetGatewayTupleOrderResponse getGatewayTupleOrderResponse, UnmarshallerContext _ctx) {
		
		getGatewayTupleOrderResponse.setRequestId(_ctx.stringValue("GetGatewayTupleOrderResponse.RequestId"));
		getGatewayTupleOrderResponse.setSuccess(_ctx.booleanValue("GetGatewayTupleOrderResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("GetGatewayTupleOrderResponse.Data.OrderId"));
		data.setOrderState(_ctx.stringValue("GetGatewayTupleOrderResponse.Data.OrderState"));
		data.setRequiredCount(_ctx.longValue("GetGatewayTupleOrderResponse.Data.RequiredCount"));
		data.setCreatedMillis(_ctx.longValue("GetGatewayTupleOrderResponse.Data.CreatedMillis"));
		data.setAcceptedMillis(_ctx.longValue("GetGatewayTupleOrderResponse.Data.AcceptedMillis"));
		getGatewayTupleOrderResponse.setData(data);
	 
	 	return getGatewayTupleOrderResponse;
	}
}