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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOpenSingleDataRequest extends RpcAcsRequest<CreateOpenSingleDataResponse> {
	   

	private String extAttrStr;

	private String thirdMsgId;

	private Long validTimeEnd;

	private String payload;

	private Boolean checkOnline;

	private String appMinVersion;

	private Long validTimeStart;

	private String linkToken;

	private String osType;

	private String bizType;

	private String appMaxVersion;

	private String appId;

	private String workspaceId;
	public CreateOpenSingleDataRequest() {
		super("mPaaS", "2020-07-10", "CreateOpenSingleData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtAttrStr() {
		return this.extAttrStr;
	}

	public void setExtAttrStr(String extAttrStr) {
		this.extAttrStr = extAttrStr;
		if(extAttrStr != null){
			putBodyParameter("ExtAttrStr", extAttrStr);
		}
	}

	public String getThirdMsgId() {
		return this.thirdMsgId;
	}

	public void setThirdMsgId(String thirdMsgId) {
		this.thirdMsgId = thirdMsgId;
		if(thirdMsgId != null){
			putBodyParameter("ThirdMsgId", thirdMsgId);
		}
	}

	public Long getValidTimeEnd() {
		return this.validTimeEnd;
	}

	public void setValidTimeEnd(Long validTimeEnd) {
		this.validTimeEnd = validTimeEnd;
		if(validTimeEnd != null){
			putBodyParameter("ValidTimeEnd", validTimeEnd.toString());
		}
	}

	public String getPayload() {
		return this.payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
		if(payload != null){
			putBodyParameter("Payload", payload);
		}
	}

	public Boolean getCheckOnline() {
		return this.checkOnline;
	}

	public void setCheckOnline(Boolean checkOnline) {
		this.checkOnline = checkOnline;
		if(checkOnline != null){
			putBodyParameter("CheckOnline", checkOnline.toString());
		}
	}

	public String getAppMinVersion() {
		return this.appMinVersion;
	}

	public void setAppMinVersion(String appMinVersion) {
		this.appMinVersion = appMinVersion;
		if(appMinVersion != null){
			putBodyParameter("AppMinVersion", appMinVersion);
		}
	}

	public Long getValidTimeStart() {
		return this.validTimeStart;
	}

	public void setValidTimeStart(Long validTimeStart) {
		this.validTimeStart = validTimeStart;
		if(validTimeStart != null){
			putBodyParameter("ValidTimeStart", validTimeStart.toString());
		}
	}

	public String getLinkToken() {
		return this.linkToken;
	}

	public void setLinkToken(String linkToken) {
		this.linkToken = linkToken;
		if(linkToken != null){
			putBodyParameter("LinkToken", linkToken);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putBodyParameter("OsType", osType);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getAppMaxVersion() {
		return this.appMaxVersion;
	}

	public void setAppMaxVersion(String appMaxVersion) {
		this.appMaxVersion = appMaxVersion;
		if(appMaxVersion != null){
			putBodyParameter("AppMaxVersion", appMaxVersion);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CreateOpenSingleDataResponse> getResponseClass() {
		return CreateOpenSingleDataResponse.class;
	}

}
