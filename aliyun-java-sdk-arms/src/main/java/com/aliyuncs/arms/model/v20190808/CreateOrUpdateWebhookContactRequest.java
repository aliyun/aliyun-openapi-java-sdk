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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateWebhookContactRequest extends RpcAcsRequest<CreateOrUpdateWebhookContactResponse> {
	   

	private Long webhookId;

	private String method;

	private String webhookName;

	private String bizParams;

	private String body;

	private String url;

	private String bizHeaders;

	private String recoverBody;
	public CreateOrUpdateWebhookContactRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateWebhookContact", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getWebhookId() {
		return this.webhookId;
	}

	public void setWebhookId(Long webhookId) {
		this.webhookId = webhookId;
		if(webhookId != null){
			putBodyParameter("WebhookId", webhookId.toString());
		}
	}

	public String getBizMethod() {
		return this.method;
	}

	public void setBizMethod(String method) {
		this.method = method;
		if(method != null){
			putBodyParameter("Method", method);
		}
	}

	public String getWebhookName() {
		return this.webhookName;
	}

	public void setWebhookName(String webhookName) {
		this.webhookName = webhookName;
		if(webhookName != null){
			putBodyParameter("WebhookName", webhookName);
		}
	}

	public String getBizParams() {
		return this.bizParams;
	}

	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
		if(bizParams != null){
			putBodyParameter("BizParams", bizParams);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("Body", body);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public String getBizHeaders() {
		return this.bizHeaders;
	}

	public void setBizHeaders(String bizHeaders) {
		this.bizHeaders = bizHeaders;
		if(bizHeaders != null){
			putBodyParameter("BizHeaders", bizHeaders);
		}
	}

	public String getRecoverBody() {
		return this.recoverBody;
	}

	public void setRecoverBody(String recoverBody) {
		this.recoverBody = recoverBody;
		if(recoverBody != null){
			putBodyParameter("RecoverBody", recoverBody);
		}
	}

	@Override
	public Class<CreateOrUpdateWebhookContactResponse> getResponseClass() {
		return CreateOrUpdateWebhookContactResponse.class;
	}

}
