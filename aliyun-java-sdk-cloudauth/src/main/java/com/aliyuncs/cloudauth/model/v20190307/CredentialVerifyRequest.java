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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CredentialVerifyRequest extends RpcAcsRequest<CredentialVerifyResponse> {
	   

	private String isOCR;

	private String isCheck;

	private String imageContext;

	private String credType;

	private String identifyNum;

	private String credName;

	private String imageUrl;

	private String certNum;

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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CredentialVerifyResponse> getResponseClass() {
		return CredentialVerifyResponse.class;
	}

}
