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
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderResponseUnmarshaller {

	public static CreateOrderResponse unmarshall(CreateOrderResponse createOrderResponse, UnmarshallerContext context) {
		
		createOrderResponse.setRequestId(context.stringValue("CreateOrderResponse.RequestId"));
		createOrderResponse.setCode(context.stringValue("CreateOrderResponse.Code"));
		createOrderResponse.setMessage(context.stringValue("CreateOrderResponse.Message"));
		createOrderResponse.setSubCode(context.stringValue("CreateOrderResponse.SubCode"));
		createOrderResponse.setSubMessage(context.stringValue("CreateOrderResponse.SubMessage"));
		createOrderResponse.setLogsId(context.stringValue("CreateOrderResponse.LogsId"));
		createOrderResponse.setSuccess(context.booleanValue("CreateOrderResponse.Success"));
		createOrderResponse.setTotalCount(context.longValue("CreateOrderResponse.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(context.stringValue("CreateOrderResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateOrderResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(context.stringValue("CreateOrderResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateOrderResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(context.stringValue("CreateOrderResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);

		List<String> lmOrderList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateOrderResponse.Model.LmOrderList.Length"); i++) {
			lmOrderList.add(context.stringValue("CreateOrderResponse.Model.LmOrderList["+ i +"]"));
		}
		model.setLmOrderList(lmOrderList);
		createOrderResponse.setModel(model);
	 
	 	return createOrderResponse;
	}
}