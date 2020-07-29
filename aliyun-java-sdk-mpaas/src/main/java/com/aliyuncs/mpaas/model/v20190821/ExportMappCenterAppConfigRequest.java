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

package com.aliyuncs.mpaas.model.v20190821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExportMappCenterAppConfigRequest extends RpcAcsRequest<ExportMappCenterAppConfigResponse> {
	   

	private String systemType;

	private Boolean onexFlag;

	private String identifier;

	private String certRsaBase64;

	private String appId;

	private String workspaceId;
	public ExportMappCenterAppConfigRequest() {
		super("mPaaS", "2019-08-21", "ExportMappCenterAppConfig", "mpaas");
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

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
		if(identifier != null){
			putBodyParameter("Identifier", identifier);
		}
	}

	public String getCertRsaBase64() {
		return this.certRsaBase64;
	}

	public void setCertRsaBase64(String certRsaBase64) {
		this.certRsaBase64 = certRsaBase64;
		if(certRsaBase64 != null){
			putBodyParameter("CertRsaBase64", certRsaBase64);
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
	public Class<ExportMappCenterAppConfigResponse> getResponseClass() {
		return ExportMappCenterAppConfigResponse.class;
	}

}
