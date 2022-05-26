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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class FindContacterRequest extends RpcAcsRequest<FindContacterResponse> {
	   

	private String localeString;

	private String type;

	private Long contacterId;
	public FindContacterRequest() {
		super("account-crm", "2016-06-06", "FindContacter");
		setMethod(MethodType.POST);
	}

	public String getLocaleString() {
		return this.localeString;
	}

	public void setLocaleString(String localeString) {
		this.localeString = localeString;
		if(localeString != null){
			putQueryParameter("LocaleString", localeString);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Long getContacterId() {
		return this.contacterId;
	}

	public void setContacterId(Long contacterId) {
		this.contacterId = contacterId;
		if(contacterId != null){
			putQueryParameter("ContacterId", contacterId.toString());
		}
	}

	@Override
	public Class<FindContacterResponse> getResponseClass() {
		return FindContacterResponse.class;
	}

}
