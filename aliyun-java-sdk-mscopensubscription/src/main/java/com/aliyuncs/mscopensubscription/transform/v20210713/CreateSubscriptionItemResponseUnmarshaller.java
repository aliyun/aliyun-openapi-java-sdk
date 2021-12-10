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

package com.aliyuncs.mscopensubscription.transform.v20210713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mscopensubscription.model.v20210713.CreateSubscriptionItemResponse;
import com.aliyuncs.mscopensubscription.model.v20210713.CreateSubscriptionItemResponse.SubscriptionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubscriptionItemResponseUnmarshaller {

	public static CreateSubscriptionItemResponse unmarshall(CreateSubscriptionItemResponse createSubscriptionItemResponse, UnmarshallerContext _ctx) {
		
		createSubscriptionItemResponse.setRequestId(_ctx.stringValue("CreateSubscriptionItemResponse.RequestId"));
		createSubscriptionItemResponse.setSuccess(_ctx.booleanValue("CreateSubscriptionItemResponse.Success"));
		createSubscriptionItemResponse.setCode(_ctx.stringValue("CreateSubscriptionItemResponse.Code"));
		createSubscriptionItemResponse.setMessage(_ctx.stringValue("CreateSubscriptionItemResponse.Message"));

		SubscriptionItem subscriptionItem = new SubscriptionItem();
		subscriptionItem.setDescription(_ctx.stringValue("CreateSubscriptionItemResponse.SubscriptionItem.Description"));
		subscriptionItem.setSmsStatus(_ctx.integerValue("CreateSubscriptionItemResponse.SubscriptionItem.SmsStatus"));
		subscriptionItem.setChannel(_ctx.stringValue("CreateSubscriptionItemResponse.SubscriptionItem.Channel"));
		subscriptionItem.setEmailStatus(_ctx.integerValue("CreateSubscriptionItemResponse.SubscriptionItem.EmailStatus"));
		subscriptionItem.setItemId(_ctx.integerValue("CreateSubscriptionItemResponse.SubscriptionItem.ItemId"));
		subscriptionItem.setPmsgStatus(_ctx.integerValue("CreateSubscriptionItemResponse.SubscriptionItem.PmsgStatus"));
		subscriptionItem.setWebhookStatus(_ctx.integerValue("CreateSubscriptionItemResponse.SubscriptionItem.WebhookStatus"));
		subscriptionItem.setItemName(_ctx.stringValue("CreateSubscriptionItemResponse.SubscriptionItem.ItemName"));
		subscriptionItem.setTtsStatus(_ctx.integerValue("CreateSubscriptionItemResponse.SubscriptionItem.TtsStatus"));

		List<Long> contactIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateSubscriptionItemResponse.SubscriptionItem.ContactIds.Length"); i++) {
			contactIds.add(_ctx.longValue("CreateSubscriptionItemResponse.SubscriptionItem.ContactIds["+ i +"]"));
		}
		subscriptionItem.setContactIds(contactIds);

		List<Long> webhookIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateSubscriptionItemResponse.SubscriptionItem.WebhookIds.Length"); i++) {
			webhookIds.add(_ctx.longValue("CreateSubscriptionItemResponse.SubscriptionItem.WebhookIds["+ i +"]"));
		}
		subscriptionItem.setWebhookIds(webhookIds);
		createSubscriptionItemResponse.setSubscriptionItem(subscriptionItem);
	 
	 	return createSubscriptionItemResponse;
	}
}