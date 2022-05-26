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
public class UpdateAccountAddressInfoRequest extends RpcAcsRequest<UpdateAccountAddressInfoResponse> {
	   

	private String cityJsonString;

	private String address;

	private String address2;

	private String postCode;

	private String pK;

	private String provinceJsonString;
	public UpdateAccountAddressInfoRequest() {
		super("account-crm", "2016-06-06", "UpdateAccountAddressInfo");
		setMethod(MethodType.POST);
	}

	public String getCityJsonString() {
		return this.cityJsonString;
	}

	public void setCityJsonString(String cityJsonString) {
		this.cityJsonString = cityJsonString;
		if(cityJsonString != null){
			putQueryParameter("CityJsonString", cityJsonString);
		}
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

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
		if(postCode != null){
			putQueryParameter("PostCode", postCode);
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

	public String getProvinceJsonString() {
		return this.provinceJsonString;
	}

	public void setProvinceJsonString(String provinceJsonString) {
		this.provinceJsonString = provinceJsonString;
		if(provinceJsonString != null){
			putQueryParameter("ProvinceJsonString", provinceJsonString);
		}
	}

	@Override
	public Class<UpdateAccountAddressInfoResponse> getResponseClass() {
		return UpdateAccountAddressInfoResponse.class;
	}

}
