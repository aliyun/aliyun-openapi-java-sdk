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

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderIdByPayIdResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderIdByPayIdResponse.LmOrderIdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderIdByPayIdResponseUnmarshaller {

	public static QueryOrderIdByPayIdResponse unmarshall(QueryOrderIdByPayIdResponse queryOrderIdByPayIdResponse, UnmarshallerContext _ctx) {
		
		queryOrderIdByPayIdResponse.setRequestId(_ctx.stringValue("QueryOrderIdByPayIdResponse.RequestId"));
		queryOrderIdByPayIdResponse.setCode(_ctx.stringValue("QueryOrderIdByPayIdResponse.Code"));
		queryOrderIdByPayIdResponse.setMessage(_ctx.stringValue("QueryOrderIdByPayIdResponse.Message"));

		List<LmOrderIdsItem> lmOrderIds = new ArrayList<LmOrderIdsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderIdByPayIdResponse.LmOrderIds.Length"); i++) {
			LmOrderIdsItem lmOrderIdsItem = new LmOrderIdsItem();
			lmOrderIdsItem.setLmOrderId(_ctx.longValue("QueryOrderIdByPayIdResponse.LmOrderIds["+ i +"].LmOrderId"));

			lmOrderIds.add(lmOrderIdsItem);
		}
		queryOrderIdByPayIdResponse.setLmOrderIds(lmOrderIds);
	 
	 	return queryOrderIdByPayIdResponse;
	}
}