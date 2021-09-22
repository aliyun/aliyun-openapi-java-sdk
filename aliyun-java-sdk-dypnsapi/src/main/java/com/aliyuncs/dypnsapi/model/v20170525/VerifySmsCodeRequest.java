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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifySmsCodeRequest extends RpcAcsRequest<VerifySmsCodeResponse> {
	   

	private String smsToken;

	private String phoneNumber;

	private String smsCode;
	public VerifySmsCodeRequest() {
		super("Dypnsapi", "2017-05-25", "VerifySmsCode");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSmsToken() {
		return this.smsToken;
	}

	public void setSmsToken(String smsToken) {
		this.smsToken = smsToken;
		if(smsToken != null){
			putQueryParameter("SmsToken", smsToken);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getSmsCode() {
		return this.smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
		if(smsCode != null){
			putQueryParameter("SmsCode", smsCode);
		}
	}

	@Override
	public Class<VerifySmsCodeResponse> getResponseClass() {
		return VerifySmsCodeResponse.class;
	}

}
