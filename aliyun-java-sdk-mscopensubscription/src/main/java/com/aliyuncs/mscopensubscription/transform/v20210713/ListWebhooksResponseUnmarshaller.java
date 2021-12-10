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

import com.aliyuncs.mscopensubscription.model.v20210713.ListWebhooksResponse;
import com.aliyuncs.mscopensubscription.model.v20210713.ListWebhooksResponse.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWebhooksResponseUnmarshaller {

	public static ListWebhooksResponse unmarshall(ListWebhooksResponse listWebhooksResponse, UnmarshallerContext _ctx) {
		
		listWebhooksResponse.setRequestId(_ctx.stringValue("ListWebhooksResponse.RequestId"));
		listWebhooksResponse.setTotalCount(_ctx.integerValue("ListWebhooksResponse.TotalCount"));
		listWebhooksResponse.setNextToken(_ctx.integerValue("ListWebhooksResponse.NextToken"));
		listWebhooksResponse.setSuccess(_ctx.booleanValue("ListWebhooksResponse.Success"));
		listWebhooksResponse.setCode(_ctx.stringValue("ListWebhooksResponse.Code"));
		listWebhooksResponse.setMessage(_ctx.stringValue("ListWebhooksResponse.Message"));

		List<Webhook> webhooks = new ArrayList<Webhook>();
		for (int i = 0; i < _ctx.lengthValue("ListWebhooksResponse.Webhooks.Length"); i++) {
			Webhook webhook = new Webhook();
			webhook.setWebhookName(_ctx.stringValue("ListWebhooksResponse.Webhooks["+ i +"].WebhookName"));
			webhook.setWebhookId(_ctx.longValue("ListWebhooksResponse.Webhooks["+ i +"].WebhookId"));
			webhook.setServerUrl(_ctx.stringValue("ListWebhooksResponse.Webhooks["+ i +"].ServerUrl"));

			webhooks.add(webhook);
		}
		listWebhooksResponse.setWebhooks(webhooks);
	 
	 	return listWebhooksResponse;
	}
}