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

import com.aliyuncs.linkedmall.model.v20180116.CreateWithholdTradeResponse;
import com.aliyuncs.linkedmall.model.v20180116.CreateWithholdTradeResponse.WithholdTradeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWithholdTradeResponseUnmarshaller {

	public static CreateWithholdTradeResponse unmarshall(CreateWithholdTradeResponse createWithholdTradeResponse, UnmarshallerContext _ctx) {
		
		createWithholdTradeResponse.setRequestId(_ctx.stringValue("CreateWithholdTradeResponse.RequestId"));
		createWithholdTradeResponse.setCode(_ctx.stringValue("CreateWithholdTradeResponse.Code"));
		createWithholdTradeResponse.setMessage(_ctx.stringValue("CreateWithholdTradeResponse.Message"));

		WithholdTradeResponse withholdTradeResponse = new WithholdTradeResponse();
		withholdTradeResponse.setOutRequestNo(_ctx.stringValue("CreateWithholdTradeResponse.WithholdTradeResponse.OutRequestNo"));
		withholdTradeResponse.setOutTradeNo(_ctx.stringValue("CreateWithholdTradeResponse.WithholdTradeResponse.OutTradeNo"));
		withholdTradeResponse.setTradeNo(_ctx.stringValue("CreateWithholdTradeResponse.WithholdTradeResponse.TradeNo"));
		withholdTradeResponse.setPaymentDate(_ctx.stringValue("CreateWithholdTradeResponse.WithholdTradeResponse.PaymentDate"));
		createWithholdTradeResponse.setWithholdTradeResponse(withholdTradeResponse);
	 
	 	return createWithholdTradeResponse;
	}
}