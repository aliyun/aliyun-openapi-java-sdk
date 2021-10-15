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

import com.aliyuncs.linkedmall.model.v20180116.CreateSettleConfirmResponse;
import com.aliyuncs.linkedmall.model.v20180116.CreateSettleConfirmResponse.TradeSettleConfirmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSettleConfirmResponseUnmarshaller {

	public static CreateSettleConfirmResponse unmarshall(CreateSettleConfirmResponse createSettleConfirmResponse, UnmarshallerContext _ctx) {
		
		createSettleConfirmResponse.setRequestId(_ctx.stringValue("CreateSettleConfirmResponse.RequestId"));
		createSettleConfirmResponse.setCode(_ctx.stringValue("CreateSettleConfirmResponse.Code"));
		createSettleConfirmResponse.setMessage(_ctx.stringValue("CreateSettleConfirmResponse.Message"));

		TradeSettleConfirmResponse tradeSettleConfirmResponse = new TradeSettleConfirmResponse();
		tradeSettleConfirmResponse.setTradeNo(_ctx.stringValue("CreateSettleConfirmResponse.TradeSettleConfirmResponse.TradeNo"));
		tradeSettleConfirmResponse.setOutRequestNo(_ctx.stringValue("CreateSettleConfirmResponse.TradeSettleConfirmResponse.OutRequestNo"));
		createSettleConfirmResponse.setTradeSettleConfirmResponse(tradeSettleConfirmResponse);
	 
	 	return createSettleConfirmResponse;
	}
}