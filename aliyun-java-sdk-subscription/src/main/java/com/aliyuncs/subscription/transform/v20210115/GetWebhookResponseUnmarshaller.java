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

import com.aliyuncs.subscription.model.v20210115.GetWebhookResponse;
import com.aliyuncs.subscription.model.v20210115.GetWebhookResponse.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWebhookResponseUnmarshaller {

	public static GetWebhookResponse unmarshall(GetWebhookResponse getWebhookResponse, UnmarshallerContext _ctx) {
		
		getWebhookResponse.setRequestId(_ctx.stringValue("GetWebhookResponse.RequestId"));
		getWebhookResponse.setMessage(_ctx.stringValue("GetWebhookResponse.Message"));
		getWebhookResponse.setCode(_ctx.stringValue("GetWebhookResponse.Code"));
		getWebhookResponse.setSuccess(_ctx.booleanValue("GetWebhookResponse.Success"));

		Webhook webhook = new Webhook();
		webhook.setServerUrl(_ctx.stringValue("GetWebhookResponse.Webhook.ServerUrl"));
		webhook.setWebhookId(_ctx.longValue("GetWebhookResponse.Webhook.WebhookId"));
		webhook.setName(_ctx.stringValue("GetWebhookResponse.Webhook.Name"));
		getWebhookResponse.setWebhook(webhook);
	 
	 	return getWebhookResponse;
	}
}