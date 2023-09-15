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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitIsvCustomerTermsRequest extends RpcAcsRequest<SubmitIsvCustomerTermsResponse> {
	   

	private String officeAddress;

	private String isvTerms;

	private String contactMail;

	private String countryId;

	private String custSpaceId;

	private String businessDesc;

	private String custName;
	public SubmitIsvCustomerTermsRequest() {
		super("cams", "2020-06-06", "SubmitIsvCustomerTerms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeAddress() {
		return this.officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
		if(officeAddress != null){
			putQueryParameter("OfficeAddress", officeAddress);
		}
	}

	public String getIsvTerms() {
		return this.isvTerms;
	}

	public void setIsvTerms(String isvTerms) {
		this.isvTerms = isvTerms;
		if(isvTerms != null){
			putQueryParameter("IsvTerms", isvTerms);
		}
	}

	public String getContactMail() {
		return this.contactMail;
	}

	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
		if(contactMail != null){
			putQueryParameter("ContactMail", contactMail);
		}
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
		if(countryId != null){
			putQueryParameter("CountryId", countryId);
		}
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putQueryParameter("CustSpaceId", custSpaceId);
		}
	}

	public String getBusinessDesc() {
		return this.businessDesc;
	}

	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
		if(businessDesc != null){
			putQueryParameter("BusinessDesc", businessDesc);
		}
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
		if(custName != null){
			putQueryParameter("CustName", custName);
		}
	}

	@Override
	public Class<SubmitIsvCustomerTermsResponse> getResponseClass() {
		return SubmitIsvCustomerTermsResponse.class;
	}

}
