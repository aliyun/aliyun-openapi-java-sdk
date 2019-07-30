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

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderItemInfoByPaymentIdForAiZhanYouResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseUnmarshaller {

	public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponse unmarshall(QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYouResponse, UnmarshallerContext _ctx) {
		
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setRequestId(_ctx.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.RequestId"));
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setCode(_ctx.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.Code"));
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setMessage(_ctx.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.Message"));

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setItemName(_ctx.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].ItemName"));
			lmOrderListItem.setLmOrderId(_ctx.longValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].LmOrderId"));
			lmOrderListItem.setSkuId(_ctx.longValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].SkuId"));
			lmOrderListItem.setSkuName(_ctx.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].SkuName"));
			lmOrderListItem.setItemId(_ctx.longValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].ItemId"));

			lmOrderList.add(lmOrderListItem);
		}
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setLmOrderList(lmOrderList);
	 
	 	return queryOrderItemInfoByPaymentIdForAiZhanYouResponse;
	}
}