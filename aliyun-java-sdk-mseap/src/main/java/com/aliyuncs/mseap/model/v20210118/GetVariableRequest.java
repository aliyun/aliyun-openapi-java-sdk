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
public class GetVariableRequest extends RpcAcsRequest<GetVariableResponse> {
	   

	private Long userCallerParentId;

	private String apiType;

	private Boolean userMfaPresent;

	private String userKp;

	private String lang;

	private String userCallerType;

	private String userSecurityToken;

	private String userAccessKeyId;

	private String aliyunKp;

	private String userBid;

	private String originalRequest;

	private Long templateId;

	private Boolean userCallerSecurityTransport;

	private String userClientIp;

	private String bid;
	public GetVariableRequest() {
		super("mseap", "2021-01-18", "GetVariable");
		setMethod(MethodType.POST);
	}

	public Long getUserCallerParentId() {
		return this.userCallerParentId;
	}

	public void setUserCallerParentId(Long userCallerParentId) {
		this.userCallerParentId = userCallerParentId;
		if(userCallerParentId != null){
			putQueryParameter("UserCallerParentId", userCallerParentId.toString());
		}
	}

	public String getApiType() {
		return this.apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putQueryParameter("ApiType", apiType);
		}
	}

	public Boolean getUserMfaPresent() {
		return this.userMfaPresent;
	}

	public void setUserMfaPresent(Boolean userMfaPresent) {
		this.userMfaPresent = userMfaPresent;
		if(userMfaPresent != null){
			putQueryParameter("UserMfaPresent", userMfaPresent.toString());
		}
	}

	public String getUserKp() {
		return this.userKp;
	}

	public void setUserKp(String userKp) {
		this.userKp = userKp;
		if(userKp != null){
			putQueryParameter("UserKp", userKp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getUserCallerType() {
		return this.userCallerType;
	}

	public void setUserCallerType(String userCallerType) {
		this.userCallerType = userCallerType;
		if(userCallerType != null){
			putQueryParameter("UserCallerType", userCallerType);
		}
	}

	public String getUserSecurityToken() {
		return this.userSecurityToken;
	}

	public void setUserSecurityToken(String userSecurityToken) {
		this.userSecurityToken = userSecurityToken;
		if(userSecurityToken != null){
			putQueryParameter("UserSecurityToken", userSecurityToken);
		}
	}

	public String getUserAccessKeyId() {
		return this.userAccessKeyId;
	}

	public void setUserAccessKeyId(String userAccessKeyId) {
		this.userAccessKeyId = userAccessKeyId;
		if(userAccessKeyId != null){
			putQueryParameter("UserAccessKeyId", userAccessKeyId);
		}
	}

	public String getAliyunKp() {
		return this.aliyunKp;
	}

	public void setAliyunKp(String aliyunKp) {
		this.aliyunKp = aliyunKp;
		if(aliyunKp != null){
			putQueryParameter("AliyunKp", aliyunKp);
		}
	}

	public String getUserBid() {
		return this.userBid;
	}

	public void setUserBid(String userBid) {
		this.userBid = userBid;
		if(userBid != null){
			putQueryParameter("UserBid", userBid);
		}
	}

	public String getOriginalRequest() {
		return this.originalRequest;
	}

	public void setOriginalRequest(String originalRequest) {
		this.originalRequest = originalRequest;
		if(originalRequest != null){
			putQueryParameter("OriginalRequest", originalRequest);
		}
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
		}
	}

	public Boolean getUserCallerSecurityTransport() {
		return this.userCallerSecurityTransport;
	}

	public void setUserCallerSecurityTransport(Boolean userCallerSecurityTransport) {
		this.userCallerSecurityTransport = userCallerSecurityTransport;
		if(userCallerSecurityTransport != null){
			putQueryParameter("UserCallerSecurityTransport", userCallerSecurityTransport.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<GetVariableResponse> getResponseClass() {
		return GetVariableResponse.class;
	}

}
