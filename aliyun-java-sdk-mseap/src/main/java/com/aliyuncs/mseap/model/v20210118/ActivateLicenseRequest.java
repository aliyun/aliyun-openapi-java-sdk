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

package com.aliyuncs.mseap.model.v20210118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ActivateLicenseRequest extends RpcAcsRequest<ActivateLicenseResponse> {
	   

	private String licenseNo;

	private String bizType;

	private String licensePublisher;

	private String bizId;

	private String licenseCode;
	public ActivateLicenseRequest() {
		super("mseap", "2021-01-18", "ActivateLicense");
		setMethod(MethodType.POST);
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
		if(licenseNo != null){
			putQueryParameter("LicenseNo", licenseNo);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getLicensePublisher() {
		return this.licensePublisher;
	}

	public void setLicensePublisher(String licensePublisher) {
		this.licensePublisher = licensePublisher;
		if(licensePublisher != null){
			putQueryParameter("LicensePublisher", licensePublisher);
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

	public String getLicenseCode() {
		return this.licenseCode;
	}

	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode;
		if(licenseCode != null){
			putQueryParameter("LicenseCode", licenseCode);
		}
	}

	@Override
	public Class<ActivateLicenseResponse> getResponseClass() {
		return ActivateLicenseResponse.class;
	}

}
