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
public class CreateTrademarkApplicationRequest extends RpcAcsRequest<CreateTrademarkApplicationResponse> {
	   

	private String authorizationOssKey;

	private String blackAndWhiteIcon;

	private String trademarkComment;

	private Boolean autoPay;

	private String trademarkIcon;

	private String channel;

	private String classifications;

	private String trademarkName;

	private String trademarkNameType;

	private String applicantId;

	private Integer applicationType;
	public CreateTrademarkApplicationRequest() {
		super("Trademark", "2019-09-02", "CreateTrademarkApplication");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthorizationOssKey() {
		return this.authorizationOssKey;
	}

	public void setAuthorizationOssKey(String authorizationOssKey) {
		this.authorizationOssKey = authorizationOssKey;
		if(authorizationOssKey != null){
			putQueryParameter("AuthorizationOssKey", authorizationOssKey);
		}
	}

	public String getBlackAndWhiteIcon() {
		return this.blackAndWhiteIcon;
	}

	public void setBlackAndWhiteIcon(String blackAndWhiteIcon) {
		this.blackAndWhiteIcon = blackAndWhiteIcon;
		if(blackAndWhiteIcon != null){
			putQueryParameter("BlackAndWhiteIcon", blackAndWhiteIcon);
		}
	}

	public String getTrademarkComment() {
		return this.trademarkComment;
	}

	public void setTrademarkComment(String trademarkComment) {
		this.trademarkComment = trademarkComment;
		if(trademarkComment != null){
			putQueryParameter("TrademarkComment", trademarkComment);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getTrademarkIcon() {
		return this.trademarkIcon;
	}

	public void setTrademarkIcon(String trademarkIcon) {
		this.trademarkIcon = trademarkIcon;
		if(trademarkIcon != null){
			putQueryParameter("TrademarkIcon", trademarkIcon);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getClassifications() {
		return this.classifications;
	}

	public void setClassifications(String classifications) {
		this.classifications = classifications;
		if(classifications != null){
			putQueryParameter("Classifications", classifications);
		}
	}

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
		if(trademarkName != null){
			putQueryParameter("TrademarkName", trademarkName);
		}
	}

	public String getTrademarkNameType() {
		return this.trademarkNameType;
	}

	public void setTrademarkNameType(String trademarkNameType) {
		this.trademarkNameType = trademarkNameType;
		if(trademarkNameType != null){
			putQueryParameter("TrademarkNameType", trademarkNameType);
		}
	}

	public String getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
		if(applicantId != null){
			putQueryParameter("ApplicantId", applicantId);
		}
	}

	public Integer getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putQueryParameter("ApplicationType", applicationType.toString());
		}
	}

	@Override
	public Class<CreateTrademarkApplicationResponse> getResponseClass() {
		return CreateTrademarkApplicationResponse.class;
	}

}
