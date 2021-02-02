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

package com.aliyuncs.subscription.transform.v20210115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemsResponse;
import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemsResponse.SubscriptionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscriptionItemsResponseUnmarshaller {

	public static ListSubscriptionItemsResponse unmarshall(ListSubscriptionItemsResponse listSubscriptionItemsResponse, UnmarshallerContext _ctx) {
		
		listSubscriptionItemsResponse.setRequestId(_ctx.stringValue("ListSubscriptionItemsResponse.RequestId"));
		listSubscriptionItemsResponse.setTotalCount(_ctx.integerValue("ListSubscriptionItemsResponse.TotalCount"));
		listSubscriptionItemsResponse.setMessage(_ctx.stringValue("ListSubscriptionItemsResponse.Message"));
		listSubscriptionItemsResponse.setNextToken(_ctx.integerValue("ListSubscriptionItemsResponse.NextToken"));
		listSubscriptionItemsResponse.setCode(_ctx.stringValue("ListSubscriptionItemsResponse.Code"));
		listSubscriptionItemsResponse.setSuccess(_ctx.booleanValue("ListSubscriptionItemsResponse.Success"));

		List<SubscriptionItem> subscriptionItems = new ArrayList<SubscriptionItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscriptionItemsResponse.SubscriptionItems.Length"); i++) {
			SubscriptionItem subscriptionItem = new SubscriptionItem();
			subscriptionItem.setPmsgStatus(_ctx.integerValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].PmsgStatus"));
			subscriptionItem.setWebhookStatus(_ctx.integerValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].WebhookStatus"));
			subscriptionItem.setDescription(_ctx.stringValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].Description"));
			subscriptionItem.setSmsStatus(_ctx.integerValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].SmsStatus"));
			subscriptionItem.setChannel(_ctx.stringValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].Channel"));
			subscriptionItem.setEmailStatus(_ctx.integerValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].EmailStatus"));
			subscriptionItem.setTtsStatus(_ctx.integerValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].TtsStatus"));
			subscriptionItem.setItemName(_ctx.stringValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].ItemName"));
			subscriptionItem.setItemId(_ctx.integerValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].ItemId"));

			List<Long> webhookIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].WebhookIds.Length"); j++) {
				webhookIds.add(_ctx.longValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].WebhookIds["+ j +"]"));
			}
			subscriptionItem.setWebhookIds(webhookIds);

			List<Long> contactIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].ContactIds.Length"); j++) {
				contactIds.add(_ctx.longValue("ListSubscriptionItemsResponse.SubscriptionItems["+ i +"].ContactIds["+ j +"]"));
			}
			subscriptionItem.setContactIds(contactIds);

			subscriptionItems.add(subscriptionItem);
		}
		listSubscriptionItemsResponse.setSubscriptionItems(subscriptionItems);
	 
	 	return listSubscriptionItemsResponse;
	}
}