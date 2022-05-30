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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.DescribeWebhookContactsResponse;
import com.aliyuncs.arms.model.v20190808.DescribeWebhookContactsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.DescribeWebhookContactsResponse.PageBean.WebhookContactsItem;
import com.aliyuncs.arms.model.v20190808.DescribeWebhookContactsResponse.PageBean.WebhookContactsItem.Webhook;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebhookContactsResponseUnmarshaller {

	public static DescribeWebhookContactsResponse unmarshall(DescribeWebhookContactsResponse describeWebhookContactsResponse, UnmarshallerContext _ctx) {
		
		describeWebhookContactsResponse.setRequestId(_ctx.stringValue("DescribeWebhookContactsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("DescribeWebhookContactsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("DescribeWebhookContactsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("DescribeWebhookContactsResponse.PageBean.Size"));

		List<WebhookContactsItem> webhookContacts = new ArrayList<WebhookContactsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts.Length"); i++) {
			WebhookContactsItem webhookContactsItem = new WebhookContactsItem();
			webhookContactsItem.setWebhookId(_ctx.floatValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].WebhookId"));
			webhookContactsItem.setWebhookName(_ctx.stringValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].WebhookName"));

			Webhook webhook = new Webhook();
			webhook.setBizMethod(_ctx.stringValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].Webhook.Method"));
			webhook.setUrl(_ctx.stringValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].Webhook.Url"));
			webhook.setBizHeaders(_ctx.mapValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].Webhook.BizHeaders"));
			webhook.setBizParams(_ctx.mapValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].Webhook.BizParams"));
			webhook.setBody(_ctx.stringValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].Webhook.Body"));
			webhook.setRecoverBody(_ctx.stringValue("DescribeWebhookContactsResponse.PageBean.WebhookContacts["+ i +"].Webhook.RecoverBody"));
			webhookContactsItem.setWebhook(webhook);

			webhookContacts.add(webhookContactsItem);
		}
		pageBean.setWebhookContacts(webhookContacts);
		describeWebhookContactsResponse.setPageBean(pageBean);
	 
	 	return describeWebhookContactsResponse;
	}
}