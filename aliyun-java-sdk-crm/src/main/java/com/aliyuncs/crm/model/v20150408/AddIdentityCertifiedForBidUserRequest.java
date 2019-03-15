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

package com.aliyuncs.crm.model.v20150408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddIdentityCertifiedForBidUserRequest extends RpcAcsRequest<AddIdentityCertifiedForBidUserResponse> {
	
	public AddIdentityCertifiedForBidUserRequest() {
		super("Crm", "2015-04-08", "AddIdentityCertifiedForBidUser", "crm");
	}

	private String bidType;

	private String licenseNumber;

	private String licenseType;

	private String phone;

	private String name;

	private String pK;

	private Boolean isEnterprise;

	public String getBidType() {
		return this.bidType;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
		if(bidType != null){
			putQueryParameter("BidType", bidType);
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
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

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	public Boolean getIsEnterprise() {
		return this.isEnterprise;
	}

	public void setIsEnterprise(Boolean isEnterprise) {
		this.isEnterprise = isEnterprise;
		if(isEnterprise != null){
			putQueryParameter("IsEnterprise", isEnterprise.toString());
		}
	}

	@Override
	public Class<AddIdentityCertifiedForBidUserResponse> getResponseClass() {
		return AddIdentityCertifiedForBidUserResponse.class;
	}

}
