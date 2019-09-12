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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePkgVersionRequest extends RoaAcsRequest<CreatePkgVersionResponse> {
	
	public CreatePkgVersionRequest() {
		super("WebPlus", "2019-03-20", "CreatePkgVersion");
		setUriPattern("/pop/v1/wam/pkgVersion");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String packageSource;

	private String pkgVersionLabel;

	private String pkgVersionDescription;

	private String appId;

	public String getPackageSource() {
		return this.packageSource;
	}

	public void setPackageSource(String packageSource) {
		this.packageSource = packageSource;
		if(packageSource != null){
			putBodyParameter("PackageSource", packageSource);
		}
	}

	public String getPkgVersionLabel() {
		return this.pkgVersionLabel;
	}

	public void setPkgVersionLabel(String pkgVersionLabel) {
		this.pkgVersionLabel = pkgVersionLabel;
		if(pkgVersionLabel != null){
			putBodyParameter("PkgVersionLabel", pkgVersionLabel);
		}
	}

	public String getPkgVersionDescription() {
		return this.pkgVersionDescription;
	}

	public void setPkgVersionDescription(String pkgVersionDescription) {
		this.pkgVersionDescription = pkgVersionDescription;
		if(pkgVersionDescription != null){
			putBodyParameter("PkgVersionDescription", pkgVersionDescription);
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
	public Class<CreatePkgVersionResponse> getResponseClass() {
		return CreatePkgVersionResponse.class;
	}

}
