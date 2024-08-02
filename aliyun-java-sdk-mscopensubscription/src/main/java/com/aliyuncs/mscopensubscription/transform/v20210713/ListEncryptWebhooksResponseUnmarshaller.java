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

import com.aliyuncs.mscopensubscription.model.v20210713.ListEncryptWebhooksResponse;
import com.aliyuncs.mscopensubscription.model.v20210713.ListEncryptWebhooksResponse.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEncryptWebhooksResponseUnmarshaller {

	public static ListEncryptWebhooksResponse unmarshall(ListEncryptWebhooksResponse listEncryptWebhooksResponse, UnmarshallerContext _ctx) {
		
		listEncryptWebhooksResponse.setRequestId(_ctx.stringValue("ListEncryptWebhooksResponse.RequestId"));
		listEncryptWebhooksResponse.setSuccess(_ctx.stringValue("ListEncryptWebhooksResponse.Success"));
		listEncryptWebhooksResponse.setCode(_ctx.stringValue("ListEncryptWebhooksResponse.Code"));

		List<Webhook> data = new ArrayList<Webhook>();
		for (int i = 0; i < _ctx.lengthValue("ListEncryptWebhooksResponse.Data.Length"); i++) {
			Webhook webhook = new Webhook();
			webhook.setWebhookId(_ctx.longValue("ListEncryptWebhooksResponse.Data["+ i +"].WebhookId"));
			webhook.setServerUrl(_ctx.stringValue("ListEncryptWebhooksResponse.Data["+ i +"].ServerUrl"));
			webhook.setWebhookName(_ctx.stringValue("ListEncryptWebhooksResponse.Data["+ i +"].WebhookName"));
			webhook.setEncryptSecurityToken(_ctx.stringValue("ListEncryptWebhooksResponse.Data["+ i +"].EncryptSecurityToken"));

			data.add(webhook);
		}
		listEncryptWebhooksResponse.setData(data);
	 
	 	return listEncryptWebhooksResponse;
	}
}