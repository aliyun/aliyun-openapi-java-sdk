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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckCompanyRegRequest extends RpcAcsRequest<CheckCompanyRegResponse> {
	   

	private String orgType;

	private String industryType;

	private String tradeName;

	private String city;

	private Integer nameType;
	public CheckCompanyRegRequest() {
		super("companyreg", "2019-05-08", "CheckCompanyReg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
		if(orgType != null){
			putQueryParameter("OrgType", orgType);
		}
	}

	public String getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
		if(industryType != null){
			putQueryParameter("IndustryType", industryType);
		}
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
		if(tradeName != null){
			putQueryParameter("TradeName", tradeName);
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

	public Integer getNameType() {
		return this.nameType;
	}

	public void setNameType(Integer nameType) {
		this.nameType = nameType;
		if(nameType != null){
			putQueryParameter("NameType", nameType.toString());
		}
	}

	@Override
	public Class<CheckCompanyRegResponse> getResponseClass() {
		return CheckCompanyRegResponse.class;
	}

}
