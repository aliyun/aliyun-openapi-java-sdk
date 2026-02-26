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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LicenseAuthRequest extends RpcAcsRequest<LicenseAuthResponse> {
	   

	private String license;

	private String appId;

	private Long tenantId;
	public LicenseAuthRequest() {
		super("avatar", "2022-01-30", "LicenseAuth");
		setMethod(MethodType.POST);
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
		if(license != null){
			putQueryParameter("License", license);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	@Override
	public Class<LicenseAuthResponse> getResponseClass() {
		return LicenseAuthResponse.class;
	}

}
