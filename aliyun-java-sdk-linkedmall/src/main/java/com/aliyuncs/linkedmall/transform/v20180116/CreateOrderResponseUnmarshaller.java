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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.CreateOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.CreateOrderResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.CreateOrderResponse.Model.LmOrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderResponseUnmarshaller {

	public static CreateOrderResponse unmarshall(CreateOrderResponse createOrderResponse, UnmarshallerContext _ctx) {
		
		createOrderResponse.setRequestId(_ctx.stringValue("CreateOrderResponse.RequestId"));
		createOrderResponse.setCode(_ctx.stringValue("CreateOrderResponse.Code"));
		createOrderResponse.setMessage(_ctx.stringValue("CreateOrderResponse.Message"));
		createOrderResponse.setSubCode(_ctx.stringValue("CreateOrderResponse.SubCode"));
		createOrderResponse.setSubMessage(_ctx.stringValue("CreateOrderResponse.SubMessage"));
		createOrderResponse.setLogsId(_ctx.stringValue("CreateOrderResponse.LogsId"));
		createOrderResponse.setSuccess(_ctx.booleanValue("CreateOrderResponse.Success"));
		createOrderResponse.setTotalCount(_ctx.longValue("CreateOrderResponse.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(_ctx.stringValue("CreateOrderResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("CreateOrderResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(_ctx.stringValue("CreateOrderResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderResponse.Model.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setLmOrderId(_ctx.stringValue("CreateOrderResponse.Model.LmOrderList["+ i +"].LmOrderId"));

			lmOrderList.add(lmOrderListItem);
		}
		model.setLmOrderList(lmOrderList);
		createOrderResponse.setModel(model);
	 
	 	return createOrderResponse;
	}
}