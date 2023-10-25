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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendSmsVerifyCodeRequest extends RpcAcsRequest<SendSmsVerifyCodeResponse> {
	   

	private Long resourceOwnerId;

	private String countryCode;

	private String phoneNumber;

	private String smsUpExtendCode;

	private String signName;

	private String resourceOwnerAccount;

	private Long validTime;

	private Long ownerId;

	private Boolean returnVerifyCode;

	private Long codeType;

	private String schemeName;

	private Long duplicatePolicy;

	private String outId;

	private Long interval;

	private String templateCode;

	private String templateParam;

	private Long codeLength;
	public SendSmsVerifyCodeRequest() {
		super("Dypnsapi", "2017-05-25", "SendSmsVerifyCode", "dypnsapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		if(countryCode != null){
			putQueryParameter("CountryCode", countryCode);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getSmsUpExtendCode() {
		return this.smsUpExtendCode;
	}

	public void setSmsUpExtendCode(String smsUpExtendCode) {
		this.smsUpExtendCode = smsUpExtendCode;
		if(smsUpExtendCode != null){
			putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
		}
	}

	public String getSignName() {
		return this.signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
		if(signName != null){
			putQueryParameter("SignName", signName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Long validTime) {
		this.validTime = validTime;
		if(validTime != null){
			putQueryParameter("ValidTime", validTime.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getReturnVerifyCode() {
		return this.returnVerifyCode;
	}

	public void setReturnVerifyCode(Boolean returnVerifyCode) {
		this.returnVerifyCode = returnVerifyCode;
		if(returnVerifyCode != null){
			putQueryParameter("ReturnVerifyCode", returnVerifyCode.toString());
		}
	}

	public Long getCodeType() {
		return this.codeType;
	}

	public void setCodeType(Long codeType) {
		this.codeType = codeType;
		if(codeType != null){
			putQueryParameter("CodeType", codeType.toString());
		}
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
		if(schemeName != null){
			putQueryParameter("SchemeName", schemeName);
		}
	}

	public Long getDuplicatePolicy() {
		return this.duplicatePolicy;
	}

	public void setDuplicatePolicy(Long duplicatePolicy) {
		this.duplicatePolicy = duplicatePolicy;
		if(duplicatePolicy != null){
			putQueryParameter("DuplicatePolicy", duplicatePolicy.toString());
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
		if(templateCode != null){
			putQueryParameter("TemplateCode", templateCode);
		}
	}

	public String getTemplateParam() {
		return this.templateParam;
	}

	public void setTemplateParam(String templateParam) {
		this.templateParam = templateParam;
		if(templateParam != null){
			putQueryParameter("TemplateParam", templateParam);
		}
	}

	public Long getCodeLength() {
		return this.codeLength;
	}

	public void setCodeLength(Long codeLength) {
		this.codeLength = codeLength;
		if(codeLength != null){
			putQueryParameter("CodeLength", codeLength.toString());
		}
	}

	@Override
	public Class<SendSmsVerifyCodeResponse> getResponseClass() {
		return SendSmsVerifyCodeResponse.class;
	}

}
