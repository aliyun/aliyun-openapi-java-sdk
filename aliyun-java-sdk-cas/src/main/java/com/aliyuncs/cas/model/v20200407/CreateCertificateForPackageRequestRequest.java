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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCertificateForPackageRequestRequest extends RpcAcsRequest<CreateCertificateForPackageRequestResponse> {
	   

	private String productCode;

	private String csr;

	private String validateType;

	private String email;

	private String phone;

	private String companyName;

	private String domain;

	private String username;
	public CreateCertificateForPackageRequestRequest() {
		super("cas", "2020-04-07", "CreateCertificateForPackageRequest", "cas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getCsr() {
		return this.csr;
	}

	public void setCsr(String csr) {
		this.csr = csr;
		if(csr != null){
			putQueryParameter("Csr", csr);
		}
	}

	public String getValidateType() {
		return this.validateType;
	}

	public void setValidateType(String validateType) {
		this.validateType = validateType;
		if(validateType != null){
			putQueryParameter("ValidateType", validateType);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putQueryParameter("CompanyName", companyName);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<CreateCertificateForPackageRequestResponse> getResponseClass() {
		return CreateCertificateForPackageRequestResponse.class;
	}

}
