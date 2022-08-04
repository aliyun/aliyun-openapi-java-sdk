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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AskAdjudicationFileRequest extends RpcAcsRequest<AskAdjudicationFileResponse> {
	   

	private String contactAddress;

	private String contactNumber;

	private String contactName;

	private String contactDistrict;

	private String contactProvince;

	private String bizId;

	private String contactCounty;

	private String contactCity;
	public AskAdjudicationFileRequest() {
		super("Trademark", "2018-07-24", "AskAdjudicationFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
		if(contactAddress != null){
			putQueryParameter("ContactAddress", contactAddress);
		}
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		if(contactNumber != null){
			putQueryParameter("ContactNumber", contactNumber);
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

	public String getContactDistrict() {
		return this.contactDistrict;
	}

	public void setContactDistrict(String contactDistrict) {
		this.contactDistrict = contactDistrict;
		if(contactDistrict != null){
			putQueryParameter("ContactDistrict", contactDistrict);
		}
	}

	public String getContactProvince() {
		return this.contactProvince;
	}

	public void setContactProvince(String contactProvince) {
		this.contactProvince = contactProvince;
		if(contactProvince != null){
			putQueryParameter("ContactProvince", contactProvince);
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

	public String getContactCounty() {
		return this.contactCounty;
	}

	public void setContactCounty(String contactCounty) {
		this.contactCounty = contactCounty;
		if(contactCounty != null){
			putQueryParameter("ContactCounty", contactCounty);
		}
	}

	public String getContactCity() {
		return this.contactCity;
	}

	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
		if(contactCity != null){
			putQueryParameter("ContactCity", contactCity);
		}
	}

	@Override
	public Class<AskAdjudicationFileResponse> getResponseClass() {
		return AskAdjudicationFileResponse.class;
	}

}
