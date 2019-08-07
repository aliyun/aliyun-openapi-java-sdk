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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckOperationPermissionRequest extends RpcAcsRequest<CheckOperationPermissionResponse> {
	
	public CheckOperationPermissionRequest() {
		super("hdr", "2017-09-25", "CheckOperationPermission", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String securityToken;

	private String serverId;

	private String operation;

	private Long userUid;

	private String gatewayId;

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	public Long getUserUid() {
		return this.userUid;
	}

	public void setUserUid(Long userUid) {
		this.userUid = userUid;
		if(userUid != null){
			putQueryParameter("UserUid", userUid.toString());
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
	public Class<CheckOperationPermissionResponse> getResponseClass() {
		return CheckOperationPermissionResponse.class;
	}

}
