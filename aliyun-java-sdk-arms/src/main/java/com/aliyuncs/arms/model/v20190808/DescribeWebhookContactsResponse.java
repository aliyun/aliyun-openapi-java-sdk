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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeWebhookContactsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebhookContactsResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Long total;

		private Long page;

		private Long size;

		private List<WebhookContactsItem> webhookContacts;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public List<WebhookContactsItem> getWebhookContacts() {
			return this.webhookContacts;
		}

		public void setWebhookContacts(List<WebhookContactsItem> webhookContacts) {
			this.webhookContacts = webhookContacts;
		}

		public static class WebhookContactsItem {

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

				private Map<Object,Object> bizHeaders;

				private Map<Object,Object> bizParams;

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

				public Map<Object,Object> getBizHeaders() {
					return this.bizHeaders;
				}

				public void setBizHeaders(Map<Object,Object> bizHeaders) {
					this.bizHeaders = bizHeaders;
				}

				public Map<Object,Object> getBizParams() {
					return this.bizParams;
				}

				public void setBizParams(Map<Object,Object> bizParams) {
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
	}

	@Override
	public DescribeWebhookContactsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebhookContactsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
