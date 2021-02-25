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

package com.aliyuncs.subscription.model.v20210115;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateSubscriptionItemRequest extends RpcAcsRequest<UpdateSubscriptionItemResponse> {
	   

	private String clientToken;

	private String locale;

	@SerializedName("contactIds")
	private List<Long> contactIds;

	private Integer itemId;

	private Integer smsStatus;

	private Integer pmsgStatus;

	private Integer webhookStatus;

	private Integer ttsStatus;

	@SerializedName("webhookIds")
	private List<Long> webhookIds;

	private Integer emailStatus;
	public UpdateSubscriptionItemRequest() {
		super("Subscription", "2021-01-15", "UpdateSubscriptionItem");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
		if(locale != null){
			putQueryParameter("Locale", locale);
		}
	}

	public List<Long> getContactIds() {
		return this.contactIds;
	}

	public void setContactIds(List<Long> contactIds) {
		this.contactIds = contactIds;	
		if (contactIds != null) {
			putBodyParameter("ContactIds" , new Gson().toJson(contactIds));
		}	
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putBodyParameter("ItemId", itemId.toString());
		}
	}

	public Integer getSmsStatus() {
		return this.smsStatus;
	}

	public void setSmsStatus(Integer smsStatus) {
		this.smsStatus = smsStatus;
		if(smsStatus != null){
			putBodyParameter("SmsStatus", smsStatus.toString());
		}
	}

	public Integer getPmsgStatus() {
		return this.pmsgStatus;
	}

	public void setPmsgStatus(Integer pmsgStatus) {
		this.pmsgStatus = pmsgStatus;
		if(pmsgStatus != null){
			putBodyParameter("PmsgStatus", pmsgStatus.toString());
		}
	}

	public Integer getWebhookStatus() {
		return this.webhookStatus;
	}

	public void setWebhookStatus(Integer webhookStatus) {
		this.webhookStatus = webhookStatus;
		if(webhookStatus != null){
			putBodyParameter("WebhookStatus", webhookStatus.toString());
		}
	}

	public Integer getTtsStatus() {
		return this.ttsStatus;
	}

	public void setTtsStatus(Integer ttsStatus) {
		this.ttsStatus = ttsStatus;
		if(ttsStatus != null){
			putBodyParameter("TtsStatus", ttsStatus.toString());
		}
	}

	public List<Long> getWebhookIds() {
		return this.webhookIds;
	}

	public void setWebhookIds(List<Long> webhookIds) {
		this.webhookIds = webhookIds;	
		if (webhookIds != null) {
			putBodyParameter("WebhookIds" , new Gson().toJson(webhookIds));
		}	
	}

	public Integer getEmailStatus() {
		return this.emailStatus;
	}

	public void setEmailStatus(Integer emailStatus) {
		this.emailStatus = emailStatus;
		if(emailStatus != null){
			putBodyParameter("EmailStatus", emailStatus.toString());
		}
	}

	@Override
	public Class<UpdateSubscriptionItemResponse> getResponseClass() {
		return UpdateSubscriptionItemResponse.class;
	}

}
