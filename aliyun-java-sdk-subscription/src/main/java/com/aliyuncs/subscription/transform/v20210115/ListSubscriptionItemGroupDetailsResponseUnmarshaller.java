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

import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemGroupDetailsResponse;
import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetail;
import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetail.SubscriptionItemDetail;
import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetail.SubscriptionItemDetail.Contact;
import com.aliyuncs.subscription.model.v20210115.ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetail.SubscriptionItemDetail.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscriptionItemGroupDetailsResponseUnmarshaller {

	public static ListSubscriptionItemGroupDetailsResponse unmarshall(ListSubscriptionItemGroupDetailsResponse listSubscriptionItemGroupDetailsResponse, UnmarshallerContext _ctx) {
		
		listSubscriptionItemGroupDetailsResponse.setRequestId(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.RequestId"));
		listSubscriptionItemGroupDetailsResponse.setMessage(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.Message"));
		listSubscriptionItemGroupDetailsResponse.setCode(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.Code"));
		listSubscriptionItemGroupDetailsResponse.setSuccess(_ctx.booleanValue("ListSubscriptionItemGroupDetailsResponse.Success"));

		List<SubscriptionItemGroupDetail> subscriptionItemGroupDetails = new ArrayList<SubscriptionItemGroupDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails.Length"); i++) {
			SubscriptionItemGroupDetail subscriptionItemGroupDetail = new SubscriptionItemGroupDetail();
			subscriptionItemGroupDetail.setItemGroupName(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemGroupName"));
			subscriptionItemGroupDetail.setDescription(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].Description"));
			subscriptionItemGroupDetail.setItemGroupId(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemGroupId"));

			List<SubscriptionItemDetail> itemDetails = new ArrayList<SubscriptionItemDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails.Length"); j++) {
				SubscriptionItemDetail subscriptionItemDetail = new SubscriptionItemDetail();
				subscriptionItemDetail.setPmsgStatus(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].PmsgStatus"));
				subscriptionItemDetail.setWebhookStatus(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].WebhookStatus"));
				subscriptionItemDetail.setDescription(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Description"));
				subscriptionItemDetail.setSmsStatus(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].SmsStatus"));
				subscriptionItemDetail.setChannel(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Channel"));
				subscriptionItemDetail.setEmailStatus(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].EmailStatus"));
				subscriptionItemDetail.setTtsStatus(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].TtsStatus"));
				subscriptionItemDetail.setItemName(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].ItemName"));
				subscriptionItemDetail.setRegionId(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].RegionId"));
				subscriptionItemDetail.setItemId(_ctx.integerValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].ItemId"));

				List<Contact> contacts = new ArrayList<Contact>();
				for (int k = 0; k < _ctx.lengthValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts.Length"); k++) {
					Contact contact = new Contact();
					contact.setEmail(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].Email"));
					contact.setIsAccount(_ctx.booleanValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].IsAccount"));
					contact.setPosition(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].Position"));
					contact.setIsVerifiedEmail(_ctx.booleanValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].IsVerifiedEmail"));
					contact.setLastMobileVerificationTimeStamp(_ctx.longValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].LastMobileVerificationTimeStamp"));
					contact.setIsObsolete(_ctx.booleanValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].IsObsolete"));
					contact.setIsVerifiedMobile(_ctx.booleanValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].IsVerifiedMobile"));
					contact.setContactId(_ctx.longValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].ContactId"));
					contact.setAccountUID(_ctx.longValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].AccountUID"));
					contact.setMobile(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].Mobile"));
					contact.setLastEmailVerificationTimeStamp(_ctx.longValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].LastEmailVerificationTimeStamp"));
					contact.setName(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Contacts["+ k +"].Name"));

					contacts.add(contact);
				}
				subscriptionItemDetail.setContacts(contacts);

				List<Webhook> webhooks = new ArrayList<Webhook>();
				for (int k = 0; k < _ctx.lengthValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Webhooks.Length"); k++) {
					Webhook webhook = new Webhook();
					webhook.setServerUrl(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Webhooks["+ k +"].ServerUrl"));
					webhook.setWebhookId(_ctx.longValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Webhooks["+ k +"].WebhookId"));
					webhook.setName(_ctx.stringValue("ListSubscriptionItemGroupDetailsResponse.SubscriptionItemGroupDetails["+ i +"].ItemDetails["+ j +"].Webhooks["+ k +"].Name"));

					webhooks.add(webhook);
				}
				subscriptionItemDetail.setWebhooks(webhooks);

				itemDetails.add(subscriptionItemDetail);
			}
			subscriptionItemGroupDetail.setItemDetails(itemDetails);

			subscriptionItemGroupDetails.add(subscriptionItemGroupDetail);
		}
		listSubscriptionItemGroupDetailsResponse.setSubscriptionItemGroupDetails(subscriptionItemGroupDetails);
	 
	 	return listSubscriptionItemGroupDetailsResponse;
	}
}