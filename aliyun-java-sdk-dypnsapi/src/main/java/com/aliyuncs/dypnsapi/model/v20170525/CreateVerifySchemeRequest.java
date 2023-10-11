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
public class CreateVerifySchemeRequest extends RpcAcsRequest<CreateVerifySchemeResponse> {
	   

	private Long resourceOwnerId;

	private String origin;

	private String bundleId;

	private String authType;

	private String appName;

	private String ipWhiteList;

	private String email;

	private String packSign;

	private String packName;

	private Long cuApiCode;

	private String sceneType;

	private String resourceOwnerAccount;

	private Long ctApiCode;

	private String osType;

	private Long ownerId;

	private String url;

	private Long cmApiCode;

	private String schemeName;

	private String smsSignName;
	public CreateVerifySchemeRequest() {
		super("Dypnsapi", "2017-05-25", "CreateVerifyScheme");
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

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
		if(origin != null){
			putQueryParameter("Origin", origin);
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getIpWhiteList() {
		return this.ipWhiteList;
	}

	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
		if(ipWhiteList != null){
			putQueryParameter("IpWhiteList", ipWhiteList);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getPackSign() {
		return this.packSign;
	}

	public void setPackSign(String packSign) {
		this.packSign = packSign;
		if(packSign != null){
			putQueryParameter("PackSign", packSign);
		}
	}

	public String getPackName() {
		return this.packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
		if(packName != null){
			putQueryParameter("PackName", packName);
		}
	}

	public Long getCuApiCode() {
		return this.cuApiCode;
	}

	public void setCuApiCode(Long cuApiCode) {
		this.cuApiCode = cuApiCode;
		if(cuApiCode != null){
			putQueryParameter("CuApiCode", cuApiCode.toString());
		}
	}

	public String getSceneType() {
		return this.sceneType;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
		if(sceneType != null){
			putQueryParameter("SceneType", sceneType);
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

	public Long getCtApiCode() {
		return this.ctApiCode;
	}

	public void setCtApiCode(Long ctApiCode) {
		this.ctApiCode = ctApiCode;
		if(ctApiCode != null){
			putQueryParameter("CtApiCode", ctApiCode.toString());
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	public Long getCmApiCode() {
		return this.cmApiCode;
	}

	public void setCmApiCode(Long cmApiCode) {
		this.cmApiCode = cmApiCode;
		if(cmApiCode != null){
			putQueryParameter("CmApiCode", cmApiCode.toString());
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

	public String getSmsSignName() {
		return this.smsSignName;
	}

	public void setSmsSignName(String smsSignName) {
		this.smsSignName = smsSignName;
		if(smsSignName != null){
			putQueryParameter("SmsSignName", smsSignName);
		}
	}

	@Override
	public Class<CreateVerifySchemeResponse> getResponseClass() {
		return CreateVerifySchemeResponse.class;
	}

}
