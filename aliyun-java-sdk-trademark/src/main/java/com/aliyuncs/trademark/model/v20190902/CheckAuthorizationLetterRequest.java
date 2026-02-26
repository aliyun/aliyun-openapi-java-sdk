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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckAuthorizationLetterRequest extends RpcAcsRequest<CheckAuthorizationLetterResponse> {
	   

	private String ossKey;

	private String color;

	private String applicantType;

	private String contactNumber;

	private String type;

	private String contactName;

	private String contactZipcode;

	private String personalType;
	public CheckAuthorizationLetterRequest() {
		super("Trademark", "2019-09-02", "CheckAuthorizationLetter");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOssKey() {
		return this.ossKey;
	}

	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
		if(ossKey != null){
			putQueryParameter("OssKey", ossKey);
		}
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
		if(color != null){
			putQueryParameter("Color", color);
		}
	}

	public String getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
		if(applicantType != null){
			putQueryParameter("ApplicantType", applicantType);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getContactZipcode() {
		return this.contactZipcode;
	}

	public void setContactZipcode(String contactZipcode) {
		this.contactZipcode = contactZipcode;
		if(contactZipcode != null){
			putQueryParameter("ContactZipcode", contactZipcode);
		}
	}

	public String getPersonalType() {
		return this.personalType;
	}

	public void setPersonalType(String personalType) {
		this.personalType = personalType;
		if(personalType != null){
			putQueryParameter("PersonalType", personalType);
		}
	}

	@Override
	public Class<CheckAuthorizationLetterResponse> getResponseClass() {
		return CheckAuthorizationLetterResponse.class;
	}

}
