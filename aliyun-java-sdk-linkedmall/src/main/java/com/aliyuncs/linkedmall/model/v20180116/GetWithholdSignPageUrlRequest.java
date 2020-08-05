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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetWithholdSignPageUrlRequest extends RpcAcsRequest<GetWithholdSignPageUrlResponse> {
	   

	private String extInfo;

	private String merchantServiceName;

	private String deviceType;

	private String outRequestNo;

	private String externalAgreementNo;

	private String merchantId;

	private String identityParameters;

	private String notifyUrl;

	private String returnUrl;

	private String merchantServiceDescription;
	public GetWithholdSignPageUrlRequest() {
		super("linkedmall", "2018-01-16", "GetWithholdSignPageUrl", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putBodyParameter("ExtInfo", extInfo);
		}
	}

	public String getMerchantServiceName() {
		return this.merchantServiceName;
	}

	public void setMerchantServiceName(String merchantServiceName) {
		this.merchantServiceName = merchantServiceName;
		if(merchantServiceName != null){
			putBodyParameter("MerchantServiceName", merchantServiceName);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putBodyParameter("DeviceType", deviceType);
		}
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
		if(outRequestNo != null){
			putBodyParameter("OutRequestNo", outRequestNo);
		}
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}

	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
		if(externalAgreementNo != null){
			putBodyParameter("ExternalAgreementNo", externalAgreementNo);
		}
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
		if(merchantId != null){
			putBodyParameter("MerchantId", merchantId);
		}
	}

	public String getIdentityParameters() {
		return this.identityParameters;
	}

	public void setIdentityParameters(String identityParameters) {
		this.identityParameters = identityParameters;
		if(identityParameters != null){
			putBodyParameter("IdentityParameters", identityParameters);
		}
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		if(notifyUrl != null){
			putBodyParameter("NotifyUrl", notifyUrl);
		}
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		if(returnUrl != null){
			putBodyParameter("ReturnUrl", returnUrl);
		}
	}

	public String getMerchantServiceDescription() {
		return this.merchantServiceDescription;
	}

	public void setMerchantServiceDescription(String merchantServiceDescription) {
		this.merchantServiceDescription = merchantServiceDescription;
		if(merchantServiceDescription != null){
			putBodyParameter("MerchantServiceDescription", merchantServiceDescription);
		}
	}

	@Override
	public Class<GetWithholdSignPageUrlResponse> getResponseClass() {
		return GetWithholdSignPageUrlResponse.class;
	}

}
