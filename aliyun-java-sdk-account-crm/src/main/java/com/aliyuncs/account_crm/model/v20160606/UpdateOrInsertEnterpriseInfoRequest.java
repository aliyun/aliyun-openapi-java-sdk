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
public class UpdateOrInsertEnterpriseInfoRequest extends RpcAcsRequest<UpdateOrInsertEnterpriseInfoResponse> {
	   

	private String enterpriseSize;

	private String cityJsonString;

	private String address;

	private String phone;

	private String name;

	private String alias;

	private String pK;

	private String fax;

	private String years;

	private String provinceJsonString;
	public UpdateOrInsertEnterpriseInfoRequest() {
		super("account-crm", "2016-06-06", "UpdateOrInsertEnterpriseInfo");
		setMethod(MethodType.POST);
	}

	public String getEnterpriseSize() {
		return this.enterpriseSize;
	}

	public void setEnterpriseSize(String enterpriseSize) {
		this.enterpriseSize = enterpriseSize;
		if(enterpriseSize != null){
			putQueryParameter("EnterpriseSize", enterpriseSize);
		}
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

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putQueryParameter("Alias", alias);
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

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
		if(fax != null){
			putQueryParameter("Fax", fax);
		}
	}

	public String getYears() {
		return this.years;
	}

	public void setYears(String years) {
		this.years = years;
		if(years != null){
			putQueryParameter("Years", years);
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
	public Class<UpdateOrInsertEnterpriseInfoResponse> getResponseClass() {
		return UpdateOrInsertEnterpriseInfoResponse.class;
	}

}
