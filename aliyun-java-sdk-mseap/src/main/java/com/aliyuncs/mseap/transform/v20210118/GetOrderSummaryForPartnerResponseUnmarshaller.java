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

package com.aliyuncs.mseap.transform.v20210118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mseap.model.v20210118.GetOrderSummaryForPartnerResponse;
import com.aliyuncs.mseap.model.v20210118.GetOrderSummaryForPartnerResponse.Data;
import com.aliyuncs.mseap.model.v20210118.GetOrderSummaryForPartnerResponse.Data.OrderLine;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderSummaryForPartnerResponseUnmarshaller {

	public static GetOrderSummaryForPartnerResponse unmarshall(GetOrderSummaryForPartnerResponse getOrderSummaryForPartnerResponse, UnmarshallerContext _ctx) {
		
		getOrderSummaryForPartnerResponse.setRequestId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.RequestId"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.OrderId"));
		data.setEncryptedBuyerId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.EncryptedBuyerId"));
		data.setEncryptedPayerId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.EncryptedPayerId"));
		data.setEncryptedUserId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.EncryptedUserId"));

		List<OrderLine> orderLines = new ArrayList<OrderLine>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderSummaryForPartnerResponse.Data.OrderLines.Length"); i++) {
			OrderLine orderLine = new OrderLine();
			orderLine.setOrderType(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.OrderLines["+ i +"].OrderType"));
			orderLine.setInstanceId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.OrderLines["+ i +"].InstanceId"));
			orderLine.setOrderLineId(_ctx.stringValue("GetOrderSummaryForPartnerResponse.Data.OrderLines["+ i +"].OrderLineId"));

			orderLines.add(orderLine);
		}
		data.setOrderLines(orderLines);
		getOrderSummaryForPartnerResponse.setData(data);
	 
	 	return getOrderSummaryForPartnerResponse;
	}
}