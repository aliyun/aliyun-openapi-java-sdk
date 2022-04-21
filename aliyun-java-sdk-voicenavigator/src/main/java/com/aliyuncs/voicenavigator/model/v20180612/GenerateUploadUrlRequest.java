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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateUploadUrlRequest extends RpcAcsRequest<GenerateUploadUrlResponse> {
	   

	private Long callerParentId;

	private Boolean securityTransport;

	private Boolean proxyOriginalSecurityTransport;

	private Long userId;

	private String callerType;

	private String callerIp;

	private String securityToken;

	private Long instanceOwnerId;

	private String clientIp;

	private Long tenantId;

	private String proxyOriginalSourceIp;

	private String key;

	private Long callerUid;

	private String callerBid;

	private Long xspaceTenantBuId;

	private Boolean mfaPresent;

	private Integer environment;

	private String fileName;

	private String instanceId;

	private String requestId;

	private Long xspaceServicerId;

	private String tenantName;

	private Boolean proxyTrustTransportInfo;

	private String userName;
	public GenerateUploadUrlRequest() {
		super("VoiceNavigator", "2018-06-12", "GenerateUploadUrl", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCallerParentId() {
		return this.callerParentId;
	}

	public void setCallerParentId(Long callerParentId) {
		this.callerParentId = callerParentId;
		if(callerParentId != null){
			putBodyParameter("CallerParentId", callerParentId.toString());
		}
	}

	public Boolean getSecurityTransport() {
		return this.securityTransport;
	}

	public void setSecurityTransport(Boolean securityTransport) {
		this.securityTransport = securityTransport;
		if(securityTransport != null){
			putBodyParameter("SecurityTransport", securityTransport.toString());
		}
	}

	public Boolean getProxyOriginalSecurityTransport() {
		return this.proxyOriginalSecurityTransport;
	}

	public void setProxyOriginalSecurityTransport(Boolean proxyOriginalSecurityTransport) {
		this.proxyOriginalSecurityTransport = proxyOriginalSecurityTransport;
		if(proxyOriginalSecurityTransport != null){
			putBodyParameter("ProxyOriginalSecurityTransport", proxyOriginalSecurityTransport.toString());
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId.toString());
		}
	}

	public String getCallerType() {
		return this.callerType;
	}

	public void setCallerType(String callerType) {
		this.callerType = callerType;
		if(callerType != null){
			putBodyParameter("CallerType", callerType);
		}
	}

	public String getCallerIp() {
		return this.callerIp;
	}

	public void setCallerIp(String callerIp) {
		this.callerIp = callerIp;
		if(callerIp != null){
			putBodyParameter("CallerIp", callerIp);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putBodyParameter("SecurityToken", securityToken);
		}
	}

	public Long getInstanceOwnerId() {
		return this.instanceOwnerId;
	}

	public void setInstanceOwnerId(Long instanceOwnerId) {
		this.instanceOwnerId = instanceOwnerId;
		if(instanceOwnerId != null){
			putBodyParameter("InstanceOwnerId", instanceOwnerId.toString());
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

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public String getProxyOriginalSourceIp() {
		return this.proxyOriginalSourceIp;
	}

	public void setProxyOriginalSourceIp(String proxyOriginalSourceIp) {
		this.proxyOriginalSourceIp = proxyOriginalSourceIp;
		if(proxyOriginalSourceIp != null){
			putBodyParameter("ProxyOriginalSourceIp", proxyOriginalSourceIp);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putBodyParameter("Key", key);
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

	public String getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(String callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putBodyParameter("CallerBid", callerBid);
		}
	}

	public Long getXspaceTenantBuId() {
		return this.xspaceTenantBuId;
	}

	public void setXspaceTenantBuId(Long xspaceTenantBuId) {
		this.xspaceTenantBuId = xspaceTenantBuId;
		if(xspaceTenantBuId != null){
			putBodyParameter("XspaceTenantBuId", xspaceTenantBuId.toString());
		}
	}

	public Boolean getMfaPresent() {
		return this.mfaPresent;
	}

	public void setMfaPresent(Boolean mfaPresent) {
		this.mfaPresent = mfaPresent;
		if(mfaPresent != null){
			putBodyParameter("MfaPresent", mfaPresent.toString());
		}
	}

	public Integer getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(Integer environment) {
		this.environment = environment;
		if(environment != null){
			putBodyParameter("Environment", environment.toString());
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
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

	public Long getXspaceServicerId() {
		return this.xspaceServicerId;
	}

	public void setXspaceServicerId(Long xspaceServicerId) {
		this.xspaceServicerId = xspaceServicerId;
		if(xspaceServicerId != null){
			putBodyParameter("XspaceServicerId", xspaceServicerId.toString());
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	public Boolean getProxyTrustTransportInfo() {
		return this.proxyTrustTransportInfo;
	}

	public void setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
		this.proxyTrustTransportInfo = proxyTrustTransportInfo;
		if(proxyTrustTransportInfo != null){
			putBodyParameter("ProxyTrustTransportInfo", proxyTrustTransportInfo.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	@Override
	public Class<GenerateUploadUrlResponse> getResponseClass() {
		return GenerateUploadUrlResponse.class;
	}

}
