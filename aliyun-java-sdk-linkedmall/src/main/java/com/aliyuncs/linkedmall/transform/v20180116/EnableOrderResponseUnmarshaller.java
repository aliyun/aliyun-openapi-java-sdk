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

import com.aliyuncs.linkedmall.model.v20180116.EnableOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.EnableOrderResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.EnableOrderResponse.Model.LmOrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableOrderResponseUnmarshaller {

	public static EnableOrderResponse unmarshall(EnableOrderResponse enableOrderResponse, UnmarshallerContext _ctx) {
		
		enableOrderResponse.setRequestId(_ctx.stringValue("EnableOrderResponse.RequestId"));
		enableOrderResponse.setCode(_ctx.stringValue("EnableOrderResponse.Code"));
		enableOrderResponse.setMessage(_ctx.stringValue("EnableOrderResponse.Message"));
		enableOrderResponse.setSubCode(_ctx.stringValue("EnableOrderResponse.SubCode"));
		enableOrderResponse.setSubMessage(_ctx.stringValue("EnableOrderResponse.SubMessage"));
		enableOrderResponse.setLogsId(_ctx.stringValue("EnableOrderResponse.LogsId"));
		enableOrderResponse.setSuccess(_ctx.booleanValue("EnableOrderResponse.Success"));
		enableOrderResponse.setTotalCount(_ctx.longValue("EnableOrderResponse.TotalCount"));

		Model model = new Model();
		model.setRedirectUrl(_ctx.stringValue("EnableOrderResponse.Model.RedirectUrl"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("EnableOrderResponse.Model.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("EnableOrderResponse.Model.OrderIds["+ i +"]"));
		}
		model.setOrderIds(orderIds);

		List<String> payTradeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("EnableOrderResponse.Model.PayTradeIds.Length"); i++) {
			payTradeIds.add(_ctx.stringValue("EnableOrderResponse.Model.PayTradeIds["+ i +"]"));
		}
		model.setPayTradeIds(payTradeIds);

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("EnableOrderResponse.Model.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setLmOrderId(_ctx.stringValue("EnableOrderResponse.Model.LmOrderList["+ i +"].LmOrderId"));

			lmOrderList.add(lmOrderListItem);
		}
		model.setLmOrderList(lmOrderList);
		enableOrderResponse.setModel(model);
	 
	 	return enableOrderResponse;
	}
}