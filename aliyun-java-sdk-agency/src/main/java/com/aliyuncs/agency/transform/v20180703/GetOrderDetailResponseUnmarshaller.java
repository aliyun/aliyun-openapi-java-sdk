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

package com.aliyuncs.agency.transform.v20180703;

import com.aliyuncs.agency.model.v20180703.GetOrderDetailResponse;
import com.aliyuncs.agency.model.v20180703.GetOrderDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderDetailResponseUnmarshaller {

	public static GetOrderDetailResponse unmarshall(GetOrderDetailResponse getOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getOrderDetailResponse.setCode(_ctx.stringValue("GetOrderDetailResponse.Code"));
		getOrderDetailResponse.setMessage(_ctx.stringValue("GetOrderDetailResponse.Message"));
		getOrderDetailResponse.setSuccess(_ctx.booleanValue("GetOrderDetailResponse.Success"));

		Data data = new Data();
		data.setResourceFee(_ctx.stringValue("GetOrderDetailResponse.Data.ResourceFee"));
		data.setOrderStatus(_ctx.longValue("GetOrderDetailResponse.Data.OrderStatus"));
		data.setCycle(_ctx.stringValue("GetOrderDetailResponse.Data.Cycle"));
		data.setOrderTypeName(_ctx.stringValue("GetOrderDetailResponse.Data.OrderTypeName"));
		data.setChargeType(_ctx.longValue("GetOrderDetailResponse.Data.ChargeType"));
		data.setPayTime(_ctx.stringValue("GetOrderDetailResponse.Data.PayTime"));
		data.setPayAmount(_ctx.stringValue("GetOrderDetailResponse.Data.PayAmount"));
		data.setGmtCreate(_ctx.stringValue("GetOrderDetailResponse.Data.GmtCreate"));
		data.setTotalPayFee(_ctx.stringValue("GetOrderDetailResponse.Data.TotalPayFee"));
		data.setOrderId(_ctx.longValue("GetOrderDetailResponse.Data.OrderId"));
		getOrderDetailResponse.setData(data);
	 
	 	return getOrderDetailResponse;
	}
}