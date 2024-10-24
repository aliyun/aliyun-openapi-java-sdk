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
public class GetAuthTokenRequest extends RpcAcsRequest<GetAuthTokenResponse> {
	   

	private Long resourceOwnerId;

	private String origin;

	private String sceneCode;

	private Integer cuApiCode;

	private String resourceOwnerAccount;

	private Integer ctApiCode;

	private Long ownerId;

	private String version;

	private String url;

	private Integer bizType;

	private Integer cmApiCode;
	public GetAuthTokenRequest() {
		super("Dypnsapi", "2017-05-25", "GetAuthToken", "dypnsapi");
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

	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
		if(sceneCode != null){
			putQueryParameter("SceneCode", sceneCode);
		}
	}

	public Integer getCuApiCode() {
		return this.cuApiCode;
	}

	public void setCuApiCode(Integer cuApiCode) {
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

	public Integer getCtApiCode() {
		return this.ctApiCode;
	}

	public void setCtApiCode(Integer ctApiCode) {
		this.ctApiCode = ctApiCode;
		if(ctApiCode != null){
			putQueryParameter("CtApiCode", ctApiCode.toString());
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
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

	public Integer getBizType() {
		return this.bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType.toString());
		}
	}

	public Integer getCmApiCode() {
		return this.cmApiCode;
	}

	public void setCmApiCode(Integer cmApiCode) {
		this.cmApiCode = cmApiCode;
		if(cmApiCode != null){
			putQueryParameter("CmApiCode", cmApiCode.toString());
		}
	}

	@Override
	public Class<GetAuthTokenResponse> getResponseClass() {
		return GetAuthTokenResponse.class;
	}

}
