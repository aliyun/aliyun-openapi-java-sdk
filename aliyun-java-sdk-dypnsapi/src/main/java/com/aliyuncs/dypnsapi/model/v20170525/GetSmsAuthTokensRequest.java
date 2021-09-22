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
public class GetSmsAuthTokensRequest extends RpcAcsRequest<GetSmsAuthTokensResponse> {
	   

	private Long resourceOwnerId;

	private String bundleId;

	private String signName;

	private String sceneCode;

	private String resourceOwnerAccount;

	private Integer smsCodeExpire;

	private String packageName;

	private String osType;

	private Long ownerId;

	private String smsTemplateCode;

	private Long expire;
	public GetSmsAuthTokensRequest() {
		super("Dypnsapi", "2017-05-25", "GetSmsAuthTokens");
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

	public String getSignName() {
		return this.signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
		if(signName != null){
			putQueryParameter("SignName", signName);
		}
	}

	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
		if(sceneCode != null){
			putQueryParameter("SceneCode", sceneCode);
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

	public Integer getSmsCodeExpire() {
		return this.smsCodeExpire;
	}

	public void setSmsCodeExpire(Integer smsCodeExpire) {
		this.smsCodeExpire = smsCodeExpire;
		if(smsCodeExpire != null){
			putQueryParameter("SmsCodeExpire", smsCodeExpire.toString());
		}
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
		if(packageName != null){
			putQueryParameter("PackageName", packageName);
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

	public String getSmsTemplateCode() {
		return this.smsTemplateCode;
	}

	public void setSmsTemplateCode(String smsTemplateCode) {
		this.smsTemplateCode = smsTemplateCode;
		if(smsTemplateCode != null){
			putQueryParameter("SmsTemplateCode", smsTemplateCode);
		}
	}

	public Long getExpire() {
		return this.expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
		if(expire != null){
			putQueryParameter("Expire", expire.toString());
		}
	}

	@Override
	public Class<GetSmsAuthTokensResponse> getResponseClass() {
		return GetSmsAuthTokensResponse.class;
	}

}
