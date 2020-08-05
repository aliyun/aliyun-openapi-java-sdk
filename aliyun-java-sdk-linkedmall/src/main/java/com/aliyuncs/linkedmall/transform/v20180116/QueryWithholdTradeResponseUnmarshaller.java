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

import com.aliyuncs.linkedmall.model.v20180116.QueryWithholdTradeResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryWithholdTradeResponse.WithholdTradeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWithholdTradeResponseUnmarshaller {

	public static QueryWithholdTradeResponse unmarshall(QueryWithholdTradeResponse queryWithholdTradeResponse, UnmarshallerContext _ctx) {
		
		queryWithholdTradeResponse.setRequestId(_ctx.stringValue("QueryWithholdTradeResponse.RequestId"));
		queryWithholdTradeResponse.setCode(_ctx.stringValue("QueryWithholdTradeResponse.Code"));
		queryWithholdTradeResponse.setMessage(_ctx.stringValue("QueryWithholdTradeResponse.Message"));

		WithholdTradeResponse withholdTradeResponse = new WithholdTradeResponse();
		withholdTradeResponse.setTradeStatus(_ctx.stringValue("QueryWithholdTradeResponse.WithholdTradeResponse.TradeStatus"));
		withholdTradeResponse.setSettleStatus(_ctx.stringValue("QueryWithholdTradeResponse.WithholdTradeResponse.SettleStatus"));
		withholdTradeResponse.setOutTradeNo(_ctx.stringValue("QueryWithholdTradeResponse.WithholdTradeResponse.OutTradeNo"));
		withholdTradeResponse.setTotalAmount(_ctx.stringValue("QueryWithholdTradeResponse.WithholdTradeResponse.TotalAmount"));
		withholdTradeResponse.setTradeNo(_ctx.stringValue("QueryWithholdTradeResponse.WithholdTradeResponse.TradeNo"));
		queryWithholdTradeResponse.setWithholdTradeResponse(withholdTradeResponse);
	 
	 	return queryWithholdTradeResponse;
	}
}