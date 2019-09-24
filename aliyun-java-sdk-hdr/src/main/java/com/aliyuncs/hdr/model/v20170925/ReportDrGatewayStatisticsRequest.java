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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportDrGatewayStatisticsRequest extends RpcAcsRequest<ReportDrGatewayStatisticsResponse> {
	
	public ReportDrGatewayStatisticsRequest() {
		super("hdr", "2017-09-25", "ReportDrGatewayStatistics", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String networkType;

	private Long upstreamTraffic;

	private String securityToken;

	private Long downstreamTraffic;

	private Long userUid;

	private String gatewayId;

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Long getUpstreamTraffic() {
		return this.upstreamTraffic;
	}

	public void setUpstreamTraffic(Long upstreamTraffic) {
		this.upstreamTraffic = upstreamTraffic;
		if(upstreamTraffic != null){
			putQueryParameter("UpstreamTraffic", upstreamTraffic.toString());
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

	public Long getDownstreamTraffic() {
		return this.downstreamTraffic;
	}

	public void setDownstreamTraffic(Long downstreamTraffic) {
		this.downstreamTraffic = downstreamTraffic;
		if(downstreamTraffic != null){
			putQueryParameter("DownstreamTraffic", downstreamTraffic.toString());
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
	public Class<ReportDrGatewayStatisticsResponse> getResponseClass() {
		return ReportDrGatewayStatisticsResponse.class;
	}

}
