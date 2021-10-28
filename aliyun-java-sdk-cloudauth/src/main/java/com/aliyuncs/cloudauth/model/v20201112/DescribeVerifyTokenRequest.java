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

package com.aliyuncs.cloudauth.model.v20201112;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVerifyTokenRequest extends RpcAcsRequest<DescribeVerifyTokenResponse> {
	   

	private String idCardNumber;

	private String idCardFrontImageUrl;

	private String faceRetainedImageUrl;

	private String userId;

	private String bizType;

	private Long userRegistTime;

	private String bizId;

	private String name;

	private String userIp;

	private String idCardBackImageUrl;

	private String userPhoneNumber;
	public DescribeVerifyTokenRequest() {
		super("Cloudauth", "2020-11-12", "DescribeVerifyToken", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Long getUserRegistTime() {
		return this.userRegistTime;
	}

	public void setUserRegistTime(Long userRegistTime) {
		this.userRegistTime = userRegistTime;
		if(userRegistTime != null){
			putQueryParameter("UserRegistTime", userRegistTime.toString());
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

	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
		if(userIp != null){
			putQueryParameter("UserIp", userIp);
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

	public String getUserPhoneNumber() {
		return this.userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
		if(userPhoneNumber != null){
			putQueryParameter("UserPhoneNumber", userPhoneNumber);
		}
	}

	@Override
	public Class<DescribeVerifyTokenResponse> getResponseClass() {
		return DescribeVerifyTokenResponse.class;
	}

}
