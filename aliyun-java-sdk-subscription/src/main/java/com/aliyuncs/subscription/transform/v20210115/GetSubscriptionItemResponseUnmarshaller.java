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

import com.aliyuncs.subscription.model.v20210115.GetSubscriptionItemResponse;
import com.aliyuncs.subscription.model.v20210115.GetSubscriptionItemResponse.SubscriptionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubscriptionItemResponseUnmarshaller {

	public static GetSubscriptionItemResponse unmarshall(GetSubscriptionItemResponse getSubscriptionItemResponse, UnmarshallerContext _ctx) {
		
		getSubscriptionItemResponse.setRequestId(_ctx.stringValue("GetSubscriptionItemResponse.RequestId"));
		getSubscriptionItemResponse.setMessage(_ctx.stringValue("GetSubscriptionItemResponse.Message"));
		getSubscriptionItemResponse.setCode(_ctx.stringValue("GetSubscriptionItemResponse.Code"));
		getSubscriptionItemResponse.setSuccess(_ctx.booleanValue("GetSubscriptionItemResponse.Success"));

		SubscriptionItem subscriptionItem = new SubscriptionItem();
		subscriptionItem.setPmsgStatus(_ctx.integerValue("GetSubscriptionItemResponse.SubscriptionItem.PmsgStatus"));
		subscriptionItem.setWebhookStatus(_ctx.integerValue("GetSubscriptionItemResponse.SubscriptionItem.WebhookStatus"));
		subscriptionItem.setDescription(_ctx.stringValue("GetSubscriptionItemResponse.SubscriptionItem.Description"));
		subscriptionItem.setSmsStatus(_ctx.integerValue("GetSubscriptionItemResponse.SubscriptionItem.SmsStatus"));
		subscriptionItem.setChannel(_ctx.stringValue("GetSubscriptionItemResponse.SubscriptionItem.Channel"));
		subscriptionItem.setEmailStatus(_ctx.integerValue("GetSubscriptionItemResponse.SubscriptionItem.EmailStatus"));
		subscriptionItem.setTtsStatus(_ctx.integerValue("GetSubscriptionItemResponse.SubscriptionItem.TtsStatus"));
		subscriptionItem.setItemName(_ctx.stringValue("GetSubscriptionItemResponse.SubscriptionItem.ItemName"));
		subscriptionItem.setItemId(_ctx.integerValue("GetSubscriptionItemResponse.SubscriptionItem.ItemId"));

		List<Long> webhookIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetSubscriptionItemResponse.SubscriptionItem.WebhookIds.Length"); i++) {
			webhookIds.add(_ctx.longValue("GetSubscriptionItemResponse.SubscriptionItem.WebhookIds["+ i +"]"));
		}
		subscriptionItem.setWebhookIds(webhookIds);

		List<Long> contactIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetSubscriptionItemResponse.SubscriptionItem.ContactIds.Length"); i++) {
			contactIds.add(_ctx.longValue("GetSubscriptionItemResponse.SubscriptionItem.ContactIds["+ i +"]"));
		}
		subscriptionItem.setContactIds(contactIds);
		getSubscriptionItemResponse.setSubscriptionItem(subscriptionItem);
	 
	 	return getSubscriptionItemResponse;
	}
}