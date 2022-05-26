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
public class CreateRealNameCertificationRequest extends RpcAcsRequest<CreateRealNameCertificationResponse> {
	   

	private String accountCertifyType;

	private String licenseNumber;

	private String licenseType;

	private String name;

	private String pk;

	private String corporateLicenseNumber;

	private String corporateName;
	public CreateRealNameCertificationRequest() {
		super("account-crm", "2016-06-06", "CreateRealNameCertification");
		setMethod(MethodType.POST);
	}

	public String getAccountCertifyType() {
		return this.accountCertifyType;
	}

	public void setAccountCertifyType(String accountCertifyType) {
		this.accountCertifyType = accountCertifyType;
		if(accountCertifyType != null){
			putQueryParameter("AccountCertifyType", accountCertifyType);
		}
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
		if(licenseNumber != null){
			putQueryParameter("LicenseNumber", licenseNumber);
		}
	}

	public String getLicenseType() {
		return this.licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
		if(licenseType != null){
			putQueryParameter("LicenseType", licenseType);
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

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk);
		}
	}

	public String getCorporateLicenseNumber() {
		return this.corporateLicenseNumber;
	}

	public void setCorporateLicenseNumber(String corporateLicenseNumber) {
		this.corporateLicenseNumber = corporateLicenseNumber;
		if(corporateLicenseNumber != null){
			putQueryParameter("CorporateLicenseNumber", corporateLicenseNumber);
		}
	}

	public String getCorporateName() {
		return this.corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
		if(corporateName != null){
			putQueryParameter("CorporateName", corporateName);
		}
	}

	@Override
	public Class<CreateRealNameCertificationResponse> getResponseClass() {
		return CreateRealNameCertificationResponse.class;
	}

}
