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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangePreferredLanguageRequest extends RpcAcsRequest<ChangePreferredLanguageResponse> {
	   

	private String preferredLanguage;
	public ChangePreferredLanguageRequest() {
		super("Aas", "2015-07-01", "ChangePreferredLanguage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPreferredLanguage() {
		return this.preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
		if(preferredLanguage != null){
			putQueryParameter("PreferredLanguage", preferredLanguage);
		}
	}

	@Override
	public Class<ChangePreferredLanguageResponse> getResponseClass() {
		return ChangePreferredLanguageResponse.class;
	}

}
