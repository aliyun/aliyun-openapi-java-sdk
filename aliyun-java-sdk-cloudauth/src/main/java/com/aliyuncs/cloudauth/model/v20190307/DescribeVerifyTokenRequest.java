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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVerifyTokenRequest extends RpcAcsRequest<DescribeVerifyTokenResponse> {
	   

	private String faceRetainedImageUrl;

	private String userId;

	private String callbackSeed;

	private String idCardBackImageUrl;

	private String idCardNumber;

	private String idCardFrontImageUrl;

	private String bizType;

	private String passedRedirectUrl;

	private String bizId;

	private String name;

	private String callbackUrl;

	private String failedRedirectUrl;
	public DescribeVerifyTokenRequest() {
		super("Cloudauth", "2019-03-07", "DescribeVerifyToken", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceRetainedImageUrl() {
		return this.faceRetainedImageUrl;
	}

	public void setFaceRetainedImageUrl(String faceRetainedImageUrl) {
		this.faceRetainedImageUrl = faceRetainedImageUrl;
		if(faceRetainedImageUrl != null){
			putQueryParameter("FaceRetainedImageUrl", faceRetainedImageUrl);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getCallbackSeed() {
		return this.callbackSeed;
	}

	public void setCallbackSeed(String callbackSeed) {
		this.callbackSeed = callbackSeed;
		if(callbackSeed != null){
			putQueryParameter("CallbackSeed", callbackSeed);
		}
	}

	public String getIdCardBackImageUrl() {
		return this.idCardBackImageUrl;
	}

	public void setIdCardBackImageUrl(String idCardBackImageUrl) {
		this.idCardBackImageUrl = idCardBackImageUrl;
		if(idCardBackImageUrl != null){
			putQueryParameter("IdCardBackImageUrl", idCardBackImageUrl);
		}
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
		if(idCardNumber != null){
			putQueryParameter("IdCardNumber", idCardNumber);
		}
	}

	public String getIdCardFrontImageUrl() {
		return this.idCardFrontImageUrl;
	}

	public void setIdCardFrontImageUrl(String idCardFrontImageUrl) {
		this.idCardFrontImageUrl = idCardFrontImageUrl;
		if(idCardFrontImageUrl != null){
			putQueryParameter("IdCardFrontImageUrl", idCardFrontImageUrl);
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

	public String getPassedRedirectUrl() {
		return this.passedRedirectUrl;
	}

	public void setPassedRedirectUrl(String passedRedirectUrl) {
		this.passedRedirectUrl = passedRedirectUrl;
		if(passedRedirectUrl != null){
			putQueryParameter("PassedRedirectUrl", passedRedirectUrl);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putQueryParameter("CallbackUrl", callbackUrl);
		}
	}

	public String getFailedRedirectUrl() {
		return this.failedRedirectUrl;
	}

	public void setFailedRedirectUrl(String failedRedirectUrl) {
		this.failedRedirectUrl = failedRedirectUrl;
		if(failedRedirectUrl != null){
			putQueryParameter("FailedRedirectUrl", failedRedirectUrl);
		}
	}

	@Override
	public Class<DescribeVerifyTokenResponse> getResponseClass() {
		return DescribeVerifyTokenResponse.class;
	}

}
