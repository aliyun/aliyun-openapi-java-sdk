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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SyncAllEduInfoRequest extends RpcAcsRequest<SyncAllEduInfoResponse> {
	   

	private String clientId;

	private String clientVersion;

	private String clientOS;

	private String loginToken;

	private String sessionId;

	private String callerBid;

	private String apiType;

	private String requestId;

	private String clientIp;

	private String endUserId;

	private Integer userSource;

	private Long aliUid;

	private Long callerUid;
	public SyncAllEduInfoRequest() {
		super("ecd", "2020-09-30", "SyncAllEduInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putBodyParameter("ClientId", clientId);
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putBodyParameter("ClientVersion", clientVersion);
		}
	}

	public String getClientOS() {
		return this.clientOS;
	}

	public void setClientOS(String clientOS) {
		this.clientOS = clientOS;
		if(clientOS != null){
			putBodyParameter("ClientOS", clientOS);
		}
	}

	public String getLoginToken() {
		return this.loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
		if(loginToken != null){
			putBodyParameter("LoginToken", loginToken);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(String callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putBodyParameter("CallerBid", callerBid);
		}
	}

	public String getApiType() {
		return this.apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putBodyParameter("ApiType", apiType);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putBodyParameter("ClientIp", clientIp);
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putBodyParameter("EndUserId", endUserId);
		}
	}

	public Integer getUserSource() {
		return this.userSource;
	}

	public void setUserSource(Integer userSource) {
		this.userSource = userSource;
		if(userSource != null){
			putBodyParameter("UserSource", userSource.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putBodyParameter("AliUid", aliUid.toString());
		}
	}

	public Long getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(Long callerUid) {
		this.callerUid = callerUid;
		if(callerUid != null){
			putBodyParameter("CallerUid", callerUid.toString());
		}
	}

	@Override
	public Class<SyncAllEduInfoResponse> getResponseClass() {
		return SyncAllEduInfoResponse.class;
	}

}
