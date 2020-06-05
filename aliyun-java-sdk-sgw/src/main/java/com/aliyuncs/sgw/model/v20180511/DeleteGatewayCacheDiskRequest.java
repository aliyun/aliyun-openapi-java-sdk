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
public class DeleteGatewayCacheDiskRequest extends RpcAcsRequest<DeleteGatewayCacheDiskResponse> {
	   

	private String localFilePath;

	private String cacheId;

	private String securityToken;

	private String gatewayId;
	public DeleteGatewayCacheDiskRequest() {
		super("sgw", "2018-05-11", "DeleteGatewayCacheDisk", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLocalFilePath() {
		return this.localFilePath;
	}

	public void setLocalFilePath(String localFilePath) {
		this.localFilePath = localFilePath;
		if(localFilePath != null){
			putQueryParameter("LocalFilePath", localFilePath);
		}
	}

	public String getCacheId() {
		return this.cacheId;
	}

	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
		if(cacheId != null){
			putQueryParameter("CacheId", cacheId);
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
	public Class<DeleteGatewayCacheDiskResponse> getResponseClass() {
		return DeleteGatewayCacheDiskResponse.class;
	}

}
