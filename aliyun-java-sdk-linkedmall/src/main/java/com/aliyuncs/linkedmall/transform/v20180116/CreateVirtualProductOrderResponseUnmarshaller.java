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

import com.aliyuncs.linkedmall.model.v20180116.CreateVirtualProductOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.CreateVirtualProductOrderResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.CreateVirtualProductOrderResponse.Model.LmOrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVirtualProductOrderResponseUnmarshaller {

	public static CreateVirtualProductOrderResponse unmarshall(CreateVirtualProductOrderResponse createVirtualProductOrderResponse, UnmarshallerContext _ctx) {
		
		createVirtualProductOrderResponse.setRequestId(_ctx.stringValue("CreateVirtualProductOrderResponse.RequestId"));
		createVirtualProductOrderResponse.setCode(_ctx.stringValue("CreateVirtualProductOrderResponse.Code"));
		createVirtualProductOrderResponse.setMessage(_ctx.stringValue("CreateVirtualProductOrderResponse.Message"));
		createVirtualProductOrderResponse.setSubCode(_ctx.stringValue("CreateVirtualProductOrderResponse.SubCode"));
		createVirtualProductOrderResponse.setSubMessage(_ctx.stringValue("CreateVirtualProductOrderResponse.SubMessage"));
		createVirtualProductOrderResponse.setLogsId(_ctx.stringValue("CreateVirtualProductOrderResponse.LogsId"));
		createVirtualProductOrderResponse.setSuccess(_ctx.booleanValue("CreateVirtualProductOrderResponse.Success"));
		createVirtualProductOrderResponse.setTotalCount(_ctx.longValue("CreateVirtualProductOrderResponse.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(_ctx.stringValue("CreateVirtualProductOrderResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateVirtualProductOrderResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("CreateVirtualProductOrderResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateVirtualProductOrderResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(_ctx.stringValue("CreateVirtualProductOrderResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateVirtualProductOrderResponse.Model.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setLmOrderId(_ctx.stringValue("CreateVirtualProductOrderResponse.Model.LmOrderList["+ i +"].LmOrderId"));

			lmOrderList.add(lmOrderListItem);
		}
		model.setLmOrderList(lmOrderList);
		createVirtualProductOrderResponse.setModel(model);
	 
	 	return createVirtualProductOrderResponse;
	}
}