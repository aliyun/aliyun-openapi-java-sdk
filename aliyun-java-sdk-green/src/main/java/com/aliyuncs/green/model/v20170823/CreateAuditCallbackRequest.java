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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAuditCallbackRequest extends RpcAcsRequest<CreateAuditCallbackResponse> {
	   

	private String callbackTypes;

	private String callbackSuggestions;

	private String url;

	private String cryptType;

	private String name;
	public CreateAuditCallbackRequest() {
		super("Green", "2017-08-23", "CreateAuditCallback", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallbackTypes() {
		return this.callbackTypes;
	}

	public void setCallbackTypes(String callbackTypes) {
		this.callbackTypes = callbackTypes;
		if(callbackTypes != null){
			putQueryParameter("CallbackTypes", callbackTypes);
		}
	}

	public String getCallbackSuggestions() {
		return this.callbackSuggestions;
	}

	public void setCallbackSuggestions(String callbackSuggestions) {
		this.callbackSuggestions = callbackSuggestions;
		if(callbackSuggestions != null){
			putQueryParameter("CallbackSuggestions", callbackSuggestions);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	public String getCryptType() {
		return this.cryptType;
	}

	public void setCryptType(String cryptType) {
		this.cryptType = cryptType;
		if(cryptType != null){
			putQueryParameter("CryptType", cryptType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateAuditCallbackResponse> getResponseClass() {
		return CreateAuditCallbackResponse.class;
	}

}
