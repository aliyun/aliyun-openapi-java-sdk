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
public class UpdateAgAccountAddressInfoRequest extends RpcAcsRequest<UpdateAgAccountAddressInfoResponse> {
	   

	private String address;

	private String address2;

	private String city;

	private String postCode;

	private String mpk;

	private String province;

	private String appName;

	private String pK;
	public UpdateAgAccountAddressInfoRequest() {
		super("account-crm", "2016-06-06", "UpdateAgAccountAddressInfo");
		setMethod(MethodType.POST);
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
		if(address2 != null){
			putQueryParameter("Address2", address2);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
		if(postCode != null){
			putQueryParameter("PostCode", postCode);
		}
	}

	public String getMpk() {
		return this.mpk;
	}

	public void setMpk(String mpk) {
		this.mpk = mpk;
		if(mpk != null){
			putQueryParameter("Mpk", mpk);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
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

	@Override
	public Class<UpdateAgAccountAddressInfoResponse> getResponseClass() {
		return UpdateAgAccountAddressInfoResponse.class;
	}

}
