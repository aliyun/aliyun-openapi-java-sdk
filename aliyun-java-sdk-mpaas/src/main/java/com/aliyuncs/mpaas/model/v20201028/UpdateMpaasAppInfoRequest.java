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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMpaasAppInfoRequest extends RpcAcsRequest<UpdateMpaasAppInfoResponse> {
	   

	private String systemType;

	private Boolean onexFlag;

	private String appName;

	private String tenantId;

	private String identifier;

	private String iconFileUrl;

	private String appId;
	public UpdateMpaasAppInfoRequest() {
		super("mPaaS", "2020-10-28", "UpdateMpaasAppInfo", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSystemType() {
		return this.systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
		if(systemType != null){
			putBodyParameter("SystemType", systemType);
		}
	}

	public Boolean getOnexFlag() {
		return this.onexFlag;
	}

	public void setOnexFlag(Boolean onexFlag) {
		this.onexFlag = onexFlag;
		if(onexFlag != null){
			putBodyParameter("OnexFlag", onexFlag.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putBodyParameter("Identifier", identifier);
		}
	}

	public String getIconFileUrl() {
		return this.iconFileUrl;
	}

	public void setIconFileUrl(String iconFileUrl) {
		this.iconFileUrl = iconFileUrl;
		if(iconFileUrl != null){
			putBodyParameter("IconFileUrl", iconFileUrl);
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

	@Override
	public Class<UpdateMpaasAppInfoResponse> getResponseClass() {
		return UpdateMpaasAppInfoResponse.class;
	}

}
