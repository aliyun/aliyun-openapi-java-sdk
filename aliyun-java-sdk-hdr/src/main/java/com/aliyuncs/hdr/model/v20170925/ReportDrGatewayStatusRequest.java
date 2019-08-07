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
public class ReportDrGatewayStatusRequest extends RpcAcsRequest<ReportDrGatewayStatusResponse> {
	
	public ReportDrGatewayStatusRequest() {
		super("hdr", "2017-09-25", "ReportDrGatewayStatus", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long downstreamSpeed;

	private String securityToken;

	private Long userUid;

	private String gatewayId;

	private Long upstreamSpeed;

	public Long getDownstreamSpeed() {
		return this.downstreamSpeed;
	}

	public void setDownstreamSpeed(Long downstreamSpeed) {
		this.downstreamSpeed = downstreamSpeed;
		if(downstreamSpeed != null){
			putQueryParameter("DownstreamSpeed", downstreamSpeed.toString());
		}
	}

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

	public Long getUpstreamSpeed() {
		return this.upstreamSpeed;
	}

	public void setUpstreamSpeed(Long upstreamSpeed) {
		this.upstreamSpeed = upstreamSpeed;
		if(upstreamSpeed != null){
			putQueryParameter("UpstreamSpeed", upstreamSpeed.toString());
		}
	}

	@Override
	public Class<ReportDrGatewayStatusResponse> getResponseClass() {
		return ReportDrGatewayStatusResponse.class;
	}

}
