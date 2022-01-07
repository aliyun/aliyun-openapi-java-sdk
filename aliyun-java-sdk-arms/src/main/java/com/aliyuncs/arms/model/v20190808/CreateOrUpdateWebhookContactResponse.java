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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateWebhookContactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateWebhookContactResponse extends AcsResponse {

	private String requestId;

	private WebhookContact webhookContact;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public WebhookContact getWebhookContact() {
		return this.webhookContact;
	}

	public void setWebhookContact(WebhookContact webhookContact) {
		this.webhookContact = webhookContact;
	}

	public static class WebhookContact {

		private Float webhookId;

		private String webhookName;

		private Webhook webhook;

		public Float getWebhookId() {
			return this.webhookId;
		}

		public void setWebhookId(Float webhookId) {
			this.webhookId = webhookId;
		}

		public String getWebhookName() {
			return this.webhookName;
		}

		public void setWebhookName(String webhookName) {
			this.webhookName = webhookName;
		}

		public Webhook getWebhook() {
			return this.webhook;
		}

		public void setWebhook(Webhook webhook) {
			this.webhook = webhook;
		}

		public static class Webhook {

			private String method;

			private String url;

			private String bizHeaders;

			private String bizParams;

			private String body;

			private String recoverBody;

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getBizHeaders() {
				return this.bizHeaders;
			}

			public void setBizHeaders(String bizHeaders) {
				this.bizHeaders = bizHeaders;
			}

			public String getBizParams() {
				return this.bizParams;
			}

			public void setBizParams(String bizParams) {
				this.bizParams = bizParams;
			}

			public String getBody() {
				return this.body;
			}

			public void setBody(String body) {
				this.body = body;
			}

			public String getRecoverBody() {
				return this.recoverBody;
			}

			public void setRecoverBody(String recoverBody) {
				this.recoverBody = recoverBody;
			}
		}
	}

	@Override
	public CreateOrUpdateWebhookContactResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateWebhookContactResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
