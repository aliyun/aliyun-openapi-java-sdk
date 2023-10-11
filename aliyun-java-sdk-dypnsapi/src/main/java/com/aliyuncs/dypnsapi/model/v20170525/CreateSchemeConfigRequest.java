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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSchemeConfigRequest extends RpcAcsRequest<CreateSchemeConfigResponse> {
	   

	private Long resourceOwnerId;

	private String androidPackageSign;

	private String platform;

	private String h5Url;

	private String iosBundleId;

	private String appName;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String h5Origin;

	private String schemeName;

	private String androidPackageName;
	public CreateSchemeConfigRequest() {
		super("Dypnsapi", "2017-05-25", "CreateSchemeConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAndroidPackageSign() {
		return this.androidPackageSign;
	}

	public void setAndroidPackageSign(String androidPackageSign) {
		this.androidPackageSign = androidPackageSign;
		if(androidPackageSign != null){
			putQueryParameter("AndroidPackageSign", androidPackageSign);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getH5Url() {
		return this.h5Url;
	}

	public void setH5Url(String h5Url) {
		this.h5Url = h5Url;
		if(h5Url != null){
			putQueryParameter("H5Url", h5Url);
		}
	}

	public String getIosBundleId() {
		return this.iosBundleId;
	}

	public void setIosBundleId(String iosBundleId) {
		this.iosBundleId = iosBundleId;
		if(iosBundleId != null){
			putQueryParameter("IosBundleId", iosBundleId);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getH5Origin() {
		return this.h5Origin;
	}

	public void setH5Origin(String h5Origin) {
		this.h5Origin = h5Origin;
		if(h5Origin != null){
			putQueryParameter("H5Origin", h5Origin);
		}
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
		if(schemeName != null){
			putQueryParameter("SchemeName", schemeName);
		}
	}

	public String getAndroidPackageName() {
		return this.androidPackageName;
	}

	public void setAndroidPackageName(String androidPackageName) {
		this.androidPackageName = androidPackageName;
		if(androidPackageName != null){
			putQueryParameter("AndroidPackageName", androidPackageName);
		}
	}

	@Override
	public Class<CreateSchemeConfigResponse> getResponseClass() {
		return CreateSchemeConfigResponse.class;
	}

}
