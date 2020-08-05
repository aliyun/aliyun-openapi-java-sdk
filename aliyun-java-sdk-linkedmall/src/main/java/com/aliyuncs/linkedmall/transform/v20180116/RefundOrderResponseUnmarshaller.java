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

import com.aliyuncs.linkedmall.model.v20180116.RefundOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.RefundOrderResponse.RefundResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefundOrderResponseUnmarshaller {

	public static RefundOrderResponse unmarshall(RefundOrderResponse refundOrderResponse, UnmarshallerContext _ctx) {
		
		refundOrderResponse.setRequestId(_ctx.stringValue("RefundOrderResponse.RequestId"));
		refundOrderResponse.setCode(_ctx.stringValue("RefundOrderResponse.Code"));
		refundOrderResponse.setMessage(_ctx.stringValue("RefundOrderResponse.Message"));

		RefundResponse refundResponse = new RefundResponse();
		refundResponse.setOutRequestNo(_ctx.stringValue("RefundOrderResponse.RefundResponse.OutRequestNo"));
		refundResponse.setOutTradeNo(_ctx.stringValue("RefundOrderResponse.RefundResponse.OutTradeNo"));
		refundResponse.setTradeNo(_ctx.stringValue("RefundOrderResponse.RefundResponse.TradeNo"));
		refundResponse.setFundChange(_ctx.stringValue("RefundOrderResponse.RefundResponse.FundChange"));
		refundResponse.setGmtRefundPay(_ctx.stringValue("RefundOrderResponse.RefundResponse.GmtRefundPay"));
		refundOrderResponse.setRefundResponse(refundResponse);
	 
	 	return refundOrderResponse;
	}
}