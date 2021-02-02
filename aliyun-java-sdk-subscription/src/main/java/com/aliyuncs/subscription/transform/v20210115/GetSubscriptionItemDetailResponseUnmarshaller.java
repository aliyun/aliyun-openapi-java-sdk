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

import com.aliyuncs.subscription.model.v20210115.GetSubscriptionItemDetailResponse;
import com.aliyuncs.subscription.model.v20210115.GetSubscriptionItemDetailResponse.SubscriptionItemDetail;
import com.aliyuncs.subscription.model.v20210115.GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contact;
import com.aliyuncs.subscription.model.v20210115.GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubscriptionItemDetailResponseUnmarshaller {

	public static GetSubscriptionItemDetailResponse unmarshall(GetSubscriptionItemDetailResponse getSubscriptionItemDetailResponse, UnmarshallerContext _ctx) {
		
		getSubscriptionItemDetailResponse.setRequestId(_ctx.stringValue("GetSubscriptionItemDetailResponse.RequestId"));
		getSubscriptionItemDetailResponse.setMessage(_ctx.stringValue("GetSubscriptionItemDetailResponse.Message"));
		getSubscriptionItemDetailResponse.setCode(_ctx.stringValue("GetSubscriptionItemDetailResponse.Code"));
		getSubscriptionItemDetailResponse.setSuccess(_ctx.booleanValue("GetSubscriptionItemDetailResponse.Success"));

		SubscriptionItemDetail subscriptionItemDetail = new SubscriptionItemDetail();
		subscriptionItemDetail.setPmsgStatus(_ctx.integerValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.PmsgStatus"));
		subscriptionItemDetail.setWebhookStatus(_ctx.integerValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.WebhookStatus"));
		subscriptionItemDetail.setDescription(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Description"));
		subscriptionItemDetail.setSmsStatus(_ctx.integerValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.SmsStatus"));
		subscriptionItemDetail.setChannel(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Channel"));
		subscriptionItemDetail.setEmailStatus(_ctx.integerValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.EmailStatus"));
		subscriptionItemDetail.setTtsStatus(_ctx.integerValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.TtsStatus"));
		subscriptionItemDetail.setItemName(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.ItemName"));
		subscriptionItemDetail.setRegionId(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.RegionId"));
		subscriptionItemDetail.setItemId(_ctx.integerValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.ItemId"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setEmail(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].Email"));
			contact.setIsAccount(_ctx.booleanValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].IsAccount"));
			contact.setPosition(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].Position"));
			contact.setIsVerifiedEmail(_ctx.booleanValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].IsVerifiedEmail"));
			contact.setLastMobileVerificationTimeStamp(_ctx.longValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].LastMobileVerificationTimeStamp"));
			contact.setIsObsolete(_ctx.booleanValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].IsObsolete"));
			contact.setIsVerifiedMobile(_ctx.booleanValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].IsVerifiedMobile"));
			contact.setContactId(_ctx.longValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].ContactId"));
			contact.setAccountUID(_ctx.longValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].AccountUID"));
			contact.setMobile(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].Mobile"));
			contact.setLastEmailVerificationTimeStamp(_ctx.longValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].LastEmailVerificationTimeStamp"));
			contact.setName(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Contacts["+ i +"].Name"));

			contacts.add(contact);
		}
		subscriptionItemDetail.setContacts(contacts);

		List<Webhook> webhooks = new ArrayList<Webhook>();
		for (int i = 0; i < _ctx.lengthValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Webhooks.Length"); i++) {
			Webhook webhook = new Webhook();
			webhook.setServerUrl(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Webhooks["+ i +"].ServerUrl"));
			webhook.setWebhookId(_ctx.longValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Webhooks["+ i +"].WebhookId"));
			webhook.setName(_ctx.stringValue("GetSubscriptionItemDetailResponse.SubscriptionItemDetail.Webhooks["+ i +"].Name"));

			webhooks.add(webhook);
		}
		subscriptionItemDetail.setWebhooks(webhooks);
		getSubscriptionItemDetailResponse.setSubscriptionItemDetail(subscriptionItemDetail);
	 
	 	return getSubscriptionItemDetailResponse;
	}
}