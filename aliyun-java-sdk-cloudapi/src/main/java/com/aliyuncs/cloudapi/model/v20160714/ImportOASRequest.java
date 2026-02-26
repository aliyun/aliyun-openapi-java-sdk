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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportOASRequest extends RpcAcsRequest<ImportOASResponse> {
	   

	private String data;

	private String authType;

	private String securityToken;

	private Boolean overwrite;

	private Boolean ignoreWarning;

	private String groupId;

	private String requestMode;

	private String backendName;

	private Boolean skipDryRun;

	private String oASVersion;
	public ImportOASRequest() {
		super("CloudAPI", "2016-07-14", "ImportOAS", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putBodyParameter("Data", data);
		}
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		if(authType != null){
			putQueryParameter("AuthType", authType);
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

	public Boolean getOverwrite() {
		return this.overwrite;
	}

	public void setOverwrite(Boolean overwrite) {
		this.overwrite = overwrite;
		if(overwrite != null){
			putQueryParameter("Overwrite", overwrite.toString());
		}
	}

	public Boolean getIgnoreWarning() {
		return this.ignoreWarning;
	}

	public void setIgnoreWarning(Boolean ignoreWarning) {
		this.ignoreWarning = ignoreWarning;
		if(ignoreWarning != null){
			putQueryParameter("IgnoreWarning", ignoreWarning.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getRequestMode() {
		return this.requestMode;
	}

	public void setRequestMode(String requestMode) {
		this.requestMode = requestMode;
		if(requestMode != null){
			putQueryParameter("RequestMode", requestMode);
		}
	}

	public String getBackendName() {
		return this.backendName;
	}

	public void setBackendName(String backendName) {
		this.backendName = backendName;
		if(backendName != null){
			putQueryParameter("BackendName", backendName);
		}
	}

	public Boolean getSkipDryRun() {
		return this.skipDryRun;
	}

	public void setSkipDryRun(Boolean skipDryRun) {
		this.skipDryRun = skipDryRun;
		if(skipDryRun != null){
			putQueryParameter("SkipDryRun", skipDryRun.toString());
		}
	}

	public String getOASVersion() {
		return this.oASVersion;
	}

	public void setOASVersion(String oASVersion) {
		this.oASVersion = oASVersion;
		if(oASVersion != null){
			putQueryParameter("OASVersion", oASVersion);
		}
	}

	@Override
	public Class<ImportOASResponse> getResponseClass() {
		return ImportOASResponse.class;
	}

}
