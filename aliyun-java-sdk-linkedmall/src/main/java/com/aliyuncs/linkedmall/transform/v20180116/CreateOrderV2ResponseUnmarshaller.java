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

import com.aliyuncs.linkedmall.model.v20180116.CreateOrderV2Response;
import com.aliyuncs.linkedmall.model.v20180116.CreateOrderV2Response.Model;
import com.aliyuncs.linkedmall.model.v20180116.CreateOrderV2Response.Model.LmOrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderV2ResponseUnmarshaller {

	public static CreateOrderV2Response unmarshall(CreateOrderV2Response createOrderV2Response, UnmarshallerContext _ctx) {
		
		createOrderV2Response.setRequestId(_ctx.stringValue("CreateOrderV2Response.RequestId"));
		createOrderV2Response.setCode(_ctx.stringValue("CreateOrderV2Response.Code"));
		createOrderV2Response.setMessage(_ctx.stringValue("CreateOrderV2Response.Message"));
		createOrderV2Response.setSubCode(_ctx.stringValue("CreateOrderV2Response.SubCode"));
		createOrderV2Response.setSubMessage(_ctx.stringValue("CreateOrderV2Response.SubMessage"));
		createOrderV2Response.setLogsId(_ctx.stringValue("CreateOrderV2Response.LogsId"));
		createOrderV2Response.setSuccess(_ctx.booleanValue("CreateOrderV2Response.Success"));
		createOrderV2Response.setTotalCount(_ctx.longValue("CreateOrderV2Response.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(_ctx.stringValue("CreateOrderV2Response.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderV2Response.Model.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("CreateOrderV2Response.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderV2Response.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(_ctx.stringValue("CreateOrderV2Response.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderV2Response.Model.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setLmOrderId(_ctx.stringValue("CreateOrderV2Response.Model.LmOrderList["+ i +"].LmOrderId"));

			lmOrderList.add(lmOrderListItem);
		}
		model.setLmOrderList(lmOrderList);
		createOrderV2Response.setModel(model);
	 
	 	return createOrderV2Response;
	}
}