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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryBillToOSSSubscriptionResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryBillToOSSSubscriptionResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryBillToOSSSubscriptionResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBillToOSSSubscriptionResponseUnmarshaller {

	public static QueryBillToOSSSubscriptionResponse unmarshall(QueryBillToOSSSubscriptionResponse queryBillToOSSSubscriptionResponse, UnmarshallerContext _ctx) {
		
		queryBillToOSSSubscriptionResponse.setRequestId(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.RequestId"));
		queryBillToOSSSubscriptionResponse.setSuccess(_ctx.booleanValue("QueryBillToOSSSubscriptionResponse.Success"));
		queryBillToOSSSubscriptionResponse.setCode(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Code"));
		queryBillToOSSSubscriptionResponse.setMessage(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Message"));

		Data data = new Data();
		data.setAccountID(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.AccountID"));
		data.setAccountName(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.AccountName"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryBillToOSSSubscriptionResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setSubscribeType(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.Items["+ i +"].SubscribeType"));
			item.setSubscribeBucket(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.Items["+ i +"].SubscribeBucket"));
			item.setBucketOwnerId(_ctx.longValue("QueryBillToOSSSubscriptionResponse.Data.Items["+ i +"].BucketOwnerId"));
			item.setSubscribeTime(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.Items["+ i +"].SubscribeTime"));
			item.setSubscribeLanguage(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.Items["+ i +"].SubscribeLanguage"));
			item.setMultAccountRelSubscribe(_ctx.stringValue("QueryBillToOSSSubscriptionResponse.Data.Items["+ i +"].MultAccountRelSubscribe"));

			items.add(item);
		}
		data.setItems(items);
		queryBillToOSSSubscriptionResponse.setData(data);
	 
	 	return queryBillToOSSSubscriptionResponse;
	}
}