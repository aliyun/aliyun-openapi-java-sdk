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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetRandomPasswordRequest extends RpcAcsRequest<GetRandomPasswordResponse> {
	   

	private String excludeLowercase;

	private String excludeCharacters;

	private String passwordLength;

	private String excludePunctuation;

	private String excludeUppercase;

	private String requireEachIncludedType;

	private String excludeNumbers;
	public GetRandomPasswordRequest() {
		super("Kms", "2016-01-20", "GetRandomPassword", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExcludeLowercase() {
		return this.excludeLowercase;
	}

	public void setExcludeLowercase(String excludeLowercase) {
		this.excludeLowercase = excludeLowercase;
		if(excludeLowercase != null){
			putQueryParameter("ExcludeLowercase", excludeLowercase);
		}
	}

	public String getExcludeCharacters() {
		return this.excludeCharacters;
	}

	public void setExcludeCharacters(String excludeCharacters) {
		this.excludeCharacters = excludeCharacters;
		if(excludeCharacters != null){
			putQueryParameter("ExcludeCharacters", excludeCharacters);
		}
	}

	public String getPasswordLength() {
		return this.passwordLength;
	}

	public void setPasswordLength(String passwordLength) {
		this.passwordLength = passwordLength;
		if(passwordLength != null){
			putQueryParameter("PasswordLength", passwordLength);
		}
	}

	public String getExcludePunctuation() {
		return this.excludePunctuation;
	}

	public void setExcludePunctuation(String excludePunctuation) {
		this.excludePunctuation = excludePunctuation;
		if(excludePunctuation != null){
			putQueryParameter("ExcludePunctuation", excludePunctuation);
		}
	}

	public String getExcludeUppercase() {
		return this.excludeUppercase;
	}

	public void setExcludeUppercase(String excludeUppercase) {
		this.excludeUppercase = excludeUppercase;
		if(excludeUppercase != null){
			putQueryParameter("ExcludeUppercase", excludeUppercase);
		}
	}

	public String getRequireEachIncludedType() {
		return this.requireEachIncludedType;
	}

	public void setRequireEachIncludedType(String requireEachIncludedType) {
		this.requireEachIncludedType = requireEachIncludedType;
		if(requireEachIncludedType != null){
			putQueryParameter("RequireEachIncludedType", requireEachIncludedType);
		}
	}

	public String getExcludeNumbers() {
		return this.excludeNumbers;
	}

	public void setExcludeNumbers(String excludeNumbers) {
		this.excludeNumbers = excludeNumbers;
		if(excludeNumbers != null){
			putQueryParameter("ExcludeNumbers", excludeNumbers);
		}
	}

	@Override
	public Class<GetRandomPasswordResponse> getResponseClass() {
		return GetRandomPasswordResponse.class;
	}

}
