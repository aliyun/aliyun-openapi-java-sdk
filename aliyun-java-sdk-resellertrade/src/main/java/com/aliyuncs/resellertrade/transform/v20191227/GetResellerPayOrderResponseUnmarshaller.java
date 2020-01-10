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

package com.aliyuncs.resellertrade.transform.v20191227;

import com.aliyuncs.resellertrade.model.v20191227.GetResellerPayOrderResponse;
import com.aliyuncs.resellertrade.model.v20191227.GetResellerPayOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResellerPayOrderResponseUnmarshaller {

	public static GetResellerPayOrderResponse unmarshall(GetResellerPayOrderResponse getResellerPayOrderResponse, UnmarshallerContext _ctx) {
		
		getResellerPayOrderResponse.setRequestId(_ctx.stringValue("GetResellerPayOrderResponse.RequestId"));
		getResellerPayOrderResponse.setSuccess(_ctx.booleanValue("GetResellerPayOrderResponse.Success"));
		getResellerPayOrderResponse.setCode(_ctx.stringValue("GetResellerPayOrderResponse.Code"));
		getResellerPayOrderResponse.setMessage(_ctx.stringValue("GetResellerPayOrderResponse.Message"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("GetResellerPayOrderResponse.Data.OrderId"));
		data.setOrderStatus(_ctx.stringValue("GetResellerPayOrderResponse.Data.OrderStatus"));
		data.setBuyerId(_ctx.stringValue("GetResellerPayOrderResponse.Data.BuyerId"));
		data.setPayAmount(_ctx.stringValue("GetResellerPayOrderResponse.Data.PayAmount"));
		getResellerPayOrderResponse.setData(data);
	 
	 	return getResellerPayOrderResponse;
	}
}