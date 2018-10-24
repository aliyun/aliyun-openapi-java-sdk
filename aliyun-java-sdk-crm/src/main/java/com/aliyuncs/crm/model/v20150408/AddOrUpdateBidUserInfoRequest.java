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
public class AddOrUpdateBidUserInfoRequest extends RpcAcsRequest<AddOrUpdateBidUserInfoResponse> {
	
	public AddOrUpdateBidUserInfoRequest() {
		super("Crm", "2015-04-08", "AddOrUpdateBidUserInfo");
	}

	private String trueName;

	private String phone;

	private String certType;

	private String certNumber;

	private String pK;

	private String email;

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
		if(trueName != null){
			putQueryParameter("trueName", trueName);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("phone", phone);
		}
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
		if(certType != null){
			putQueryParameter("certType", certType);
		}
	}

	public String getCertNumber() {
		return this.certNumber;
	}

	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
		if(certNumber != null){
			putQueryParameter("certNumber", certNumber);
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("email", email);
		}
	}

	@Override
	public Class<AddOrUpdateBidUserInfoResponse> getResponseClass() {
		return AddOrUpdateBidUserInfoResponse.class;
	}

}
