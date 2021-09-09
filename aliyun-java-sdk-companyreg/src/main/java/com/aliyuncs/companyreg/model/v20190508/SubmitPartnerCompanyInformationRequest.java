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
public class SubmitPartnerCompanyInformationRequest extends RpcAcsRequest<SubmitPartnerCompanyInformationResponse> {
	   

	private String uscc;

	private String contactName;

	private String companyName;

	private String bizId;

	private String contactMobile;

	private String companyBizType;
	public SubmitPartnerCompanyInformationRequest() {
		super("companyreg", "2019-05-08", "SubmitPartnerCompanyInformation", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUscc() {
		return this.uscc;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
		if(uscc != null){
			putQueryParameter("Uscc", uscc);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
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

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getContactMobile() {
		return this.contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
		if(contactMobile != null){
			putQueryParameter("ContactMobile", contactMobile);
		}
	}

	public String getCompanyBizType() {
		return this.companyBizType;
	}

	public void setCompanyBizType(String companyBizType) {
		this.companyBizType = companyBizType;
		if(companyBizType != null){
			putQueryParameter("CompanyBizType", companyBizType);
		}
	}

	@Override
	public Class<SubmitPartnerCompanyInformationResponse> getResponseClass() {
		return SubmitPartnerCompanyInformationResponse.class;
	}

}
