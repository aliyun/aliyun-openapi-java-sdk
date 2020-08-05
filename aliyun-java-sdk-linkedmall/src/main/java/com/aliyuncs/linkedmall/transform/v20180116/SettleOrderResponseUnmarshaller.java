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

import com.aliyuncs.linkedmall.model.v20180116.SettleOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.SettleOrderResponse.TradeOrderSettleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SettleOrderResponseUnmarshaller {

	public static SettleOrderResponse unmarshall(SettleOrderResponse settleOrderResponse, UnmarshallerContext _ctx) {
		
		settleOrderResponse.setRequestId(_ctx.stringValue("SettleOrderResponse.RequestId"));
		settleOrderResponse.setCode(_ctx.stringValue("SettleOrderResponse.Code"));
		settleOrderResponse.setMessage(_ctx.stringValue("SettleOrderResponse.Message"));

		TradeOrderSettleResponse tradeOrderSettleResponse = new TradeOrderSettleResponse();
		tradeOrderSettleResponse.setOutRequestNo(_ctx.stringValue("SettleOrderResponse.TradeOrderSettleResponse.OutRequestNo"));
		tradeOrderSettleResponse.setTradeNo(_ctx.stringValue("SettleOrderResponse.TradeOrderSettleResponse.TradeNo"));
		settleOrderResponse.setTradeOrderSettleResponse(tradeOrderSettleResponse);
	 
	 	return settleOrderResponse;
	}
}