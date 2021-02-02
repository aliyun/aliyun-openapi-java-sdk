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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSubscriptionItemDetailRequest extends RpcAcsRequest<GetSubscriptionItemDetailResponse> {
	   

	private String locale;

	private Integer itemId;
	public GetSubscriptionItemDetailRequest() {
		super("Subscription", "2021-01-15", "GetSubscriptionItemDetail");
		setMethod(MethodType.GET);
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

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId.toString());
		}
	}

	@Override
	public Class<GetSubscriptionItemDetailResponse> getResponseClass() {
		return GetSubscriptionItemDetailResponse.class;
	}

}
