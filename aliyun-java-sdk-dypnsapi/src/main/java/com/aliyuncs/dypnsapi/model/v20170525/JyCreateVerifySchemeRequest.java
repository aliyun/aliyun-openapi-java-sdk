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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class JyCreateVerifySchemeRequest extends RpcAcsRequest<JyCreateVerifySchemeResponse> {
	   

	private Long resourceOwnerId;

	private String bundleId;

	private String appName;

	private String packSign;

	private String packName;

	private Long cuApiCode;

	private String resourceOwnerAccount;

	private Long ctApiCode;

	private String osType;

	private Long ownerId;

	private Long cmApiCode;

	private String schemeName;
	public JyCreateVerifySchemeRequest() {
		super("Dypnsapi", "2017-05-25", "JyCreateVerifyScheme", "dypnsapi");
		setProtocol(ProtocolType.HTTPS);
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

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
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

	@Override
	public Class<JyCreateVerifySchemeResponse> getResponseClass() {
		return JyCreateVerifySchemeResponse.class;
	}

}
