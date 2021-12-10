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

package com.aliyuncs.mscopensubscription.model.v20210713;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateSubscriptionItemRequest extends RpcAcsRequest<CreateSubscriptionItemResponse> {
	   

	private String itemName;

	private String locale;
	public CreateSubscriptionItemRequest() {
		super("MscOpenSubscription", "2021-07-13", "CreateSubscriptionItem");
		setMethod(MethodType.POST);
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
		if(itemName != null){
			putBodyParameter("ItemName", itemName);
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

	@Override
	public Class<CreateSubscriptionItemResponse> getResponseClass() {
		return CreateSubscriptionItemResponse.class;
	}

}
