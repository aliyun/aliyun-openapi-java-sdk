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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateConfigurationOrderRequest extends RpcAcsRequest<CreateConfigurationOrderResponse> {
	   

	private Long callerParentId;

	private Boolean callerSecurityTransport;

	private Long userCallerParentId;

	private Long packageId;

	private String callerType;

	private Boolean systemCall;

	private String securityToken;

	private Boolean userMfaPresent;

	private String clientIp;

	private Long aliyunKpLong;

	private String userKp;

	private String lang;

	private Long stsTokenCallerBid;

	private String userCallerType;

	private String userSecurityToken;

	private String userAccessKeyId;

	private String aliyunKp;

	private String userBid;

	private String originalRequest;

	private Boolean mfaPresent;

	private Boolean proxyCallerSecurityTransport;

	private Long stsTokenCallerUid;

	private Boolean userCallerSecurityTransport;

	private String requestId;

	private String userClientIp;

	private String popAction;

	private String proxyCallerIp;

	private String bid;

	private String items;

	private Boolean proxyTrustTransportInfo;
	public CreateConfigurationOrderRequest() {
		super("Premiumpics", "2020-05-05", "CreateConfigurationOrder");
		setMethod(MethodType.POST);
	}

	public Long getCallerParentId() {
		return this.callerParentId;
	}

	public void setCallerParentId(Long callerParentId) {
		this.callerParentId = callerParentId;
		if(callerParentId != null){
			putQueryParameter("CallerParentId", callerParentId.toString());
		}
	}

	public Boolean getCallerSecurityTransport() {
		return this.callerSecurityTransport;
	}

	public void setCallerSecurityTransport(Boolean callerSecurityTransport) {
		this.callerSecurityTransport = callerSecurityTransport;
		if(callerSecurityTransport != null){
			putQueryParameter("CallerSecurityTransport", callerSecurityTransport.toString());
		}
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

	public Long getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
		if(packageId != null){
			putQueryParameter("PackageId", packageId.toString());
		}
	}

	public String getCallerType() {
		return this.callerType;
	}

	public void setCallerType(String callerType) {
		this.callerType = callerType;
		if(callerType != null){
			putQueryParameter("CallerType", callerType);
		}
	}

	public Boolean getSystemCall() {
		return this.systemCall;
	}

	public void setSystemCall(Boolean systemCall) {
		this.systemCall = systemCall;
		if(systemCall != null){
			putQueryParameter("SystemCall", systemCall.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public Long getAliyunKpLong() {
		return this.aliyunKpLong;
	}

	public void setAliyunKpLong(Long aliyunKpLong) {
		this.aliyunKpLong = aliyunKpLong;
		if(aliyunKpLong != null){
			putQueryParameter("AliyunKpLong", aliyunKpLong.toString());
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

	public Long getStsTokenCallerBid() {
		return this.stsTokenCallerBid;
	}

	public void setStsTokenCallerBid(Long stsTokenCallerBid) {
		this.stsTokenCallerBid = stsTokenCallerBid;
		if(stsTokenCallerBid != null){
			putQueryParameter("StsTokenCallerBid", stsTokenCallerBid.toString());
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

	public Boolean getMfaPresent() {
		return this.mfaPresent;
	}

	public void setMfaPresent(Boolean mfaPresent) {
		this.mfaPresent = mfaPresent;
		if(mfaPresent != null){
			putQueryParameter("MfaPresent", mfaPresent.toString());
		}
	}

	public Boolean getProxyCallerSecurityTransport() {
		return this.proxyCallerSecurityTransport;
	}

	public void setProxyCallerSecurityTransport(Boolean proxyCallerSecurityTransport) {
		this.proxyCallerSecurityTransport = proxyCallerSecurityTransport;
		if(proxyCallerSecurityTransport != null){
			putQueryParameter("ProxyCallerSecurityTransport", proxyCallerSecurityTransport.toString());
		}
	}

	public Long getStsTokenCallerUid() {
		return this.stsTokenCallerUid;
	}

	public void setStsTokenCallerUid(Long stsTokenCallerUid) {
		this.stsTokenCallerUid = stsTokenCallerUid;
		if(stsTokenCallerUid != null){
			putQueryParameter("StsTokenCallerUid", stsTokenCallerUid.toString());
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
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

	public String getPopAction() {
		return this.popAction;
	}

	public void setPopAction(String popAction) {
		this.popAction = popAction;
		if(popAction != null){
			putQueryParameter("PopAction", popAction);
		}
	}

	public String getProxyCallerIp() {
		return this.proxyCallerIp;
	}

	public void setProxyCallerIp(String proxyCallerIp) {
		this.proxyCallerIp = proxyCallerIp;
		if(proxyCallerIp != null){
			putQueryParameter("ProxyCallerIp", proxyCallerIp);
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

	public String getItems() {
		return this.items;
	}

	public void setItems(String items) {
		this.items = items;
		if(items != null){
			putQueryParameter("Items", items);
		}
	}

	public Boolean getProxyTrustTransportInfo() {
		return this.proxyTrustTransportInfo;
	}

	public void setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
		this.proxyTrustTransportInfo = proxyTrustTransportInfo;
		if(proxyTrustTransportInfo != null){
			putQueryParameter("ProxyTrustTransportInfo", proxyTrustTransportInfo.toString());
		}
	}

	@Override
	public Class<CreateConfigurationOrderResponse> getResponseClass() {
		return CreateConfigurationOrderResponse.class;
	}

}
