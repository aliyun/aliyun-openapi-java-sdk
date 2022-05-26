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
public class FindAllContacterRequest extends RpcAcsRequest<FindAllContacterResponse> {
	   

	private String localeString;

	private String type;

	private Long userId;
	public FindAllContacterRequest() {
		super("account-crm", "2016-06-06", "FindAllContacter");
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

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<FindAllContacterResponse> getResponseClass() {
		return FindAllContacterResponse.class;
	}

}
