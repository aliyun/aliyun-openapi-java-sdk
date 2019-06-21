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

	public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponse unmarshall(QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYouResponse, UnmarshallerContext context) {
		
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setRequestId(context.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.RequestId"));
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setCode(context.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.Code"));
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setMessage(context.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.Message"));

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < context.lengthValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setItemName(context.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].ItemName"));
			lmOrderListItem.setLmOrderId(context.longValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].LmOrderId"));
			lmOrderListItem.setSkuId(context.longValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].SkuId"));
			lmOrderListItem.setSkuName(context.stringValue("QueryOrderItemInfoByPaymentIdForAiZhanYouResponse.LmOrderList["+ i +"].SkuName"));

			lmOrderList.add(lmOrderListItem);
		}
		queryOrderItemInfoByPaymentIdForAiZhanYouResponse.setLmOrderList(lmOrderList);
	 
	 	return queryOrderItemInfoByPaymentIdForAiZhanYouResponse;
	}
}