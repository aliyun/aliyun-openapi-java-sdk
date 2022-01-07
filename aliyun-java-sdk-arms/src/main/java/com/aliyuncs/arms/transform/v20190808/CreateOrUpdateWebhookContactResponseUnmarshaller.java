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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateWebhookContactResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateWebhookContactResponse.WebhookContact;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateWebhookContactResponseUnmarshaller {

	public static CreateOrUpdateWebhookContactResponse unmarshall(CreateOrUpdateWebhookContactResponse createOrUpdateWebhookContactResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateWebhookContactResponse.setRequestId(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.RequestId"));

		WebhookContact webhookContact = new WebhookContact();
		webhookContact.setWebhookId(_ctx.floatValue("CreateOrUpdateWebhookContactResponse.WebhookContact.WebhookId"));
		webhookContact.setWebhookName(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.WebhookName"));

		Webhook webhook = new Webhook();
		webhook.setBizMethod(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook.Method"));
		webhook.setUrl(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook.Url"));
		webhook.setBizHeaders(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook.BizHeaders"));
		webhook.setBizParams(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook.BizParams"));
		webhook.setBody(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook.Body"));
		webhook.setRecoverBody(_ctx.stringValue("CreateOrUpdateWebhookContactResponse.WebhookContact.Webhook.RecoverBody"));
		webhookContact.setWebhook(webhook);
		createOrUpdateWebhookContactResponse.setWebhookContact(webhookContact);
	 
	 	return createOrUpdateWebhookContactResponse;
	}
}