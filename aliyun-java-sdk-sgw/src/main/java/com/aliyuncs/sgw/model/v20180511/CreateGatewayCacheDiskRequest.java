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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGatewayCacheDiskRequest extends RpcAcsRequest<CreateGatewayCacheDiskResponse> {
	   

	private Long cacheDiskSizeInGB;

	private String securityToken;

	private String cacheDiskCategory;

	private String gatewayId;
	public CreateGatewayCacheDiskRequest() {
		super("sgw", "2018-05-11", "CreateGatewayCacheDisk", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCacheDiskSizeInGB() {
		return this.cacheDiskSizeInGB;
	}

	public void setCacheDiskSizeInGB(Long cacheDiskSizeInGB) {
		this.cacheDiskSizeInGB = cacheDiskSizeInGB;
		if(cacheDiskSizeInGB != null){
			putQueryParameter("CacheDiskSizeInGB", cacheDiskSizeInGB.toString());
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

	public String getCacheDiskCategory() {
		return this.cacheDiskCategory;
	}

	public void setCacheDiskCategory(String cacheDiskCategory) {
		this.cacheDiskCategory = cacheDiskCategory;
		if(cacheDiskCategory != null){
			putQueryParameter("CacheDiskCategory", cacheDiskCategory);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	@Override
	public Class<CreateGatewayCacheDiskResponse> getResponseClass() {
		return CreateGatewayCacheDiskResponse.class;
	}

}
