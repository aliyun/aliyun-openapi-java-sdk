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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAgAccountRequest extends RpcAcsRequest<CreateAgAccountResponse> {
	
	public CreateAgAccountRequest() {
		super("BssOpenApi", "2017-12-14", "CreateAgAccount");
		setProtocol(ProtocolType.HTTPS);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String firstName;

	private String loginEmail;

	private String provinceName;

	private String cityName;

	private String accountAttr;

	private String postcode;

	private String enterpriseName;

	private String nationCode;

	private String lastName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		if(firstName != null){
			putQueryParameter("FirstName", firstName);
		}
	}

	public String getLoginEmail() {
		return this.loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
		if(loginEmail != null){
			putQueryParameter("LoginEmail", loginEmail);
		}
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
		if(provinceName != null){
			putQueryParameter("ProvinceName", provinceName);
		}
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
		if(cityName != null){
			putQueryParameter("CityName", cityName);
		}
	}

	public String getAccountAttr() {
		return this.accountAttr;
	}

	public void setAccountAttr(String accountAttr) {
		this.accountAttr = accountAttr;
		if(accountAttr != null){
			putQueryParameter("AccountAttr", accountAttr);
		}
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
		if(postcode != null){
			putQueryParameter("Postcode", postcode);
		}
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
		if(enterpriseName != null){
			putQueryParameter("EnterpriseName", enterpriseName);
		}
	}

	public String getNationCode() {
		return this.nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
		if(nationCode != null){
			putQueryParameter("NationCode", nationCode);
		}
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		if(lastName != null){
			putQueryParameter("LastName", lastName);
		}
	}

	@Override
	public Class<CreateAgAccountResponse> getResponseClass() {
		return CreateAgAccountResponse.class;
	}

}
