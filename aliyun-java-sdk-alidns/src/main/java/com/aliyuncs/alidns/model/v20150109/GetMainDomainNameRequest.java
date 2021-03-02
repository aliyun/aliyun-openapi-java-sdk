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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetMainDomainNameRequest extends RpcAcsRequest<GetMainDomainNameResponse> {
	   

	private String inputString;

	private String lang;
	public GetMainDomainNameRequest() {
		super("Alidns", "2015-01-09", "GetMainDomainName", "alidns");
		setMethod(MethodType.POST);
	}

	public String getInputString() {
		return this.inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
		if(inputString != null){
			putQueryParameter("InputString", inputString);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<GetMainDomainNameResponse> getResponseClass() {
		return GetMainDomainNameResponse.class;
	}

}
