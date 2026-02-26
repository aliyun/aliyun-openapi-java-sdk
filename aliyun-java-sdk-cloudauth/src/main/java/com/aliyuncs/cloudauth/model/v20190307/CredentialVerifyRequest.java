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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CredentialVerifyRequest extends RpcAcsRequest<CredentialVerifyResponse> {
	   

	private String productCode;

	private String isOCR;

	private String isCheck;

	private String imageContext;

	private String credType;

	private String promptModel;

	private String identifyNum;

	private String credName;

	private String merchantId;

	@SerializedName("merchantDetail")
	private List<MerchantDetail> merchantDetail;

	private String imageUrl;

	private String certNum;

	private String prompt;

	private String userName;
	public CredentialVerifyRequest() {
		super("Cloudauth", "2019-03-07", "CredentialVerify", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getIsOCR() {
		return this.isOCR;
	}

	public void setIsOCR(String isOCR) {
		this.isOCR = isOCR;
		if(isOCR != null){
			putQueryParameter("IsOCR", isOCR);
		}
	}

	public String getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
		if(isCheck != null){
			putQueryParameter("IsCheck", isCheck);
		}
	}

	public String getImageContext() {
		return this.imageContext;
	}

	public void setImageContext(String imageContext) {
		this.imageContext = imageContext;
		if(imageContext != null){
			putBodyParameter("ImageContext", imageContext);
		}
	}

	public String getCredType() {
		return this.credType;
	}

	public void setCredType(String credType) {
		this.credType = credType;
		if(credType != null){
			putQueryParameter("CredType", credType);
		}
	}

	public String getPromptModel() {
		return this.promptModel;
	}

	public void setPromptModel(String promptModel) {
		this.promptModel = promptModel;
		if(promptModel != null){
			putQueryParameter("PromptModel", promptModel);
		}
	}

	public String getIdentifyNum() {
		return this.identifyNum;
	}

	public void setIdentifyNum(String identifyNum) {
		this.identifyNum = identifyNum;
		if(identifyNum != null){
			putQueryParameter("IdentifyNum", identifyNum);
		}
	}

	public String getCredName() {
		return this.credName;
	}

	public void setCredName(String credName) {
		this.credName = credName;
		if(credName != null){
			putQueryParameter("CredName", credName);
		}
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
		if(merchantId != null){
			putQueryParameter("MerchantId", merchantId);
		}
	}

	public List<MerchantDetail> getMerchantDetail() {
		return this.merchantDetail;
	}

	public void setMerchantDetail(List<MerchantDetail> merchantDetail) {
		this.merchantDetail = merchantDetail;	
		if (merchantDetail != null) {
			putQueryParameter("MerchantDetail" , new Gson().toJson(merchantDetail));
		}	
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	public String getCertNum() {
		return this.certNum;
	}

	public void setCertNum(String certNum) {
		this.certNum = certNum;
		if(certNum != null){
			putQueryParameter("CertNum", certNum);
		}
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putQueryParameter("Prompt", prompt);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	public static class MerchantDetail {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CredentialVerifyResponse> getResponseClass() {
		return CredentialVerifyResponse.class;
	}

}
