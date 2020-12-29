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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIpsecServerRequest extends RpcAcsRequest<CreateIpsecServerResponse> {
	   

	private String ikeConfig;

	private String clientToken;

	private String ipsecConfig;

	private String psk;

	private String localSubnet;

	private Boolean effectImmediately;

	private String clientIpPool;

	private String dryRun;

	private String vpnGatewayId;

	private Boolean pskEnabled;

	private String ipSecServerName;
	public CreateIpsecServerRequest() {
		super("Vpc", "2016-04-28", "CreateIpsecServer", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIkeConfig() {
		return this.ikeConfig;
	}

	public void setIkeConfig(String ikeConfig) {
		this.ikeConfig = ikeConfig;
		if(ikeConfig != null){
			putQueryParameter("IkeConfig", ikeConfig);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getIpsecConfig() {
		return this.ipsecConfig;
	}

	public void setIpsecConfig(String ipsecConfig) {
		this.ipsecConfig = ipsecConfig;
		if(ipsecConfig != null){
			putQueryParameter("IpsecConfig", ipsecConfig);
		}
	}

	public String getPsk() {
		return this.psk;
	}

	public void setPsk(String psk) {
		this.psk = psk;
		if(psk != null){
			putQueryParameter("Psk", psk);
		}
	}

	public String getLocalSubnet() {
		return this.localSubnet;
	}

	public void setLocalSubnet(String localSubnet) {
		this.localSubnet = localSubnet;
		if(localSubnet != null){
			putQueryParameter("LocalSubnet", localSubnet);
		}
	}

	public Boolean getEffectImmediately() {
		return this.effectImmediately;
	}

	public void setEffectImmediately(Boolean effectImmediately) {
		this.effectImmediately = effectImmediately;
		if(effectImmediately != null){
			putQueryParameter("EffectImmediately", effectImmediately.toString());
		}
	}

	public String getClientIpPool() {
		return this.clientIpPool;
	}

	public void setClientIpPool(String clientIpPool) {
		this.clientIpPool = clientIpPool;
		if(clientIpPool != null){
			putQueryParameter("ClientIpPool", clientIpPool);
		}
	}

	public String getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(String dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun);
		}
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
		if(vpnGatewayId != null){
			putQueryParameter("VpnGatewayId", vpnGatewayId);
		}
	}

	public Boolean getPskEnabled() {
		return this.pskEnabled;
	}

	public void setPskEnabled(Boolean pskEnabled) {
		this.pskEnabled = pskEnabled;
		if(pskEnabled != null){
			putQueryParameter("PskEnabled", pskEnabled.toString());
		}
	}

	public String getIpSecServerName() {
		return this.ipSecServerName;
	}

	public void setIpSecServerName(String ipSecServerName) {
		this.ipSecServerName = ipSecServerName;
		if(ipSecServerName != null){
			putQueryParameter("IpSecServerName", ipSecServerName);
		}
	}

	@Override
	public Class<CreateIpsecServerResponse> getResponseClass() {
		return CreateIpsecServerResponse.class;
	}

}
